import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shop_Cursor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shop_Cursor extends Interface_Ai
{

int counter_1_ = 0;
int counter_2_ = 0;
int counter_3_ = 0;
int counter_4_ = 0;
int side = 1;
boolean Left = true;
boolean Right = false;
boolean General_Synopsis = true;
boolean dirtyFlag_Shop = false;
boolean keyAlreadyPressed = false;
int y;
int x;

     public void act() 
     {
         if (General_Synopsis){
             
//     if (!(dirtyFlag_Shop))
//              
//              {
//                  
//                  side = 1;
//                  x = 300;
//                  y = 250;
//                  
//                  dirtyFlag_Shop = true;
//                  
//              }
//                 
//              if (Greenfoot.isKeyDown("a"))
//          
//              {
//              
//                         side = 1;
//                         setLocation(300, y);
//                      
//                     keyAlreadyPressed = true;
//                                 if (keyAlreadyPressed){
//                        
//                        System.out.println("(x:" + x + ", " + "y" + y + ")");
//                         
//                        keyAlreadyPressed = false;
//             }
// }
//     
//             else if (Greenfoot.isKeyDown("w"))
//      
//             {
//                 
//                 if (side == 1)                
//                 {                    
//                   if(counter_1_ == 1)                  
//                   {                      
//                       setLocation(300, 250);                      
//                     }                    
//                     else if (counter_1_ == 2)                     
//                     {                        
//                       setLocation(300, 300);                         
//                     }                    
//                     else if (counter_1_ == 3)                    
//                     {                        
//                       setLocation(300, 350);                        
//                     }                    
//                     else if (counter_1_ == 4)                    
//                     {                    
//                       setLocation(300, 400);                        
//                     }                    
//                     else if (counter_1_ == 5)                     
//                     {                        
//                       setLocation(300, 450);                        
//                     }                    
//                     else if (counter_1_ == 6)                    
//                     {                        
//                       setLocation(300, 500);                        
//                     }                    
//                     else if (counter_1_ == 7)                    
//                     {                        
//                       setLocation(300, 550);                        
//                     }                    
//                     counter_1_ = ((counter_1_) + 1) % 8;                    
//                 }                
//                 else if (side == 2)                
//                 {       
//                     if (counter_2_ == 1)                    
//                     {                        
//                         setLocation(700, 250);                        
//                     }
//                     else if (counter_2_ == 2)
//                     {
//                         setLocation(700, 300);
//                     }
//                     else if (counter_2_ == 3)
//                     {
//                         setLocation(700, 350);
//                     }
//                     else if (counter_2_ == 4)
//                     {
//                         setLocation(700, 400);
//                     }  
//                     else if (counter_2_ == 5) 
//                     {
//                         setLocation(700, 450);
//                     }  
//                     else if (counter_2_ == 6) 
//                     {
//                         setLocation(700, 500);
//                     }  
//                     else if (counter_2_ == 7) 
//                     {
//                         setLocation(700, 550);
//                     }                    
//                     counter_2_ = ((counter_2_) + 1) % 8;                    
//                 }
//                 keyAlreadyPressed = true;
//                             if (keyAlreadyPressed){
//                        
//                         System.out.println("(x:" + x + ", " + "y" + y + ")");
//                         
//                        keyAlreadyPressed = false;
//             }
//             }
//     
//                 else if (Greenfoot.isKeyDown("s"))
//      
//                 {
//         
//                   if (side == 1)
//                   
//                   {
//                       
//                       if(counter_3_ == 1)
//                       
//                       {
//                           setLocation(300, 250);
//                         } 
//                         else if (counter_3_ == 2)
//                         {
//                             setLocation(300, 300);         
//                         }  
//                         else if (counter_3_ == 3) 
//                         {
//                             setLocation(300, 350);
//                         }  
//                         else if (counter_3_ == 4)
//                         {
//                             setLocation(300, 400);
//                         }
//                         else if (counter_3_ == 5) 
//                         {
//                             setLocation(300, 450);
//                         }   
//                         else if (counter_3_ == 6) 
//                         {
//                             setLocation(300, 500);
//                         }  
//                         else if (counter_3_ == 7)
//                         {
//                             setLocation(300, 550);
//                         }
//                         setLocation( x , (y + 50) % 600 );
//                         
//                      counter_3_ = ((counter_3_) + 1) % 8;
//                      
//                     } 
//                     else if (side == 2)
//                     {
//                         
//                         if (counter_4_ == 1) 
//                         {
//                             setLocation(700, 250);
//                         }
//                         else if (counter_4_ == 2)
//                         {
//                             setLocation(700, 300);
//                         }  
//                         else if (counter_4_ == 3) 
//                         {
//                             setLocation(700, 350);
//                         } 
//                         else if (counter_4_ == 4)
//                         {
//                             setLocation(700, 400);
//                         }
//                         else if (counter_4_ == 5)
//                         {
//                             setLocation(700, 450);
//                         }  
//                         else if (counter_4_ == 6) 
//                         {
//                             setLocation(700, 500);
//                         }   
//                         else if (counter_4_ == 7)
//                         {
//                             setLocation(700, 550);
//                         }
//                         
//                      counter_4_ = ((counter_4_) + 1) % 8;
//                      
//                     }
//                   keyAlreadyPressed = true;
//                               if (keyAlreadyPressed){
//                        
//                         System.out.println("(x:" + x + ", " + "y" + y + ")");
//                         
//                        keyAlreadyPressed = false;
//             }
//                 }
//                 
//                 else if (Greenfoot.isKeyDown("d"))
//                 
//                 {
//                     
//                     side = 2;
//                         setLocation(700, y);
//                         
//                     keyAlreadyPressed = true;
//             if (keyAlreadyPressed){
//                        
//                         System.out.println("(x:" + x + ", " + "y" + y + ")");
//                         
//                        keyAlreadyPressed = false;
//             }
//                 } 
//                 
// 
//                 
//                 }
//            }
//                 else if (Greenfoot.isKeyDown("space"))
//                 
//                 {
//    
//                         if(counter_2 == 2) {
//             
//                             System.out.println("Spells");
//            
//                         }      else if (counter_2 == 4) {
//             
//                             System.out.println("Spells");   
//            
//                         }      else if (counter_2 == 6) {
//             
//                             System.out.println("Spells");
//            
//                         }      else if (counter_2 == 8) {
//             
//                             System.out.println("Spells");
//            
//                         }      else if (counter_2 == 10) {
//             
//                             System.out.println("Spells");
//            
//                         }      else if (counter_2 == 12) {
//             
//                             System.out.println("Spells");
//            
//                         }      else if (counter_2 == 14) {
//             
//                             System.out.println("Spells");
//            
//                         }      else if (counter_2 == 16) {
//             
//                             System.out.println("Spells");
//            
//                         }      else if (counter_2 == 18) {
//             
//                             System.out.println("Spells");
//            
//                         }      else if (counter_2 == 20) {
//             
//                             System.out.println("Spells");
//            
//                         }      else if (counter_2 == 22) {
//             
//                             System.out.println("Spells");
//            
//                         }      else if (counter_2 == 24) {
//             
//                             System.out.println("Spells");
//            
//                         }      else if (counter_2 == 26) {
//             
//                             System.out.println("Spells");
//            
//                         }      else if (counter_2 == 28) {
//             
//                             System.out.println("Spells");
//            
//                         }
//                         
//                     }
    
}    
}        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

