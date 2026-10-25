package com.fruitcowboy;

import processing.core.PApplet;

import com.fruitcowboy.fruits.Fruit;

public class Main extends PApplet {

    private GameManager gameManager;
    private float x, y, vx, vy, initvy;
    private Fruit normalFruit;

    @Override
    public void settings() {
        size(1400, 800);
    }

    @Override
    public void setup() {
        // gameManager = new GameManager();
        // gameManager.setup(this);
        background(100);
        noStroke();
        fill(255, 0, 0);
        x = 40;
        y = 500;
        vx = 2;
        vy = 18;
        initvy = 18;
        normalFruit = new Fruit(50, 800, 2, 18, 0.3f, 100);
    }

    @Override
    public void draw() {
        // background(30);
        // gameManager.update();
        // gameManager.draw(this);
        rect(x, y, 25, 25);
        x += vx;
        y -= vy;
        vy -= 0.5;
        if (y > 500) {
            initvy -= 1;
            vy = initvy;
        }
        normalFruit.move(this);
    }

    @Override
    public void mousePressed() {
        // gameManager.handleClick(mouseX, mouseY);
    }

    public static void main(String[] args) {
        PApplet.main(Main.class);
    }
}
