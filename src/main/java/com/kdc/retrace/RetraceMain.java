package com.kdc.retrace;

import com.kdc.retrace.security.config.CookieProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableAsync;


@SpringBootApplication
@EnableConfigurationProperties(CookieProperties.class)
@EnableAsync
public class RetraceMain {

	public static void main(String[] args) {
		SpringApplication.run(RetraceMain.class, args);
	}

}
