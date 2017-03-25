import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bu extends game
{
    /**
     * Act - do whatever the bu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   private static final int damage2 = 10;
    /**
     * Act - do whatever the bulletboss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
         setLocation(getX()+30,getY());
        if(isAtEdge()){
         getWorld().removeObject(this);
         return;
      } 
         
       countScore();
      
      
      checkBulletHitya();
        
      
     
       
    }    
    
     private void checkBulletHitya()
    {
        Big mon = (Big) getOneIntersectingObject(Big.class);
      
      if (mon != null){
           mon.hitya(damage2);
           getWorld().removeObject(this);
      }
          
    }
    public void countScore(){
     if(isTouching(a.class)||isTouching(b.class)||isTouching(cc.class)||isTouching(dd.class))   
    {
          Score.score=Score.score+10;
         
    }
  }
}
