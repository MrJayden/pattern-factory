package com.learn.gupao.factorydesignmode.factorymethodmode;

public class FactoryMethodModeTest {
    public static void main(String[] args) {
        IRestaurant restaurant = new ChinessRestaurant();
        restaurant.doCooking().making();
        System.out.println("----------------------------------------");
        restaurant = new WesternRestaurant();
        restaurant.doCooking().making();
    }
}
