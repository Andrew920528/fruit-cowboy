package com.fruitcowboy;

import processing.core.PApplet;

import com.fruitcowboy.fruits.NormalFruit;

public class Main extends PApplet {

    private GameManager gameManager;
    private float x, y, vx, vy, initvy;
    private NormalFruit normalFruit1;
    private NormalFruit normalFruit2;
    private NormalFruit normalFruit3;
    private NormalFruit normalFruit4;
    private NormalFruit normalFruit5;
    private NormalFruit normalFruit6;

    @Override
    public void settings() {
        size(1400, 800);
    }

    @Override
    public void setup() {
        Util.init(this);
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
        normalFruit1 = new NormalFruit(50, 800, 2, 18, 0.3f, 90, "data/fruits/fruit1.png");
        normalFruit2 = new NormalFruit(250, 800, -3, 21, 0.4f, 40, "data/fruits/fruit2.jpg");
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
        normalFruit1.move(this);
        normalFruit2.move(this);
    }

    @Override
    public void mousePressed() {
        // gameManager.handleClick(mouseX, mouseY);
    }

    public static void main(String[] args) {
        PApplet.main(Main.class);
    }
}
