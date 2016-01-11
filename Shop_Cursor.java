import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shop_Cursor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shop_Cursor extends Interface_Ai
{

int counter_1_ = 0;
int counter_2_ = 0;
int counter_3_ = 0;
int counter_4_ = 0;
int side = 1;
boolean Left = true;
boolean Right = false;
boolean General_Synopsis = true;
boolean dirtyFlag_Shop = false;
boolean keyAlreadyPressed = false;
int y = 250;
int x = 300;

     public void act() 
     {
         if (General_Synopsis){
             if (Greenfoot.isKeyDown("a")){
                 if (x == 700){
                    setLocation(300, getY());
                    x = getX();
                    y = getY();
                    //System.out.println("x" + x + " y" + y);
                    }
                }
             if (Greenfoot.isKeyDown("d")){
                 if (x == 300){
                     setLocation(700, getY());
                     x = getX();
                     y = getY();
                     //System.out.println("x" + x + " y" + y);
                    }
                }
             if (Greenfoot.isKeyDown("w")){
                 if (y > 250){
                     setLocation(getX(), getY() - 50);
                     x = getX();
                     y = getY();                    
                     //System.out.println("x" + x + " y" + y);
                    }
                }
             if (Greenfoot.isKeyDown("s")){
                 if (y < 550){
                     setLocation(getX(), getY() + 50);
                     x = getX();
                     y = getY();
                     //System.out.println("x" + x + " y" + y);
                    }
                }
            }
        }
        

    
}    

      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

