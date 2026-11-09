package com.fruitcowboy.fruits;

import com.fruitcowboy.Util;

import processing.core.PApplet;
import processing.core.PImage;

public abstract class Fruit {
   float x, y, vx, vy, gravity;
   int radius;
   PImage img;

   public Fruit(float x, float y, float vx, float vy, float gravity, String image_path, int radius){
      this.x = x;
      this.y = y;
      this.vx = vx;
      this.vy = vy;
      this.gravity = gravity;
      this.img = Util.circleCrop(image_path, radius);
      this.radius = radius;
   
   }
   // P = Processing
   public void move(PApplet p){
        this.x += this.vx;
        this.y -= this.vy;
        this.vy = this.vy - this.gravity;
        p.image(this.img, this.x, this.y);
   }
   void destroy(){

   }
    
}
