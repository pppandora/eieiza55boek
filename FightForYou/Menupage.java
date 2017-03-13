import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menupage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menupage extends World
{
    public GreenfootSound sound = new GreenfootSound ("bg.wav");
    /**
     * Constructor for objects of class Menupage.
     * 
     */
    public Menupage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 
        addObject(new lv1(),140,294);
        addObject(new lv2(),395,294);
        addObject(new lv3(),676,294);
    }
      public void started(){
       sound.play();
    }
    public void stopped(){
        sound.pause();
    }
}
