        import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
        
        /**
         * Write a description of class LevelTwo here.
         * 
         * @author (your name) 
         * @version (a version number or a date)
         */
        public class LevelTwo extends World
        {
           public GreenfootSound sound = new GreenfootSound ("bg.wav");
            static int timee = 3600;
            int tt;
           int time;
            int timer;
            int moncount;
            boolean a = true;
            boolean d = true;
            String b[]={"b0","b1"};
            String c[] = {"c0","c1","c2"};
            String s[] = {"s0"};
            int HP=100;
            /**
             * Constructor for objects of class LevelTwo.
             * 
             */
            public LevelTwo()
            {    
                // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
                 super(800, 400, 1); 
                 addObject(new Heart(),20,20);
                 addObject(new sc(),217,20);
                 addObject(new Time(),303,20);
                  addObject(new charector(),20,310);
                  addObject(new reset2(),783,380);
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
              time();
              ranlo();
            }
    
           
             public void time(){
                if(timee>0){
    
                showText(" "+timee/50 , 300,20);
    
                showText(" "+timee/2 , 300,20);
    
                timee--;
                if(timee == 0){
                    Greenfoot.setWorld(new Lose());
                }
             }
           }
            public void ranlo(){
           tt++;
            if(tt==360){
               addObject(new lotus(),Greenfoot.getRandomNumber(800), 0);
            }
        }
           
           public void addmonster(){
                
                 
               time++;
              if (time ==60 && d==true){
                   addObject(new MonLv1(),Greenfoot.getRandomNumber(600)+800,310);
                   
                   moncount++;
    
                  if(cc.class != null){
    
                  if(b.class != null){
    
                   time = Greenfoot.getRandomNumber(5);
                }
              }
              
    
                if(moncount == 60 &&a == true){
    
              if(moncount == 50 &&a == true){
    
                  d= false;
                 addObject(new cc(),785,310);
                 a= false;
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
        
