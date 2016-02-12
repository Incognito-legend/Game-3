import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Color here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Color extends background
{
    

    /**
     * Constructor for objects of class Color.
     * 
     */
    public static void Color()
    {
        
    }
    public static void Begin(){
        int[] x = { 
                50, 61, 83, 69, 71, 50, 29, 31, 17, 39
     };

        fill(0);
        // Read one array element each time through the for loop
      for (int i = 0; i < x.length; i++) {
        drawRect(0, i*10, x[i], 8);
      }
                                             
    }
    
    public static int fill(int i){return i;}
    
    public static void drawRect(int x, int y, int width, int height){
/**
 * Draw the outline of the specified rectangle. 
 * 
 * The left and right edges of the rectangle are at x and x + width.
 * 
 * The top and bottom edges are at y and y + height.
 * 
 * The rectangle is drawn using the current color.
 * 
 * Parameters:
 * 
 * x - the x coordinate of the rectangle to be drawn.
 * 
 * y - the y coordinate of the rectangle to be drawn.
 * 
 * width - the width of the rectangle to be drawn.
 * 
 * height - the height of the rectangle to be drawn.
 */  





}
}
