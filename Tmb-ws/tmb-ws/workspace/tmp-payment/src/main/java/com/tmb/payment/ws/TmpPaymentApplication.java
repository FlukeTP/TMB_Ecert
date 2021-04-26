package com.tmb.payment.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("file:${tmb.ws.config.location}/wsapplication.properties")
public class TmpPaymentApplication  extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(TmpPaymentApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure (SpringApplicationBuilder application) {
		return application.sources(TmpPaymentApplication.class);
	}
}
