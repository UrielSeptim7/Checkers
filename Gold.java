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
   private boolean _clicked2 = false;
   
    public void act() 
    {   
        if (_clicked)
        {
            if ( Greenfoot.getMouseInfo().getButton() == 1 )
            {
                int _x = Greenfoot.getMouseInfo().getX();
                int _y = Greenfoot.getMouseInfo().getY();
                
                for (int j = 1; j <= 8; j++)
                {
                    for (int i = 1 % 2;i < 8; i = i + 2) {
                        if ( (_x > 40 + (i *80)) && (_x > 40 + (i *80) - 80) && (_y > 40 + (j*80)) && (_y > 40 + (j*80) - 80) )
                        {
                            setLocation(40 + (i *80), 40 + 80*(j-1));
                        }
                        // 40 + (i *80),40 + 80*(j-1));
                    }
                }
                
                //setLocation(_x, _y);
                setImage("white.png");
                _clicked = false;
                _clicked2 = true;
            }
        }
        
        if(Greenfoot.mouseClicked(this) && !_clicked && !_clicked2)
        {
            int x = getX();
            int y = getY();
            setImage("white_2.png");
            _clicked = true;
        }
        
        if(Greenfoot.mouseClicked(this))
        {
            _clicked2 = false;
        }
   }    
}
