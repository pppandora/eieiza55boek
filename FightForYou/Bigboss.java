import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bigboss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bigboss extends Boss
{
    /**
     * Act - do whatever the Bigboss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    double heart2= 60;
   int time;
    int direc =-2;
    /**
     * Act - do whatever the Ptuow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bigboss(){
        time = 0;
    }
    public void act() 
    {
        // Add your action code here.
        move(direc);
        shoot();
        walk();
        
    }    
    public void shoot(){
        
         time++;
          if (time == 90){
              //for(int i =0;i<10;i++){
               getWorld().addObject(new shoot(), getX()-50, getY());
            //}
         }
                    
             
        }
   public void hitit(int damage2) {
        heart2 = heart2 - damage2;
         if(heart2 == 0){
                getWorld().removeObject(this);
                Greenfoot.setWorld(new EndGame());
                
            }
    }
       public void walk(){
      if(isAtEdge()){
        direc = -direc;
        }
    }  
}
