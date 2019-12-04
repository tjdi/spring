package com.example.di.domain;


import com.example.di.config.RootConfig;
import com.example.di.domain.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PersonTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(RootConfig.class);

        Person tom = applicationContext.getBean(Person.class);
        Person jerry = applicationContext.getBean(Person.class);
        System.out.println(tom==jerry);
//        tom.chop();
    }
}
