package com.vlada.trash;

public class ImprovedMessageCreator extends MessageCreator {
    @Override
    public String printHelloToPeople(int countOfPeople) {
        return "Hello  "+countOfPeople;
    }

    @Override
    public int calculateSum(int a, int b) {
        return a+b;
    }
}
