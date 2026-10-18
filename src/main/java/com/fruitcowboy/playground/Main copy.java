package com.fruitcowboy.playground;

import com.fruitcowboy.GameManager;

import processing.core.PApplet;

public class Main extends PApplet {

    private GameManager gameManager;
    private int x;
    private int y;
    private double circleSpeedx;
    private double circleSpeedy;
    private int c;
    private int cc;
    @Override
    public void settings() {
        size(800, 600);
    }

    @Override
    public void setup() {
        // gameManager = new GameManager();
        // gameManager.setup(this);
        x = 200;
        y = 300;
        circleSpeedx = 1.5;
        circleSpeedy = 1.5;
        c = 1;
        cc = 1;
        noStroke();
    }

    @Override
    public void draw() {
        // background(30);
        // gameManager.update();
        // gameManager.draw(this);
        fill(0, 185, c, 8);
        rect(0, 0, width, height);
        fill(0, c, 190);
        circle(x, y, 100);
        x += circleSpeedx;
        y += circleSpeedy;
        c += cc;
        if (x > width - 40 || x < 40) {
            circleSpeedx *= -1;
        }
        if (y > height - 40 || y < 40) {
            circleSpeedy *= -1;
        }
        if(c > 255 || c < 0){
            cc *= -1;
        }
    }

    @Override
    public void mousePressed() {
        // gameManager.handleClick(mouseX, mouseY);
    }

    public static void main(String[] args) {
        PApplet.main(Main.class);
    }
}
