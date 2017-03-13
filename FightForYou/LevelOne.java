    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
     * Write a description of class LevelOne here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
    public class LevelOne extends World
    {
       public GreenfootSound sound = new GreenfootSound ("bg.wav");
        int time;
        int timer;
        static int timee = 3600;
        int moncount;
        boolean a = true;
        boolean d = true;
        String b[]={"b0","b1"};
        String c[] = {"c0","c1","c2"};
        String s[] = {"s0"};
        /**
         * Constructor for objects of class LevelOne.
         * 
         */
        public LevelOne()
         {    
            // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
             super(800, 400, 1); 
              addObject(new Heart(),20,20);
             addObject(new sc(),217,20);
              addObject(new charector(),20,310);
              addObject(new reset(),783,380);
              addObject(new exit(),778,23);
              
              time++;
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
       
       public void addmonster(){
            
           time++;
          if (time ==120 && d==true){
               addObject(new MonLv1(),Greenfoot.getRandomNumber(600)+800,310);
               
               moncount++;
              if(edok.class != null){
               time = Greenfoot.getRandomNumber(5);
            }
          }
          
          if(moncount == 50 &&a == true){
              d= false;
             addObject(new edok(),785,310);
             a= false;
            }
        
        }
        public void random (){
        int x = Greenfoot.getRandomNumber(3);
        int i = Greenfoot.getRandomNumber(2);
        addObject(new clound (c[x]),62,51);
        addObject(new sun (s[0]),743,24);
        addObject(new bird (b[i]),62,51);
       }
        public void time(){
            if(timee>0){
            showText(" "+timee/60 , 300,20);
            timee--;
            if(timee == 0){
                Greenfoot.setWorld(new Lose());
            }
         }
       }
     
        public void stopped(){
          sound.pause();
       }   
     
    }

     
    
