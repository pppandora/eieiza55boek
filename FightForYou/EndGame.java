import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndGame extends World
{
   public GreenfootSound sound = new GreenfootSound ("bg.wav");
   public GreenfootSound bg = new GreenfootSound ("Good1.wav");
    
    /**
     * Constructor for objects of class EndGame.
     * 
     */
    public EndGame()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
         super(800, 400, 1); 
         addObject(new menu(),67,380);
         addObject(new exit(),157,380);
         showText(" Score :"+Score.score,393,271);
         bg.play();
         bg.setVolume(80);
    }
     
    public void stopped(){
        sound.stop();
        bg.stop();
    }
    
}
