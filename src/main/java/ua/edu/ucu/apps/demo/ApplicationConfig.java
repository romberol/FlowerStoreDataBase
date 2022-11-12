package ua.edu.ucu.apps.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public String getData(){
        return "Hello, World!.";
    }
}
