    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
     * Write a description of class pause here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
    public class pause extends botton
    {
        public static boolean paused;
        /**
         * Act - do whatever the pause wants to do. This method is called whenever
         * the 'Act' or 'Run' button gets pressed in the environment.
         */
        public void act() 
        {
            // Add your action code here
            checkClick();
        }    
         public void checkClick(){
                if (!Greenfoot.mouseClicked(this)) paused = false;
                if (Greenfoot.mouseClicked(this)) paused = true;
    
    
        }
        
    
    }
