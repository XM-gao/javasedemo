package com.neuedu.factory02;

public class Factory02 implements GardenerFactory {
    @Override
    public Apple createA() {

        return new AppleB();
    }

    @Override
    public Banana createB() {
        return new BananaB();
    }
}
