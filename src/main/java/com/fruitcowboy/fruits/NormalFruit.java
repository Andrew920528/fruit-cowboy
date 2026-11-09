package com.fruitcowboy.fruits;

import processing.core.PApplet;

public class NormalFruit extends Fruit {
    public NormalFruit(float x, float y, float vx, float vy, float gravity) {
        super(x, y, vx, vy, gravity);
    }

    @Override
    public void move(PApplet p) {
        p.fill(255, 255, 0);
        super.move(p);
    }
}
