import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Startpage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Startpage extends World
{
    public GreenfootSound sound = new GreenfootSound ("bg.wav");
    boolean a = true;
    /**
     * Constructor for objects of class Startpage.
     * 
     */
    public Startpage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 
       addObject(new start(),408,348);
        sound.setVolume(60);
    }
    public void started(){
       sound.playLoop();
      
    }
    public void stopped(){
        sound.pause();
    }
}
