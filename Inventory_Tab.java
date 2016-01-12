import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the inventory tab for the player, all items will be placed in this, and the following code in public void act(){...} will effect all items when picked up.
 * 
 * @author Cameron Wilson
 * @version 1/12/2016, 11:11 AM.
 */
public class Inventory_Tab extends Player
{
    private int imageCount = 3; // number of images in the animation
    private int actsPerImage = 10; // act cycles per image
    private int animationActCounter = 0; // act counter for the animatio    
    int imageNumber = animationActCounter / actsPerImage;
    
    boolean Inventory_Opened = false;
    int counter = 0;
    public void act() 
    {
         animationActCounter = (animationActCounter + 1) % (imageCount * actsPerImage); // act counter that cycles for each complete cycle of images
//         if (animationActCounter % actsPerImage == 0){ // if time to change image
//         System.out.println("animationActCounter: " + animationActCounter + " imageCount: " + imageCount + " actsPerImage: " + actsPerImage + " imageNumber: " + imageNumber);
//        }
        if ((Greenfoot.isKeyDown("space")) && (!(Inventory_Opened)) && (animationActCounter % actsPerImage == 0)){
            System.out.println("animationActCounter: " + animationActCounter + " imageCount: " + imageCount + " actsPerImage: " + actsPerImage + " imageNumber: " + imageNumber);
            if (counter == 1){
            setImage("inventory_tab_closed_animation.png");
            } else if (counter == 2){
            setImage("inventory_tab_closed.png");
            } else if (counter == 3){
            setImage("inventory_tab_resized_x5.png");
            } else if (counter == 4){
              
            Inventory_Opened = true;
            
            }
            counter = (counter + 1) % 4;
        } else if ((Greenfoot.isKeyDown("space")) && (Inventory_Opened) && (animationActCounter % actsPerImage == 0)){
            setImage("inventory_tab_closed.png");
            Inventory_Opened = false;
            
    } 
}
    }

