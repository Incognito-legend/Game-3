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
//        int x = 475;
//        int y = 300;
    
    int instance;
    
    int whichWalk = 0;
    int Class;
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
    int cmC = 0;
    boolean Pl = false;
    boolean Shop_Check = false;
    boolean a = false;
    boolean Game_Start_Instance = false;
    boolean Shop_Pan2 = false;
    public boolean Initialization = false;
    public static int cSI; // 1 to 14; 14 = exit; // change shop interface = cSI;
    public static boolean cSMI = false; // false = shop option is unselected; true = shop option has been selected; // change shop map instance = cSMI;
    public static boolean fireWait = false;
    public static boolean statsWait = false;
    public static boolean aspectCheck = false;
    public static boolean statsWait_ = false;
    public void act() 
    {
        setSpeed(48);
    
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
      
      if (this instanceof Mage){
          if (!(aspectCheck)){
          Magic.aspect(getRandomNumberRange(1,6), 1);
          aspectCheck = true;
        }
          
      if ((Greenfoot.isKeyDown ("1")) && (!(fireWait))){
          
          if (lastWayFacing == "a"){
          level.addObject(new Fireball(), 275, 300);
         } else if (lastWayFacing == "w"){
           level.addObject(new Fireball(), 475, 100);
         } else if (lastWayFacing == "s"){
           level.addObject(new Fireball(), 475, 500);
         } else if (lastWayFacing == "d"){
           level.addObject(new Fireball(), 675, 300);
         }
        fireWait = true;
      }
      
      if ((Greenfoot.isKeyDown ("2")) && (!(fireWait))){
          
          if (lastWayFacing == "a"){
          level.addObject(new Fimbulvatr(), 275, 300);
         } else if (lastWayFacing == "w"){
           level.addObject(new Fimbulvatr(), 475, 100);
         } else if (lastWayFacing == "s"){
           level.addObject(new Fimbulvatr(), 475, 500);
         } else if (lastWayFacing == "d"){
           level.addObject(new Fimbulvatr(), 675, 300);
         }
        fireWait = true;
      }
      
      if ((Greenfoot.isKeyDown ("3")) && (!(fireWait))){
          
          if (lastWayFacing == "a"){
          level.addObject(new Elfire(), 275, 300);
         } else if (lastWayFacing == "w"){
           level.addObject(new Elfire(), 475, 100);
         } else if (lastWayFacing == "s"){
           level.addObject(new Elfire(), 475, 500);
         } else if (lastWayFacing == "d"){
           level.addObject(new Elfire(), 675, 300);
         }
        fireWait = true;
      }
      
      if ((Greenfoot.isKeyDown("escape")) && (!(statsWait))){
        level.setDefaultForMap(1);
        level.changeMap(3,2);
        level.addObject(new Magic(), 475,300);
        statsWait = true;
        statsWait_ = true;
        }
        
      
        
    }
    
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
         //System.out.println("hero moved left, Tile: " + hero_x + ", " + hero_y);
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
      // System.out.println("( hX_px: " + hero_x_px + ", hY_px: " + hero_y_px + " ) ( hX: " + hero_x + ", hY: " + hero_y + " )");
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
         //System.out.println("hero moved right, Tile: " + hero_x + ", " + hero_y);
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
      // System.out.println("( hX_px: " + hero_x_px + ", hY_px: " + hero_y_px + " ) ( hX: " + hero_x + ", hY: " + hero_y + " )");

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
       
      // System.out.println("( hX_px: " + hero_x_px + ", hY_px: " + hero_y_px + " ) ( hX: " + hero_x + ", hY: " + hero_y + " )");

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

    // end of Player movement
    
    // Beginning of Artificial movement
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
        // end of Artificial movement
    }
    
    
        if (Room == Lobby){     

        
  
       
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
           System.out.println("enter blacksmith check");
           Room = Blacksmith;
           level.setDefaultForMap(1);
           level.changeMap(2,1);
           dirtyFlag1 = false;
           
           



    }
       if (level.getTileAt(hero_x, hero_y) == 6 && (dirtyFlag1 == true)){
        //System.out.println("Welcome to the Shop!");
        System.out.println("Shop Entry Check");
        Room = Shop;
        level.setDefaultForMap(1);
        
        level.changeMap(3,1);
        dirtyFlag1 = false;
        
    }
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
           System.out.println("leaving shop initial check");
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
//System.out.println("check shop instance");    

    //setSpeed(50);

    
    // Visual INITIALIZATION OF TRADE INSTANCE: SHOP
    if (!(Shop_Check))
    {
        // 1 = shop, 2 = blacksmith, 3 = arena, (coming soon: 4 = home);
        if (cmC == 1){
    level.addObject(new SBIC_Resize(), 475,300);
    
    
}
       if (cmC == 20){    
    setImage(SBIC);
} else if (cmC == 40){
    level.addObject(new Tutorial_Guide(), 100, 100);
} else if (cmC == 60){ 
    level.addObject(new Trade_Instance(), 500, 300);
} else if (cmC == 80){
    level.addObject(new Trade_Inventory_Shop_Interface_LB(), 300, 250);
} else if (cmC == 100){
    level.addObject(new Trade_Inventory_Shop_Interface_LB(), 300, 300);
} else if (cmC == 120){
    level.addObject(new Trade_Inventory_Shop_Interface_LB(), 300, 350);
} else if (cmC == 140){
    level.addObject(new Trade_Inventory_Shop_Interface_LB(), 300, 400);
} else if (cmC == 160){
    level.addObject(new Trade_Inventory_Shop_Interface_LB(), 300, 450);
} else if (cmC == 180){
    level.addObject(new Trade_Inventory_Shop_Interface_LB(), 300, 500);
} else if (cmC == 200){
    level.addObject(new Trade_Inventory_Shop_Interface_LB(), 300, 550);
} else if (cmC == 220){
    level.addObject(new Trade_Inventory_Shop_Interface_LB(), 700, 250);
} else if (cmC == 240){
    level.addObject(new Trade_Inventory_Shop_Interface_LB(), 700, 300);
} else if (cmC == 260){
    level.addObject(new Trade_Inventory_Shop_Interface_LB(), 700, 350);
} else if (cmC == 280){
    level.addObject(new Trade_Inventory_Shop_Interface_LB(), 700, 400);
} else if (cmC == 300){
    level.addObject(new Trade_Inventory_Shop_Interface_LB(), 700, 450);
} else if (cmC == 320){
    level.addObject(new Trade_Inventory_Shop_Interface_LB(), 700, 500);
} else if (cmC == 340){
    level.addObject(new Trade_Inventory_Shop_Interface_LB(), 700, 550);
} else if (cmC == 360){
    level.addObject(new Shop_Welcome_Message(), 500, 50); 
} else if (cmC == 380){
    level.addObject(new Shop_option_1(), 300, 250);
} else if (cmC == 400){
    level.addObject(new Shop_option_2(), 300, 300);
} else if (cmC == 420){    
    level.addObject(new Shop_option_3(), 300, 350); 
} else if (cmC == 440){    
    level.addObject(new Shop_option_4(), 300, 400);
} else if (cmC == 460){    
    level.addObject(new Shop_option_5(), 300, 450);
} else if (cmC == 480){    
    level.addObject(new Shop_option_6(), 300, 500);
} else if (cmC == 500){    
    level.addObject(new Shop_option_7(), 300, 550);
} else if (cmC == 520){    
    level.addObject(new Shop_option_8(), 700, 250);
} else if (cmC == 540){    
    level.addObject(new Shop_option_9(), 700, 300);
} else if (cmC == 560){    
    level.addObject(new Shop_option_10(), 700, 350);
} else if (cmC == 580){    
    level.addObject(new Shop_option_11(), 700, 400);
} else if (cmC == 600){    
    level.addObject(new Shop_option_12(), 700, 450);
} else if (cmC == 620){    
    level.addObject(new Shop_option_14(), 700, 550);
} else if (cmC == 640){    
    level.addObject(new Shop_Cursor_Images(), 310, 250);
} else if (cmC == 660){
    Shop_Pan2 = false;
    Shop_Check = true;
}

    if (cmC < 660){
    cmC = (cmC + 1);
    
    
}

}
if ((Shop_Check) && (!(Shop_Pan2))){
    setRoom();
     if (Greenfoot.isKeyDown("space")){
         //System.out.println("System.Check.getOptionSelection.14.3.initialization.complete");
         //Shop_Cursor.getOptionSelection(3,14);
         if (cSI == 3){
                System.out.println("Spells: Here's a collection of _Spell Tomes_ I've gathered over the years!");
                level.changeMap(3,3);
                Shop_Pan2 = true;
                } else if (cSI == 4){
                    System.out.println("Melee Weapons: Swords, spears, axes... I've got all seek on sale here!"); 
                    level.changeMap(3,4);
                    Shop_Pan2 = true;
                    } else if (cSI == 5){
                        System.out.println("Ranged Weapons: Bows, javelins, throwing axes, crossbows... whatever you need I've got it right here!"); 
                        level.changeMap(3,5);
                        Shop_Pan2 = true;
                        } else if (cSI == 6){
                            System.out.println("Staves: I've gathered a few rare magical staves in stock for the right price of course!");
                            level.changeMap(3,6);
                            Shop_Pan2 = true;
                            } else if (cSI == 7){
                                System.out.println("Relics: These are very hard to come by, are you really that rich?");
                                level.changeMap(3,7);
                                Shop_Pan2 = true;
                                } else if (cSI == 8){
                                    System.out.println("Items: I got a few things you might be interested in!");
                                    level.changeMap(3,8);
                                    Shop_Pan2 = true;
                                    } else if (cSI == 9){
                                        System.out.println("Materials: Don't go out into the fray without proper supplies! You'll catch a cold!");
                                        level.changeMap(3,9);
                                        Shop_Pan2 = true;
                                        } else if (cSI == 10){
                                            System.out.println("Miscelaneous: If you want them, I've got a few random things on sale that you could buy for your house.");
                                            level.changeMap(3,10);
                                            Shop_Pan2 = true;
                                            } else if (cSI == 11){
                                                System.out.println("Enchanting: I have a few enchanting items for your gear, or - for the right price, I could enchant them?!");
                                                level.changeMap(3,11);
                                                Shop_Pan2 = true;
                                                } else if (cSI == 12){
                                                    System.out.println("Rare Goods: These are rare goods from across the desert and beyond, they don't come cheap pal!");
                                                    level.changeMap(3,12);
                                                    Shop_Pan2 = true;
                                                    } else if (cSI == 13){
                                                        System.out.println("Ammo: All the arrows and bolts you need I've got right here!");
                                                        level.changeMap(3,13);
                                                        Shop_Pan2 = true;
                                                        } else if (cSI == 14){
                                                            System.out.println("Magic Skills: I know a Grey cloaked Wizard who can teach you many magical skills!");
                                                            level.changeMap(3,14);
                                                            Shop_Pan2 = true;
                                                            } else if (cSI == 15){
                                                                System.out.println("Unspecified (Unknown Selection): Sorry...this hasn't arrived yet! It might be here when you come back some other time though!");
                                                                level.changeMap(3,15);
                                                                Shop_Pan2 = true;
                                                                } else if (cSI == 16){
                                                                    System.out.println("Exit?: Thank you! Come again!");
                                                                    
                                                                    level.changeMap(3,16);
                                                                    Shop_Pan2 = true;
                                                                    }

            
         
         
     }

 }
}
 
}

 public static void setRoom(){
         
         
         cSMI = true;
        
 }


public void Stats(){
    if (!(Game_Start_Instance)){
        
    background level = (background)this.getWorld();
    
    
    int Affinity_ = (getRandomNumberRange(1,10));
    
    System.out.println("Affinity: " + Affinity_);
    
    int Aid_ = (getRandomNumberRange(1,10));
    
    System.out.println("Aid: " + Aid_);
    
    int Attack_Speed_ = (getRandomNumberRange(1,10));
    
    System.out.println("Attack Speed: " + Attack_Speed_);
    
    int Constitution_ = (getRandomNumberRange(1,10));
    
    System.out.println("Constitution: " + Constitution_);
    
    int Defense_ = (getRandomNumberRange(1,10));
    
    System.out.println("Defense: " + Defense_);
    
    int Hp_ = (getRandomNumberRange(1,10));
    
    System.out.println("Hp: " + Hp_);
    
    int Leadership_ = (getRandomNumberRange(1,10));
    
    System.out.println("Leadership: " + Leadership_);
    
    int Level_ = 1;
    
    System.out.println("Level: " + Level_);
    
    int Luck_ = (getRandomNumberRange(1,10));
    
    System.out.println("Luck: " + Luck_);
    
    int Magic_ = (getRandomNumberRange(1,10));
    
    System.out.println("Magic: " + Magic_);
    
    int Maximum_Hp_ = 60;
    
    System.out.println("Maximum Hp: " + Maximum_Hp_);
    
    int Movement_ = (getRandomNumberRange(1,10));
    
    System.out.println("Movement: " + Movement_);
    
    int Movement_Star_ = 10;
    
    System.out.println("Movement_Star: " + Movement_Star_);
    
    int Pursuit_Critical_Coefficient_ = (getRandomNumberRange(1,10));
    
    System.out.println("PCC: " + Pursuit_Critical_Coefficient_);
    
    int Relative_Power_ = (getRandomNumberRange(1,10));
    
    System.out.println("RP: " + Relative_Power_);
    
    int Resistance_ = (getRandomNumberRange(1,10));
    
    System.out.println("Resistance: " + Resistance_);
    
    int Skill_ = (getRandomNumberRange(1,10));
    
    System.out.println("Skill: " + Skill_);
    
    int Speed_ = (getRandomNumberRange(1,10));
    
    System.out.println("Speed: " + Speed_);
    
    int Strength_ = (getRandomNumberRange(1,10));
    
    System.out.println("Strength: " + Strength_);
    
    int Weapon_Level_ = (getRandomNumberRange(1,10));
    
    System.out.println("Weapon Level: " + Weapon_Level_);
    
    int Weapon_Rank_ = (getRandomNumberRange(1,10));
    
    System.out.println("Weapon Rank: " + Weapon_Rank_);
    
    int Weight_ = (getRandomNumberRange(1,10));
    
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
public int getRandomNumberRange(int start, int end){
    int normal = Greenfoot.getRandomNumber(end-start+1);
    return normal+start;
}




//-------------------------------------------------------------------------------



// static java.lang.String getKey(){
//     return getKey();
// //Get the most recently pressed key, since the last time this method was called.
// }
// 
 static void setSpeed(int speed){
     
     
     System.out.println("Speed =" + speed);
     //Set the speed of the execution.
 }
}
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
