package com.example.di.domain;

import com.example.di.domain.Axe;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SteelAxe implements Axe {
    @Override
    public void chop() {
        System.out.println("钢斧砍");
    }
}
