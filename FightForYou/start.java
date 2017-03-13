import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class start extends Actor
{
    /**
     * Act - do whatever the start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        checkClick();
        point();
    }    
    public void checkClick(){
        
        if(Greenfoot.mouseClicked(this)){
           Greenfoot.setWorld(new Menupage());
           Greenfoot.playSound("click.wav");
        }
     }
    public void point(){
         if(Greenfoot.mouseMoved(this)){
           setImage("start2.png");
        }else
        {
            setImage("start1.png");
        }
     }
     
}
