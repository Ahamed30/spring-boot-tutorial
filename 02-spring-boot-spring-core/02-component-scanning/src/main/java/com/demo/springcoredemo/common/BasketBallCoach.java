package com.demo.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BasketBallCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Shoot 500 three pointers!";
    }
}
