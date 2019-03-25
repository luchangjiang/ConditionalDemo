package com.river.ConditionalDemo.service.impl;

import com.river.ConditionalDemo.service.Fighter;
import org.springframework.stereotype.Service;

/**
 * @program: ConditionalDemo
 * @description: fighter of Babana
 * @author: luchangjiang
 * @create: 2019-03-25 10:38
 **/
//@Service
public class Babana implements Fighter {
    @Override
    public void fight(){
        System.out.println("Banana: 自由的气息，蕉迟但到");
    }
}
