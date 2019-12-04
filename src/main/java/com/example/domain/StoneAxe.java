package com.example.domain;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class StoneAxe implements Axe{

    @Override
    public void chop() {
        System.out.println("石斧砍");
    }
}
