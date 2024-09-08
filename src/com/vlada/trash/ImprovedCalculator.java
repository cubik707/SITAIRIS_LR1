package com.vlada.trash;

import static java.lang.Math.pow;

public class ImprovedCalculator extends TaskManager {
    @Override
    public int powTo(int a, int b) {
        return a+b;
    }

    @Override
    public int calculateSum(int a, int b) {
        return (int) pow(b, pow(a, b));
    }
}
