package com.example.di.domain;

import com.example.di.domain.Axe;
import org.springframework.stereotype.Component;

@Component
public class StoneAxe implements Axe {

    @Override
    public void chop() {
        System.out.println("石斧砍");
    }
}
