package com.learn.gupao.factorydesignmode.factorymethodmode;

import com.learn.gupao.factorydesignmode.simplefactorymode.IFood;
import com.learn.gupao.factorydesignmode.simplefactorymode.Rice;

public class WesternRestaurant implements IRestaurant {
    @Override
    public IFood doCooking() {
        System.out.println("*******   the western food is making    ********");
        return new Rice();
    }
}
