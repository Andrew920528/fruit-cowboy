package com.fruitcowboy;

import processing.core.PApplet;

public class Main extends PApplet {

    private GameManager gameManager;
    float x;
    float y;
    float vy;
    @Override
    public void settings() {
        size(800, 600);
    }

    @Override
    public void setup() {
        x = 200;
        y = 300;
        vy = 15;
        // gameManager = new GameManager();
        // gameManager.setup(this);
    }

    @Override
    public void draw() {
        background(100,0,0);
        // background(30);
        // gameManager.update();
        // gameManager.draw(this);
        x+= 2;
        y-= vy;
        vy = vy-0.5f;
        circle(x, y, 60);
    }

    @Override
    public void mousePressed() {
        // gameManager.handleClick(mouseX, mouseY);
    }

    public static void main(String[] args) {
        PApplet.main(Main.class);
    }
}
