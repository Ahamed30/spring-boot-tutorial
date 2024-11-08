package com.demo.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TennisCoach implements Coach{

    public TennisCoach() {
        System.out.println(getClass().getSimpleName()+ " is created");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backend volley";
    }
}
