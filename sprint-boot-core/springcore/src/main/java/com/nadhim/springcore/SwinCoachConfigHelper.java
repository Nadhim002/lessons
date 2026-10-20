package com.nadhim.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwinCoachConfigHelper {

    @Bean
    public Coach swimCoach(){
        return new SwimCoach() ;
    }
 }
