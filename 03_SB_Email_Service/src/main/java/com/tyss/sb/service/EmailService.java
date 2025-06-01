package com.tyss.sb.service;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender javaMailSender;

	public void sendEmail(String to, String body, String subject) {
		SimpleMailMessage message = new SimpleMailMessage();

		message.setTo(to);
		message.setText(body);
		message.setSubject(subject);

		javaMailSender.send(message);
	}

	@Autowired
	private TemplateEngine engine;

	public void sendEmail(String to, String subject) throws MessagingException {
		MimeMessage message = javaMailSender.createMimeMessage();

		MimeMessageHelper helper = new MimeMessageHelper(message, true);// to pass attachments we use true

		String body = engine.process("forgot-password", new Context());

		helper.setTo(to);
		helper.setText(body, true);// bcz body contains html code
		helper.setSubject(subject);
		
		helper.addAttachment("project", new File("C:\\Users\\asus\\Documents\\Project.pdf"));

		javaMailSender.send(message);
	}
}
