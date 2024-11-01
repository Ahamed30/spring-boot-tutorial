package com.demo.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class GolfCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Hit 350 shots!";
    }
}
