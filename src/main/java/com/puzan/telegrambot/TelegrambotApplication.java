package com.puzan.telegrambot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@SpringBootApplication
@RestController
public class TelegrambotApplication {

    @GetMapping
    public String home() {
        return "Welcome..";
    }

    public static void main(String[] args) {
        SpringApplication.run(TelegrambotApplication.class, args);
        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(new ImBot());

        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

}
