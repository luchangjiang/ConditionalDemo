package com.river.ConditionalDemo.config;

import com.river.ConditionalDemo.service.Fighter;
import com.river.ConditionalDemo.service.Van;
import com.river.ConditionalDemo.service.impl.Babana;
import com.river.ConditionalDemo.service.impl.Billy;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: ConditionalDemo
 * @description: van config
 * @author: luchangjiang
 * @create: 2019-03-25 10:45
 **/
@Configuration
public class VanConfig {
    @Bean
    @ConditionalOnBean(Billy.class)
    public Fighter fighter(){
        return new Billy();
    }

    @Bean
    @ConditionalOnMissingBean
    public Fighter fighter2(){
        return new Babana();
    }
}
