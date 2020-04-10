import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Rabbit rabbit = new Rabbit();
        addObject(rabbit,34,323);
        Snake snake = new Snake();
        addObject(snake,233,144);
        Snake snake2 = new Snake();
        addObject(snake2,419,285);
        Strawberry strawberry = new Strawberry();
        addObject(strawberry,406,76);
        Strawberry strawberry2 = new Strawberry();
        addObject(strawberry2,454,351);
        Strawberry strawberry3 = new Strawberry();
        addObject(strawberry3,47,175);
        Strawberry strawberry4 = new Strawberry();
        addObject(strawberry4,136,54);
        Strawberry strawberry5 = new Strawberry();
        addObject(strawberry5,217,271);
        strawberry5.setLocation(306,224);
        snake.setLocation(188,297);
        snake2.setLocation(305,113);
        strawberry2.setLocation(503,229);
    }
}
