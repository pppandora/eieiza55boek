import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class clound here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class clound extends Actor
{
    /**
     * Act - do whatever the clound wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(1);
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }    
    public clound(String c){
       setImage(c+".png");

    }
    
}
