package com.learn.gupao.factorydesignmode.factorymethodmode;

import com.learn.gupao.factorydesignmode.simplefactorymode.IFood;
import com.learn.gupao.factorydesignmode.simplefactorymode.Noodles;

public class ChinessRestaurant implements IRestaurant {
    @Override
    public IFood doCooking() {
        System.out.println("--------  the Chinese food is making    ---------");
        return new Noodles();
    }
}
