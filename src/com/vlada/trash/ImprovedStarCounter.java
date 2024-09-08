package com.vlada.trash;

public class ImprovedStarCounter extends StarCounter {
    public String name;
    ImprovedStarCounter(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printName(){
        System.out.println(this.name);
    }
}
