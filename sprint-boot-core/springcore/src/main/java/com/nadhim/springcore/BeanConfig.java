package com.nadhim.springcore;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanConfig {

    private Coach theCoach ;

    @Autowired
    BeanConfig( @Qualifier("swimCoach") Coach coach){
        theCoach = coach ;
    }


    @GetMapping("swin")
    public String hello(){
        return theCoach.getDailyWorkout() ;
    }

}
