import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bulletboss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bulletboss extends game
{
    private static final int damage2 = 10;
    /**
     * Act - do whatever the bulletboss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
         setLocation(getX()+1,getY());
        if(isAtEdge()){
         getWorld().removeObject(this);
         return;
      } 
         
       countScore();
      
      checkBulletHitit();
      
        
      
     
       
    }    
    private void checkBulletHitit()
    {
        Boss mon = (Boss) getOneIntersectingObject(Boss.class);
      
      if (mon != null){
           mon.hitit(damage2);
           getWorld().removeObject(this);
      }
          
    }
    public void countScore(){
     if(isTouching(edok.class)||isTouching(Ptuow.class)||isTouching(Bigboss.class))   
    {
          Score.score=Score.score+10;
         
    }
  }
}
