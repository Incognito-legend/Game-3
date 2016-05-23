import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Fimbulvatr extends Player
{
    int counter = 1;
    GreenfootSound fimb = new GreenfootSound("fimb.wav");
    public void act() 
    {
       background level = (background)this.getWorld();
        if(counter == 1) {
           fimb.play();
           setImage("fimb1.png");
        }      else if (counter == 2) {
           setImage("fimb2.png");            
        }      else if (counter == 3) {
           setImage("fimb3.png");
        }      else if (counter == 4) {
           setImage("fimb4.png");
        }      else if (counter == 5) {
           setImage("fimb5.png");
        }      else if (counter == 6) {
           setImage("fimb6.png");
        }      else if (counter == 7) {
           setImage("fimb7.png");
        }      else if (counter == 8) {
           setImage("fimb8.png");
        }      else if (counter == 9) {
           setImage("fimb9.png");
        }      else if (counter == 10) {
           setImage("fimb10.png");
        }      else if (counter == 11) {
           setImage("fimb11.png");
        }      else if (counter == 12) {
           setImage("fimb12.png");
        }      else if (counter == 13) {
           setImage("fimb13.png");
        }      else if (counter == 14) {
           setImage("fimb14.png");
        }      else if (counter == 15) {
           setImage("fimb15.png");
        }      else if (counter == 16) {
           setImage("fimb16.png");
        }      else if (counter == 17) {
           setImage("fimb17.png");
        }      else if (counter == 18) {
           setImage("fimb18.png");
        }      else if (counter == 19) {
           setImage("fimb19.png");
        }      else if (counter == 20) {
           setImage("fimb20.png");
        }      else if (counter == 21) {
           setImage("fimb21.png");
        }      else if (counter == 22) {
           setImage("fimb22.png");
        }      else if (counter == 23) {
           setImage("fimb23.png");
        }      else if (counter == 24) {
           setImage("fimb24.png");
        }      else if (counter == 25) {
           setImage("fimb25.png");
        }      else if (counter == 26) {
           setImage("fimb26.png");
        }      else if (counter == 27) {
           setImage("fimb27.png");
        }      else if (counter == 28) {
           setImage("fimb28.png");
        }      else if (counter == 29) {
           setImage("fimb29.png");
        }      else if (counter == 30) {
           setImage("fimb30.png");
        }      else if (counter == 31) {
           setImage("fimb31.png");
        }      else if (counter == 32) {
           setImage("fimb32.png");
        }      else if (counter == 33) {
           setImage("fimb33.png");
        }      else if (counter == 34) {
           setImage("fimb34.png");
        }      else if (counter == 35) {
           setImage("fimb35.png");
        }      else if (counter == 36) {
           setImage("fimb36.png");
        }      else if (counter == 37) {
           setImage("fimb37.png");
        }      else if (counter == 38) {
           setImage("fimb38.png");
        }      else if (counter == 39) {
           setImage("fimb39.png");
        }      else if (counter == 40) {
           setImage("fimb40.png");
        }      else if (counter == 41) {
           setImage("fimb41.png");
        }      else if (counter == 42) {
           setImage("fimb42.png");
        }      else if (counter == 43) {
           setImage("fimb43.png");
        }      else if (counter == 44) {
           setImage("fimb44.png");
        }      else if (counter == 45) {
           setImage("fimb45.png");
        }      else if (counter == 46) {
           setImage("fimb46.png");
        }
        
        
        if(counter == 47) {
        //level.addObject(new BattleScene(), 475, 300);
        level.removeObject(this);   
        Player.fireWait = false;
        }
        counter++;
    }
}
