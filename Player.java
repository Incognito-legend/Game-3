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
    String lastWayFacing = "down";
    
    String lastClassType = "Paladin";
    int x = 512;
    int y = 389;
    
    
    
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
    
    
    int Affinity_;
    int Aid_;
    int Attack_Speed_;
    int Constitution_;
    int Defense_;
    int Hp_;
    int Leadership_;
    int Level_;
    int Luck_;
    int Magic_;
    int Maximum_Hp_;
    int Movement_;
    int Movement_Star_;
    int Pursuit_Critical_Coefficient_;
    int Relative_Power_;
    int Resistance_;
    int Skill_;
    int Speed_;
    int Strength_;
    int Weapon_Level_;
    int Weapon_Rank_;
    //
    int Weight_;
    // ^^^ (Character / Class) Specific Stat
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

        // Movement and controls section
  if (!(cutscene)){
        if (Room == Lobby){
     

        
  if (Greenfoot.isKeyDown ("left")){
       
       level.scroll(10, 0);
       

       hero_x_px = -level.pos_x + getX()-50;
       hero_y_px = -level.pos_y + getY();
       hero_x = hero_x_px/96;
       hero_y = hero_y_px/96;
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
        lastWayFacing = "left";
//         System.out.println("hero moved left, Tile: " + hero_x + ", " + hero_y);
//         System.out.println(level.pos_x + ", " + level.pos_y);
    }
        else  if (Greenfoot.isKeyDown ("right"))
    {
       
       background x = (background)this.getWorld();
       x.scroll(-10, 0);
       hero_x_px = -level.pos_x + getX()+50;
       hero_y_px = -level.pos_y + getY();
       hero_x = hero_x_px/96;
       hero_y = hero_y_px/96;
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
        lastWayFacing = "right";
//         System.out.println("hero moved right, Tile: " + hero_x + ", " + hero_y);
//         System.out.println(level.pos_x + ", " + level.pos_y);
    }
        else if (Greenfoot.isKeyDown("up"))
    {
       background x = (background)this.getWorld();
       x.scroll(0, 10);
       hero_x_px = -level.pos_x + getX();
       hero_y_px = -level.pos_y + getY();
       hero_x = hero_x_px/96;
       hero_y = hero_y_px/96;
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
        lastWayFacing = "up";
//         System.out.println("hero moved up, Tile: " + hero_x + ", " + hero_y);
//         System.out.println(level.pos_x + ", " + level.pos_y);
    }    
        else if (Greenfoot.isKeyDown("down"))
    {   
       background x = (background)this.getWorld();
       x.scroll(0, -10);
       hero_x_px = -level.pos_x + getX();
       hero_y_px = -level.pos_y + getY()+40;
       hero_x = hero_x_px/96;
       hero_y = hero_y_px/96;
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
        lastWayFacing = "down";
//         System.out.println("hero moved down, Tile: " + hero_x + ", " + hero_y);
//         System.out.println(level.pos_x + ", " + level.pos_y);
    //end of Player movement
    //Beginning of Artificial movement
    } 
       //end of Artificial movement
    else 
    {
        if (lastWayFacing.equals("up")){
            setImage(up2);
        } else if (lastWayFacing.equals("down")){
            setImage(down2);
        } else if (lastWayFacing.equals("left")) {
            setImage(left2);
        } else if (lastWayFacing.equals("right")) {
            setImage(right2);
        }
        

    }
    
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
        level.addObject(new hunter(), 512, 389);
        level.addObject(new Smoke_Effect(), 512, 389);
        System.out.println("You have chosen the [ Hunter ] !");
        Class = 1;
        Player_Stats = true;
        level.addObject(new Player_Portrait_Instance(), 120, 500);
        level.addObject(new Player_Name_Panel(), 120, 100);
    }
       if (level.getTileAt(hero_x, hero_y) == 8 && !(this instanceof Druid)){
        level.removeObject(this);
        level.addObject(new Druid(), 512, 389);
        level.addObject(new Smoke_Effect(), 512, 389);
        System.out.println("You have chosen the [ Druid ] !");
        Class = 2;
        Player_Stats = true;
    }
       if (level.getTileAt(hero_x, hero_y) == 9 && !(this instanceof Mage)){
        level.removeObject(this);
        level.addObject(new Mage(), 512, 389);
        level.addObject(new Smoke_Effect(), 512, 389);
        System.out.println("You have chosen the [ Mage ] !");
        Class = 3;
        Player_Stats = true;
    }
        if (level.getTileAt(hero_x, hero_y) == 10 && !(this instanceof Palladin)){
        level.removeObject(this);
        level.addObject(new Palladin(), 512, 389);
        level.addObject(new Smoke_Effect(), 512, 389);
        System.out.println("You have chosen the [ Palladin ] !");
        Class = 4;
        Player_Stats = true;
    }
       if (level.getTileAt(hero_x, hero_y) == 11 && !(this instanceof Warrior)){
        level.removeObject(this);
        level.addObject(new Warrior(), 512, 389);
        level.addObject(new Smoke_Effect(), 512, 389);
        System.out.println("You have chosen the [ Warrior ] !");
        Class = 5;
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
////////////////////////////////////////////////////////////////////////////////////////////////////////







if (Room == Blacksmith){
    if (Greenfoot.isKeyDown ("left"))
    {
      level.scroll(10, 0);
       hero_x_px = -level.pos_x + getX()-50;
       hero_y_px = -level.pos_y + getY();
       hero_x = hero_x_px/96;
       hero_y = hero_y_px/96;
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
        lastWayFacing = "left";
        //System.out.println("hero moved left, Tile: " + hero_x + ", " + hero_y);
    }
  
        else  if (Greenfoot.isKeyDown ("right"))
    {
        background x = (background)this.getWorld();
      x.scroll(-10, 0);
       hero_x_px = -level.pos_x + getX()+50;
       hero_y_px = -level.pos_y + getY();
       hero_x = hero_x_px/96;
       hero_y = hero_y_px/96;
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
        lastWayFacing = "right";
        //System.out.println("hero moved right, Tile: " + hero_x + ", " + hero_y);
    }

        else if (Greenfoot.isKeyDown("up"))
    {
        background x = (background)this.getWorld();
      x.scroll(0, 10);
       hero_x_px = -level.pos_x + getX();
       hero_y_px = -level.pos_y + getY();
       hero_x = hero_x_px/96;
       hero_y = hero_y_px/96;
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
        lastWayFacing = "up";
        //System.out.println("hero moved up, Tile: " + hero_x + ", " + hero_y);
    }
    
        else if (Greenfoot.isKeyDown("down"))
    {   
        background x = (background)this.getWorld();
      x.scroll(0, -10);
       hero_x_px = -level.pos_x + getX();
       hero_y_px = -level.pos_y + getY()+40;
       hero_x = hero_x_px/96;
       hero_y = hero_y_px/96;
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
        lastWayFacing = "down";
        //System.out.println("hero moved down, Tile: " + hero_x + ", " + hero_y);
    } 
    
    else 
    {
        
        if (lastWayFacing.equals("up")){
            setImage(up2);
        } else if (lastWayFacing.equals("down")){
            setImage(down2);
        } else if (lastWayFacing.equals("left")) {
            setImage(left2);
        } else if (lastWayFacing.equals("right")) {
            setImage(right2);
        }
        
    }

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
//     if (!level.music.isPlaying()) {
//         level.track_num++;
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////         








if ((Room == Shop) && !(windowPane)){
    if (Greenfoot.isKeyDown ("left"))
    {
      level.scroll(10, 0);
       hero_x_px = -level.pos_x + getX()-50;
       hero_y_px = -level.pos_y + getY();
       hero_x = hero_x_px/96;
       hero_y = hero_y_px/96;
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
        lastWayFacing = "left";
        //System.out.println("hero moved left, Tile: " + hero_x + ", " + hero_y);
    }
  
        else  if (Greenfoot.isKeyDown ("right"))
    {
        background x = (background)this.getWorld();
      x.scroll(-10, 0);
       hero_x_px = -level.pos_x + getX()+50;
       hero_y_px = -level.pos_y + getY();
       hero_x = hero_x_px/96;
       hero_y = hero_y_px/96;
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
        lastWayFacing = "right";
        //System.out.println("hero moved right, Tile: " + hero_x + ", " + hero_y);
    }

        else if (Greenfoot.isKeyDown("up"))
    {
        background x = (background)this.getWorld();
      x.scroll(0, 10);
       hero_x_px = -level.pos_x + getX();
       hero_y_px = -level.pos_y + getY();
       hero_x = hero_x_px/96;
       hero_y = hero_y_px/96;
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
        lastWayFacing = "up";
        //System.out.println("hero moved up, Tile: " + hero_x + ", " + hero_y);
    }
    
        else if (Greenfoot.isKeyDown("down"))
    {   
        background x = (background)this.getWorld();
      x.scroll(0, -10);
       hero_x_px = -level.pos_x + getX();
       hero_y_px = -level.pos_y + getY()+40;
       hero_x = hero_x_px/96;
       hero_y = hero_y_px/96;
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
        lastWayFacing = "down";
        //System.out.println("hero moved down, Tile: " + hero_x + ", " + hero_y);
    } 
    
    else 
    {
        
        if (lastWayFacing.equals("up")){
            setImage(up2);
        } else if (lastWayFacing.equals("down")){
            setImage(down2);
        } else if (lastWayFacing.equals("left")) {
            setImage(left2);
        } else if (lastWayFacing.equals("right")) {
            setImage(right2);
        }
        
    }

//SYSTEM MESSAGE PANEL Start
    if ((level.getTileAt(hero_x, hero_y) == 12) && !(Shop_Goodbye)){
        
           //System.out.println("Goodbye!");
           Shop_Goodbye = true;
           Room = Lobby;
           level.setDefaultForMap(2);
           level.changeMap(1,1);

           
           dirtyFlag1 = true;
        
 } else if (!(level.getTileAt(hero_x, hero_y) == 12) && (Shop_Goodbye)){
           Shop_Goodbye = false;
           level.track_num = 1;
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






if ((Room == Shop) && (windowPane)){
        if (lastWayFacing.equals("up")){
            setImage(up2);
        } else if (lastWayFacing.equals("down")){
            setImage(down2);
        } else if (lastWayFacing.equals("left")) {
            setImage(left2);
        } else if (lastWayFacing.equals("right")) {
            setImage(right2);
        }
        level.setDefaultForMap(1);
        level.changeMap(3,2);
}


//--------------------------------------------------------------------------------------









if (Room == Arena){
    if (Greenfoot.isKeyDown ("left"))
    {
      level.scroll(10, 0);
      
       hero_x_px = -level.pos_x + getX()-50;
       hero_y_px = -level.pos_y + getY();
       hero_x = hero_x_px/96;
       hero_y = hero_y_px/96;
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
        lastWayFacing = "left";
        System.out.println(level.pos_x + ", " + level.pos_y);
        System.out.println("hero moved left, Tile: " + hero_x + ", " + hero_y);
    }
  
        else  if (Greenfoot.isKeyDown ("right"))
    {
        background x = (background)this.getWorld();
      x.scroll(-10, 0);
       hero_x_px = -level.pos_x + getX()+50;
       hero_y_px = -level.pos_y + getY();
       hero_x = hero_x_px/96;
       hero_y = hero_y_px/96;
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
        lastWayFacing = "right";
        System.out.println(level.pos_x + ", " + level.pos_y);
        System.out.println("hero moved right, Tile: " + hero_x + ", " + hero_y);
    }

        else if (Greenfoot.isKeyDown("up"))
    {
        background x = (background)this.getWorld();
      x.scroll(0, 10);
       hero_x_px = -level.pos_x + getX();
       hero_y_px = -level.pos_y + getY();
       hero_x = hero_x_px/96;
       hero_y = hero_y_px/96;
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
        lastWayFacing = "up";
        System.out.println(level.pos_x + ", " + level.pos_y);
        System.out.println("hero moved up, Tile: " + hero_x + ", " + hero_y);
    }
    
        else if (Greenfoot.isKeyDown("down"))
    {   
        background x = (background)this.getWorld();
      x.scroll(0, -10);
       hero_x_px = -level.pos_x + getX();
       hero_y_px = -level.pos_y + getY()+40;
       hero_x = hero_x_px/96;
       hero_y = hero_y_px/96;
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
        lastWayFacing = "down";
        System.out.println(level.pos_x + ", " + level.pos_y);
        System.out.println("hero moved down, Tile: " + hero_x + ", " + hero_y);
    } 
    
    else 
    {
        
        if (lastWayFacing.equals("up")){
            setImage(up2);
        } else if (lastWayFacing.equals("down")){
            setImage(down2);
        } else if (lastWayFacing.equals("left")) {
            setImage(left2);
        } else if (lastWayFacing.equals("right")) {
            setImage(right2);
        }
        
    }
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
    if (Greenfoot.isKeyDown ("left"))
    {
      level.scroll(10, 0);
       hero_x_px = -level.pos_x + getX()-50;
       hero_y_px = -level.pos_y + getY();
       hero_x = hero_x_px/96;
       hero_y = hero_y_px/96;
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
        lastWayFacing = "left";
        //System.out.println("hero moved left, Tile: " + hero_x + ", " + hero_y);
    }
  
        else  if (Greenfoot.isKeyDown ("right"))
    {
        background x = (background)this.getWorld();
      x.scroll(-10, 0);
       hero_x_px = -level.pos_x + getX()+50;
       hero_y_px = -level.pos_y + getY();
       hero_x = hero_x_px/96;
       hero_y = hero_y_px/96;
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
        lastWayFacing = "right";
        //System.out.println("hero moved right, Tile: " + hero_x + ", " + hero_y);
    }

        else if (Greenfoot.isKeyDown("up"))
    {
        background x = (background)this.getWorld();
      x.scroll(0, 10);
       hero_x_px = -level.pos_x + getX();
       hero_y_px = -level.pos_y + getY();
       hero_x = hero_x_px/96;
       hero_y = hero_y_px/96;
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
        lastWayFacing = "up";
        //System.out.println("hero moved up, Tile: " + hero_x + ", " + hero_y);
    }
    
        else if (Greenfoot.isKeyDown("down"))
    {   
        background x = (background)this.getWorld();
      x.scroll(0, -10);
       hero_x_px = -level.pos_x + getX();
       hero_y_px = -level.pos_y + getY()+40;
       hero_x = hero_x_px/96;
       hero_y = hero_y_px/96;
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
        lastWayFacing = "down";
        //System.out.println("hero moved down, Tile: " + hero_x + ", " + hero_y);
    } 
    
    else 
    {
        
        if (lastWayFacing.equals("up")){
            setImage(up2);
        } else if (lastWayFacing.equals("down")){
            setImage(down2);
        } else if (lastWayFacing.equals("left")) {
            setImage(left2);
        } else if (lastWayFacing.equals("right")) {
            setImage(right2);
        }
        
    }
           if (level.getTileAt(hero_x, hero_y) == 4 && (dirtyFlag1 == true)){
// entering Arena Battle room
           Room = Arena;
           level.setDefaultForMap(1);
           level.changeMap(4,1);
           dirtyFlag1 = false;
        
    }
}
}
}
}

    //block#1 = wall
    //block#1002 = floor
    //TB revisited later   
    //}
    //if (!(level.getTileAt(hero_x, hero_y) == 12)){
           //dirtyFlag = true;
           
    //}   
