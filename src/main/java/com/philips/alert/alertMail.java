package com.philips.alert;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

//@SpringBootApplication
public class alertMail implements CommandLineRunner {

	@Autowired
	private static JavaMailSender javaMailSender ;
	
	
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Sending Email...");
		//sendSimpleEmail();
		//sendEmailWithAttachment();

        System.out.println("Done");
		
	}
	
	public static void sendSimpleEmail(String content) {

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("test@gmail.com", "test2@gmail.com");

        msg.setSubject("Costomer requesting for human interface");
        msg.setText(content);

        javaMailSender.send(msg);

    }
	
	void sendEmailWithAttachment() throws MessagingException, IOException {

        MimeMessage msg = javaMailSender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(msg, true);
        helper.setTo("kirankumarr.13.1998@gmail.com");

        helper.setSubject("Explore Philips Products - Best in the Market");

        helper.setText("<h1>Check attachment for image!</h1>", true);

        helper.addAttachment("Intellivue_MX800.png", new ClassPathResource("Intellivue_MX800.png"));

        javaMailSender.send(msg);

    }
	
	
	
}
