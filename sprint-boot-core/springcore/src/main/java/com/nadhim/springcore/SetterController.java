package com.nadhim.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SetterController {

    private Coach myCoach ;

    @Autowired
    void setCoach(@Qualifier("footBallCoach") Coach coach){
        myCoach = coach ;
    }

    @GetMapping("set")
    public String one(){
        return myCoach.getDailyWorkout() ;
    }

}
