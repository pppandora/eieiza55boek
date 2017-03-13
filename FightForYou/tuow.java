import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tuow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tuow extends Monster
{
    /**
     * Act - do whatever the tuow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   int life =100;
   int direc = -3;
   public void act()
    {
       move(direc);
       walk();
   }
  public void hit(int damage) {
        life = life - damage;
        if(life <= 0) 
           getWorld().removeObject(this);         
    }
  public void walk(){
      if(isAtEdge()){
        setImage("monlv3.png");
        direc = -direc;
        
        }
      
  }
}


