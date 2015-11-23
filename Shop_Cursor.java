import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shop_Cursor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shop_Cursor extends Interface_Ai
{
int x;
int y;
int counter_2 = 0;
int side;
int left = 0;
int right = 6;
boolean General_Synopsis = true;
boolean dirtyFlag_Shop = false;
     public void act() 
     {
         if (General_Synopsis){
             if (!(dirtyFlag_Shop)){
                 side = left;
                 dirtyFlag_Shop = true;
                }
         if (Greenfoot.isKeyDown("a"))
         {
             
             if ((side == left) && (!(side == right)))
             {
                 setLocation(300, y);
                 
             } else if ((side == right) && (!(side == left)))
             {
                    setLocation(700, y);
             }
             side = (side + 1) % 7;
    }
     else if (Greenfoot.isKeyDown("w"))
    {
              if ((side == left) && (!(side == right))){
        if(counter_2 == 2) {
           setLocation(300, 250);
           System.out.println("Spells");
        }      else if (counter_2 == 4) {
           setLocation(300, 300);         
        }      else if (counter_2 == 6) {
           setLocation(300, 350);
        }      else if (counter_2 == 8) {
           setLocation(300, 400);
        }      else if (counter_2 == 10) {
           setLocation(300, 450);
        }      else if (counter_2 == 12) {
           setLocation(300, 500);
        }      else if (counter_2 == 14) {
           setLocation(300, 550);
        }
        counter_2 = (counter_2 + 1) % 16;
    } else if ((side == right) && (!(side == left)))
    {
       
         if (counter_2 == 2) {
           setLocation(700, 250);
        }      else if (counter_2 == 4) {
           setLocation(700, );
        }      else if (counter_2 == 6) {
           setLocation(700, );
        }      else if (counter_2 == 8) {
           setLocation(700,);
        }      else if (counter_2 == 10) {
           setLocation(700,);
        }      else if (counter_2 == 12) {
           setLocation(700,);
        }      else if (counter_2 == 14) {
           setLocation(700,);
        }
        counter_2 = (counter_2 + 1) % 16;
    }
        
    }
     else if (Greenfoot.isKeyDown("s"))
    {
                  if ((side == left) && (!(side == right))){
        if(counter_2 == 2) {
           setLocation(300, 250);
        }      else if (counter_2 == 4) {
           setLocation(300, );         
        }      else if (counter_2 == 6) {
           setLocation(300, );
        }      else if (counter_2 == 8) {
           setLocation(300, );
        }      else if (counter_2 == 10) {
           setLocation(300,);
        }      else if (counter_2 == 12) {
           setLocation(300, );
        }      else if (counter_2 == 14) {
           setLocation(300, );
        }
        counter_2 = ((counter_2) + 1) % 16;
    } else if ((side == right) && (!(side == left)))
    {
         if (counter_2 == 2) {
           setLocation(700, 250);
        }      else if (counter_2 == 4) {
           setLocation(700, );
        }      else if (counter_2 == 6) {
           setLocation(700, );
        }      else if (counter_2 == 8) {
           setLocation(700, );
        }      else if (counter_2 == 10) {
           setLocation(700, );
        }      else if (counter_2 == 12) {
           setLocation(700, );
        }      else if (counter_2 == 14) {
           setLocation(700, );
        }
        counter_2 = ((counter_2) + 1) % 16;
    }
           
    }
     else if (Greenfoot.isKeyDown("d"))
    {
        
        if (side == left)
             {
                 setLocation(300, y);
                } else if (side == right)
                {
                    setLocation(700, y);
                }
             side = (side + 1) % 7;
        
    } 
     else if (Greenfoot.isKeyDown("space"))
    {
        if(counter_2 == 2) {
            
           System.out.println("Spells");
           
        }      else if (counter_2 == 4) {
            
           System.out.println("Spells");   
           
        }      else if (counter_2 == 6) {
            
           System.out.println("Spells");
           
        }      else if (counter_2 == 8) {
            
           System.out.println("Spells");
           
        }      else if (counter_2 == 10) {
            
           System.out.println("Spells");
           
        }      else if (counter_2 == 12) {
            
           System.out.println("Spells");
           
        }      else if (counter_2 == 14) {
            
           System.out.println("Spells");
           
        }      else if (counter_2 == 16) {
            
           System.out.println("Spells");
           
        }      else if (counter_2 == 18) {
            
           System.out.println("Spells");
           
        }      else if (counter_2 == 20) {
            
           System.out.println("Spells");
           
        }      else if (counter_2 == 22) {
            
           System.out.println("Spells");
           
        }      else if (counter_2 == 24) {
            
           System.out.println("Spells");
           
        }      else if (counter_2 == 26) {
            
           System.out.println("Spells");
           
        }      else if (counter_2 == 28) {
            
           System.out.println("Spells");
           
        }
    }
}    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

}
}
