package com.demo.springcoredemo.rest;

import com.demo.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final Coach myCoach;
    private final Coach anotherCoach;

    @Autowired
    public DemoController(@Qualifier("basketBallCoach") Coach thecoach,
                          @Qualifier("basketBallCoach") Coach theAnotherCoach) {
        System.out.println(getClass().getSimpleName()+ " In rest controller");
        myCoach = thecoach;
        anotherCoach = theAnotherCoach;
    }

    @GetMapping("/daily-workout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public  String check() { return "Comparing Beans: myCoach == anotherCoach " + (myCoach == anotherCoach); }
}
