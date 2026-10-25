package com.fruitcowboy;

import processing.core.PGraphics;

import processing.core.PImage;

import processing.core.PApplet;

public class Util {
    private static PApplet p;
    private Util (){}
    public static  void init(PApplet applet){
        p = applet;
    }

    PImage circleCrop(PImage src) {
        PGraphics mask = p.createGraphics(src.width, src.height);
        mask.beginDraw();
        mask.background(0);
        mask.noStroke();
        mask.fill(255);
        mask.ellipse(src.width / 2, src.height / 2, src.width, src.height);
        mask.endDraw();

        PImage result = src.copy();
        result.mask(mask);
        return result;
    }
}
