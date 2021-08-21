package com.codecool.vehicle;

public class RedBicycle extends Bicycle {
    public RedBicycle() {
        super(Bicycle.RED);
    }

    @Override
    public void goForward() {
        System.out.println("We are in Red bicycle");
        super.goForward();
    }
}
