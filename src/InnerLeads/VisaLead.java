/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InnerLeads;

import Classdoc.DBConnection;
import java.sql.SQLException;

/**
 *
 * @author Neeraj
 */
public class VisaLead extends javax.swing.JPanel {

    /**
     * Creates new form HotelLead
     */
    public VisaLead(int n,String user,String name)
    {
        this();
        lead=n;
    }
    public VisaLead() {
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

        jLabel48 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNotes = new javax.swing.JTextArea();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        txtPassonTo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnSignup10 = new javax.swing.JLabel();
        cbCountry = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel48.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(51, 51, 51));
        jLabel48.setText("Status");
        add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, -1, -1));
        add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, 420, -1));

        jLabel50.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(51, 51, 51));
        jLabel50.setText("Country");
        add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        txtNotes.setColumns(20);
        txtNotes.setRows(5);
        jScrollPane1.setViewportView(txtNotes);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 420, 200));

        jLabel56.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(51, 51, 51));
        jLabel56.setText("Notes");
        add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, -1));

        jLabel57.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(51, 51, 51));
        jLabel57.setText("Passon to");
        add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));
        add(txtPassonTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 420, -1));

        jPanel2.setBackground(new java.awt.Color(54, 33, 89));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSignup10.setText("Save");
        btnSignup10.setBackground(new java.awt.Color(255, 255, 255));
        btnSignup10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnSignup10.setForeground(new java.awt.Color(255, 255, 255));
        btnSignup10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignup10MouseClicked(evt);
            }
        });
        jPanel2.add(btnSignup10, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 11, -1, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 100, 40));

        cbCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cbCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 180, 20));
    }// </editor-fold>//GEN-END:initComponents
int lead;
    String country,notes,passonto,status;
    private void btnSignup10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignup10MouseClicked
        // TODO add your handling code here:
        jPanel2MouseClicked(null);
    }//GEN-LAST:event_btnSignup10MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        country=cbCountry.getSelectedItem().toString();
        notes=txtNotes.getText();
        passonto=txtPassonTo.getText();
        status=txtStatus.getText();
        
        if(notes.length()==0)
        {
            jLabel1.setText("Enter some notes atleast");
        }
        
        
        String sql=String.format("insert into visa_lead values(%s,'%s','%s','%s','%s')", lead,country,notes,passonto,status);
        System.out.println(sql);
        try{
        int result=DBConnection.executeUpdate(sql);
        if(result<0)
        {
            System.out.println("something went wrong visalead");
            return;
        }
        jLabel1.setText("saved");
        }
        catch(SQLException e)
        {
            System.out.println(e+"visa lead");
        }
        
    }//GEN-LAST:event_jPanel2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnSignup10;
    private javax.swing.JComboBox<String> cbCountry;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtNotes;
    private javax.swing.JTextField txtPassonTo;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}
