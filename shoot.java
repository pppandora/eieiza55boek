import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class shoot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class shoot extends game
{
    private static final int damage = 10;
    /**
     * Act - do whatever the shoot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public void act() 
    {
        // Add your action code here.
      setLocation(getX()-30,getY());
      if(isAtEdge()){
         getWorld().removeObject(this);
         return;
      }
        checkBulletHit2();
    }    
    private void checkBulletHit2()
    {
        charector cha = (charector) getOneIntersectingObject(charector.class);
      
      if (cha != null){
           cha.hit2(damage);
           getWorld().removeObject(this);
      }
          
    }
    public void check(){
        if(isTouching(bulletboss.class)){
            getWorld().removeObject(this);
        }
    }
}
