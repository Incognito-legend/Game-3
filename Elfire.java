import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fireball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elfire extends Player
{
    int counter = 1;
    GreenfootSound Fire = new GreenfootSound("elfire.wav");
    public void act() 
    {
       background level = (background)this.getWorld();
        if(counter == 1) {
           Fire.play();
           setImage("elifire1.png");
        }      else if (counter == 2) {
           setImage("elifire2.png");            
        }      else if (counter == 3) {
           setImage("elifire3.png");
        }      else if (counter == 4) {
           setImage("elifire4.png");
        }      else if (counter == 5) {
           setImage("elifire5.png");
        }      else if (counter == 6) {
           setImage("elifire6.png");
        }      else if (counter == 7) {
           setImage("elifire7.png");
        }      else if (counter == 8) {
           setImage("elifire8.png");
        }      else if (counter == 9) {
           setImage("elifire9.png");
        }      else if (counter == 10) {
           setImage("elifire10.png");
        }      else if (counter == 11) {
           setImage("elifire11.png");
        }      else if (counter == 12) {
           setImage("elifire12.png");
        }      else if (counter == 13) {
           setImage("elifire13.png");
        }      else if (counter == 14) {
           setImage("elifire14.png");
        }
        if(counter == 15) {
        //level.addObject(new BattleScene(), 475, 300);
        level.removeObject(this);   
        Player.fireWait = false;
        }
        counter++;
    }
}
