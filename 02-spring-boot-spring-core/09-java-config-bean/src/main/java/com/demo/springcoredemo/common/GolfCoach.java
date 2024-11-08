package com.demo.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class GolfCoach implements Coach{

    public GolfCoach() {
        System.out.println(getClass().getSimpleName()+ " is created");
    }

    @Override
    public String getDailyWorkout() {
        return "Hit 350 shots!";
    }
}
