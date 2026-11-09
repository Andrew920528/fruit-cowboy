package com.fruitcowboy.fruits;

import processing.core.PApplet;

public class NormalFruit extends Fruit {
    public NormalFruit(float x, float y, float vx, float vy, float gravity, String image_path, int radius) {
        super(x, y, vx, vy, gravity, image_path, radius);
    }

    @Override
    public void move(PApplet p) {
        p.fill(255, 255, 0);
        super.move(p);
    }
}
