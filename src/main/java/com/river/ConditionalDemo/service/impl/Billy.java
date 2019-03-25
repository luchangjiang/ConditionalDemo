package com.river.ConditionalDemo.service.impl;

import com.river.ConditionalDemo.service.Fighter;
import org.springframework.stereotype.Service;

/**
 * @program: ConditionalDemo
 * @description: fighter of billy
 * @author: luchangjiang
 * @create: 2019-03-25 10:37
 **/
//@Service
public class Billy implements Fighter {
    public void fight(){
        System.out.println("Billy：吾乃新日暮里的王，三界哲学的主宰。");

    }
}
