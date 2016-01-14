import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.core.WorldHandler;
import javax.swing.*;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Toolkit;
public class cursor extends Actor

{
    GreenfootImage cImage = new GreenfootImage("Mouse_Cursor.png");
    boolean cdf = false;
    int x;
    int y;

//  
// public void act()
// {
//     if (timer > 0)
//     {
//         timer--;
//         if (timer == 0) /* change image back */;
//     }
//     else if (Greenfoot.mouseClicked(this))
//     {
//         play();
//         setImage("left.png");
//         timer = 100;
//     }
// }
    public void act() 
    {
        background wc = (background)this.getWorld();
        if (!(cdf)){
        wc.ChangeMouseImage(cImage, x, y);
        cdf = true;
    }    



    

    
    
}

}