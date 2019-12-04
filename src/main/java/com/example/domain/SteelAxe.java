package com.example.domain;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SteelAxe implements Axe{
    @Override
    public void chop() {
        System.out.println("钢斧砍");
    }
}
