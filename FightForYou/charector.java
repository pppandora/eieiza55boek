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
    public static int HP = 100;
    public int ySpeed;
    public int groundLevel=310;
    public int heart = 5;
    public void act() 
    {
        // Add your action code here.
        action(); 
        checkFire();
        jump();
        CheckDie();
        
    }

    public void checkFire()
    {
        if(Greenfoot.isKeyDown("z")) {
            
            getWorld().addObject(new Bullet(), getX(), getY());
            
             setImage("chaAc.png"); 
        }
        if(Greenfoot.isKeyDown("x")) {
            getWorld().addObject(new bulletboss(), getX(), getY());
             setImage("chaAc.png"); 
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
            }
        }
    }
     public void CheckDie(){
      if(isTouching(Monster.class)||isTouching(Boss.class)||isTouching(shoot.class)){
         HP--;
         if(HP==0){
           Greenfoot.setWorld(new EndGame());  
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

