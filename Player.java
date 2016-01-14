import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Actor
{
    
    String baseString = "";
    String left1;
    String left2;
    String left3;
    String right1;
    String right2;
    String right3;
    String down1;
    String down2;
    String down3;
    String up1;
    String up2;
    String up3;
    String SBIC;
    String lastWayFacing = "s";
    
    String lastClassType = "Paladin";
    int x = 512;
    int y = 389;
    
    int instance;
    
    int whichWalk = 0;
    int Class = 4;
    boolean dirtyFlag = true;
    boolean dirtyFlag1 = true;
    int Lobby = 1;
    int Room = Lobby;
    int Blacksmith = 2;
    int Shop = 3;
    int Arena = 4;
    int Arena_Open_Doors = 5;
    int Arena_Battle_Room = 6;
    boolean Blacksmith_Goodbye = false;
    boolean Blacksmith_Welcome = false;
    boolean Shop_Goodbye = false;
    boolean Shop_Welcome = false;
    boolean windowPane = false;
    
    boolean cutscene = false;
    
    boolean Player_Stats = false;
    
    

    // ^^^ (Character / Class) Specific Stat
    boolean Left_Edge = true;
    boolean Right_Edge = false;
    boolean Top = true;
    boolean Bottom = false;
    int S_Loc = 0;
    // 0 = upper left most corner of interface
    int S_LocX = 0;
    // S_LocX = 0 means that the cursor is on the left side of the interface, 1 means its on the right side.
    int S_Object;
    boolean Pl = false;
    boolean Shop_Check = false;
    boolean a = false;
    boolean Game_Start_Instance = false;
    public boolean Initialization = false;
    public void act() 
    {
    
    
        background level = (background)this.getWorld();


        int hero_x_px = -level.pos_x + getX();
        int hero_y_px = -level.pos_y + getY();
        int hero_x = hero_x_px/96;
        int hero_y = hero_y_px/96;
        int music = level.track_num;

        boolean dirtyFlag = true;
        boolean dirtyFlag1 = true;
        if (!(a))
        {
            Initialization = false;
        GameStart(Initialization);
        a = true;
       }
        // Movement and controls section
  if (!(windowPane)){
      if (Greenfoot.isKeyDown ("a")){
       background x = (background)this.getWorld();
       level.scroll(10, 0);
       
       hero_x_px = -level.pos_x + getX()-50;
       hero_y_px = -level.pos_y + getY();
       hero_x = hero_x_px/96;
       hero_y = hero_y_px/96;
       //System.out.println("( hX_px: " + hero_x_px + ", hY_px: " + hero_y_px + " ) ( hX: " + hero_x + ", hY: " + hero_y + " )");
       

      if (level.getTileAt (hero_x, hero_y) == 1){
          level.scroll(-10, 0);
      }
      
        if (whichWalk == 0) {
            setImage(left1);
        } else if (whichWalk == 1) {
            setImage(left2);
        } else if (whichWalk == 2) {
            setImage(left3);
        } else if (whichWalk == 3) {
            setImage(left2);
        }
        whichWalk = (whichWalk + 1) % 4;
        lastWayFacing = "a";
//         System.out.println("hero moved left, Tile: " + hero_x + ", " + hero_y);
//         System.out.println(level.pos_x + ", " + level.pos_y);
    }
        else  if (Greenfoot.isKeyDown ("d"))
    {
       
       background x = (background)this.getWorld();
       x.scroll(-10, 0);
       
       hero_x_px = -level.pos_x + getX()+50;
       hero_y_px = -level.pos_y + getY();
       hero_x = hero_x_px/96;
       hero_y = hero_y_px/96;
       //System.out.println("( hX_px: " + hero_x_px + ", hY_px: " + hero_y_px + " ) ( hX: " + hero_x + ", hY: " + hero_y + " )");
      if (level.getTileAt (hero_x, hero_y) == 1){
          level.scroll(10, 0);
        }
        
        if (whichWalk == 0) {
            setImage(right1);
        } else if (whichWalk == 1) {
            setImage(right2);
        } else if (whichWalk == 2) {
            setImage(right3);
        } else if (whichWalk == 3) {
            setImage(right2);
        }
        whichWalk = (whichWalk + 1) % 4;
        lastWayFacing = "d";
//         System.out.println("hero moved right, Tile: " + hero_x + ", " + hero_y);
//         System.out.println(level.pos_x + ", " + level.pos_y);
    }
        else if (Greenfoot.isKeyDown("w"))
    {
       background x = (background)this.getWorld();
       x.scroll(0, 10);
       
       hero_x_px = -level.pos_x + getX();
       hero_y_px = -level.pos_y + getY();
       hero_x = hero_x_px/96;
       hero_y = hero_y_px/96;
       //System.out.println("( hX_px: " + hero_x_px + ", hY_px: " + hero_y_px + " ) ( hX: " + hero_x + ", hY: " + hero_y + " )");

      if (level.getTileAt (hero_x, hero_y) == 1){
          level.scroll(0, -10);
        }
        
        if (whichWalk == 0) {
            setImage(up1);
        } else if (whichWalk == 1) {
            setImage(up2);
        } else if (whichWalk == 2) {
            setImage(up3);
        } else if (whichWalk == 3) {
            setImage(up2);
        }    
        whichWalk = (whichWalk + 1) % 4;  
        lastWayFacing = "w";
//         System.out.println("hero moved up, Tile: " + hero_x + ", " + hero_y);
//         System.out.println(level.pos_x + ", " + level.pos_y);
    }    
        else if (Greenfoot.isKeyDown("s"))
    {   
       background x = (background)this.getWorld();
       x.scroll(0, -10);
       
       hero_x_px = -level.pos_x + getX();
       hero_y_px = -level.pos_y + getY()+40;
       hero_x = hero_x_px/96;
       hero_y = hero_y_px/96;
       //System.out.println("( hX_px: " + hero_x_px + ", hY_px: " + hero_y_px + " ) ( hX: " + hero_x + ", hY: " + hero_y + " )");

      if (level.getTileAt (hero_x, hero_y) == 1){
          level.scroll(0, 10);
        }
        
        if (whichWalk == 0) {
            setImage(down1);
        } else if (whichWalk == 1) {
            setImage(down2);
        } else if (whichWalk == 2) {
            setImage(down3);
        } else if (whichWalk == 3) {
            setImage(down2);
        }   
        whichWalk = (whichWalk + 1) % 4;
        lastWayFacing = "s";
//         System.out.println("hero moved down, Tile: " + hero_x + ", " + hero_y);
//         System.out.println(level.pos_x + ", " + level.pos_y);
    //end of Player movement
    //Beginning of Artificial movement
    } 
        else 
    {
        if (lastWayFacing.equals("w")){
            setImage(up2);
        } else if (lastWayFacing.equals("s")){
            setImage(down2);
        } else if (lastWayFacing.equals("a")) {
            setImage(left2);
        } else if (lastWayFacing.equals("d")) {
            setImage(right2);
        }
//          if ((Room == Shop) && (windowPane)){
//          level.setDefaultForMap(1);
//          level.changeMap(3,2);
//          setImage(SBIC);        
//          }
    }
    
    
        if (Room == Lobby){     

        
  
       //end of Artificial movement
    // Tile Definitions
       if (level.getTileAt(hero_x, hero_y) == 3){
        System.out.println("You're at your house!");
        
        
    }
       if (level.getTileAt(hero_x, hero_y) == 4 && (dirtyFlag1 == true)){
       //         System.out.println("You're at the Arena!");
           Room = Arena;
           level.setDefaultForMap(1);
           level.changeMap(4,1);
           dirtyFlag1 = false;
        
    }
       if (level.getTileAt(hero_x, hero_y) == 5 && (dirtyFlag1 == true)){
           //System.out.println("Welcome to the Blacksmith!");
           //Room = Blacksmith;
           //getbackground();
           Room = Blacksmith;
           level.setDefaultForMap(1);
           level.changeMap(2,1);
           dirtyFlag1 = false;
           
           



    }
       if (level.getTileAt(hero_x, hero_y) == 6 && (dirtyFlag1 == true)){
        //System.out.println("Welcome to the Shop!");
        Room = Shop;
        level.setDefaultForMap(1);
        level.changeMap(3,1);
        dirtyFlag1 = false;
        
    }
    //        if (Class == 1 && (level.getTileAt(hero_x, hero_y) == 5) && dirtyFlag1 == false && (this instanceof hunter)){
        //        dirtyFlag1 = true;
        //        level.addObject(new hunter(), 512, 389);
        //     }  else if (Class == 3 && (level.getTileAt(hero_x, hero_y) == 5) && dirtyFlag1 == false && (this instanceof Mage)){
            //        dirtyFlag1 = true;
            //        level.addObject(new Mage(), 512, 389);
            //     }  else if (Class == 4 && (level.getTileAt(hero_x, hero_y) == 5) && dirtyFlag1 == false && (this instanceof Palladin)){
                //        dirtyFlag1 = true;
                //        level.addObject(new Palladin(), 512, 389);
                //     }  else if (Class == 5 && (level.getTileAt(hero_x, hero_y) == 5) && dirtyFlag1 == false && (this instanceof Warrior)){
                    //        dirtyFlag1 = true;
                    //        level.addObject(new Warrior(), 512, 389);
                    //     }  else if (Class == 2 && (level.getTileAt(hero_x, hero_y) == 5) && dirtyFlag1 == false && (this instanceof Druid)){
                        //        dirtyFlag1 = true;
                        //        level.addObject(new Druid(), 512, 389);
                        //     }
       if (level.getTileAt(hero_x, hero_y) == 7 && !(this instanceof hunter)){
        level.removeObject(this);
        System.out.println("You have chosen the [ Hunter ] !");
        Class = 1;
        level.Class(1);
        Player_Stats = true;
    }
       if (level.getTileAt(hero_x, hero_y) == 8 && !(this instanceof Druid)){
        level.removeObject(this);
        System.out.println("You have chosen the [ Druid ] !");
        Class = 2;
        level.Class(2);
        Player_Stats = true;
    }
       if (level.getTileAt(hero_x, hero_y) == 9 && !(this instanceof Mage)){
        level.removeObject(this);
        System.out.println("You have chosen the [ Mage ] !");
        Class = 3;
        level.Class(3);
        Player_Stats = true;
    }
        if (level.getTileAt(hero_x, hero_y) == 10 && !(this instanceof Palladin)){
        level.removeObject(this);
        System.out.println("You have chosen the [ Palladin ] !");
        Class = 4;
        level.Class(4);
        Player_Stats = true;
    }
       if (level.getTileAt(hero_x, hero_y) == 11 && !(this instanceof Warrior)){
        level.removeObject(this);
        System.out.println("You have chosen the [ Warrior ] !");
        Class = 5;
        level.Class(5);
        Player_Stats = true;
    }

//         if (!level.music.isPlaying()) {
//         level.track_num++;
//         
//         if(level.track_num > 100) {
//             level.track_num = 1;
//         }
//         
//         if( level.track_num == 1) {
//             
//            level.music = new GreenfootSound("079 - Shattered Life.wav");
//         } else if( level.track_num == 2)  {
//             
//            level.music = new GreenfootSound("043 - Silent Ground.wav");
//         }
//             level.music.play();
//     }
}





//-----------------------------------------------------------------------------------------------------------------------------------------------
//===============================================================================================================================================
//-----------------------------------------------------------------------------------------------------------------------------------------------





if (Room == Blacksmith){


//SYSTEM MESSAGE PANEL Start
    if ((level.getTileAt(hero_x, hero_y) == 12) && !(Blacksmith_Goodbye)){
        
           System.out.println("Goodbye!");
           Blacksmith_Goodbye = true;
           Room = Lobby;
           level.setDefaultForMap(2);
           level.changeMap(1,1);
           dirtyFlag1 = true;
           
 } else if (!(level.getTileAt(hero_x, hero_y) == 12) && (Blacksmith_Goodbye)){
           Blacksmith_Goodbye = false;
           level.track_num = 1;
 }
       if ((level.getTileAt(hero_x, hero_y) == 6) && !(Blacksmith_Welcome)){
           
           System.out.println("My goods are of the highest quality!");
           Blacksmith_Welcome = true;
 } else if (!(level.getTileAt(hero_x, hero_y) == 6) && (Blacksmith_Welcome)){
     //System.out.println("Farewell Stranger!");
     Blacksmith_Welcome = false;
 }
//SYSTEM MESSAGE PANEL End
}

if (Room == Arena){
           if (level.getTileAt(hero_x, hero_y) == 4 && (dirtyFlag1 == true)){
// entering Arena Battle room
           Room = Arena_Open_Doors;
           level.setDefaultForMap(1);
           level.changeMap(5,1);
           //level.addObject(new Objective_Arrow(), 512, 389);
           dirtyFlag1 = false;
        
    }
}

if (Room == Arena_Open_Doors){
           if (level.getTileAt(hero_x, hero_y) == 4 && (dirtyFlag1 == true)){
// entering Arena Battle room
           Room = Arena;
           level.setDefaultForMap(1);
           level.changeMap(4,1);
           dirtyFlag1 = false;
        
    }
}




//-------------------------------------------------------------------------------------------------------------------------------------------------




if ((Room == Shop) && (!(windowPane))){
//SYSTEM MESSAGE PANEL Start
    if ((level.getTileAt(hero_x, hero_y) == 12) && !(Shop_Goodbye)){
        
           //System.out.println("Goodbye!");
          
           Room = Lobby;
           level.setDefaultForMap(2);
           level.changeMap(1,1);

           
           dirtyFlag1 = true;
           Shop_Goodbye = true;
 } else if (!(level.getTileAt(hero_x, hero_y) == 12) && (Shop_Goodbye)){
           Shop_Goodbye = false;
           //level.track_num = 1;
 }
       if ((level.getTileAt(hero_x, hero_y) == 6) && !(Shop_Welcome)){
           
           System.out.println("Oh! Come on in!");
           windowPane = true;
           Shop_Welcome = true;
 } else if (!(level.getTileAt(hero_x, hero_y) == 6) && (Shop_Welcome)){
     System.out.println("You be careful out there!");
     Shop_Welcome = false;
 }
//SYSTEM MESSAGE PANEL End
}


}

if ((Room == Shop) && (windowPane)){
    
    //setSpeed(50);

    
    // Visual INITIALIZATION OF TRADE INSTANCE: SHOP
    if (!(Shop_Check))
    {
        // 1 = shop, 2 = blacksmith, 3 = arena, (coming soon: 4 = home);
    setImage(SBIC);
    level.addObject(new Tutorial_Guide(), 100, 100);
    level.addObject(new Trade_Instance(), 500, 300);
    // first shop items trade interface row vvvvvvvvv
    level.addObject(new Trade_Inventory_Shop_Interface_LB(), 300, 250);
    level.addObject(new Trade_Inventory_Shop_Interface_LB(), 300, 300);
    level.addObject(new Trade_Inventory_Shop_Interface_LB(), 300, 350);
    level.addObject(new Trade_Inventory_Shop_Interface_LB(), 300, 400);
    level.addObject(new Trade_Inventory_Shop_Interface_LB(), 300, 450);
    level.addObject(new Trade_Inventory_Shop_Interface_LB(), 300, 500);
    level.addObject(new Trade_Inventory_Shop_Interface_LB(), 300, 550);
    // next row vvvvvvvvvv
    level.addObject(new Trade_Inventory_Shop_Interface_LB(), 700, 250);
    level.addObject(new Trade_Inventory_Shop_Interface_LB(), 700, 300);
    level.addObject(new Trade_Inventory_Shop_Interface_LB(), 700, 350);
    level.addObject(new Trade_Inventory_Shop_Interface_LB(), 700, 400);
    level.addObject(new Trade_Inventory_Shop_Interface_LB(), 700, 450);
    level.addObject(new Trade_Inventory_Shop_Interface_LB(), 700, 500);
    level.addObject(new Trade_Inventory_Shop_Interface_LB(), 700, 550);
    //------------------------------------------------------------------
    level.addObject(new Shop_Welcome_Message(), 500, 50); 
    //------------------------------------------------------------------
    // first shop items trade interface Text row vvvvvvvvv
    level.addObject(new Shop_option_1(), 300, 250);
    level.addObject(new Shop_option_2(), 300, 300);
    level.addObject(new Shop_option_3(), 300, 350);
    level.addObject(new Shop_option_4(), 300, 400);
    level.addObject(new Shop_option_5(), 300, 450);
    level.addObject(new Shop_option_6(), 300, 500);
    level.addObject(new Shop_option_7(), 300, 550);
    // next Text row vvvvvvvvvv
    level.addObject(new Shop_option_8(), 700, 250);
    level.addObject(new Shop_option_9(), 700, 300);
    level.addObject(new Shop_option_10(), 700, 350);
    level.addObject(new Shop_option_11(), 700, 400);
    level.addObject(new Shop_option_12(), 700, 450);

    level.addObject(new Shop_Cursor(), 300, 250);

    level.setDefaultForMap(1);
    level.changeMap(3,2);  
    Shop_Check = true;
}

 }
 
}



public void Stats(){
    if (!(Game_Start_Instance)){
    background level = (background)this.getWorld();
    
    
    int Affinity_ = (level.getRandomNumberRange(1,10));
    
    System.out.println("Affinity: " + Affinity_);
    
    int Aid_ = (level.getRandomNumberRange(1,10));
    
    System.out.println("Aid: " + Aid_);
    
    int Attack_Speed_ = (level.getRandomNumberRange(1,10));
    
    System.out.println("Attack Speed: " + Attack_Speed_);
    
    int Constitution_ = (level.getRandomNumberRange(1,10));
    
    System.out.println("Constitution: " + Constitution_);
    
    int Defense_ = (level.getRandomNumberRange(1,10));
    
    System.out.println("Defense: " + Defense_);
    
    int Hp_ = (level.getRandomNumberRange(1,10));
    
    System.out.println("Hp: " + Hp_);
    
    int Leadership_ = (level.getRandomNumberRange(1,10));
    
    System.out.println("Leadership: " + Leadership_);
    
    int Level_ = 1;
    
    System.out.println("Level: " + Level_);
    
    int Luck_ = (level.getRandomNumberRange(1,10));
    
    System.out.println("Luck: " + Luck_);
    
    int Magic_ = (level.getRandomNumberRange(1,10));
    
    System.out.println("Magic: " + Magic_);
    
    int Maximum_Hp_ = 60;
    
    System.out.println("Maximum Hp: " + Maximum_Hp_);
    
    int Movement_ = (level.getRandomNumberRange(1,10));
    
    System.out.println("Movement: " + Movement_);
    
    int Movement_Star_ = 10;
    
    System.out.println("Movement_Star: " + Movement_Star_);
    
    int Pursuit_Critical_Coefficient_ = (level.getRandomNumberRange(1,10));
    
    System.out.println("PCC: " + Pursuit_Critical_Coefficient_);
    
    int Relative_Power_ = (level.getRandomNumberRange(1,10));
    
    System.out.println("RP: " + Relative_Power_);
    
    int Resistance_ = (level.getRandomNumberRange(1,10));
    
    System.out.println("Resistance: " + Resistance_);
    
    int Skill_ = (level.getRandomNumberRange(1,10));
    
    System.out.println("Skill: " + Skill_);
    
    int Speed_ = (level.getRandomNumberRange(1,10));
    
    System.out.println("Speed: " + Speed_);
    
    int Strength_ = (level.getRandomNumberRange(1,10));
    
    System.out.println("Strength: " + Strength_);
    
    int Weapon_Level_ = (level.getRandomNumberRange(1,10));
    
    System.out.println("Weapon Level: " + Weapon_Level_);
    
    int Weapon_Rank_ = (level.getRandomNumberRange(1,10));
    
    System.out.println("Weapon Rank: " + Weapon_Rank_);
    
    int Weight_ = (level.getRandomNumberRange(1,10));
    
    System.out.println("Weight: " + Weight_);
    
    Initialization = false;
    
    
}
}

public boolean GameStart(boolean checkStart)
{
if (!(Game_Start_Instance)){    
       
    if (!(checkStart))
    
    {
           
        Stats();
        Game_Start_Instance = true;
}
}
return checkStart;
}



}

//-------------------------------------------------------------------------------



// static java.lang.String getKey(){
//     return getKey();
// //Get the most recently pressed key, since the last time this method was called.
// }
// 
//  static void setSpeed(int speed){
//      System.out.println("Speed =" + speed);
//      //Set the speed of the execution.
//  }

// 
// 
// static void start(){
// //Run (or resume) the execution.
// }
// 
// 
// static void stop(){
// //Pause the execution.
// }



    //block#1 = wall
    //block#1002 = floor
    //TB revisited later   
    //}
    //if (!(level.getTileAt(hero_x, hero_y) == 12)){
           //dirtyFlag = true;
           
    //}   
