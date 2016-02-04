import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class start_Button__ extends Start_Menu
{

    public void act() 
    {
        background level = (background)this.getWorld();
        if (background.smscheck){
            level.removeObject(this);
    }    
}
}