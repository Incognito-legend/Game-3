import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shop_option_8 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shop_option_8 extends Shop
{
   boolean df = false;
    public void act() 
    {
        if (!(df)){
        setImage("Shop_option_8[].png");
        df = true;
    }    
    background level = (background)this.getWorld();
    if (Shop_Cursor.setRoom) {
                
            level.removeObject(this);
            
        }
}
}