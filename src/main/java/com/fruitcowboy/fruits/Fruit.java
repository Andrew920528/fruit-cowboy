package com.fruitcowboy.fruits;

import processing.core.PApplet;

public abstract class Fruit {
   float x, y, vx, vy, gravity;
   String image_path;
   int radius;

   public Fruit(float x, float y, float vx, float vy, float gravity){
      this.x = x;
      this.y = y;
      this.vx = vx;
      this.vy = vy;
      this.gravity = gravity;  
   }
   // P = Processing
   public void move(PApplet p){
        this.x += this.vx;
        this.y -= this.vy;
        this.vy = this.vy - this.gravity;
        p.circle(this.x, this.y, 60);
   }
   void destroy(){

   }
    
}
