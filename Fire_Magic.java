import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fire_Magic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fire_Magic extends Magic
{
    
    boolean magicStatsWindowCheck = false;
    
    int check = 1;
     public void act() 
    {
        background level = (background)this.getWorld();
        if (!(magicStatsWindowCheck)){
            setImage("Fire Aspect - Transparent Background.png");
            GreenfootImage image = getImage();
            image.scale(14*3, 14*3);
            setImage(image);
            
            magicStatsWindowCheck = true;
    }
    if (check == 100){
    
    }
    check = (check + 1) % 101;
    } 
    void setTransparency(int t){}
}
