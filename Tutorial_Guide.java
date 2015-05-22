import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tutorial_Guide here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tutorial_Guide extends Player
{
    boolean check = true;
    GreenfootImage Tutorial_Guide = new GreenfootImage("Tutorial Guide.png");
    public void act() 
    {
        if (check){
        setImage(Tutorial_Guide);
        Tutorial_Guide.scale(Tutorial_Guide.getWidth()*5,Tutorial_Guide.getHeight()*5);
        check = false;
}
}
}