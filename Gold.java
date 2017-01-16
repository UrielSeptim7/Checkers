import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Math;
import java.util.List;

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
                            //Далее проверка на шашку соперника
                            searchEnemy(x, y, 40 + (i *80), 40 + j*80);
                        }
                    }
                }
                
                setImage("white.png");
                _clicked = false;
                _clicked2 = true;
            }
        }
        
        if(Greenfoot.mouseClicked(this) && !_clicked && !_clicked2)
        {
            x = getX();
            y = getY();
            setImage("white_2.png");
            _clicked = true;
        }
        
        if(Greenfoot.mouseClicked(this))
        {
            _clicked2 = false;
        }
    }
    
    public void searchEnemy(int x, int y, int _x, int _y)
    {
        if ( (Math.abs(_x - x) == 80) && (Math.abs(_y - y) == 80) )
        {
            setImage("black.png");
        }
    }
   
    @Override 
    public void destroy()
    {
        getWorld().removeObject(this);
    }
}
