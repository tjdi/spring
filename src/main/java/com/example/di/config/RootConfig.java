package com.example.di.config;

import com.example.di.domain.Person;
import com.example.di.domain.SteelAxe;
import com.example.di.domain.StoneAxe;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

@Configuration
//这个注解表示当前这个类是Spring框架的配置类，对Spring框架的一些配置都放在这个类的里面

//@ComponentScan("com.example.domain")
//这个注解指Spring要管理项目中所有的类，那么这些类去哪里寻找，如何发现这些要被管理的类
@Import(DataConfig.class)
public class RootConfig {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Person person(){return new Person();}

    @Bean
    public SteelAxe steelAxe() {
        return new SteelAxe();
    }

    @Bean
    public StoneAxe stoneAxe() {
        return new StoneAxe();
    }

}
