/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import Classdoc.Printer;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.print.PageFormat;
import java.awt.print.PrinterJob;
import java.awt.print.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Preetam-Ahuja
 */
public class PrinterFrame extends javax.swing.JFrame {

    /**
     * Creates new form PrinterFrame
     */
    public PrinterFrame(DefaultTableModel dtb, String remark,String idx) {
        this();
        this.head="Bill";
        this.FAdd=FAdd;
        this.TAdd=TAdd;
        this.remark=remark;
        this.dtb=dtb;

  if(head.equals("Contract"))
        {
        header1.setText(head);
        ta1.setText(remark);
        idtxt.setText(idx);
        DefaultTableModel atb = (DefaultTableModel) tab1.getModel();
        atb.setRowCount(0);
        atb.addColumn("S.No");
        atb.addColumn(dtb.getColumnName(0));
        atb.addColumn(dtb.getColumnName(1));
        atb.addColumn(dtb.getColumnName(2));
        atb.addColumn(dtb.getColumnName(3));
        atb.addColumn(dtb.getColumnName(4));
        atb.addColumn(dtb.getColumnName(7));
        atb.addRow(new String[]{"S.No",dtb.getColumnName(0), dtb.getColumnName(1), dtb.getColumnName(2), dtb.getColumnName(3), dtb.getColumnName(4), dtb.getColumnName(7)});
      
        int y = 1;
  
    
        for (int x = 0; x <= dtb.getRowCount(); x++) {
          
            int tb=atb.getRowCount()*25+tab1.getY();
            pages=tb/1750;
            System.out.println(pages);
            if (x == dtb.getRowCount()) {
                double bag = 0;
                double quantity = 0;
                double total = 0;
                for (int z = 0; z < dtb.getRowCount(); z++) {
                    bag = bag + Double.parseDouble(dtb.getValueAt(z, 3).toString());
                    quantity = quantity + Double.parseDouble(dtb.getValueAt(z, 2).toString());
                    total = total + Double.parseDouble(dtb.getValueAt(z, 7).toString());

                }
                atb.addRow(new String[]{"Total =",null, null, "" + quantity, "" + bag, null, "" + total});

            } else {
                atb.addRow(new String[]{"" + y, dtb.getValueAt(x, 0).toString(), dtb.getValueAt(x, 1).toString(), dtb.getValueAt(x, 2).toString(), dtb.getValueAt(x, 3).toString(), dtb.getValueAt(x, 4).toString(), dtb.getValueAt(x, 7).toString()});
                ++y;
            }
        }
        Dimension dimen=new Dimension(p1.getPreferredSize().width,p1.getPreferredSize().height+1750*pages);
                p1.setPreferredSize(dimen);
        new Classdoc.TableRowResize().funcResize(tab1);
        }
        else
        {
            sp2.setVisible(true);
            sp1.setVisible(false);
            firmName1.setText(cpn);
        header2.setText(head);
        idlbl.setText(FAdd);
        tar1.setText(TAdd);
        int xz=0;
        DefaultTableModel atb = (DefaultTableModel) tab2.getModel();
        atb.setRowCount(0);
        atb.addColumn("S.No");
        atb.addColumn(dtb.getColumnName(0));
        atb.addColumn(dtb.getColumnName(1));
        atb.addColumn(dtb.getColumnName(2));
        if(remark.equals("factory")){
        atb.addColumn(dtb.getColumnName(3));xz=3;}
        else{
        atb.addColumn(dtb.getColumnName(4));xz=4;}
        atb.addColumn("");
        atb.addColumn(dtb.getColumnName(5));
        atb.addRow(new String[]{"S.No",dtb.getColumnName(0), dtb.getColumnName(1), dtb.getColumnName(2),"Comm (%)", "Comm Amt","Total"});
      
        int y = 1;

        for (int x = 0; x <= dtb.getRowCount(); x++) {
            int tb=atb.getRowCount()*25+tab2.getY();
            pages=tb/1750;
            if (x == dtb.getRowCount()) {
               
                double comm = 0;
                double total = 0;
              
                for (int z = 0; z < dtb.getRowCount(); z++) {
                    comm = comm + Double.parseDouble(dtb.getValueAt(z, xz).toString());
                    
                    total = total + Double.parseDouble(dtb.getValueAt(z, 5).toString());

                }
                atb.addRow(new String[]{"Total =",null, null,null,null,""+comm,""+total});

            } else {
                atb.addRow(new String[]{"" + y, dtb.getValueAt(x, 0).toString(), dtb.getValueAt(x, 1).toString(), dtb.getValueAt(x, 2).toString(),""+(Double.parseDouble(dtb.getValueAt(x, xz).toString())/Double.parseDouble(dtb.getValueAt(x, 5).toString()))*100, dtb.getValueAt(x, xz).toString(), dtb.getValueAt(x, 5).toString()});
                ++y;
            }
        }
        Dimension dimen=new Dimension(p2.getPreferredSize().width,p2.getPreferredSize().height+1750*pages);
                p2.setPreferredSize(dimen);
        
        new Classdoc.TableRowResize().funcResize(tab2);
        }
    }
    PrinterJob pjob;
    PageFormat preformat;
    PageFormat postformat;
String cpn,head,FAdd,TAdd,remark; 
DefaultTableModel dtb;
    public PrinterFrame() {
        initComponents();
        this.getContentPane().setBackground(Color.black);
        this.setLocation((fw - 1280) / 2, (fh - 664) / 2);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/Images/icon64x64.png"));
        sp2.setVisible(false);
      
        
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        l2 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        sp1 = new javax.swing.JScrollPane();
        p1 = new javax.swing.JPanel();
        idtxt = new javax.swing.JLabel();
        ta3 = new javax.swing.JEditorPane();
        firmName = new javax.swing.JLabel();
        header1 = new javax.swing.JLabel();
        p3 = new javax.swing.JPanel();
        ta1 = new javax.swing.JTextArea();
        ta2 = new javax.swing.JEditorPane();
        tab1 = new javax.swing.JTable();
        sp2 = new javax.swing.JScrollPane();
        p2 = new javax.swing.JPanel();
        tab2 = new javax.swing.JTable();
        ta4 = new javax.swing.JEditorPane();
        tar1 = new javax.swing.JTextArea();
        firmName1 = new javax.swing.JLabel();
        header2 = new javax.swing.JLabel();
        idlbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Print Preview");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l2.setBackground(new java.awt.Color(0, 0, 0));
        l2.setFont(new java.awt.Font("AR JULIAN", 0, 18)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 255, 255));
        l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l2.setText("Cancel");
        l2.setOpaque(true);
        l2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l2MouseExited(evt);
            }
        });
        jPanel1.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 110, 40));

        l1.setBackground(new java.awt.Color(0, 0, 0));
        l1.setFont(new java.awt.Font("AR JULIAN", 0, 18)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 255));
        l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l1.setText("Print");
        l1.setOpaque(true);
        l1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l1MouseExited(evt);
            }
        });
        jPanel1.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 110, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 1260, 80));

        sp1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        p1.setBackground(new java.awt.Color(255, 255, 255));
        p1.setPreferredSize(new java.awt.Dimension(1240, 1754));
        p1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idtxt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        p1.add(idtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 230, 60));

        ta3.setEditable(false);
        ta3.setBorder(null);
        ta3.setContentType("text/html"); // NOI18N
        ta3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ta3.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n \n      <center>\r<font size=\"5\"><b>\n1313 , Chawla Sadan ,Kumhar Gali<br>\nHanumanganj , Bhopal (M.P)<br>\nContact : 0755-4030201 , 0755-2540512<br>\nE-Mail : Ajeetbrokers5@gmail.com<br></b>\n</center>\n</font>\n\n  </body>\r\n</html>\r\n"); // NOI18N
        ta3.setFocusable(false);
        p1.add(ta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 1220, 140));

        firmName.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        firmName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        firmName.setText("Ajeet Broker's");
        firmName.setToolTipText("");
        p1.add(firmName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1220, 60));

        header1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        header1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header1.setText("Contract");
        header1.setToolTipText("");
        p1.add(header1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1220, 70));

        p3.setBackground(new java.awt.Color(255, 255, 255));
        p3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ta1.setEditable(false);
        ta1.setColumns(20);
        ta1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ta1.setRows(5);
        ta1.setBorder(null);
        ta1.setFocusable(false);
        ta1.setSelectionColor(new java.awt.Color(0, 0, 0));
        p3.add(ta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1220, 80));

        ta2.setEditable(false);
        ta2.setBorder(null);
        ta2.setContentType("text/html"); // NOI18N
        ta2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ta2.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n  \n      \r<h2><u>Terms & Conditions</u></h2><br>\n<font size=\"5\">\n1.Bargain Must be dispatched in time and according to the Conditions .<br>\n2.In case of any dispute on decision in binding to all involved Parties , we appear as the witness of the bargain only.<br>\n3.We are not responsible for any loss,profit,shortage,damage arising from non delivery or not taking or any fraud at any side.<br>\n4.If bargain is cancelled due to any time limit loading condition or any Government restriction , our commission will be charged as usual .<br>\n5.After Dispatching the intimations and duplicate bills will be sent to us immediately .\n</font>\n\n  </body>\r\n</html>\r\n"); // NOI18N
        ta2.setFocusable(false);
        p3.add(ta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1220, 290));

        p1.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1400, 1240, 390));

        tab1.setAutoCreateRowSorter(true);
        tab1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        tab1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tab1.setFocusable(false);
        tab1.setGridColor(new java.awt.Color(0, 0, 0));
        tab1.setRowHeight(25);
        tab1.setRowSelectionAllowed(false);
        tab1.setShowHorizontalLines(false);
        tab1.setShowVerticalLines(false);
        p1.add(tab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 475, 1200, 1750));

        sp1.setViewportView(p1);

        getContentPane().add(sp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 580));

        sp2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        p2.setBackground(new java.awt.Color(255, 255, 255));
        p2.setPreferredSize(new java.awt.Dimension(1240, 1750));
        p2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tab2.setAutoCreateRowSorter(true);
        tab2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        tab2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tab2.setFocusable(false);
        tab2.setGridColor(new java.awt.Color(255, 255, 255));
        tab2.setRowHeight(25);
        tab2.setRowSelectionAllowed(false);
        p2.add(tab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 575, 1200, 175000));

        ta4.setEditable(false);
        ta4.setBorder(null);
        ta4.setContentType("text/html"); // NOI18N
        ta4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ta4.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n \n      <center>\r<font size=\"6\"><b>\n1313 , Chawla Sadan ,Kumhar Gali<br>\nHanumanganj , Bhopal (M.P)<br>\nContact : 0755-4030201 , 0755-2540512<br>\nE-Mail : Ajeetbrokers5@gmail.com<br></b>\n</center>\n</font>\n\n  </body>\r\n</html>\r\n"); // NOI18N
        ta4.setFocusable(false);
        p2.add(ta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 1220, 140));

        tar1.setEditable(false);
        tar1.setColumns(20);
        tar1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tar1.setRows(5);
        tar1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Supplier Details", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        tar1.setFocusable(false);
        tar1.setSelectionColor(new java.awt.Color(0, 0, 0));
        p2.add(tar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 1220, 270));

        firmName1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        firmName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        firmName1.setText("Ajeet Broker's");
        firmName1.setToolTipText("");
        p2.add(firmName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1220, 60));

        header2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        header2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header2.setText("Contract");
        header2.setToolTipText("");
        p2.add(header2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1220, 70));

        idlbl.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        idlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2.add(idlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 290, 140));

        sp2.setViewportView(p2);

        getContentPane().add(sp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents
int pages=0;
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    int fh = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().height;
    int fw = dim.width;
    private void l1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseEntered
        // TODO add your handling code here:
        l1.setBackground(Color.WHITE);
        l1.setForeground(Color.BLACK);
    }//GEN-LAST:event_l1MouseEntered

    private void l1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseExited
        // TODO add your handling code here:
        l1.setForeground(Color.WHITE);
        l1.setBackground(Color.BLACK);
    }//GEN-LAST:event_l1MouseExited

    private void l2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseEntered
        // TODO add your handling code here:
        l2.setBackground(Color.WHITE);
        l2.setForeground(Color.BLACK);
    }//GEN-LAST:event_l2MouseEntered

    private void l2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseExited
        // TODO add your handling code here:
        l2.setForeground(Color.WHITE);
        l2.setBackground(Color.BLACK);
    }//GEN-LAST:event_l2MouseExited

    private void l1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseClicked

        // TODO add your handling code here:
        if(head.equals("Contract"))
        {
        pjob = PrinterJob.getPrinterJob();
        preformat = pjob.defaultPage();
        preformat.setOrientation(PageFormat.PORTRAIT);

        postformat = pjob.pageDialog(preformat);

        try {
            if (preformat != postformat) {
                //Set print component
                pjob.setPrintable(new Printer(p1, pages), postformat);
                if (pjob.printDialog()) {
                    pjob.print();
                    this.dispose();
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        }
        else
        {System.out.println("else");
            pjob = PrinterJob.getPrinterJob();
        preformat = pjob.defaultPage();
        preformat.setOrientation(PageFormat.PORTRAIT);

        postformat = pjob.pageDialog(preformat);

        try {
            if (preformat != postformat) {
                //Set print component
                pjob.setPrintable(new Printer(p2, pages), postformat);
                if (pjob.printDialog()) {
                    pjob.print();
                    this.dispose();
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        }
    }//GEN-LAST:event_l1MouseClicked

    private void l2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseClicked
        // TODO add your handling code here:
//        if(JOptionPane.showConfirmDialog(rootPane,"Are you Sure !")==0)
        this.dispose();
    }//GEN-LAST:event_l2MouseClicked

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
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrinterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrinterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrinterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrinterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrinterFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel firmName;
    private javax.swing.JLabel firmName1;
    private javax.swing.JLabel header1;
    private javax.swing.JLabel header2;
    private javax.swing.JLabel idlbl;
    private javax.swing.JLabel idtxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JScrollPane sp1;
    private javax.swing.JScrollPane sp2;
    private javax.swing.JTextArea ta1;
    private javax.swing.JEditorPane ta2;
    private javax.swing.JEditorPane ta3;
    private javax.swing.JEditorPane ta4;
    private javax.swing.JTable tab1;
    private javax.swing.JTable tab2;
    private javax.swing.JTextArea tar1;
    // End of variables declaration//GEN-END:variables
}
