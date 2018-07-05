/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classdoc;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.awt.print.Pageable;

/**
 *
 * @author Neeraj
 */
    
public class Printer implements Printable{
     Component comp;
   int pages,i=0,j=0;

    public Printer(Component compx,int pages){

      this.comp=compx;
      this.pages=pages;
      
    }

    @Override
    public int print(Graphics g, PageFormat format, int page_index) 
            throws PrinterException {
        if (page_index >pages) {
            return Printable.NO_SUCH_PAGE;
        }
     
        // get the bounds of the component
      
        
        Dimension dim = comp.getSize();
        
        double cHeight = dim.getHeight();
        double cWidth = dim.getWidth();

        // get the bounds of the printable area
        double pHeight = format.getImageableHeight()*(pages+1);
        double pWidth = format.getImageableWidth();
        
        double xRatio = pWidth / cWidth;
        double yRatio =  pHeight/cHeight;
    
        double pXStart = format.getImageableX();
        double pYStart = format.getImageableY()-i*((1750*yRatio));
        System.out.println(pYStart);
        
       

        Graphics2D g2 = (Graphics2D) g;
        
        g2.translate(pXStart,pYStart);
        g2.scale(xRatio,yRatio);
        System.out.println(i+" "+pages);
        comp.paint(g2);
        ++j;
        if(i<pages && j%2==0)
             ++i;
        return Printable.PAGE_EXISTS;
    }
}
    



