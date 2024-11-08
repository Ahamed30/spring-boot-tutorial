package com.demo.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    public TennisCoach() {
        System.out.println(getClass().getSimpleName()+ " is created");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backend volley";
    }
}
