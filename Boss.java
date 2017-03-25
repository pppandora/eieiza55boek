import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Actor
{
    /**
     * Act - do whatever the Boss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     int life = 600;
    
    /**
     * Act - do whatever the Monster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
    }    
   
    
    public void movement(){
        move(-4);
        if(isAtEdge()){
        getWorld().removeObject(this);
        }
    }
    
 
 public void hitit(int damage) {
        life = life - damage;
        if(life <= 0) 
           getWorld().removeObject(this);         
    } 
}
