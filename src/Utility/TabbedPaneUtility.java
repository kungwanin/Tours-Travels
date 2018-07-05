/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

import java.util.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import static project.NewDashBoard.cTbp;
/**
 *
 * @author Preetam Ahuja
 */
public class TabbedPaneUtility {

    static public JTabbedPane TabPane=null;
    static public List<JPanel> tabs=new ArrayList<>();
    
    public static void addTab(String text,JPanel Panel,String loc){
        TabPane.add(text,Panel);
        JPanel TabLook=new resources.TabLookAndFeel(text,Panel,TabPane,loc);
        tabs.add(Panel);
        TabPane.setTitleAt(tabs.size()-1, text);
        TabPane.setTabComponentAt(tabs.size()-1,TabLook);
        TabPane.setSelectedIndex(tabs.size()-1);
    }
    
    public static void removeTab(JPanel Panel){
        TabPane.remove(tabs.indexOf(Panel));
        tabs.remove(tabs.indexOf(Panel));
    }
    public static void select(JPanel Panel){
      //  TabPane.setSelectedComponent(tabs.indexOf(Panel));
                cTbp.setSelectedIndex(tabs.indexOf(Panel));

    }
    
}
