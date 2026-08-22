package com.fruitcowboy;

import processing.core.PApplet;

public class HitEffect {

    private final String text;
    private final float x;
    private final float y;

    public HitEffect(String text, float x, float y) {
        this.text = text;
        this.x = x;
        this.y = y;
    }

    public void update() {
        // TODO: age the effect, expire after ~15-20 frames
    }

    public void draw(PApplet p) {
        // TODO: draw text with scale/fade/rotate animation
    }
}
