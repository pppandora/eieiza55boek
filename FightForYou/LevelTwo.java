    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
     * Write a description of class LevelTwo here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
    public class LevelTwo extends World
    {
       
       int time;
        int timer;
        int count=1000;
        String b[]={"b0","b1"};
        String c[] = {"c0","c1","c2"};
        String s[] = {"s0"};
        /**
         * Constructor for objects of class LevelTwo.
         * 
         */
        public LevelTwo()
        {    
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
          if (time ==120){
               addObject(new tuow(),Greenfoot.getRandomNumber(600)+800,310);
              if(Ptuow.class != null){
               time = Greenfoot.getRandomNumber(5);
            }
          }
          count--;
          if(count == 0){
             addObject(new Ptuow(),785,310);
            
            }
        
        }
         public void random (){
        int x = Greenfoot.getRandomNumber(3);
        addObject(new clound (c[x]),62,51);
        addObject(new sun (s[0]),743,24);
        addObject(new bird (b[Greenfoot.getRandomNumber(2)]),62,51+(Greenfoot.getRandomNumber(10)));
       }  
     
           
        }  
    
