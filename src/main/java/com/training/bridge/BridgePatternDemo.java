package com.training.bridge;

import org.apache.logging.log4j.core.pattern.AbstractStyleNameConverter;

/**
 * Created by adame on 5/30/2017.
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(50, 50, 5, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
