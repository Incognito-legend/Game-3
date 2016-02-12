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
    static boolean cdfCheckTwo = true;
    public void act() 
    {
        background wc = (background)this.getWorld();
        if (!(cdf)){
        wc.ChangeMouseImage(cImage, x, y);
        cdf = true;
    }
    
        if (Greenfoot.mouseClicked(this)){
            
             
        
        }

        if (background.mousePressed(true)){
            if(background.bcc){
            DF_Check(true);
        }
            if (!(cdfCheckTwo)){
        }
    }
    

    
    
 }
  public static boolean DF_Check(boolean cdfCheck){
   if (cdfCheck){
        cdfCheckTwo = false;
   }
    return cdfCheck;
  }
}