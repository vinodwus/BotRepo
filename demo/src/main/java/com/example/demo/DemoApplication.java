package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		 // Initialize Api Context
      ApiContextInitializer.init();

      // Instantiate Telegram Bots API
      TelegramBotsApi botsApi = new TelegramBotsApi();
      // Register our bot
      try {
          botsApi.registerBot(new MyAmazingBot());
      } catch (TelegramApiException e) {
          e.printStackTrace();
      }
	}

}
