package com.learn.gupao.factorydesignmode.simplefactorymode;

public class SimpleFacoryModeTest {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.makeFood(Noodles.class).making();
        System.out.println("-----------------------------------");
        restaurant.makeFood(Rice.class).making();
    }
}
