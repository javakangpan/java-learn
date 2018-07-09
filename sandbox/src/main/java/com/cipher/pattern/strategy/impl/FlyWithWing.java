package com.cipher.pattern.strategy.impl;

import com.cipher.pattern.strategy.FlyingStrategy;

/**
 * 飞行接口实现类
 * Created by cipher on 2017/9/12.
 */
public class FlyWithWing implements FlyingStrategy {

    public void performFly() {
        System.out.println("振翅高飞~");
    }

}
