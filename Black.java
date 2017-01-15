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
    private int x = 0;
    private int y = 0;
    
    public void act() 
    {
        if (_clicked)
        {
            if ( Greenfoot.getMouseInfo().getButton() == 1 )
            {
                int _x = Greenfoot.getMouseInfo().getX();
                int _y = Greenfoot.getMouseInfo().getY();
                
                for (int i = 0; i < 8; i++)
                {
                    for (int j = 0; j < 8; j++) {
                        if ( (_x > 0 + (i *80)) && (_x < 80 + ((i+1) *80)) && (_y > 0 + (j*80)) && (_y < 80 + ((j+1)*80)))
                        {
                            setLocation(40 + (i *80), 40 + j*80);
                        }
                    }
                }
                
                setImage("black.png");
                _clicked = false;
                _clicked2 = true;
            }
        }
        
        if(Greenfoot.mouseClicked(this) && !_clicked && !_clicked2)
        {
            x = getX();
            y = getY();
            setImage("black_2.png");
            _clicked = true;
        }
        
        if(Greenfoot.mouseClicked(this))
        {
            _clicked2 = false;
        }
    }
    
    @Override 
    public void destroy()
    {
        getWorld().removeObject(this);
    }
}
