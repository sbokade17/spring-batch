package com.example.springbatch;

import com.example.springbatch.data.UserNamePassword;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.context.annotation.RequestScope;

import java.util.Properties;

@SpringBootApplication
public class SpringBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchApplication.class, args);
	}



	@Bean
	@RequestScope
	@Lazy
	public JavaMailSender getJavaMailSender()
	{
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		mailSender.setHost("smtp.gmail.com");
		mailSender.setPort(25);

		UserNamePassword userNamePassword= getRandomUser();

		System.out.println("Mail config for: "+userNamePassword.getUsername());
		mailSender.setUsername(userNamePassword.getUsername());
		mailSender.setPassword(userNamePassword.getPassword());

		Properties props = mailSender.getJavaMailProperties();
		props.put("mail.transport.protocol", "smtp");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.debug", "true");

		return mailSender;
	}

	private UserNamePassword getRandomUser() {
		UserNamePassword userNamePassword = new UserNamePassword();
		if(System.currentTimeMillis()%2==0){
			userNamePassword.setUsername("bloggersbokade17@gmail.com");
			userNamePassword.setPassword("9766766538");
		}else{
			userNamePassword.setUsername("dodomobileapp@gmail.com");
			userNamePassword.setPassword("Dodo@123");
		}

		return userNamePassword;
	}
}
