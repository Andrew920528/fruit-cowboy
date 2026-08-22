package com.fruitcowboy.scenes;

import processing.core.PApplet;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * The main gameplay scene. This is where fruits spawn, get clicked, and
 * score/lives change - build the real game in here.
 */
public class Game implements Scene {

    private int score = 0;
    private int lives = 3;

    // --- dummy demo state, delete once real gameplay is built ---
    private float circleX;
    private float circleSpeed = 3;
    private final ArrayList<int[]> clickMarkers = new ArrayList<>(); // {x, y, age}

    @Override
    public void setup(PApplet p) {
        // TODO: real setup (load assets, spawn first fruits, etc.)
        circleX = p.width / 2f;
    }

    @Override
    public void update() {
        // TODO: advance spawn timers, update fruits, update/expire hit effects
    }

    @Override
    public void draw(PApplet p) {
        // TODO: draw fruits, hit effects, and HUD (score/lives text)
        drawDummyDemo(p);
    }

    @Override
    public void handleClick(float x, float y) {
        // TODO: check click against active fruits, trigger hit or miss logic
        clickMarkers.add(new int[]{(int) x, (int) y, 0});
    }

    /**
     * Just a smoke test to prove shapes, animation, text, and clicks all
     * work end to end. Safe to delete once real fruits/effects exist.
     */
    private void drawDummyDemo(PApplet p) {
        // a bouncing circle (shape + animation)
        circleX += circleSpeed;
        if (circleX > p.width - 40 || circleX < 40) {
            circleSpeed *= -1;
        }
        p.fill(255, 200, 0);
        p.noStroke();
        p.circle(circleX, p.height / 2f, 60);

        // title + instructions (text)
        p.fill(255);
        p.textSize(28);
        p.textAlign(PApplet.CENTER, PApplet.TOP);
        p.text("Fruit Cowboy", p.width / 2f, 20);
        p.textSize(14);
        p.text("Click anywhere to test mouse input", p.width / 2f, 55);

        // fading markers where the player clicked (mouse click feedback)
        Iterator<int[]> it = clickMarkers.iterator();
        while (it.hasNext()) {
            int[] marker = it.next();
            int age = marker[2];
            float alpha = PApplet.map(age, 0, 30, 255, 0);
            if (alpha <= 0) {
                it.remove();
                continue;
            }
            p.noFill();
            p.stroke(255, 0, 0, alpha);
            p.strokeWeight(3);
            p.circle(marker[0], marker[1], 20 + age);
            marker[2] = age + 1;
        }
    }
}
