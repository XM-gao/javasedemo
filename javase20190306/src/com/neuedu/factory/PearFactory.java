package com.neuedu.factory;

public class PearFactory implements GardenerInterface {
    @Override
    public Fruit create() {
        return new Pear();
    }
}
