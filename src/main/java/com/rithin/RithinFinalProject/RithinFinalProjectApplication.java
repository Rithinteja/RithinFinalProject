package com.rithin.RithinFinalProject;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class RithinFinalProjectApplication {


	@Autowired
	private EmailSenderService senderService;


	public static void main(String[] args) {
		SpringApplication.run(RithinFinalProjectApplication.class, args);
	}
	@EventListener(ApplicationReadyEvent.class)
	public void sendMail(){

				senderService.sendEmail("rithinteja.aechan@gmail.com", "REMINDER!");
			}


		}




