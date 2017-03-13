import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends game
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static final int damage = 10;
    
    
    /** A bullet looses one life each act, and will disappear when life = 0 */
    /**
     * The bullet will damage asteroids if it hits them.
     */
    public void act()
    {
      
      setLocation(getX()+1,getY());
        if(isAtEdge()){
         getWorld().removeObject(this);
         return;
      }
     
      countScore();
      checkBulletHit();
        
    }
    
    /**
     * Check whether we have hit an asteroid.
     */
    private void checkBulletHit()
    {
        Monster monster = (Monster) getOneIntersectingObject(Monster.class);
      
      if (monster != null){
           monster.hit(damage);
           getWorld().removeObject(this);
      }
          
    }
     public void countScore(){
     if(isTouching(tuow.class)||isTouching(MonLv1.class))   
     {
          Score.score++;
          
     }  
   }
}
