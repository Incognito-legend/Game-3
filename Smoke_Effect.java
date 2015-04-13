import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Smoke_Effect extends Player
{
    int counter = 1;
    public void act() 
    {
       background level = (background)this.getWorld();
        if(counter == 1) {
           setImage("cloud-0.png");
        }      else if (counter == 2) {
           setImage("cloud-1.png");            
        }      else if (counter == 3) {
           setImage("cloud-2.png");
        }      else if (counter == 4) {
           setImage("cloud-3.png");
        }      else if (counter == 5) {
           setImage("cloud-4.png");
        }      else if (counter == 6) {
           setImage("cloud-5.png");
        }      else if (counter == 7) {
           setImage("cloud-6.png");
        }      else if (counter == 8) {
           setImage("cloud-7.png");
        }      else if (counter == 9) {
           setImage("cloud-8.png");
        }
        if(counter == 10) {
        level.removeObject(this);    
        }
        counter++;
    }
}
