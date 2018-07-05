/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classdoc;

import javax.swing.table.TableCellRenderer;
import java.awt.Component;
import javax.swing.JTable;
/**
 *
 * @author Neeraj
 */
public class TableRowResize {
    public void funcResize(JTable tab)
    {
        for(int column=0;column<tab.getColumnCount();column++)
      {
          int width=15;
          for(int row=0;row<tab.getRowCount();++row)
          {
              TableCellRenderer renderer=tab.getCellRenderer(row, column);
              Component comp=tab.prepareRenderer(renderer, row, column);
              width=Math.max(comp.getPreferredSize().width+1,width);
          }
          if(width>300)
              width=300;
          tab.getColumnModel().getColumn(column).setPreferredWidth(width);
      
      }
    }
    
}


