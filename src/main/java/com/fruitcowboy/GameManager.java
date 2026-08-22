package com.fruitcowboy;

import com.fruitcowboy.scenes.Game;
import com.fruitcowboy.scenes.Scene;
import processing.core.PApplet;

/**
 * Holds whichever Scene is currently active and forwards Processing's
 * setup/update/draw/click calls to it. Students shouldn't need to touch
 * this file - add new screens by writing a new Scene, not by editing here.
 *
 * TODO (teacher): wire up switching between multiple scenes, e.g. a
 * setScene(Scene next) method plus Start/Win/Lose scenes calling it.
 */
public class GameManager {

    private Scene currentScene = new Game();

    public void setup(PApplet p) {
        currentScene.setup(p);
    }

    public void update() {
        currentScene.update();
    }

    public void draw(PApplet p) {
        currentScene.draw(p);
    }

    public void handleClick(float x, float y) {
        currentScene.handleClick(x, y);
    }
}
