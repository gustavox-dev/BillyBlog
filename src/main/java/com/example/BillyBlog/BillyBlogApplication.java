package com.example.BillyBlog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class BillyBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(BillyBlogApplication.class, args);
    }

}
