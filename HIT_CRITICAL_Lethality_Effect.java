import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HIT_CRITICAL_Lethality_Effect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HIT_CRITICAL_Lethality_Effect extends Weapons_and_Armor_Animation_Effects
{
        int sprite_num = 1;
    public void act() 
    {
       background level = (background)this.getWorld();
        if(sprite_num == 1) {
           setImage(".png");
        }      else if (sprite_num == 2) {
           setImage(".png");            
        }      else if (sprite_num == 3) {
           setImage(".png");
        }      else if (sprite_num == 4) {
           setImage(".png");
        }      else if (sprite_num == 5) {
           setImage(".png");
        }      else if (sprite_num == 6) {
           setImage(".png");
        }      else if (sprite_num == 7) {
           setImage(".png");
        }      else if (sprite_num == 8) {
           setImage(".png");
        if(sprite_num == 53) {
        level.removeObject(this);    
        }
        sprite_num++;
    }
    }    

}
