package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        Coach coach = context.getBean("cricketCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());

        context.close();
    }
}
