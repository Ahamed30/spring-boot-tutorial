package com.demo.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BasketBallCoach implements Coach{

    public BasketBallCoach() {
        System.out.println(getClass().getSimpleName()+ " is created");
    }

    @Override
    public String getDailyWorkout() {
        return "Shoot 1000 three pointers!";
    }
}
