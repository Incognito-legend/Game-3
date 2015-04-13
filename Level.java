import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level extends Actor
{
   public Level()
   {
    GreenfootImage image = getImage();
            image.scale(image.getWidth()*6,image.getHeight()*6);
            setImage(image);
        }
}
