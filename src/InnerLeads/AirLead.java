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
public class AirLead extends javax.swing.JPanel {

    /**
     * Creates new form HotelLead
     */
    public AirLead(int n,String user,String name)
    {
        this();
        lead=n;
    }
    public AirLead() {
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
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        txtFrom = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        txtTo = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        txtTicket = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNotes = new javax.swing.JTextArea();
        jLabel56 = new javax.swing.JLabel();
        txtPreferred_Airline = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        txtPassonTo = new javax.swing.JTextField();
        cbAirline_Type = new javax.swing.JComboBox<>();
        cbBoarding = new javax.swing.JComboBox<>();
        cbJourney = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btnSignup10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel48.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(51, 51, 51));
        jLabel48.setText("Status");
        add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 600, -1, -1));
        add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 620, 420, -1));

        jLabel49.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(51, 51, 51));
        jLabel49.setText("Journey");
        add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        jLabel50.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(51, 51, 51));
        jLabel50.setText("From");
        add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));
        add(txtFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 420, -1));

        jLabel51.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(51, 51, 51));
        jLabel51.setText("To");
        add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, -1));
        add(txtTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 420, -1));

        jLabel52.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(51, 51, 51));
        jLabel52.setText("No. of Tickets");
        add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));
        add(txtTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 420, -1));

        jLabel53.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(51, 51, 51));
        jLabel53.setText("Airline Type");
        add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, -1, -1));

        jLabel54.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(51, 51, 51));
        jLabel54.setText("Boarding Pass");
        add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, -1, -1));

        jLabel55.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(51, 51, 51));
        jLabel55.setText("Preferred Airline");
        add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));

        txtNotes.setColumns(20);
        txtNotes.setRows(5);
        jScrollPane1.setViewportView(txtNotes);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, 420, 70));

        jLabel56.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(51, 51, 51));
        jLabel56.setText("Notes");
        add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, -1, -1));
        add(txtPreferred_Airline, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 420, -1));

        jLabel57.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(51, 51, 51));
        jLabel57.setText("Passon to");
        add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 540, -1, -1));
        add(txtPassonTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 560, 420, -1));

        cbAirline_Type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Domestic", "International", " " }));
        add(cbAirline_Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 420, -1));

        cbBoarding.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Economy", "First Class" }));
        add(cbBoarding, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 420, -1));

        cbJourney.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Return", " " }));
        add(cbJourney, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 420, -1));

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

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 100, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 80, -1, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/i3.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, 50, 40));
    }// </editor-fold>//GEN-END:initComponents
String journey,from,to,type,boarding,preferred_airline,notes,passonto,status,airline_type;
int lead,ticket;
    private void btnSignup10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignup10MouseClicked
        // TODO add your handling code here:
        jPanel2MouseClicked(null);
    }//GEN-LAST:event_btnSignup10MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        journey=cbJourney.getSelectedItem().toString();
        from=txtFrom.getText();
        to=txtTo.getText();
        airline_type=cbAirline_Type.getSelectedItem().toString();
        boarding=cbBoarding.getSelectedItem().toString();
        preferred_airline=txtPreferred_Airline.getText();
        notes=txtNotes.getText();
        passonto=txtPassonTo.getText();
        status=txtStatus.getText();
        
        
        if(from.length()==0 || to.length()==0 || txtTicket.getText().length()==0 || preferred_airline.length()==0 )
            jLabel1.setText("all field are compulsary");

            jLabel1.setText("");
            ticket=Integer.parseInt(txtTicket.getText());
        
       String sql=String.format("insert into air_lead values(%s,'%s','%s','%s',%s,'%s','%s','%s','%s','%s')", lead,journey,from,to,ticket,airline_type,boarding,preferred_airline,notes,status);
        System.out.println(sql);
       try{
       int result=DBConnection.executeUpdate(sql);
       if(result<0)
       {
           System.out.println("something went wrong in airlead");
           return;
       }
       jLabel1.setText("saved");
       }
       catch(SQLException e)
       {
           System.out.println(e+"airlead");
       }
        
    }//GEN-LAST:event_jPanel2MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnSignup10;
    private javax.swing.JComboBox<String> cbAirline_Type;
    private javax.swing.JComboBox<String> cbBoarding;
    private javax.swing.JComboBox<String> cbJourney;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtFrom;
    private javax.swing.JTextArea txtNotes;
    private javax.swing.JTextField txtPassonTo;
    private javax.swing.JTextField txtPreferred_Airline;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtTicket;
    private javax.swing.JTextField txtTo;
    // End of variables declaration//GEN-END:variables
}
