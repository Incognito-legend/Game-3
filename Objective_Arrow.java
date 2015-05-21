import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Objective_Arrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Objective_Arrow extends Actor
{
    GreenfootImage Objective_Arrow_1 = new GreenfootImage("Objective_Arrow_1(up).png");
    GreenfootImage Objective_Arrow_2 = new GreenfootImage("Objective_Arrow_2(up).png");
    int counter = 0;
    int timer = 0;
    int width = 216;
    int height = 256;
    public void act() 
    {
            int width = 216;
            int height = 256;
        background level = (background)this.getWorld();
        Objective_Arrow_1.scale(Objective_Arrow_1.getWidth()/2,Objective_Arrow_1.getHeight()/2);
        Objective_Arrow_2.scale(Objective_Arrow_2.getWidth()/2,Objective_Arrow_2.getHeight()/2);
               if (counter == 0 && timer == 9) {
            setImage("Objective_Arrow_1(up).png");
//             setBackground(map_Lobby);
        } else if (counter == 1 && timer == 9) {
            setImage("Objective_Arrow_1(up).png");
        } else if (counter == 2 && timer == 9) {
            setImage("Objective_Arrow_1(up).png");
        } else if (counter == 3 && timer == 9) {
            setImage("Objective_Arrow_2(up).png");
        } else if (counter == 4 && timer == 9) {
            setImage("Objective_Arrow_2(up).png");
        } else if (counter == 5 && timer == 9) {
            setImage("Objective_Arrow_2(up).png");
        }
        counter = (counter + 1) % 6;
        timer = (timer +1) % 10;
        }
    }    
