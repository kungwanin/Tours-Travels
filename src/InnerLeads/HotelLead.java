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
public class HotelLead extends javax.swing.JPanel {

    /**
     * Creates new form HotelLead
     */
    public HotelLead(int n,String user,String name)
    {
        this();
        lead=n;
    }
    public HotelLead() {
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
        txtFor = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        txtStarCategory = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        txtHotel = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        txtRoomType = new javax.swing.JTextField();
        txtMealPlan = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNotes = new javax.swing.JTextArea();
        jLabel56 = new javax.swing.JLabel();
        txtTransport = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        txtPassonTo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnSignup10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel48.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(51, 51, 51));
        jLabel48.setText("Status");
        add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 590, -1, -1));
        add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 610, 420, -1));

        jLabel49.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(51, 51, 51));
        jLabel49.setText("For");
        add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));
        add(txtFor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 420, -1));

        jLabel50.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(51, 51, 51));
        jLabel50.setText("City");
        add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));
        add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 420, -1));

        jLabel51.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(51, 51, 51));
        jLabel51.setText("Star Category");
        add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, -1));
        add(txtStarCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 420, -1));

        jLabel52.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(51, 51, 51));
        jLabel52.setText("Hotel");
        add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));
        add(txtHotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 420, -1));

        jLabel53.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(51, 51, 51));
        jLabel53.setText("Room Type");
        add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, -1, -1));

        jLabel54.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(51, 51, 51));
        jLabel54.setText("Meal Plan");
        add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, -1, -1));
        add(txtRoomType, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 420, -1));
        add(txtMealPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 420, -1));

        jLabel55.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(51, 51, 51));
        jLabel55.setText("Transport");
        add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));

        txtNotes.setColumns(20);
        txtNotes.setRows(5);
        jScrollPane1.setViewportView(txtNotes);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, 420, 60));

        jLabel56.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(51, 51, 51));
        jLabel56.setText("Notes");
        add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, -1, -1));
        add(txtTransport, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 420, -1));

        jLabel57.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(51, 51, 51));
        jLabel57.setText("Passon to");
        add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 530, -1, -1));
        add(txtPassonTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 550, 420, -1));

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
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 80, 30));
    }// </editor-fold>//GEN-END:initComponents
    int lead;
    String h_for,city,star_category,hotel,room_type,meal_plan,transport,notes,passonto,status;
    private void btnSignup10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignup10MouseClicked
        // TODO add your handling code here:
        jPanel2MouseClicked(null);
    }//GEN-LAST:event_btnSignup10MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        
        h_for=txtFor.getText();
        city=txtCity.getText();
        star_category=txtStarCategory.getText();
        hotel=txtHotel.getText();
        room_type=txtRoomType.getText();
        meal_plan=txtMealPlan.getText();
        transport=txtTransport.getText();
        notes=txtNotes.getText();
        passonto=txtPassonTo.getText();
        status=txtStatus.getText();
        
        if(h_for.length()==0 || city.length()==0 || hotel.length()==0 || room_type.length()==0 || meal_plan.length()==0
                || transport.length()==0 )
        {
        jLabel1.setText("Enter necessary details");
        return;
        }
        
        jLabel1.setText("");
        
        String sql=String.format("insert into hotel_lead values(%s,'%s','%s','%s','%s','%s','%s','%s','%s','%s','%s')",lead,h_for,city,star_category,hotel,room_type,meal_plan,transport,notes,passonto,status);
        System.out.println(sql);
       try{
        int result=DBConnection.executeUpdate(sql);
        if(result<0)
        {
            System.out.println("something went wrong hotel lead");
            return;
        }
        jLabel1.setText("Saved");
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jPanel2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnSignup10;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtFor;
    private javax.swing.JTextField txtHotel;
    private javax.swing.JTextField txtMealPlan;
    private javax.swing.JTextArea txtNotes;
    private javax.swing.JTextField txtPassonTo;
    private javax.swing.JTextField txtRoomType;
    private javax.swing.JTextField txtStarCategory;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtTransport;
    // End of variables declaration//GEN-END:variables
}
