import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Items here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Items extends Player_Interface
{
    boolean iDF = false;
    //int[] data; // Declare
    int[] data = { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223 };
    
    boolean itemcheckList = false;
    int itemID = 0;
    
    public void act() 
    {
            if (!(iDF)){
                
                //data = new int[222]; // Create // total is actually 223, but 0 counts as 1 in this case. So -> 0 = 1 -> 0 + 222 = 222 == 223
                               
                
                Items();
                
            }
    }    
    public void Items(){
        if (!(iDF)){  
            
            background level = (background)this.getWorld();
            
            if (!(itemcheckList)){
            
            System.out.println(data[itemID]);
            
            if (data[itemID] == 1){
                
                System.out.println("Iron_Sword" + ", data: " + data[itemID] + ", itemID: " + itemID);
                                
            }
            if (data[itemID] == 2){
                
                System.out.println("Steel_Sword" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 3){
                
                System.out.println("Silver_Sword" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 4){
                
                System.out.println("_Sword" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 5){
                
                System.out.println("_Sword" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 6){
                
                System.out.println("_Sword" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 7){
                
                System.out.println("_Sword" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 8){
                
                System.out.println("_Sword" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 9){
                
                System.out.println("_Sword" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 10){
                
                System.out.println("_Sword" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }            
            if (data[itemID] == 11){
                
                System.out.println("_Sword" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 12){
                
                System.out.println("_Sword" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 13){
                
                System.out.println("_Sword" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 14){
                
                System.out.println("_Sword" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 15){
                
                System.out.println("_Sword" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 16){
                
                System.out.println("_Sword" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 17){
                
                System.out.println("_Sword" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 18){
                
                System.out.println("_Sword" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 19){
                
                System.out.println("_Sword" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 20){
                
                System.out.println("_Sword" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 21){
                
                System.out.println("_Sword" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 22){
                
                System.out.println("_Sword" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 23){
                
                System.out.println("_Sword" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 24){
                
                System.out.println("_Sword" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 25){
                
                System.out.println("_Sword" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 26){
                
                System.out.println("_Sword" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 27){
                
                System.out.println("_Sword" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 28){
                
                System.out.println("_Sword" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 29){
                
                System.out.println("_Sword" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 30){
                
                System.out.println("_Sword" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            
            if (data[itemID] == 31){
                
                System.out.println("_Spear" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 32){
                
                System.out.println("_Spear" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 33){
                
                System.out.println("_Spear" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 34){
                
                System.out.println("_Spear" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 35){
                
                System.out.println("_Spear" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 36){
                
                System.out.println("_Spear" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 37){
                
                System.out.println("_Spear" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 38){
                
                System.out.println("_Spear" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 39){
                
                System.out.println("_Spear" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 40){
                
                System.out.println("_Spear" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 41){
                
                System.out.println("_Spear" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 42){
                
                System.out.println("_Spear" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 43){
                
                System.out.println("_Spear" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 44){
                
                System.out.println("_Spear" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 45){
                
                System.out.println("_Spear" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 46){
                
                System.out.println("_Spear" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 47){
                
                System.out.println("_Spear" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 48){
                
                System.out.println("_Spear" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 49){
                
                System.out.println("_Spear" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 50){
                
                System.out.println("_Spear" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 51){
                
                System.out.println("_Spear" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 52){
                
                System.out.println("_Axe" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 53){
                
                System.out.println("_Axe" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 54){
                
                System.out.println("_Axe" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 55){
                
                System.out.println("_Axe" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 56){
                
                System.out.println("_Axe" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 57){
                
                System.out.println("_Axe" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 58){
                
                System.out.println("_Axe" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 59){
                
                System.out.println("_Axe" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 60){
                
                System.out.println("_Axe" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 61){
                
                System.out.println("_Axe" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 62){
                
                System.out.println("_Axe" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 63){
                
                System.out.println("_Axe" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 64){
                
                System.out.println("_Axe" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 65){
                
                System.out.println("_Axe" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 66){
                
                System.out.println("_Axe" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 67){
                
                System.out.println("_Axe" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 68){
                
                System.out.println("_Axe" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 69){
                
                System.out.println("_Axe" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 70){
                
                System.out.println("_Axe" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 71){
                
                System.out.println("_Axe" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 72){
                
                System.out.println("_Axe" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 73){
                
                System.out.println("_Bow" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 74){
                
                System.out.println("_Bow" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 75){
                
                System.out.println("_Bow" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 76){
                
                System.out.println("_Bow" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 77){
                
                System.out.println("_Bow" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 78){
                
                System.out.println("_Bow" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 79){
                
                System.out.println("_Bow" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 80){
                
                System.out.println("_Bow" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 81){
                
                System.out.println("_Bow" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 82){
                
                System.out.println("_Bow" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 83){
                
                System.out.println("_Bow" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 84){
                
                System.out.println("_Bow" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 85){
                
                System.out.println("_Balista" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 86){
                
                System.out.println("_Balista" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 87){
                
                System.out.println("_Tome" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 88){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 89){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 90){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 91){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 92){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 93){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 94){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 95){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 96){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 97){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 98){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 99){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 100){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 101){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 102){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 103){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 104){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 105){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 106){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 107){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 108){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 109){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 110){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }            
            if (data[itemID] == 111){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 112){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 113){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 114){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 115){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 116){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 117){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 118){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 119){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 120){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 121){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 122){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 123){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 124){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 125){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 126){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 127){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 128){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 129){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 130){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 131){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 132){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 133){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 134){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 135){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 136){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 137){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 138){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 139){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 140){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 141){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 142){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 143){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 144){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 145){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 146){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 147){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 148){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 149){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 150){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 151){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 152){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 153){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 154){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 155){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 156){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 157){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 158){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 159){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 160){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 161){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 162){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 163){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 164){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 165){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 166){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 167){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 168){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 169){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 170){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 171){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 172){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 173){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 174){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 175){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 176){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 177){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 178){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 179){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 180){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 181){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 182){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 183){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 184){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 185){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 186){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 187){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 188){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 189){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 190){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 191){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 192){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 193){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 194){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 195){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 196){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 197){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 198){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 199){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 200){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 201){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 202){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 203){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 204){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 205){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 206){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 207){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 208){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 209){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 210){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 211){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 212){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 213){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 214){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 215){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 216){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 217){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 218){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 219){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 220){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 221){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 222){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            if (data[itemID] == 223){
                
                System.out.println("" + ", data: " + data[itemID] + ", itemID: " + itemID);
                
            }
            iDF = true;  
        }
        }
        
        if (itemID == 1){
            
        }

    }
    public int getItemID(int ItemData){
        int i = itemID;
        System.out.println("i = " + i + ", itemID.CheckResidual = " + itemID);
        return data[i];
}

}
