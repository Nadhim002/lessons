package com.nadhim.springcore;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanScopeCheckController {

    private Coach myCoach ;

    @Autowired
    void setCoach(@Qualifier("footBallCoach") Coach coach){
        myCoach = coach ;
    }

    @PostConstruct
    void helloWorld(){
        System.out.println("Sartup stuff");
    }

    @PostConstruct
    void helloWorldOne(){
        System.out.println("Sartup stuff two");
    }

    @PreDestroy
    void belloWorld(){
        System.out.println("Ending stuff");
    }

    @PreDestroy
    void belloWorldOne(){
        System.out.println("Ending stuff two");
    }

    @GetMapping("bet")
    public String one(){
        return myCoach.getDailyWorkout() ;
    }
}
