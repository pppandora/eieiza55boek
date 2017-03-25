import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class charector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class charector extends Actor
{
    /**
     * Act - do whatever the charector wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GreenfootSound gun = new GreenfootSound("gun.wav");
    public GreenfootSound guns = new GreenfootSound("gunboss.wav");
    public GreenfootSound jump = new GreenfootSound("jump.wav");
    public static int HP = 100;
    public int ySpeed;
    public int groundLevel=310;
    public int heart = 5;
    int delay;
    public charector(){
        delay = 30;
    }
    public void act() 
    {
        // Add your action code here.
        action(); 
        checkFire();
        jump();
        CheckDie();
        delay++;
        monshoot();
        
    }

    public void checkFire()
    {
     
        if(Greenfoot.isKeyDown("z")) {
            if(delay>=30){
               getWorld().addObject(new Bullet(), getX(), getY());
               setImage("chaAc.png"); 
               gun.play();
               gun.setVolume(70);
            }
        }
    
        if(Greenfoot.isKeyDown("x")) {
               if(delay>=30){
              getWorld().addObject(new bulletboss(), getX(), getY());
               getWorld().addObject(new bu(), getX(), getY());
              setImage("chaAc.png"); 
              guns.play();
               guns.setVolume(70);
            }
        }
    
    }    
    
    public void action(){
       if(Greenfoot.isKeyDown("right")){
           move(3);
           setImage("chaR.png");
        }
      
       if(Greenfoot.isKeyDown("left")){
           move(-3);
           setImage("chaL.png");
       } 
            
    }
     public void jump()
    {
        boolean onGround = (getY() == groundLevel);
        if (!onGround)
        {
           ySpeed++;
           setLocation(getX(), getY()+ySpeed);
           //turn();
            if (getY()==500)
            {
                setLocation(getX(), groundLevel);
           }
        }
        else
        {
            if (Greenfoot.isKeyDown("space"))
            {
                ySpeed = -20;
                setLocation(getX(), getY()+ySpeed);
               jump.play();
               jump.setVolume(70);
            }
        }
    }
     public void CheckDie(){
      if(isTouching(Monster.class)||isTouching(Boss.class)||isTouching(Big.class)){
         HP--;
         if(HP==0){
           Greenfoot.setWorld(new Lose());  
          }
      } 
    }
    public void monshoot(){
     if(isTouching(shoot.class)){
        HP--;
         if(HP==0){
           Greenfoot.setWorld(new Lose());  
          }
      }
    }
   
    public void hit2(int damage2) {
        heart = heart - damage2;
        if(heart == 0) {
           getWorld().removeObject(this);  
           
        }
    }
}

