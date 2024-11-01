package com.demo.springcoredemo.rest;

import com.demo.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

    // We can give any function name need not be a setter name, unless it is autowired it will perform setter injection
    @Autowired
    public void doSomeStuff(Coach theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/daily-workout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
