package com.fruitcowboy;

import processing.core.PApplet;

public class Main extends PApplet {

    private GameManager gameManager;

    @Override
    public void settings() {
        size(800, 600);
    }

    @Override
    public void setup() {
        gameManager = new GameManager();
        gameManager.setup(this);
    }

    @Override
    public void draw() {
        background(30);
        gameManager.update();
        gameManager.draw(this);
    }

    @Override
    public void mousePressed() {
        gameManager.handleClick(mouseX, mouseY);
    }

    public static void main(String[] args) {
        PApplet.main(Main.class);
    }
}
