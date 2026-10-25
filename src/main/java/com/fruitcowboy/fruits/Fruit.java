package com.fruitcowboy.fruits;

import processing.core.PApplet;
//TODO TODO abstract TODO TODO
public class Fruit {
   // this is the Parent class - you will make fruits based on this.
   private float x, y, vx, vy, gravity, hitbox;

   public Fruit(float x, float y, float vx, float vy, float gravity, float hitbox) {
      this.x = x;
      this.y = y;
      this.vx = vx;
      this.vy = vy;
      this.gravity = gravity;
      this.hitbox = hitbox;
   }

   public void move(PApplet p) {
      p.circle(this.x, this.y, this.hitbox);
      this.x += this.vx;
      this.y -= this.vy;
      this.vy -= this.gravity;

   }

   public void destroy() {

   }
}