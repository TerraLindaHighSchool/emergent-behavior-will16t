import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * The world where ants live.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class AntWorld extends World
{
    public static final int SIZE = 640;

    /**
     * Create a new world. It will be initialised with a few ant hills
     * and food sources
     */
    public AntWorld()
    {
        super(SIZE, SIZE, 1);
        setPaintOrder(Ant.class, AntHill.class);
        prepare();
    }
    public void act()
    {
        if(getObjects(Food.class).size( ) == 0 && getObjects(Pheromone.class).size( ) ==0 )
        {
            Greenfoot.stop();
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        AntHill antHill = new AntHill();
        addObject(antHill,139,258);
        AntHill antHill2 = new AntHill();
        addObject(antHill2,371,451);
        Food food = new Food();
        addObject(food,381,273);
        Food food2 = new Food();
        addObject(food2,98,447);
        Food food3 = new Food();
        addObject(food3,259,89);
        Food food4 = new Food();
        addObject(food4,448,573);
        Food food5 = new Food();
        addObject(food5,71,121);
    }
}
