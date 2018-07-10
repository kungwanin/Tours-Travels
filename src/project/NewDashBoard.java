/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import Classdoc.Dim;
import Classdoc.TrayIconDemo;
import Utility.TabbedPaneUtility;
import java.awt.SystemTray;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

/**
 *
 * @author Neeraj
 */
public class NewDashBoard extends javax.swing.JFrame {

    /**
     * Creates new form NewDashBoard
     */
    public NewDashBoard(String u) {
        this();
        TabbedPaneUtility.TabPane = cTbp;
        user = u;
        this.setSize(framewidth, frameheight);
        jPanel1.setLocation(260, 0);

        this.getContentPane().setLayout(null);

        ar = new Classdoc.Dim().addCustomer();

        VerticalPanel vp = new VerticalPanel(cTbp, MainPanel, user, ar);
        vp.setSize(260, frameheight);
        vp.setLocation(0, 0);
        this.add(vp);

        cTbp.setSize(framewidth, frameheight);
        cTbp.setLocation(240, 0);
        //try
        try {
            if (SystemTray.isSupported()) {
                TrayIconDemo td = new TrayIconDemo();
                td.displayTray();
                System.out.println("hey");
            } else {
                System.err.println("System tray not supported!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        user = u;
        //  Vpanel.userName.setHorizontalAlignment(SwingConstants.CENTER);
        //    Vpanel.userName.setText(u);
    }

    public NewDashBoard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        cTbp = new javax.swing.JTabbedPane();

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1350, Short.MAX_VALUE)
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cTbp.setBackground(new java.awt.Color(255, 255, 255));
        cTbp.setOpaque(true);
        jPanel1.add(cTbp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1355, 728));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(679, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String name, mobile, email, address, sql;
    static String user;
    int frameheight = Dim.getHeight();
    int framewidth = Dim.getWidth();
    static List<String> ar;

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    //javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    //UIManager.setLookAndFeel(UIManager.addAuxiliaryLookAndFeel(laf));
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewDashBoard().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    public static javax.swing.JTabbedPane cTbp;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public static void lead(String st, int lead, String user, String name) {
        cTbp.addTab("lead", new Lead(st, lead, user, name));
        int i = cTbp.getTabCount();
        cTbp.setSelectedIndex(i - 1);
        cTbp.setTabComponentAt(i - 1, new Classdoc.PutIconImage().getLabel(" Lead ", "/images/paste.png"));

    }


}
