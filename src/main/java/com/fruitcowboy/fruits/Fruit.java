package com.fruitcowboy.fruits;

import processing.core.PApplet;

public abstract class Fruit {
   // this is the Parent class - you will make fruits based on this.
   private float x, y, vx, vy, gravity;

   public Fruit(float x, float y, float vx, float vy, float gravity) {
      this.x = x;
      this.y = y;
      this.vx = vx;
      this.vy = vy;
      this.gravity = gravity;
   }

   public void move() {

   }
   public void destroy(){
      
   }
}