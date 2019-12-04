package com.example.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//这个注解标记的类会被Spring进行管理，成为的Spring一个组建（也叫做bean）
public class Person  {

    @Autowired
//    这个注解告诉Spring从被管理的所有对象中，选择最合适的送到这个引用的里面
    private  Axe axe;

    public void chop(){
        axe.chop();
    }
}
