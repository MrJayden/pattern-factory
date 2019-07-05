package com.learn.gupao.factorydesignmode.simplefactorymode;

public class Restaurant {

    public IFood makeFood(Class<? extends IFood> clazz){
        if(null != clazz){
            try {
                return clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
