import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    balloon_boy balloon = new balloon_boy("Balloony", 8);
    balloon_boy balloon2 = new balloon_boy();
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 720, 1);
        addObject(balloon, 540, 360);
        addObject(balloon2, 540, 360);
        setBackground("C:\\Users\\david.pan\\Downloads\\communism.jpg");
    }
    public void act(){
        showText(balloon.toString(), 540,360);
        showText(balloon2.toString(), 540,540);
    }
}
