package com.nadhim.springcore;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout(){
        return "Enjoy the Day Dumb!!!!!" ;
    }
}
