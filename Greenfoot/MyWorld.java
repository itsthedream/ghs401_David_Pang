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
        super(1000, 600, 1); 
        //addObject(new Someclassname(),100, 100);
        showText("Run", getWidth()/2,300);
        for (int i=0;i<10;i++)
        {
            addObject(new Someclassname(),40,i*100);
        }
    }
}
