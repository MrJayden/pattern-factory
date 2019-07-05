package com.learn.gupao.factorydesignmode.abstractfactorymode;

import com.learn.gupao.factorydesignmode.simplefactorymode.IFood;
import com.learn.gupao.factorydesignmode.simplefactorymode.Rice;

public class WesternHighRestaurant implements IHighRestaurant {
    @Override
    public IFood makeStapleFood() {
        return new Rice();
    }

    @Override
    public void addSideDish() {
        System.out.println(" ------ 沙拉 -------");
    }

    @Override
    public void drinking() {
        System.out.println(" ---- 过期的82拉菲 ------ ");
    }
}
