package com.nadhim.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeadController {

    // Private field for injection
    private Coach myCoach ;
    private Coach anotherMyCoach ;


    // Define the constructor for dependency injection
    @Autowired

    HeadController(@Qualifier("cricketCoach") Coach theCoach ,@Qualifier("cricketCoach")  Coach theAnotherMyCoach){
        myCoach = theCoach ;
        anotherMyCoach = theAnotherMyCoach;

    }

    @GetMapping("")
    public String startingPoint(){
        return "startingPoint" ;
    }

    @GetMapping("dailyworkout")
    public String hello(){
        return myCoach.getDailyWorkout() ;
    }

    @GetMapping("bean-check")
    public String hellosy(){
        return "Is different beans ? " + (anotherMyCoach == myCoach) ;
    }


}
