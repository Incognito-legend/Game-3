import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fireball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fireball extends Player
{
    int counter = 1;
    GreenfootSound Fire = new GreenfootSound("fire fixed.wav");
    public void act() 
    {
       background level = (background)this.getWorld();
        if(counter == 1) {
           Fire.play();
           setImage("fire1.png");
        }      else if (counter == 2) {
           setImage("fire2.png");            
        }      else if (counter == 3) {
           setImage("fire3.png");
        }      else if (counter == 4) {
           setImage("fire4.png");
        }      else if (counter == 5) {
           setImage("fire5.png");
        }      else if (counter == 6) {
           setImage("fire6.png");
        }      else if (counter == 7) {
           setImage("fire7.png");
        }      else if (counter == 8) {
           setImage("fire8.png");
        }      else if (counter == 9) {
           setImage("fire9.png");
        }      else if (counter == 10) {
           setImage("fire10.png");
        }      else if (counter == 11) {
           setImage("fire11.png");
        }      else if (counter == 12) {
           setImage("fire12.png");
        }      else if (counter == 13) {
           setImage("fire13.png");
        }      else if (counter == 14) {
           setImage("fire14.png");
        }      else if (counter == 15) {
           setImage("fire15.png");
        }      else if (counter == 16) {
           setImage("fire16.png");
        }      else if (counter == 17) {
           setImage("fire17.png");
        }      else if (counter == 18) {
           setImage("fire18.png");
        }      else if (counter == 19) {
           setImage("fire19.png");
        }      else if (counter == 20) {
           setImage("fire20.png");
        }      else if (counter == 21) {
           setImage("fire21.png");
        }
        if(counter == 22) {
        //level.addObject(new BattleScene(), 475, 300);
        level.removeObject(this);   
        Player.fireWait = false;
        }
        counter++;
    }
}
