import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shop_option_14 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shop_option_14 extends Shop
{
    boolean df = false;
    public void act() 
    {
        background level = (background)this.getWorld();
        if (!(df)){
        setImage("Shop_Exit[].png");
        df = true;
    }
    if (background.removeShopObjects(true)){
        level.removeObject(this);
    }    
    
}
}
