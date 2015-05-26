import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Objective_Arrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Objective_Arrow extends Actor
{
    int counter = 0;
    int timer = 0;
    int time_count = 0;
    public void act() 
    {
            int width = 216;
            int height = 256;

               if (counter == 0 && timer == 9) {
            setImage("Objective_Arrow_1(up).png");
//             setBackground(map_Lobby);
            System.out.println("time_count = " + Integer.toString(timer));
        } else if (counter == 1 && timer == 9) {
            setImage("Objective_Arrow_1(up).png");
            
            System.out.println("time_count = " + Integer.toString(timer));
        } else if (counter == 2 && timer == 9) {
            setImage("Objective_Arrow_1(up).png");
            System.out.println("time_count = " + Integer.toString(timer));
        } else if (counter == 3 && timer == 9) {
            setImage("Objective_Arrow_2(up).png");
            System.out.println("time_count = " + Integer.toString(timer));
        } else if (counter == 4 && timer == 9) {
            setImage("Objective_Arrow_2(up).png");
            System.out.println("time_count = " + Integer.toString(timer));
        } else if (counter == 5 && timer == 9) {
            setImage("Objective_Arrow_2(up).png");
            System.out.println("time_count = " + Integer.toString(timer));
        }
//         time_count = time_count + 1;
        counter = (counter + 1) % 6;
        timer = (timer + 1) % 10;
        }
    }    
