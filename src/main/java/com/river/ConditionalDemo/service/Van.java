package com.river.ConditionalDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: ConditionalDemo
 * @description: van
 * @author: luchangjiang
 * @create: 2019-03-25 10:42
 **/
@Service
public class Van {
    @Autowired
    private Fighter fighter;

    public void fight(){
        System.out.println("van：boy next door,do you like 玩游戏");
        fighter.fight();
    }
}
