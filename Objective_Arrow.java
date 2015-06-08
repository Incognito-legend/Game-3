import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Objective_Arrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Objective_Arrow extends Actor
{
    int counter = 0;
    
    int width = 216;
    int height = 256;
    
    int pos_x = -1358;
    int pos_y = -2045;
    int x = 412;
    int y = 489;
    public void act() 
    {
        if (counter == 0){
       setImage("Objective_Arrow_1(up).png");    
  } else if (counter == 25){
      setImage("Objective_Arrow_2(up).png");
}
        counter = (counter + 1) % 50;
        setLocation(pos_x, pos_y);
    }
      
    public void setLocation(int pos_x, int pos_y){
        
    }
}
// 
//         public void scroll(int dx, int dy)
//     {
//        pos_x = pos_x + dx;
//        
//        pos_y += dy;
// 
//        //System.out.println("pos_x " + pos_x + ", pos_y " + pos_y);
// }
//     }
