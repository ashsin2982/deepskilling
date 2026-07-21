package com.example.countryxml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.countryxml.model.Country;

@SpringBootApplication
public class CountryxmlApplication {

    public static void main(String[] args) {

        SpringApplication.run(CountryxmlApplication.class, args);

        try (ClassPathXmlApplicationContext context =
                     new ClassPathXmlApplicationContext("country.xml")) {

            Country country = context.getBean("country", Country.class);

            System.out.println(country);
        }
    }
}