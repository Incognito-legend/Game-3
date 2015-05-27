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
    private long lastMark = System.currentTimeMillis();
    private SimpleTimer timer = new SimpleTimer();
//     int timer = 0;
//     int seconds = 0;
    public void act() 
    {
            int width = 216;
            int height = 256;
if ((counter == 0) && (timer.millisElapsed() > 1000 && Gr           eenfoot.isKeyDown("space"))){
     setImage("Objective_Arrow_1(up).png");
timer.mark();
             System.out.println("seconds = " + Integer.toString(timer.millisElapsed()));
        } else if ((counter == 1) && (timer.millisElapsed() > 1000 && Greenfoot.isKeyDown("space"))){
            
            setImage("Objective_Arrow_2(up).png");
timer.mark();
             System.out.println("seconds = " + Integer.toString(timer.millisElapsed()));

        }
        counter = (counter + 1) % 2;
        }
    public void mark()
    {
        lastMark = System.currentTimeMillis();
    }
        public int millisElapsed()
    {
        return (int) (System.currentTimeMillis() - lastMark);
    }
    }    
