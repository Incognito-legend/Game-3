import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class stat_increase_effect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class stat_increase_effect extends Player
{
int counter = 1;
GreenfootSound LVL_UP_STAT_Sound;    
public void act() 
    {
        background level = (background)this.getWorld();
        GreenfootSound LVL_UP_STAT_Sound = new GreenfootSound("Level_Up_Stat.wav");
// in constructor (or wherever/whenever you want to start the music
// LVL_UP_STAT_Sound.play(); // or to continuously loop through music 'bg.Sound.playLoop();'
// to stop music (from world class)
// LVL_UP_STAT_Sound.pause(); // or 'bgSound.stop();' 
if(counter == 1) {
           LVL_UP_STAT_Sound.play(); 
           setImage("StUpSpark1.png");
        }      else if (counter == 2) {
           setImage("StUpSpark2.png");            
        }      else if (counter == 3) {
           setImage("StUpSpark3.png");
        }      else if (counter == 4) {
           setImage("StUpSpark4.png");
        }      else if (counter == 5) {
           setImage("StUpSpark5.png");
        }      else if (counter == 6) {
           setImage("StUpSpark6.png");
        }      else if (counter == 7) {
           setImage("StUpSpark7.png");
        }      else if (counter == 8) {
           setImage("StUpSpark8.png");
        }      else if (counter == 9) {
           setImage("StUpSpark9.png");
        }      else if (counter == 10) {
           setImage("StUpSpark10.png");
        }      else if (counter == 11) {
           setImage("StUpSpark11.png");
        } 
        if(counter == 12) {
        level.removeObject(this);    
        }
        counter++;
    }
}    

