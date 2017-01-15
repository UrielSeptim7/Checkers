import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Black here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Black extends Chackers
{
    /**
     * Act - do whatever the Black wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   private boolean _clicked = false;
   private boolean _clicked2 = false;
    
    public void act() 
    {
        if (_clicked)
        {
            if ( Greenfoot.getMouseInfo().getButton() == 1 )
            {
                int _x = Greenfoot.getMouseInfo().getX();
                int _y = Greenfoot.getMouseInfo().getY();
                setLocation(_x, _y);
                setImage("black.png");
                _clicked = false;
                _clicked2 = true;
            }
        }
        
        if(Greenfoot.mouseClicked(this) && !_clicked && !_clicked2)
        {
            int x = getX();
            int y = getY();
            setImage("black_2.png");
            _clicked = true;
        }
        
        if(Greenfoot.mouseClicked(this))
        {
            _clicked2 = false;
        }
    }    
}
