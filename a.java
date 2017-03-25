import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class a here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class a extends Boss
{
    /**
     * Act - do whatever the a wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int BossHP = 200;
    int direc = -2;
    public void act() 
    {
        // Add your action code here.
       // win();
        move(direc);
        walk();
        
    } 
  
       public void hitit(int damage2) {
        BossHP = BossHP - damage2;
         if(BossHP == 0){
                getWorld().removeObject(this);
                Greenfoot.setWorld(new EndGame());
                
            }
    }
    
      public void walk(){
      if(isAtEdge()){
        setImage("boss02.png");
        direc = -direc;
        }
    }
}


