package com.neuedu.factory02;


public class Factory01 implements GardenerFactory {
    @Override
    public Apple createA() {
        return new AppleA();
    }

    @Override
    public Banana createB() {
        return new BananaA();
    }
}
