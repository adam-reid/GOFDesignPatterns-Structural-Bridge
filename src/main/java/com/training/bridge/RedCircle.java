package com.training.bridge;

/**
 * Created by adame on 5/30/2017.
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("I am red, with a radius of " + radius + ", "
        + "an x of " + x + ", and a y of " + y);
    }
}
