import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class edok here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class edok extends Boss
{
    /**
     * Act - do whatever the edok wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int BossHP = 1000;
    public void act() 
    {
        // Add your action code here.
       // win();
        move(-1);
        
    } 
  
       public void hitit(int damage2) {
        heart = heart - damage2;
        
    }
    
    public void BossHP(){
        if(isTouching(bulletboss.class)){
            BossHP--;
            if(BossHP == 0){
                getWorld().removeObject(this);
            }
        }
    }
}
