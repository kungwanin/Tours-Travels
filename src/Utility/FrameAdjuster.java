/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.util.*;

/**
 *
 * @author Preetam Ahuja
 */
public class FrameAdjuster {
    
    static List <Component> comp=new ArrayList<>();
    private static void parseComponents(Component cmp)
    {
        Container cnt= (Container)cmp;
        List<Component> list=new ArrayList<>(Arrays.asList(cnt.getComponents()));
        for(Component c:list){
            comp.add(c);
            try
            {
                parseComponents((Container)c);
            }
            catch(Exception e)
            {
                
            }
        }
    }
    public static void fitFrame(Component panel,Dimension dim){
        System.out.println(panel.getSize()+" "+dim);
        double wRatio=dim.width/(double)panel.getWidth();
        parseComponents(panel);
        
        System.out.println(wRatio);
        for(Component c:comp)
        {
            c.setSize((int)(c.getWidth()*wRatio),(int)(c.getHeight()*wRatio));
            System.out.println(c.getName()+" "+c.getSize().width+" "+c.getSize().height+" "+c.getLocation().x+" "+c.getLocation().y);
            c.setLocation((int)(c.getX()*wRatio),(int)(c.getY()*wRatio));
        }
        panel.setSize(dim);
        comp=new ArrayList<>();
    }
}
