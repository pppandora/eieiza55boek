import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ptuow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ptuow extends Boss
{
    int time;
    int direc =-1;
    /**
     * Act - do whatever the Ptuow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Ptuow(){
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
    
     public void die(){
         if(isTouching(bulletboss.class)){
              heart--;
              if(heart <= 0 ){
                getWorld().removeObject(this);
                }
            }
        
       }
       public void walk(){
      if(isAtEdge()){
        setImage("boss02.png");
        direc = -direc;
        }
    }
}

