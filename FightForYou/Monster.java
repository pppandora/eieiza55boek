import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monster extends Actor
{
    /**
     * Act - do whatever the Monster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    int life = 100;
    
    /**
     * Act - do whatever the Monster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
    }    
   
    
    public void movement(){
        move(-2);
        if(isAtEdge()){
        getWorld().removeObject(this);
        }
    }
    
 
  public void hit(int damage) {
        life = life - damage;
        if(life <= 0) 
           getWorld().removeObject(this);         
    }
  
}


