import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ai here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ai extends Actor
{
boolean Ai_Interface = true;
    public Ai() 
    {
        if ((Greenfoot.isKeyDown("Space")) && (Ai_Interface)){
            
            Ai_Interface = false;
    }    
}
}