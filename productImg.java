import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class production_image here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class productImg extends Actor
{
    GifImage gifImage = new GifImage("Cam Productions.gif");
    
    int count = 1;
    int countII = 1;
    int t = 0;
    
    //int tT = 255;
    boolean tc = false;
    boolean tc2 = true;
    //boolean tc3 = false;
    //boolean notInitialized = true;
    
    public void act() 
    {
        background level = (background)this.getWorld();
        if (tc2){
            
        if (!(tc)){
            
        if (t == 0){
            
            gifImage.getCurrentImage().setTransparency(t);
        
        }
        
        if (t < 255){
            
            gifImage.getCurrentImage().setTransparency(t);
            t = (t + 1);
          
          
            //System.out.println(t); 
            
            //t = (t + 1);
            
        }
        
        if (t == 255){
            //tc = true;
            tc2 = false;
            
        }
        
     }
     
     
        
        
        
     
    
  }
  
  if (!(tc2)){
      
           
            
        //gifImage.getCurrentImage().setTransparency(tT);
        
            if (countII == 100){
                
            level.addObject(new Start_Menu(), 475, 300);
            
            
            
            level.removeObject(this); 
            
        }
        
        countII++;
        
        
        
    }
  if (count <= 180){
            
            setImage(gifImage.getCurrentImage());
            
            //System.out.println(count);
            count++;
     } 
  
  
  
}


    
//     public static void delay(int time){
//     }
        //     public static void setSpeed(int speed){
            //     }
}
