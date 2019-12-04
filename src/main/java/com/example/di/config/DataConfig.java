package com.example.di.config;

import com.example.di.condition.MagicExistCondition;
import com.example.di.domain.Person;
import com.example.di.domain.SteelAxe;
import com.example.di.domain.StoneAxe;
import org.springframework.context.annotation.*;

@Configuration
public class DataConfig {
    @Bean
    public Person person() {
        return new Person();
    }

    @Bean
    @Conditional(MagicExistCondition.class)
//    @Profile("steel")
//    @Primary
    public SteelAxe steelAxe() {
        return new SteelAxe();
    }

    @Bean
//    @Profile("stone")
    public StoneAxe stoneAxe() {
        return new StoneAxe();
    }

//    @Bean
//    public LocalDate localDate() {
//        return LocalDate.now();
//    }
}
