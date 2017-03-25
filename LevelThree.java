import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelThree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelThree extends World
{
    public GreenfootSound sound = new GreenfootSound ("bg.wav");  
     static int timee = 3600;
    int time;
        int timer;
        int moncount;
        int count;
        int t ;
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
             addObject(new Heart(),20,20);
             addObject(new sc(),217,20);
             addObject(new Time(),303,20);
              addObject(new charector(),20,310);
              addObject(new reset3(),783,380);
              addObject(new exit(),778,23);
              time= 0;
              t =0;
        }
        public void act(){
           showText(" "+charector.HP+" ",54,20); 
           showText(" "+Score.score+" ", 240,20);
           addmonster();
           timer++;
           time();
            if (timer ==120){
           random();
          }
         
        }
          public void time(){
            if(timee>0){
            showText(" "+timee/60 , 300,20);

            showText(" "+timee , 300,20);
                
            timee--;
            if(timee == 0){
                Greenfoot.setWorld(new Lose());
            }
         }
       }
       
       public void addmonster(){
            
           time++;
           if (time ==30&& d==true){
               addObject(new tuow(),Greenfoot.getRandomNumber(600)+800,310);
               moncount++;
              if(dd.class != null){
               time = Greenfoot.getRandomNumber(5);
            }
          }

           if(getObjects(b.class).isEmpty()){
          if(moncount == 30 &&a == true){
            
              d= false;
             
             
             addObject(new b(),785,310);
              
               
           if(getObjects(a.class).isEmpty()){
          if(moncount == 10 &&a == true){
              d= false;
             
             addObject(new a(),785,310);
            

             count++;
            
            
          }
        }
         if(getObjects(tuow.class).isEmpty()){ 
          if(count== 2 && e == true){
             
             
             addObject(new dd(),785,310);
            
            a= false;
            e= false;
            }
        }
        }
    }
}
    public void random (){
        int x = Greenfoot.getRandomNumber(3);
        addObject(new clound (c[x]),62,51);
        addObject(new sun (s[0]),743,24);
        addObject(new bird (b[Greenfoot.getRandomNumber(2)]),62,51+(Greenfoot.getRandomNumber(10)));
       }  
     
    public void stopped(){
        sound.pause();
    }
}

