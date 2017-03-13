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
   /*public MonLv1(){
    GreenfootImage img = new GreenfootImage(11,11);
    img.fill();
    setImage(img);
}*/
int life =100;
 
public void act()
{
   /* setLocation(getX(), getY()+1); //higher number = faster falling
    if (getY() > getWorld().getHeight()) removeObject(this);*/
    movement();
}
  public void hit(int damage) {
        life = life - damage;
        if(life <= 0) 
           getWorld().removeObject(this);         
    }
}
