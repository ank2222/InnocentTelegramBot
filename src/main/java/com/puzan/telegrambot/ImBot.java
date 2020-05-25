package com.puzan.telegrambot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class ImBot extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {
        if (update.getMessage().getText().startsWith("/")) {
            System.out.println(update.getMessage() + "");
            System.out.println(update);
            SendMessage message = new SendMessage();
            message.setText(update.getMessage().getFrom().getFirstName() + " says \"" + update.getMessage().getText() + "\"");
            message.setChatId(update.getMessage().getChatId());
            try {
                for (int i = 0; i < 10; i++) {
                    execute(message);
                }
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
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
