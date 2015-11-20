import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shop_Cursor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shop_Cursor extends Interface_Ai
{
//     boolean Left_Edge = true;
//     boolean Right_Edge = false;
//     boolean Top = true;
//     boolean Bottom = false;
//     int S_Loc = 1;
//     int S_Object;
//     int S_One = 1;
//     int S_Two = 2;
//     int S_Three = 3;
//     int S_Four = 4;
//     int S_Five = 5;
//     int S_Six = 6;
//     int S_Seven = 7;
//     int S_Eight = 8;
//     int S_Nine = 9;
//     int S_Ten = 10;
//     int S_Eleven = 11;
//     int S_Twelve = 12;
//     int S_Thirteen = 13;
//     int S_Fourteen = 14;
//     boolean Pl = false;
//     int counter = 1;
//     
// int pos_x = -1400;
// 
// int pos_y = -2045;
// 
// 
// GreenfootImage shop_Cursor = new GreenfootImage("Shop_Cursor (Transparent background).png");
// 
// 

     public Shop_Cursor() 
     {
//         if (Greenfoot.isKeyDown("a"))
//         {
//             
//         setLocation(300, 500);
//         
//        background level = (background)this.getWorld();
//         if(counter == 1) {
//            setLocation(300, 500);
//         }      else if (counter == 2) {
//            setLocation(300, 550);         
//         }      else if (counter == 3) {
//            setLocation(300, 600);
//         }      else if (counter == 4) {
//            setLocation(300, 650);
//         }      else if (counter == 5) {
//            setLocation(300, 700);
//         }      else if (counter == 6) {
//            setLocation(300, 750);
//         }      else if (counter == 7) {
//            setLocation(300, 800);
//         }      else if (counter == 8) {
//            setLocation(300, 850);
//         }      else if (counter == 9) {
//            setLocation(300, 900);
//         }      else if (counter == 10) {
//            setLocation(300, 500);
//         }      else if (counter == 11) {
//            setLocation(300, 500);
//         }      else if (counter == 12) {
//            setLocation(300, 500);
//         }      else if (counter == 13) {
//            setLocation(300, 500);
//         }      else if (counter == 14) {
//            setLocation(300, 500);
//         }
//         if(counter == 15) {
//            setLocation(300, 500);
//         }
//         counter++;
//     }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//         background level = (background)this.getWorld();
//     if (Pl){
//     if (Greenfoot.isKeyDown ("a")){
//         // leftwards movement for cursor
//     System.out.println("left statement working!");
//     } else if (Greenfoot.isKeyDown ("d")){
//         // rightwards movement for cursor
//     System.out.println("right statement working!");
//     } else if (Greenfoot.isKeyDown ("w")){
//         // upwards movement for cursor
//     System.out.println("up statement working!");
//     } else if (Greenfoot.isKeyDown ("s")){
//         // downwards movement for cursor
//     System.out.println("down statement working!");
// }
//     if ((Greenfoot.isKeyDown ("a")) && (!(Left_Edge))){
//          
//         if (Right_Edge){
//             Right_Edge = false;
//             System.out.println("Right_Edge = " + Right_Edge);
//             Left_Edge = true;
//         }
//         
//         System.out.println("Left_Edge = " + Left_Edge);
//     } else if ((Greenfoot.isKeyDown ("w")) && (!(Top)) && (S_Loc >= 2)){
//             S_Loc = S_Loc - 1;
//             System.out.println("S_Loc = " + S_Loc);
//                    if ((S_Loc == 1) && (Left_Edge) && (!(Right_Edge))){
//         Top = true;
//             S_Loc = S_Loc - 0;
//             S_Object = S_One; 
//             
//             // Spells : (300, 250)
//             
//         } else if ((S_Loc == 1) && (!(Left_Edge)) && (Right_Edge)){
//         Top = true;
//             S_Loc = S_Loc - 0;
//             S_Object = S_Eight;
//             
//             // Miscelaneous : (700, 250)
//             
//         }
//         
// else if ((S_Loc == 2) && (Left_Edge) && (!(Right_Edge))){
//             
//             S_Object = S_Two;
//             
//             // Melee Weapons : (300, 300)
//             
//         } else if ((S_Loc == 2) && (!(Left_Edge)) && (Right_Edge)){
//             
//             S_Object = S_Nine;
//             
//             // Enchanting : (700, 300)
//             
//         }
//         
// else if ((S_Loc == 3) && (Left_Edge) && (!(Right_Edge))){
//     
//             S_Object = S_Three;
//             
//             // Ranged Weapons : (300, 350)
//             
//         } else if ((S_Loc == 3) && (!(Left_Edge)) && (Right_Edge)){
//             
//             S_Object = S_Ten;
//             
//             // Rare Goods : (700, 350)
//             
//         }
//         
// else if ((S_Loc == 4) && (Left_Edge) && (!(Right_Edge))){
//     
//             S_Object = S_Four;
//             
//             // Staves : (300, 400)
//             
//         } else if ((S_Loc == 4) && (!(Left_Edge)) && (Right_Edge)){
//             
//             S_Object = S_Eleven;
//             
//             // Ammo : (700, 400)
//             
//         }
//         
// else if ((S_Loc == 5) && (Left_Edge) && (!(Right_Edge))){
//     
//             S_Object = S_Five;
//             
//             // Relics : (300, 450)
//             
//         } else if ((S_Loc == 5) && (!(Left_Edge)) && (Right_Edge)){
//             
//             S_Object = S_Twelve;
//             
//             // Magic Skills : (700, 450)
//             
//         }
//         
// else if ((S_Loc == 6) && (Left_Edge) && (!(Right_Edge))){
//     
//             S_Object = S_Six;
//             
//             // Items : (300, 500)
//             
//         } else if ((S_Loc == 6) && (!(Left_Edge)) && (Right_Edge)){
//             
//             S_Object = S_Thirteen;
//             
//             // Empty N/A : (700, 500)
//             
//         }
//         
// else if ((S_Loc == 7) && (Left_Edge) && (!(Right_Edge))){
//     
//             S_Object = S_Seven;
//             
//             // Materials : (300, 550)
//             
//         } else if ((S_Loc == 7) && (!(Left_Edge)) && (Right_Edge)){
//             
//             S_Object = S_Fourteen;
//             
//             // Empty N/A : (700, 550)
//             
//         }
//     } else if ((Greenfoot.isKeyDown ("s")) && (!(Bottom)) && (S_Loc <= 6)){
//             S_Loc = S_Loc + 1;
//             System.out.println("S_Loc = " + S_Loc);
//                    if ((S_Loc == 1) && (Left_Edge) && (!(Right_Edge))){
//         Top = true;
//             S_Loc = S_Loc - 0;
//             S_Object = S_One; 
//             
//             // Spells : (300, 250)
//             
//         } else if ((S_Loc == 1) && (!(Left_Edge)) && (Right_Edge)){
//         Top = true;
//             S_Loc = S_Loc - 0;
//             S_Object = S_Eight;
//             
//             // Miscelaneous : (700, 250)
//             
//         }
//         
// else if ((S_Loc == 2) && (Left_Edge) && (!(Right_Edge))){
//             
//             S_Object = S_Two;
//             
//             // Melee Weapons : (300, 300)
//             
//         } else if ((S_Loc == 2) && (!(Left_Edge)) && (Right_Edge)){
//             
//             S_Object = S_Nine;
//             
//             // Enchanting : (700, 300)
//             
//         }
//         
// else if ((S_Loc == 3) && (Left_Edge) && (!(Right_Edge))){
//     
//             S_Object = S_Three;
//             
//             // Ranged Weapons : (300, 350)
//             
//         } else if ((S_Loc == 3) && (!(Left_Edge)) && (Right_Edge)){
//             
//             S_Object = S_Ten;
//             
//             // Rare Goods : (700, 350)
//             
//         }
//         
// else if ((S_Loc == 4) && (Left_Edge) && (!(Right_Edge))){
//     
//             S_Object = S_Four;
//             
//             // Staves : (300, 400)
//             
//         } else if ((S_Loc == 4) && (!(Left_Edge)) && (Right_Edge)){
//             
//             S_Object = S_Eleven;
//             
//             // Ammo : (700, 400)
//             
//         }
//         
// else if ((S_Loc == 5) && (Left_Edge) && (!(Right_Edge))){
//     
//             S_Object = S_Five;
//             
//             // Relics : (300, 450)
//             
//         } else if ((S_Loc == 5) && (!(Left_Edge)) && (Right_Edge)){
//             
//             S_Object = S_Twelve;
//             
//             // Magic Skills : (700, 450)
//             
//         }
//         
// else if ((S_Loc == 6) && (Left_Edge) && (!(Right_Edge))){
//     
//             S_Object = S_Six;
//             
//             // Items : (300, 500)
//             
//         } else if ((S_Loc == 6) && (!(Left_Edge)) && (Right_Edge)){
//             
//             S_Object = S_Thirteen;
//             
//             // Empty N/A : (700, 500)
//             
//         }
//         
// else if ((S_Loc == 7) && (Left_Edge) && (!(Right_Edge))){
//     
//             S_Object = S_Seven;
//             
//             // Materials : (300, 550)
//             
//         } else if ((S_Loc == 7) && (!(Left_Edge)) && (Right_Edge)){
//             
//             S_Object = S_Fourteen;
//             
//             // Empty N/A : (700, 550)
//             
//         }
//     } else if ((Greenfoot.isKeyDown ("d")) && (!(Right_Edge))){
//         
//         if (Left_Edge){
//             Left_Edge = false;
//             System.out.println("Right_Edge = " + Left_Edge);
//             Right_Edge = true;
//         }
//         
//         
//         //Shop_Parameters = 
//         
//     }
// }
//  else 
// {
//     if (S_Object == 1){
//         level.shopMoveCursor(1);
//      } else if (S_Object == 2){
//          level.shopMoveCursor(2);
//       } else if (S_Object == 3){
//           level.shopMoveCursor(3);
//        } else if (S_Object == 4){
//            level.shopMoveCursor(4);
//         } else if (S_Object == 5){
//             level.shopMoveCursor(5);
//          } else if (S_Object == 6){
//              level.shopMoveCursor(6);
//           } else if (S_Object == 7){
//               level.shopMoveCursor(7);
//            } else if (S_Object == 8){
//                level.shopMoveCursor(8);
//             } else if (S_Object == 9){
//                 level.shopMoveCursor(9);
//              } else if (S_Object ==10){
//                  level.shopMoveCursor(10);
//               } else if (S_Object ==11){
//                   level.shopMoveCursor(11);
//                } else if (S_Object ==12){
//                    level.shopMoveCursor(12);
//                 } else if (S_Object ==13){
//                     level.shopMoveCursor(13);
//                  } else if (S_Object ==14){
//                      level.shopMoveCursor(14);
//     }
// }
//     }
}
}
//     public void shopCursorScroll(int dx, int dy){
//        pos_x = pos_x + dx;
//        pos_y += dy;
//        drawImage(shop_Cursor, pos_x, pos_y);
// }
// public void drawImage(GreenfootImage image, int x, int y){
// }
//      int pos_x = -1358;
//      int pos_y = -2045;
//      int counter = 0;
// //     int x = 412;
// //     int y = 489;
//      public void act() 
//      {
//          if (Greenfoot.isKeyDown("w"))
//          {
//          if (counter == 0){
//              
//   } else if (counter == 25){
//         
// }
//         counter = (counter + 1) % 50;
//         setLocation(pos_x, pos_y);
//     }
// } 
//     public void setLocation(int pos_x, int pos_y){
//         
//     }
// }
