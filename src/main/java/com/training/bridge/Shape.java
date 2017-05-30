package com.training.bridge;

/**
 * Created by adame on 5/30/2017.
 */
public abstract class Shape {
    protected DrawAPI drawApi;

    protected Shape(DrawAPI drawAPI) {
        this.drawApi = drawAPI;
    }

    public abstract void draw();
}
