package com.tyss.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tyss.sb.service.EmailService;

import jakarta.mail.MessagingException;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws MessagingException {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);

		EmailService service = run.getBean(EmailService.class);

		String toEmail = "preranapagare01@gmail.com";
		String subject = "About spring boot class";
		String body = "Hi Your spring boot classes are about to complete";

//		service.sendEmail(toEmail, body, subject);

		service.sendEmail(toEmail, subject);
		
		System.out.println("Sent");
	}

}
