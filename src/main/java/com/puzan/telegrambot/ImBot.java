package com.puzan.telegrambot;

import com.google.gson.Gson;
import org.springframework.web.client.RestTemplate;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class ImBot extends TelegramLongPollingBot {

    boolean enable;

    @Override
    public void onUpdateReceived(Update update) {
        SendMessage message = new SendMessage();
        message.setChatId(update.getMessage().getChatId());

        if (update.getMessage().getText().startsWith("//")) {
            message.setText(update.getMessage().getFrom().getFirstName() + "'S bhagwaan says " + update.getMessage().getText() + "\"");
            try {
                for (int i = 0; i < 10; i++) {
                    execute(message);
                }
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (update.getMessage().getText().startsWith("//image ")) {
            try {
                message.setText(searchImage(update.getMessage().getText().split("//image")[1]));
            } catch (Exception ex) {
                message.setText("You guys have exceeded limit. I wont search now.");
                try {
                    execute(message);
                } catch (Exception e0x) {

                }

            }

        } else if (update.getMessage().getText().startsWith("//youtube ")) {
            try {
                if (enable)
                    message.setText(searchYoutube(update.getMessage().getText().split("//youtube")[1]));
                else
                    message.setText("Disabled");
                execute(message);
            } catch (Exception ex) {
                ex.printStackTrace();
                message.setText("Limit exceeded");
            }
        } else if (update.getMessage().getText().startsWith("//start")) {
            if (update.getMessage().getFrom().getFirstName().startsWith("Pujan") | update.getMessage().getFrom().getFirstName().startsWith("Kyu")) {
                enable = true;
                message.setText("Started successfully.");
            } else
                message.setText("You dont have permission.");
            try {
                execute(message);
            } catch (Exception ex) {

            }
        }
    }


    private String searchYoutube(String searchQuery) {
        final String uri = "https://www.googleapis.com/youtube/v3/search?part=snippet&type=video&key=" + MyBots.API_KEY[0] + "&q=" + searchQuery;
        RestTemplate restTemplate = new RestTemplate();
        YoutubeResponse result = restTemplate.getForObject(uri, YoutubeResponse.class);
        result.getItems().get(0).getSnippet().getTitle();
        String url = "https://youtu.be/" + result.getItems().get(0).getId().getVideoId();
        return url;
    }

    private String searchImage(String searchQuery) {
        final String uri = "https://www.googleapis.com/customsearch/v1?searchType=image&key=" + MyBots.CSE_KEY[0] + "&cx=" +
                MyBots.CSE_KEY[1] + "&q=" + searchQuery;
        RestTemplate restTemplate = new RestTemplate();
        String resultString = restTemplate.getForObject(uri, String.class);

        Post result = new Gson().fromJson(resultString, Post.class);
        String msg = "Title: " + result.getItems().get(0).getTitle() + "\n" + result.getItems().get(0).getImage().getThumbnailLink();
        return msg;
    }


    @Override
    public String getBotUsername() {
        return MyBots.BOT_USERNAME;
    }

    @Override
    public String getBotToken() {
        return MyBots.BOT_TOKEN;
    }
}
