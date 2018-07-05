/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classdoc;

import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Neeraj
 */
public class PutIconImage {
    public JLabel getLabel(String title,String icon)
     {
         JLabel label=new JLabel(title);
         try{
             label.setIcon(new ImageIcon(ImageIO.read(getClass().getResource(icon))));
             
         }
         catch(IOException e)
         {
             System.out.println(e);
         }
         return label;
     }
}
