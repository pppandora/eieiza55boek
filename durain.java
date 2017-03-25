import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class durain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class durain extends Actor
{
    /**
     * Act - do whatever the durain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(1);
        setRotation(360);
        setLocation(getX(),getY()+5);
         remove();
        // Add your action code here.
    }
    public void remove(){
        if(isTouching(charector.class)||isAtEdge()){
        getWorld().removeObject(this);
        }
    
}
}
