package dev.samuelolawuyi.Movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class MovieReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieReviewApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer configurer() {
		return new	WebMvcConfigurer() {
			@Override
			public void addCorsMappings (CorsRegistry reg){
				reg.addMapping("/**").allowedOrigins("*");
			}

		};
	}
}
