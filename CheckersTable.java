import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.List;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CheckersTable extends World
{
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
   
    public CheckersTable()
    {    
        // Create a new world with 800x800 cells with a cell size of 1x1 pixels.
        super(640, 640, 1); 
        createBoard();
        List <Gold> goldCheckers= getObjects(Gold.class);
        List <Black> blackCheckers= getObjects(Black.class);
    }
    public void createBoard (){
        getBackground().setColor(Color.LIGHT_GRAY);
        for (int j = 1; j <= 8; j ++) {
            for (int i = j % 2; i < 8; i = i +2) {
                getBackground().fillRect(80*i,80*(j-1),80,80);
            }
        }
        for (int j = 1; j <= 3; j++) {
            for (int i = j % 2;i < 8;i = i + 2) {
                addObject(new Gold(),40 + (i *80),40 + 80*(j-1));
            }
        }
        for (int j = 6; j <= 8; j++) {
            for (int i = j % 2;i < 8;i = i + 2) {
                addObject(new Black(),40 + (i *80),40 + 80*(j-1));
            }
        }
        
        //addObject(new Gold(),120,40);
    }
    }

    