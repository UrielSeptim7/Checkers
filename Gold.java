import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class Gold here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gold extends Chackers
{
    /**
     * Act - do whatever the Gold wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean _clicked = false;
    
    public void act() 
    {   
        if (_clicked)
        {
            if ( Greenfoot.getMouseInfo().getButton() == 1 )
            {
                int _x = Greenfoot.getMouseInfo().getX();
                int _y = Greenfoot.getMouseInfo().getY();
                setLocation(_x, _y);
                setImage("white.png");
                _clicked = false;
            }
        }
        
        if(Greenfoot.mouseClicked(this) && !_clicked)
        {
            int x = getX();
            int y = getY();
            setImage("white_2.png");
            _clicked = true;
        }
   }    
}
