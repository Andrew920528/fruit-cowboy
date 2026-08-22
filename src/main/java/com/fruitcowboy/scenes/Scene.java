package com.fruitcowboy.scenes;

import processing.core.PApplet;

/**
 * One "screen" of the game (e.g. Game, Start, Win, Lose).
 * GameManager just calls whichever Scene is currently active - add a new
 * Scene by writing a new class that implements this interface.
 */
public interface Scene {

    void setup(PApplet p);

    void update();

    void draw(PApplet p);

    void handleClick(float x, float y);
}
