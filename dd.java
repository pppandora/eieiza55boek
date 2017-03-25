import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dd extends Big
{
    /**
     * Act - do whatever the dd wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    double heart2= 600;
   int time;
    int direc =-2;
    /**
     * Act - do whatever the Ptuow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public dd(){
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
             
               getWorld().addObject(new shoot(), getX()-50, getY());
            
         }
                    
             
        }
    public void hitya(int damage) {
        life = life - damage;
        if(life <= 0) {
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

