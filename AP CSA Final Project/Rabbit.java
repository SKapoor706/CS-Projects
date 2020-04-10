import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Rabbit extends Actor
{
    /**
     * Act - do whatever the Rabbit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.isKeyDown("Up")) {
            setRotation(-90);
            move(5);
        }
        if (Greenfoot.isKeyDown("Down")) {
            setRotation(90);
            move(5);
        }
        if (Greenfoot.isKeyDown("Right")) {
            setRotation(0);
            move(5);
        }
        if (Greenfoot.isKeyDown("Left")) {
            setRotation(180);
            move(5);
        }
        
    }    
}
