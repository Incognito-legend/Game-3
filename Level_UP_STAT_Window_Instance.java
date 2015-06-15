import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level_Up_Window_No_Mag here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level_UP_STAT_Window_Instance extends Player
{
int counter = 1;
int instance = 1; 
GreenfootSound LVL_UP_STAT_WINDOW_Sound;
public void Act(){
            if (instance == 1){
        background level = (background)this.getWorld();
        GreenfootSound LVL_UP_STAT_WINDOW_Sound = new GreenfootSound("Level_Up_Stat.wav");
        
        if(counter == 1) {
           LVL_UP_STAT_WINDOW_Sound.play(); 
           setImage("Level_Up_Window1-big.png");
        }      else if (counter == 2) {
           setImage("Level_Up_Window1-flip1.png");            
        }      else if (counter == 3) {
           setImage("Level_Up_Window1-flip2.png");
        }      else if (counter == 4) {
           setImage("Level_Up_Window1-flip3.png");
        }      else if (counter == 5) {
           setImage("Level_Up_Window1-flip4.png");
        }      else if (counter == 6) {
           setImage("Level_Up_Window1-flip5.png");
        }      else if (counter == 7) {
           setImage("Level_Up_Window1-flip6.png");
        }      else if (counter == 8) {
           setImage("Level_Up_Window1-flip7.png");
        }      else if (counter == 9) {
           setImage("Level_Up_Window1-flip8.png");
        }      else if(counter == 10) {
        instance = 2;        
        }      else if (counter == 20){
        level.removeObject(this);
        }
        counter++;
    }
    ///end ^
    //start v
    //non-switch stage - regular level up - increase magic/non-magic player Level by 1! (if int exp = 100) -> set to 0 again.
    if (instance == 2){
       setImage("Level_Up_Window1-big.png");  
}
}
}