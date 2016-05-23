import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Magic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Magic extends Symbols
{
    boolean magicAffinityCheck = false;
    boolean magicStatsWindowCheck = false;
    static boolean typeCheck = false;
    static boolean aspectRank1Check = false;
    static boolean aspectRank2Check = false;
    static int aT;
    static int aR;
    
    GreenfootImage image = new GreenfootImage("Status magic.png");
     public void act() 
    {
        background level = (background)this.getWorld();
        if ((Greenfoot.isKeyDown("escape")) && (Player.statsWait)){
            level.removeObject(this);
        }
        
        if (!(magicStatsWindowCheck)){
            
            
            image.scale(142*3, 160*3);
            setImage(image);
            if (aT == 1){
                
                 if (aR == 1){
              level.addObject(new Fire_Magic(), 568, 350);
              magicStatsWindowCheck = true;
             } else if (aR == 2){
                 
             }
             
            } else if (aT == 2){
                
                 if (aR == 1){
              level.addObject(new Ice_Magic(), 568, 350);
              magicStatsWindowCheck = true;
             } else if (aR == 2){
                 
             }
             
            } else if (aT == 3){
                
                 if (aR == 1){
              level.addObject(new Light_Magic(), 568, 350);
              magicStatsWindowCheck = true;
             } else if (aR == 2){
                 
             }   
             
            } else if (aT == 4){
                
                 if (aR == 1){
              level.addObject(new Lightning_Magic(), 568, 350);
              magicStatsWindowCheck = true;
             } else if (aR == 2){
                 
             }   
             
            } else if (aT == 5){
                
                 if (aR == 1){
              level.addObject(new Wind_Magic(), 568, 350);
              magicStatsWindowCheck = true;
             } else if (aR == 2){
                 
             }   
             
            } else if (aT == 6){
                
                 if (aR == 1){
              level.addObject(new Dark_Magic(), 568, 350);
              magicStatsWindowCheck = true;
             } else if (aR == 2){
                 
             }   
             
            }
            
            if (this instanceof Fire_Magic){            
              magicStatsWindowCheck = true;
                    } else if (this instanceof Ice_Magic){
                             magicStatsWindowCheck = true;
                            } else if (this instanceof Light_Magic){
                                     magicStatsWindowCheck = true;
                                    } else if (this instanceof Lightning_Magic){
                                             magicStatsWindowCheck = true;
                                            } else if (this instanceof Wind_Magic){
                                                     magicStatsWindowCheck = true;
                                                    } else if (this instanceof Dark_Magic){
                                                             magicStatsWindowCheck = true;
                                                             
    }
    
    }
   
}
public static int aspect(int type, int aspectRank){
        if ((!(typeCheck)) && (!(aspectRank1Check)) && (!(aspectRank2Check))){
            
          if (type == 1){
              aT = 1;
              
          if (aspectRank == 1){
              aR = 1;
              typeCheck = true;
              aspectRank1Check = true;
            } else if (aspectRank == 2){
              aR = 2;
              typeCheck = true;
              aspectRank2Check = true;
            }
            
        } else if (type == 2){
             aT = 2;
          
          if (aspectRank == 1){
              aR = 1;
              typeCheck = true;
              aspectRank1Check = true;
            } else if (aspectRank == 2){
              aR = 2;
              typeCheck = true;
              aspectRank2Check = true;
            }
            
        } else if (type == 3){
             aT = 3;
          
          if (aspectRank == 1){
              aR = 1;
              typeCheck = true;
              aspectRank1Check = true;
            } else if (aspectRank == 2){
              aR = 2;
              typeCheck = true;
              aspectRank2Check = true;
            }
            
        } else if (type == 4){
             aT = 4;
          
          if (aspectRank == 1){
              aR = 1;
              typeCheck = true;
              aspectRank1Check = true;
            } else if (aspectRank == 2){
              aR = 2;
              typeCheck = true;
              aspectRank2Check = true;
            }
            
        } else if (type == 5){
             aT = 5;
            
          if (aspectRank == 1){
              aR = 1;
              typeCheck = true;
              aspectRank1Check = true;
            } else if (aspectRank == 2){
              aR = 2;
              typeCheck = true;
              aspectRank2Check = true;
            }
                
        } else if (type == 6){
             aT = 6;
            
          if (aspectRank == 1){
              aR = 1;
              typeCheck = true;
              aspectRank1Check = true;
            } else if (aspectRank == 2){
              aR = 2;
              typeCheck = true;
              aspectRank2Check = true;
            }
                
          }
  }
  return type & aspectRank;  
  }
  void setTransparency(int t){}
}
//status magic size width = 142
// status magic size height = 160