package com.fruitcowboy.fruits;

import com.fruitcowboy.Util;

import processing.core.PApplet;
import processing.core.PImage;
public abstract class Fruit {
   // this is the Parent class - you will make fruits based on this.
   private float x, y, vx, vy, gravity;
   private PImage img;
   private int hitbox;

   public Fruit(float x, float y, float vx, float vy, float gravity, int hitbox, String imagepath) {
      this.x = x;
      this.y = y;
      this.vx = vx;
      this.vy = vy;
      this.gravity = gravity;
      this.hitbox = hitbox;
      this.img = Util.circleCrop(imagepath, this.hitbox);
   }

   public void move(PApplet p) {
      p.image(this.img, this.x,  this.y);
      this.x += this.vx;
      this.y -= this.vy;
      this.vy -= this.gravity;

   }

   public void destroy() {

   }
}