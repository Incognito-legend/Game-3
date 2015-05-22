import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Date;
import java.util.List;
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
    public Tutorial_Guide() 
    {
        Date d = new Date();
        if ((check)){
        setImage(Tutorial_Guide);
        Tutorial_Guide.scale(Tutorial_Guide.getWidth()*2,Tutorial_Guide.getHeight()*2);
        check = false;
        System.out.println("End of T.O. Check!: " + d);
}
}
}