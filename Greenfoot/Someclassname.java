import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Test of using greentfoot
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Someclassname extends Actor
{
    private int speed;
    public Someclassname()
    {
        this.speed = (int)((Math.random()*50));
        System.out.println("Something was made");
    }
    public Someclassname(int speed)
    {
        this.speed = speed;
        System.out.println("Something was made... with speed");
    }
    /**
     * Act - do whatever the Someclassname wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(this.speed);
        if(isAtEdge())
        {
            turn((int)((Math.random()*90)));
            this.speed = (int)((Math.random()*100));
        }
        System.out.println(getX());
    }    
}
