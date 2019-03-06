package com.neuedu.factory;

public class BananaFactory implements GardenerInterface {
    @Override
    public Fruit create() {
        return new Banana();
    }
}
