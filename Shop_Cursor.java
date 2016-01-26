import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shop_Cursor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shop_Cursor extends Interface_Ai
{

    String baseString = "";
    String s1;
    String s2;
    String s3;
    String s4;
    String s5;
    String s6;
    String s7;
    String s8;
    String s9;
    String s10;
    String s11;
    String s12;
    String s13;
    String s14;
    String s15;
    String s16;
    String s17;

boolean General_Synopsis = true; 
boolean Shop_Main_Menu = true;
boolean timerCounter = true;
boolean moveDF = false;
boolean oS = false;
//aka -> option selected = oS
int y = 250;
int x = 310;
int sprite_counter = 0;
int timerCount = 0;
int Shop_Option = 1;
int oSC;
//aka -> oSC = option selection choice


     public void act() 
     
     {
         if (General_Synopsis){
             if (Shop_Main_Menu){
             if (Greenfoot.isKeyDown("a")){
                 if (x == 710){
                    setLocation(310, getY());
                    x = getX();
                    y = getY();
                    moveDF = true;
                    
                    }
                }
             if (Greenfoot.isKeyDown("d")){
                 if (x == 310){
                     setLocation(710, getY());
                     x = getX();
                     y = getY();
                     moveDF = true;
                     
                    }
                }
             if (Greenfoot.isKeyDown("w")){
                 if (y > 250){
                     setLocation(getX(), getY() - 50);
                     x = getX();
                     y = getY();
                     moveDF = true;
                    
                    }
                }
             if (Greenfoot.isKeyDown("s")){
                 if (y < 550){
                     setLocation(getX(), getY() + 50);
                     x = getX();
                     y = getY();
                     moveDF = true;
                     
                    }
                    }
                    
                    if (moveDF){
                    if ((x == 310) && (y == 250)){
                    Shop_Option = 1;
                    System.out.println(Shop_Option);
                    } else if ((x == 310) && (y == 300)){
                        Shop_Option = 2;
                        System.out.println(Shop_Option);
                        } else if ((x == 310) && (y == 350)){
                            Shop_Option = 3;
                            System.out.println(Shop_Option);
                            } else if ((x == 310) && (y == 400)){
                                Shop_Option = 4;
                                System.out.println(Shop_Option);
                                } else if ((x == 310) && (y == 450)){
                                    Shop_Option = 5;
                                    System.out.println(Shop_Option);
                                    } else if ((x == 310) && (y == 500)){
                                        Shop_Option = 6;
                                        System.out.println(Shop_Option);
                                        } else if ((x == 310) && (y == 550)){
                                            Shop_Option = 7;
                                            System.out.println(Shop_Option);
                    } else if ((x == 710) && (y == 250)){
                        Shop_Option = 8;
                        System.out.println(Shop_Option);
                        } else if ((x == 710) && (y == 300)){
                            Shop_Option = 9;
                            System.out.println(Shop_Option);
                            } else if ((x == 710) && (y == 350)){
                                Shop_Option = 10;
                                System.out.println(Shop_Option);
                                } else if ((x == 710) && (y == 400)){
                                    Shop_Option = 11;
                                    System.out.println(Shop_Option);
                                    } else if ((x == 710) && (y == 450)){
                                        Shop_Option = 12;
                                        System.out.println(Shop_Option);
                                        } else if ((x == 710) && (y == 500)){
                                            Shop_Option = 13;
                                            System.out.println(Shop_Option);
                                            } else if ((x == 710) && (y == 550)){
                                                Shop_Option = 14;
                                                System.out.println(Shop_Option);
                                                
                    }
                    moveDF = false;
                }
                                            
                if ((Greenfoot.isKeyDown("space")) && (!(oS))){
                  if (Shop_Option == 1){
                    System.out.println("Spells");
                    oSC = Shop_Option;
                    }else if (Shop_Option == 2){
                        System.out.println("Melee Weapons"); 
                        oSC = Shop_Option;
                        }else if (Shop_Option == 3){
                            System.out.println("Ranged Weapons");
                            oSC = Shop_Option; 
                            }else if (Shop_Option == 4){
                                System.out.println("Staves");
                                oSC = Shop_Option; 
                                }else if (Shop_Option == 5){
                                    System.out.println("Relics");
                                    oSC = Shop_Option; 
                                    }else if (Shop_Option == 6){
                                        System.out.println("Items");
                                        oSC = Shop_Option; 
                                        }else if (Shop_Option == 7){
                                            System.out.println("Materials");
                                            oSC = Shop_Option;
                                            }else if (Shop_Option == 8){
                                                System.out.println("Miscelaneous");
                                                oSC = Shop_Option;
                                                }else if (Shop_Option == 9){
                                                    System.out.println("Enchanting");
                                                    oSC = Shop_Option;
                                                    }else if (Shop_Option == 10){
                                                        System.out.println("Rare Goods");
                                                        oSC = Shop_Option;
                                                        }else if (Shop_Option == 11){
                                                            System.out.println("Ammo");
                                                            oSC = Shop_Option;
                                                            }else if (Shop_Option == 12){
                                                                System.out.println("Magic Skills");
                                                                oSC = Shop_Option;
                                                                }else if (Shop_Option == 13){
                                                                    System.out.println("Unspecified (Unknown Selection)");
                                                                    oSC = Shop_Option;
                                                                    }else if (Shop_Option == 14){
                                                                        System.out.println("Exit?");
                                                                        oSC = Shop_Option;
                                                                        }
                  oS = true;                                                      
                  
                }
                    
                    
        if (timerCounter){
            timerCount = 0;
                if (sprite_counter == 1){
                setImage(s10);
                } else if (sprite_counter == 2){
                setImage(s11);
                } else if (sprite_counter == 3){
                setImage(s12);
                } else if (sprite_counter == 4){
                setImage(s13);
                } else if (sprite_counter == 5){
                setImage(s14);
                } else if (sprite_counter == 6){
                setImage(s15);    
                } else if (sprite_counter == 7){
                setImage(s16);    
                } else if (sprite_counter == 8){
                setImage(s17);    
                } else if (sprite_counter == 9){
                setImage(s1);    
                } else if (sprite_counter == 10){
                setImage(s2);    
                } else if (sprite_counter == 11){
                setImage(s3);    
                } else if (sprite_counter == 12){
                setImage(s4);    
                } else if (sprite_counter == 13){
                setImage(s5);    
                } else if (sprite_counter == 14){
                setImage(s6);    
                } else if (sprite_counter == 15){
                setImage(s7);    
                } else if (sprite_counter == 16){
                setImage(s8);    
                } else if (sprite_counter == 17){
                setImage(s9);    
                } else if (sprite_counter == 18){
                setImage(s10);
                timerCounter = false;
               }
               
            sprite_counter = (sprite_counter + 1) % 19;
             
             
             
   
             
            } else if (!(timerCounter)){
                
                if (timerCount == 99){
                    
                    timerCounter = true;
                    
                    
            }
           timerCount = (timerCount + 1) % 100;
        }
       }
    }
}
        
public static int getOptionSelection(int optNum, int roomNum){
if ((optNum == 14) && (roomNum == 3)){
    
}
    
return optNum & roomNum;    
}
    
}    

      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

