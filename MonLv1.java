import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MonLv1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MonLv1 extends Monster
{
    /**
     * Act - do whatever the MonLv1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
 
int life =100;
 
public void act()
{
       movement();
}
  public void hit(int damage) {
        life = life - damage;
        if(life <= 0) 
           getWorld().removeObject(this);         
    }
}
