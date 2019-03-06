package com.neuedu.factory;

public class Test {
    public static void main(String[] args) {
        GardenerInterface gardener=new BananaFactory();
        gardener.create();
    }
}
