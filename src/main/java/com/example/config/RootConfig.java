package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//这个注解表示当前这个类是Spring框架的配置类，对Spring框架的一些配置都放在这个类的里面

@ComponentScan("com.example.domain")
//这个注解指Spring要管理项目中所有的类，那么这些类去哪里寻找，如何发现这些要被管理的类
public class RootConfig {

}
