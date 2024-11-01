package com.demo.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // @Qualifiers has more priority than Primary
public class TennisCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice your backend volley";
    }
}
