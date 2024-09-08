package com.vlada.trash;

public class Calculator implements Powable {
    @Override
    public int powTo(int a, int b) {
        return (int)Math.pow(a, b);
    }

    @Override
    public int calculateSum(int a, int b) {
        return a + b;
    }
}
