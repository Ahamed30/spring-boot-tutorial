package com.demo.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BasketBallCoach implements Coach{

    public BasketBallCoach() {
        System.out.println(getClass().getSimpleName()+ " is created");
    }

    @Override
    public String getDailyWorkout() {
        return "Shoot 1000 three pointers!";
    }
}
