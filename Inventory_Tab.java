import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the inventory tab for the player, all items will be placed in this, and the following code in public void act(){...} will effect all items when picked up.
 * 
 * @author Cameron Wilson
 * @version 1/12/2016, 11:11 AM.
 */
public class Inventory_Tab extends Player
{
    private int imageCount = 5; // number of images in the animation
    private int actsPerImage = 5; // act cycles per image
    private int animationActCounter = 0; // act counter for the animatio    
    int imageNumber = animationActCounter / actsPerImage;
    
    boolean Inventory_Opened = false;
    boolean df = false;
    static boolean invCheckThis = false;
    static boolean check = false;
    int counter = 0;
    int iM;
    int iN;
    int t = 0;
    public void act() 
    {
    background inventory = (background)this.getWorld();     
         animationActCounter = (animationActCounter + 1) % (imageCount * actsPerImage); // act counter that cycles for each complete cycle of images
         //         if (animationActCounter % actsPerImage == 0){ // if time to change image
             //         System.out.println("animationActCounter: " + animationActCounter + " imageCount: " + imageCount + " actsPerImage: " + actsPerImage + " imageNumber: " + imageNumber);
             //        }
        if ((Greenfoot.isKeyDown("space")) && (!(Inventory_Opened)) && (!(df)) && (animationActCounter % actsPerImage == 0)){
            //System.out.println("animationActCounter: " + animationActCounter + " imageCount: " + imageCount + " actsPerImage: " + actsPerImage + " imageNumber: " + imageNumber);
            df = true;
        } else if ((Greenfoot.isKeyDown("space")) && (Inventory_Opened)){
            df = false;
            
    }
    if ((df) && (!(Inventory_Opened))){
     invTabImgOpen();
    }
    if ((!(df)) && (Inventory_Opened)){
     invTabImgClose();
    }
     if ((invCheckThis) && (iM == 3) && (iN == 2)){
        setImage("inventory_tab_closed.png");
        getImage().setTransparency(t);
        invCheckThis = false;
        
    }
    
    
}

void    setTransparency(int t){}

public static int setMN(int m, int n){
    if (!(check)){
    if ((m == 3) && (n == 2)){
        checkDF(true);
    }
}

    return m & n;
}


public static boolean checkDF(boolean invCheck){
   if (invCheck){
       invCheckThis = true;
    } else if (!(invCheck)){
       invCheckThis = false;
    }
    return invCheck;
}


public void invTabImgOpen(){
    if (!(Inventory_Opened)){
    if (counter == 1){
            setImage("inventory_tab_closed.png");
            } else if (counter == 2){
            setImage("inventory_tab_closed_animation.png");
            } else if (counter == 3){
            setImage("inventory_tab_resized_x5_ap1.png");
            } else if (counter == 4){
            setImage("inventory_tab_resized_x5_ap2.png");
            } else if (counter == 5){
            setImage("inventory_tab_resized_x5_ap3.png");
            } else if (counter == 6){
            setImage("inventory_tab_resized_x5_ap4.png");
            } else if (counter == 7){
              
            Inventory_Opened = true;
            
            
            
            }
            counter = (counter + 1) % 8;
}
}



public void invTabImgClose(){
    if (Inventory_Opened){
    if (counter == 1){
            setImage("inventory_tab_resized_x5_ap4.png");
            } else if (counter == 2){
            setImage("inventory_tab_resized_x5_ap3.png");
            } else if (counter == 3){
            setImage("inventory_tab_resized_x5_ap2.png");
            } else if (counter == 4){
            
            setImage("inventory_tab_resized_x5_ap1.png");
            } else if (counter == 5){
            
            setImage("inventory_tab_closed_animation.png");
            } else if (counter == 6){
            
            setImage("inventory_tab_closed.png");
            } else if (counter == 7){
              
            Inventory_Opened = false;
            
            
            
            }
            counter = (counter + 1) % 8;
    }
}




    }

