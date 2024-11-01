package com.demo.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Shoot 100 free kicks!";
    }
}
