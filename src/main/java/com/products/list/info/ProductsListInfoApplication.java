package com.products.list.info;

import javax.validation.constraints.NotNull;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ProductsListInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsListInfoApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfig() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(@NotNull CorsRegistry registry) {
				registry.addMapping("/**").allowedMethods("PUT", "DELETE", "POST", "GET", "PATCH", "OPTIONS", "HEAD")
						.allowedHeaders("*").allowCredentials(true).maxAge(3600);
			}
		};
	}

}
