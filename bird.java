import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bird extends Actor
{
    int direc = 2;
    /**
     * Act - do whatever the bird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(direc);
        bump();
    }    
    public bird(String b){
       setImage(b+".png");
    }
    public void bump(){
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
