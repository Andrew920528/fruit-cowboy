package com.fruitcowboy;

import com.fruitcowboy.fruits.NormalFruit;

import processing.core.PApplet;

public class Main extends PApplet {

    private GameManager gameManager;
    float x;
    float y;
    float vy;
    private NormalFruit f1, f2, f3;
    @Override
    public void settings() {
        size(800, 600);
    }

    @Override
    public void setup() {
        Util.init(this);
        x = 200;
        y = 300;
        vy = 15;
        // gameManager = new GameManager();
        // gameManager.setup(this);
        f1 = new NormalFruit(200, 300, 3, 15, 0.5f, "data/fruits/kiwi.png", 45);
        f2 = new NormalFruit(600, 400, -4, 25, 0.9f, "data/fruits/coconut.png", 51);
        f3 = new NormalFruit(100, 200, 2, 5, 0.3f, "data/fruits/GreenApple.png", 45);
    }

    @Override
    public void draw() {
        background(100,0,0);
        // background(30);
        // gameManager.update();
        // gameManager.draw(this);
        f1.move(this);
        f2.move(this);
        f3.move(this);
    }

    @Override
    public void mousePressed() {
        // gameManager.handleClick(mouseX, mouseY);
    }

    public static void main(String[] args) {
        PApplet.main(Main.class);
    }
}
