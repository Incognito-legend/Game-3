import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player_Room_Arena_Subclass_Doors_Info here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player_Room_Info extends Player
{
    /**
     * Act - do whatever the Player_Room_Arena_Subclass_Doors_Info wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        System.out.println("System.Player.Room.Info/Initialized");
    }
    public int Room(int Initialization_SN)
    {
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
    }
}
