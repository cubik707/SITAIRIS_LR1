package com.vlada.trash;

public class StarCounter implements AddStarsable {
    @Override
    public void printCountOfStars(int stars) {
        System.out.println("Count of stars: " + stars);
    }

    @Override
    public int calculateSum(int a, int b) {
        return b+a+b;
    }
}
