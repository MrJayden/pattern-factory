package com.learn.gupao.factorydesignmode.abstractfactorymode;

public class AbstractFactoryModeTest {
    public static void main(String[] args) {
        IHighRestaurant highRestaurant = new ChineseHighRestaurant();
        highRestaurant.makeStapleFood().making();
        highRestaurant.addSideDish();
        highRestaurant.drinking();
        System.out.println("---------------------------");
        highRestaurant = new WesternHighRestaurant();
        highRestaurant.makeStapleFood().making();
        highRestaurant.addSideDish();
        highRestaurant.drinking();
    }
}
