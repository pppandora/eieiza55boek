import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class reset2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class reset2 extends botton
{
    /**
     * Act - do whatever the reset2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
      public void act() 
    {
        // Add your action code here.
        checkClick();
    }    
    public void checkClick(){
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("click.wav");
            Greenfoot.setWorld(new LevelTwo());
            charector.HP=100;
            Score.score = 0;
            LevelTwo.timee = 3600;
        } 
    } 
}
