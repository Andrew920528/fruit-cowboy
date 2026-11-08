package com.fruitcowboy;

import processing.core.PGraphics;

import processing.core.PImage;

import processing.core.PApplet;
import processing.core.PConstants;

public class Util {
    private static PApplet p;

    private Util() {
    }

    public static void init(PApplet applet) {
        p = applet;
    }

    public static PImage circleCrop(String src, int radius) {
        PImage photo = p.loadImage(src);
        if (photo == null) {
            throw new RuntimeException("Couldn't load image: " + src);
        }

        int side = Math.min(photo.width, photo.height);
        int sx = (photo.width - side) / 2;
        int sy = (photo.height - side) / 2;
        PImage result = photo.get(sx, sy, side, side);

        int size = radius * 2;
        result.resize(size, size);

        result.format = PConstants.ARGB;
        result.loadPixels();
        float c = size / 2f;
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                float dx = x + 0.5f - c;
                float dy = y + 0.5f - c;
                if (dx * dx + dy * dy > c * c) {
                    result.pixels[y * size + x] = 0;
                }
            }
        }
        result.updatePixels();
        return result;
    }
}
