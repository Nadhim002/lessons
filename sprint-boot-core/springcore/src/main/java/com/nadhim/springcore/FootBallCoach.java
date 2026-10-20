package com.nadhim.springcore;

import org.springframework.stereotype.Component;

@Component
public class FootBallCoach implements Coach{

    public String getDailyWorkout(){
        return "It's football coaching" ;
    }
}
