import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class balloon_boy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class balloon_boy extends Actor
{
    private double speed;
    private String name;
    public balloon_boy(String name, double speed)
    {
        System.out.println("A new balloon named " + name + " with a speed of " + speed + " was created");
        this.speed = speed;
        this.name = name;
    }
    public balloon_boy()
    {
        this.speed=5;
        this.name="no name haha";
        System.out.println("An irrelevant balloon was made");
    }
    public void act() 
    {
        move((int)(this.speed));
        if(this.isAtEdge()){
            turn((int)(Math.random()*91));
        }
    }
    public String toString(){
        return(this.name + "\nX: " + this.getX() + "\nY: " + this.getY());
    }
}
