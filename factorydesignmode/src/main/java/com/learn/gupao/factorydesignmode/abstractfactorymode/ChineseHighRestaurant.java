package com.learn.gupao.factorydesignmode.abstractfactorymode;

import com.learn.gupao.factorydesignmode.simplefactorymode.IFood;
import com.learn.gupao.factorydesignmode.simplefactorymode.Noodles;

public class ChineseHighRestaurant implements IHighRestaurant {
    @Override
    public IFood makeStapleFood() {
        return new Noodles();
    }

    @Override
    public void addSideDish() {
        System.out.println(" ***  红烧狮子头  ***");
    }

    @Override
    public void drinking() {
        System.out.println("~~~ 北京二锅头 ~~~");
    }
}
