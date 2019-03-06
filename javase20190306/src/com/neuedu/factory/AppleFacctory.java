package com.neuedu.factory;

public class AppleFacctory implements  GardenerInterface{
    @Override
    public Fruit create() {
        return new Apple();
    }
}
