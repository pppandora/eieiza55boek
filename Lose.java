import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lose here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lose extends World
{
    boolean a = true;
    public GreenfootSound sound = new GreenfootSound ("bg.wav");
    public GreenfootSound lose = new GreenfootSound ("lose.wav");
    /**
     * Constructor for objects of class Lose.
     * 
     */
    public Lose()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 
        addObject(new menu(),67,380);
         addObject(new exit(),157,380);
         
         showText(" Score :"+Score.score,393,271);
    }
    public void act(){
       lose.setVolume(80);
       lose.play();
       
    }
    public void stopped(){
        sound.pause();
        lose.stop();
    }
}

