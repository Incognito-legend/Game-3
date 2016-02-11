// import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
// 
// public class UserInfo extends java.lang.Object
// {
//     /**
//      * The UserInfo class can be used to store data permanently on a server,
//      * 
//      * and to share this data between different users,
//      * 
//      * when the scenario runs on the Greenfoot web site.
//      * 
//      * 
//      * 
//      * This can be used to implement shared high score tables or other examples of shared data.
//      * 
//      * 
//      * 
//      * Storage is only available when the current user is logged in on the Greenfoot site,
//      * 
//      * so for some users storage will not be available.
//      * 
//      * 
//      * 
//      * Always use UserInfo.isStorageAvailable() to check before accessing the user data.
//      * 
//      * A typical code snippet for storing a high score is as follows:
//      
//      if (UserInfo.isStorageAvailable()) {
//          
//          UserInfo myInfo = UserInfo.getMyInfo();
//          
//          if (newScore > myInfo.getScore()) {
//              
//              myInfo.setScore(newScore);
//              
//              myInfo.store();  // write back to server
//              
//          }
//      }
//      
//      *
//      *
//      *
//      * Methods to retrieve user data include getting data for the current user (getMyInfo()),
//      * 
//      * the top scorers (e.g. getTop(10) for the top 10),
//      * 
//      * and data for users with scores near my own score (e.g. getNearby(10)).
//      * 
//      * 
//      * 
//      * The data that can be stored for each user consists of a score,
//      * 
//      * 10 additional general purpose integers,
//      * 
//      * and 5 strings (limited to 50 characters in length).
//      * 
//      * 
//      * 
//      * In addition, the user name and user's image can be retrieved from the user data.
//      * 
//      * 
//      * 
//      * For testing purposes,
//      * 
//      * while running within Greenfoot (not on the web site),
//      * 
//      * the user name can be set in the preferences (CTRL-SHIFT-P / CMD-SHIFT-P).
//      * 
//      * 
//      * 
//      * This allows to simulate different users during development.
//      * 
//      * 
//      * 
//      * When running on the web site,
//      * 
//      * the user name is the name used to log in to the site.
//      */
//     
//     public static final int NUM_INTS = 100; // The number of integers that can be stored
//     
//     public static final int NUM_STRINGS = 100; // The number of Strings that can be stored
//     
//     public static final int STRING_LENGTH_LIMIT = 26; // The maximum number of characters that can be stored in each String
//     
//     public static int newScore;
//     
//     String userName;
//     
//     
//     
//     public void act() 
//     {
//         if (UserInfo.isStorageAvailable()) {
//          UserInfo myInfo = UserInfo.getMyInfo();
//          if (newScore > myInfo.getScore()) {
//              myInfo.setScore(newScore);
//              myInfo.store();  // write back to server
//          }
//      }
//     }    
//     
//     
//     
//     public java.lang.String getUserName()
//     {
//         /**
//          * Get the username of the user that this storage belongs to.
//          * 
//          * 
//          * 
//          * RETURNS:
//          * 
//          * The username as a String.
//          */    
//         
//         return userName;
//     }
//     
//     public int getInt(int index)
//     {         
//         /** 
//          * Get the value of the int at the given index (0 to NUM_INTS-1, inclusive). 
//          * 
//          * The default value is zero.
//          * 
//          * 
//          * 
//          * PARAMETERS:
//          * 
//          * index - The index of the array where the needed int is positioned.
//          * 
//          * 
//          * 
//          * RETURNS:
//          * 
//          * The value of the number in the given index of the array.  
//          */    
//         
//         
//     } 
//     
//     public java.lang.String getString(int index)
//     {
//         /**
//          * Get the value of the String at the given index (0 to NUM_STRINGS-1, inclusive). 
//          * 
//          * The default value is the empty String.
//          */    
//     }
//     
//     public void setInt(int index, int value)
//     {
//         /**
//          * Set the value of the int at the given index (0 to NUM_INTS-1, inclusive).
//          * 
//          * Note that to store this value permanently, you must later call store().
//          */        
//     }
//     
//     public void setString(int index, java.lang.String value)
//     {
//         /**
//          * Get the value of the String at the given index (0 to NUM_STRINGS-1, inclusive).
//          * 
//          * Passing null is treated as a blank string.
//          * 
//          * The given String must be of STRING_LENGTH_LIMIT characters or less (or else the method will fail).
//          * 
//          * Note that to store this value permanently, you must later call store().
//          */                
//     }
//     
//     public int getScore()
//     {
//         /**
//          * Get the user's score.
//          * 
//          * By default, this is zero.
//          */ 
//     }
//     
//     public void setScore(int score)
//     {
//         /**
//          * Set the user's score.
//          * 
//          * Note that this really does set the user's score.
//          * 
//          * 
//          * 
//          * If you want to record only the user's highest score, you must code that yourself, using something like:
//          * 
//          * if (latestScore > userData.getScore()){ userData.setScore(latestScore); }
//          * 
//          * Without some code like this, you'll always overwrite the user's previous score.
//          * 
//          * 
//          * 
//          * Note that to store this value permanently, you must later call store().
//          */    
//     }
//     
//     public int getRank()
//     {
//         /**
//          * Get the users overall rank for this scenario.
//          * 
//          * 
//          * 
//          * The user with the highest score will return 1,
//          * 
//          * the user with the second highest score will return 2, and so on.
//          * 
//          * 
//          * 
//          * Players with equal scores will get equal ranks, so rank will not necessarily be unique.
//          * 
//          * To find the rank, scores are sorted in descending order (highest score first).
//          * 
//          * If your scores need to be lowest-first, one trick is to store them as negative numbers.
//          * 
//          * If the rank is unavailable (e.g. because the data hasn't been stored yet), this function will return -1.
//          */    
//     }
//     
//     public static boolean isStorageAvailable()
//     {
//         /**
//          * Indicate whether storage is available.
//          * 
//          * 
//          * 
//          * Storage is unavailable if the scenario is run as an applet outside the Greenfoot website,
//          * 
//          * or as a stand-alone application, 
//          * 
//          * or if the user is not logged in to the Greenfoot website.
//          * 
//          * 
//          * 
//          * This last case is very common, so you should check this function before attempting to use the other static storage functions.
//          * 
//          * If this function returns false, your scenario should proceed without using storage.
//          */    
//     }
//     
//     public static UserInfo getMyInfo()
//     {
//         /**
//          * Get the data stored for the current user.
//          * 
//          * 
//          * 
//          * RETURNS NULL IF:
//          * 
//          * there is a problem reading the local storage.csv file (for local scenarios), or
//          * 
//          * the scenario is running as a stand-alone application, or applet on your own website, or
//          * 
//          * there is a problem connecting to the server (for scenarios on the greenfoot.org site), or
//          * 
//          * the user is not logged in (for scenarios on the greenfoot.org site).
//          * 
//          * 
//          * 
//          * The last case is very common, so you should always be ready to handle a null return from this function.
//          * 
//          * 
//          * 
//          * RETURNS:
//          * 
//          * the user's data, or null if there was a problem.
//          */
//     }
//     
//     public boolean store()
//     {
//         /**
//          * Store the data to the server.
//          * 
//          * You can only store data for the current user (that is, data retrieved using getMyData).
//          * 
//          * If you try to store data for any user other than the current user, it is guaranteed to fail.
//          * 
//          * 
//          * 
//          * RETURNS:
//          * 
//          * true if stored successfully, false if there was a problem.
//          */
//     }
//     
//     public static java.util.List getTop(int maxAmount)
//     {
//         /**
//          * Get a sorted list of the UserInfo items for this scenario, starting at the top.
//          * 
//          * This will return one UserInfo item per user, and it will be sorted in descending order by the score (i.e. the return of getScore()).
//          * 
//          * The parameter allows you to specify a limit on the amount of users' data to retrieve.
//          * 
//          * 
//          * 
//          * If there's lots of data stored for users in your app,
//          * 
//          * it may take some time (and bandwidth) to retrieve all users' data,
//          * 
//          * and often you do not need all the users' data.
//          * 
//          * 
//          * 
//          * For example, if you want to show the high-scores,
//          * 
//          * STORE the score with setScore(score) and store(),
//          * 
//          * and then use getTop(10) to get the users with the top ten scores.
//          * 
//          * 
//          * 
//          * RETURNS NULL IF: 
//          * 
//          * there is a problem reading the local file (for local scenarios), or
//          *
//          * the scenario is running as a stand-alone application, or applet on your own website, or
//          *
//          * there is a problem connecting to the server (for scenarios on the greenfoot.org site).
//          * 
//          * 
//          * 
//          * You should always be ready to handle a null return from this function.
//          * 
//          * PARAMETERS:
//          * 
//          * maxAmount - The maximum number of data items to retrieve.
//          * 
//          * Passing zero or a negative number will get all the data, but see the note above.
//          * 
//          * 
//          * 
//          * RETURNS:
//          * 
//          * A list where each item is a UserInfo, or null if there was a problem
//          */
//     }
//     
//     public GreenfootImage getUserImage()
//     {
//         /**
//          * Return an image of the user. The image size is 50x50 pixels.
//          * 
//          * On the Greenfoot website, this is their profile picture.
//          * 
//          * 
//          * 
//          * If running locally (or a profile picture is unavailable),
//          * 
//          * this method returns a dummy image with the username drawn on the image.
//          * 
//          * 
//          * 
//          * RETURNS:
//          * 
//          * A 50x50 pixel GreenfootImage.
//          */
//     }
//     
//     
//     
//     
//     
//     
//     
//     
//     
//     
//     
//     
//     
//     
//     
//     
//     
//     
//     
//     
//     
//     
//     
//     
//     
//     
// }
