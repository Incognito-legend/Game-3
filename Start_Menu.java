import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.awt.Color;
/**
 * Write a description of class Start_Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start_Menu extends Actor
{
    GifImage gifImageII = new GifImage("Start Menu.gif");
    public static boolean Game_Start_Idle = true;
//     boolean fc = false;
    boolean tc2 = true;
    boolean tc = false;
    boolean check = false;
    int t = 0;
//     public int fadeLevel = 0;
    public void act() 
    {
        background level = (background)this.getWorld();
        if (Game_Start_Idle){
            
        setImage(gifImageII.getCurrentImage());
        //         fade(fadeLevel++);

    // if (!(fc)){
      //     fade(0);
    //     fc = true;
    // }
   if (tc2){
            
        if (!(tc)){
            
        if (t == 0){
            
            gifImageII.getCurrentImage().setTransparency(t);
        
        }
        
        if (t < 255){
            
            gifImageII.getCurrentImage().setTransparency(t);
            t++;
          
          
            //System.out.println(t); 
            
            //t = (t + 1);
            
        }
        
        if (t == 255){
            //tc = true;
            t = 255;
            gifImageII.getCurrentImage().setTransparency(255);
            tc2 = false;
            
        }
        
     }        
     
   }

   if ((!(tc2)) && (!(check))){

    
    level.addObject(new start_Button__(), 475, 550);
    check = true;
    }
    
   if ((!(tc2)) && (check)){
   if (Greenfoot.isKeyDown("space")){
       Game_Start_Idle = false;
   }
}
}
if (!(Game_Start_Idle)){
background.startMenuSelect(true);
level.removeObject(this);
}
}
public void setTransparency(int t){}

// public void fade(int f)
//     {
//         if (f > 255)
//         {
//             f = 255;
//         }
//         else if (f < 0)
//         {
//             f = 0;
//         }
//          
//         GreenfootImage fade = new GreenfootImage(600, 400);
//         Color fadeColor;
//         fadeColor = new Color(0, 0, 0, f);
//         fade.clear();
//         fade.setColor(fadeColor);
//         fade.fillRect(0, 0, 600, 400);
//         setImage(fade);
//     }
}
