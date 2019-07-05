package com.learn.gupao.factorydesignmode.simplefactorymode;

public class Rice implements IFood{
    @Override
    public void making() {
        System.out.println("the rice is making ,please wait for a moment");
    }
}
