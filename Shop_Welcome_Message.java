import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shop_Welcome_Message here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shop_Welcome_Message extends Shop
{
    boolean df = false;
    public void act() 
    {
        if (!(df)){
        setImage("Shop_Welcome_Message[].png");
        df = true;
    }    
}
}