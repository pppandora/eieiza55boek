import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelThree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelThree extends World
{
       int time;
        int timer;
        int moncount;
        int count;
        boolean a = true;
        boolean d = true;
        boolean e = true;
        String b[]={"b0","b1"};
        String c[] = {"c0","c1","c2"};
        String s[] = {"s0"};
    /**
     * Constructor for objects of class LevelThree.
     * 
     */
    public LevelThree()
      {    
            // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
            // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
             super(800, 400, 1); 
              addObject(new charector(),20,310);
              addObject(new resume(),783,380);
              addObject(new exit(),778,23);
              time++;
        }
        public void act(){
           showText(" "+charector.HP+" ",54,20); 
           showText(" "+Score.score+" ", 240,20);
           addmonster();
           timer++;
            if (timer ==120){
           random();
          }
        }
       
       public void addmonster(){
            
           time++;
           if (time ==120&& d==true){
               addObject(new tuow(),Greenfoot.getRandomNumber(600)+800,310);
               moncount++;
              if(Bigboss.class != null){
               time = Greenfoot.getRandomNumber(5);
            }
          }
           if(getObjects(Ptuow.class).isEmpty()){
          if(moncount == 10&&a == true){
              d= false;
             
             addObject(new Ptuow(),785,310);
            
             count++;
            }
        }
          
          if(count== 2 ){
             addObject(new Bigboss(),785,310);
            a= false;
            }
           
        }
          public void random (){
        int x = Greenfoot.getRandomNumber(3);
        addObject(new clound (c[x]),62,51);
        addObject(new sun (s[0]),743,24);
        addObject(new bird (b[Greenfoot.getRandomNumber(2)]),62,51+(Greenfoot.getRandomNumber(10)));
       }  
       
}
