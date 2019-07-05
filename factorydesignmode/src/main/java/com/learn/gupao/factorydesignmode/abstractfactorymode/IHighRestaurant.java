package com.learn.gupao.factorydesignmode.abstractfactorymode;

import com.learn.gupao.factorydesignmode.simplefactorymode.IFood;

public interface IHighRestaurant {

    IFood makeStapleFood();

    void addSideDish();

    void drinking();
}
