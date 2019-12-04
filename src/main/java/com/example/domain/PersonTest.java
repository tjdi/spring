package com.example.domain;


import com.example.config.RootConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PersonTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(RootConfig.class);

        Person tom = applicationContext.getBean(Person.class);
        tom.chop();
    }
}
