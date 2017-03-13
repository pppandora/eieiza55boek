import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class edok here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class edok extends Boss
{
    /**
     * Act - do whatever the edok wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
       // win();
        move(-1);
        
    } 
  
       public void hitit(int damage2) {
        heart = heart - damage2;
        if(heart == 0) {
            
             
             Greenfoot.setWorld(new EndGame());
           
        }
    }
    
    
}
