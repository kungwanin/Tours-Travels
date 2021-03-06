
package project;

import Classdoc.DBConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Pay extends javax.swing.JPanel {

    /**
     * Creates new form Pay
     */
    public Pay(String h,String user) {
        initComponents();
         ccb.addItem(" ");
         txtuser.setText(""+user);
         txtinvoiceno.setText(""+h);
         jPanel2.setVisible(false);
         jLabel21.setVisible(false);
        try
        {
//        Class.forName("java.sql.Driver");
//        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/accountsoft", "root", "1234");
//        st=con.createStatement();
        String b,c,d,e;
        b="Select * from customer_details";
        rs=DBConnection.executeQuery(sql);
        while(rs.next())
         {
        c=rs.getString("cname");
        ccb.addItem(c);
       }

        }
        catch(Exception ex)
        {

        JOptionPane.showMessageDialog(this, ex.getMessage()+" msg of upper");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtcid = new javax.swing.JTextField();
        txtcustomerac = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbtype = new javax.swing.JComboBox<>();
        txtmobile = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtdiscount = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtpay = new javax.swing.JTextField();
        txtbalance = new javax.swing.JTextField();
        txtreference = new javax.swing.JTextField();
        txtamount = new javax.swing.JTextField();
        txttax = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtinvoicedate = new javax.swing.JTextField();
        txtuser = new javax.swing.JTextField();
        txtac = new javax.swing.JTextField();
        ccb = new javax.swing.JComboBox<>();
        txtinvoiceno = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        txtpaymentdate = new com.github.lgooddatepicker.components.DatePicker();
        jSeparator1 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtnewbal = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtpaid = new javax.swing.JTextField();
        txtcb = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Customerid");
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, -1, -1));

        jLabel1.setText("Customer A/C");
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, -1, -1));

        txtcid.setEditable(false);
        txtcid.setBackground(new java.awt.Color(204, 204, 204));
        txtcid.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(txtcid, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 90, -1));
        jPanel1.add(txtcustomerac, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 110, -1));

        jLabel4.setText("Customername");
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        jLabel3.setText("Account no");
        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, -1, -1));

        jLabel6.setText("Customermobile");
        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, -1, -1));

        jLabel5.setText("User");
        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, -1, -1));

        cbtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Cheque", "Debit/credit card", "Other", " " }));
        jPanel1.add(cbtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 190, 100, -1));

        txtmobile.setEditable(false);
        jPanel1.add(txtmobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 40, 100, -1));

        jLabel7.setText("Invoice date");
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jLabel8.setText("Invoiceno");
        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jLabel9.setText("PaymentDate");
        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, -1, -1));

        txtdiscount.setAutoscrolls(false);
        txtdiscount.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtdiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 100, -1));

        jLabel10.setText("PaymentType");
        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, -1, -1));

        jLabel11.setText("GST/Tax");
        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        jLabel12.setText("Referenceno");
        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));

        jLabel13.setText("TotalAmount");
        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, -1, -1));

        jLabel14.setText("Discount");
        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        txtpay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtpayFocusLost(evt);
            }
        });
        jPanel1.add(txtpay, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 110, -1));

        txtbalance.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtbalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 100, -1));
        jPanel1.add(txtreference, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 110, -1));

        txtamount.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 110, -1));

        txttax.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txttax, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 100, -1));

        jButton1.setText("PAY");
        jButton1.setBackground(new java.awt.Color(53, 33, 89));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 280, -1, -1));

        txtinvoicedate.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtinvoicedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 90, -1));

        txtuser.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 70, 100, -1));

        txtac.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtac, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 90, -1));

        ccb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ccbItemStateChanged(evt);
            }
        });
        jPanel1.add(ccb, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 110, -1));

        txtinvoiceno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtinvoicenoFocusLost(evt);
            }
        });
        jPanel1.add(txtinvoiceno, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 90, -1));

        jButton2.setText("Get");
        jButton2.setBackground(new java.awt.Color(53, 33, 89));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 60, 20));
        jPanel1.add(txtpaymentdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 130, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1100, 10));

        jButton3.setText("CLEAR");
        jButton3.setBackground(new java.awt.Color(53, 33, 89));
        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 280, -1, -1));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, 220, 30));

        jPanel2.setBackground(new java.awt.Color(54, 33, 89));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtnewbal.setEditable(false);
        txtnewbal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtnewbal.setForeground(new java.awt.Color(204, 0, 0));
        jPanel2.add(txtnewbal, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, 100, -1));

        jLabel18.setText("New Balance");
        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, -1));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Pay");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Current Balance");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        txtpaid.setEditable(false);
        txtpaid.setBackground(new java.awt.Color(204, 204, 204));
        txtpaid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtpaid.setForeground(new java.awt.Color(204, 0, 0));
        jPanel2.add(txtpaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 100, -1));

        txtcb.setEditable(false);
        txtcb.setBackground(new java.awt.Color(204, 204, 204));
        txtcb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtcb.setForeground(new java.awt.Color(204, 0, 0));
        jPanel2.add(txtcb, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 100, -1));

        jButton4.setBackground(new java.awt.Color(153, 0, 0));
        jButton4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton4.setText("CANCEL");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 50, -1, -1));

        jButton5.setText("CONFIRM");
        jButton5.setBackground(new java.awt.Color(0, 255, 0));
        jButton5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 990, 120));

        jLabel15.setText("Pay");
        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, -1, -1));

        jLabel16.setText("Current Balance");
        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 0, 0));
        jLabel21.setText("PAYMENT DONE");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 460, -1, -1));

        jButton6.setBackground(new java.awt.Color(54, 39, 89));
        jButton6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Close Tab");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 500, 130, 30));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
Connection con =null;
 ResultSet  rs= null ;
 Statement st=null;
 String sql,invoice,custname,user,invoicedate,type,custmobile,custid,ref,amtpay,actualamt,bal,tax,dis,ac,cac,paydate;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        double a,b,c;
a=Double.parseDouble(txtpay.getText());
b=Double.parseDouble(txtbalance.getText());
c=b-a;
jPanel2.setVisible(true);
txtnewbal.setText(""+c);
txtcb.setText(""+b);
txtpaid.setText(""+a);

        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtpayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpayFocusLost

    }//GEN-LAST:event_txtpayFocusLost

    private void ccbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ccbItemStateChanged
String b,e,f,d;
         int c;
          e=(String) ccb.getSelectedItem(); 
        try
        {
            
//        Class.forName("java.sql.Driver");
//        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/accountsoft", "root", "1234");
//        st=con.createStatement();
       b="Select cid,mobile_no from customer_details where cname ='"+e+"'";
        rs=DBConnection.executeQuery(sql);
            System.out.println(""+b);
         while(rs.next())
         {
         c=rs.getInt("cid");
         d=rs.getString("mobile_no");
         txtcid.setText(""+c);
         txtmobile.setText(""+d);
         }
         
}
        catch(Exception ex)
        {

        JOptionPane.showMessageDialog(this, ex.getMessage());
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_ccbItemStateChanged

    private void txtinvoicenoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtinvoicenoFocusLost

    }//GEN-LAST:event_txtinvoicenoFocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       int m=Integer.parseInt(txtinvoiceno.getText());
addInvoiceDate(m);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
txtinvoiceno.setText("");
        txtuser.setText("");
          txtcid.setText("");
   txtpaymentdate.setText("");
       txtinvoicedate.setText("");
        txtmobile.setText("");
        txtreference.setText("");
        txtpay.setText("");
        txtnewbal.setText("");
        txtamount.setText("");
        txtac.setText("");
        txtcustomerac.setText("");        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        invoice=txtinvoiceno.getText();
        user=txtuser.getText().trim();
        custid=txtcid.getText().trim();
        paydate=txtpaymentdate.getDateStringOrSuppliedString("yyyy-mm-dd");;
         invoicedate=txtinvoicedate.getText().trim();
        type=cbtype.getSelectedItem().toString();
      custname=ccb.getSelectedItem().toString();
        custmobile=txtmobile.getText();
        ref=txtreference.getText();
        amtpay=txtpay.getText();
        bal=txtnewbal.getText();
        actualamt=txtamount.getText();
        ac=txtac.getText();
        cac=txtcustomerac.getText();
        if(user.length()==0 || custid.length()==0 || custmobile.length()==0
                || invoicedate.length()==0)
        {
            
            jLabel17.setText("All fields are compulsary");
            return;
        }
        try
        {
//            Class.forName("java.sql.Driver");
//      con=DriverManager.getConnection("jdbc:mysql://localhost:3306/accountsoft", "root", "1234");
//      st=con.createStatement();
    sql="Update payment set paymenttype='"+type+"',paymentdate='"+paydate+"',referenceno='"+ref+"',amountpaid='"+amtpay+"',actualamount='"+actualamt+"',balance='"+bal+"',customeraccno='"+cac+"',user='"+user+"' where invoiceno='"+invoice+"';";        
            System.out.println(""+sql);       

            int result=DBConnection.executeUpdate(sql);
            if (result > 0) {
                DBConnection.commit();
       //                  JOptionPane.showMessageDialog(null, "Record Saved Successfully");
            } else {
         //       JOptionPane.showMessageDialog(null, "Sorry Fail to Save Record");
            }
           // st.executeUpdate(sql);
        }
        catch(Exception ex)
        {
            System.out.println(""+ex.getMessage());
        }
    System.out.println(new Classdoc.SendSMS().sendSms("Ticket Booked amt="+txtpay.getText()+" invoice_no"+invoice, "TXTLCL", custmobile));
        System.out.println("hey payment done");
        
        //payment mein dalna hai yeh
        try{
            
        new Classdoc.SendEmail("shewaramani91@gmail.com","confirmation","Your apyment of "+txtpay.getText()+" is done");
        
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        jLabel21.setVisible(true);
        jButton3.doClick();
        jPanel2.setVisible(false);
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton3.doClick();
        jPanel2.setVisible(false);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbtype;
    private javax.swing.JComboBox<String> ccb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtac;
    private javax.swing.JTextField txtamount;
    private javax.swing.JTextField txtbalance;
    private javax.swing.JTextField txtcb;
    private javax.swing.JTextField txtcid;
    private javax.swing.JTextField txtcustomerac;
    private javax.swing.JTextField txtdiscount;
    private javax.swing.JTextField txtinvoicedate;
    private javax.swing.JTextField txtinvoiceno;
    private javax.swing.JTextField txtmobile;
    private javax.swing.JTextField txtnewbal;
    private javax.swing.JTextField txtpaid;
    private javax.swing.JTextField txtpay;
    private com.github.lgooddatepicker.components.DatePicker txtpaymentdate;
    private javax.swing.JTextField txtreference;
    private javax.swing.JTextField txttax;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables


 public void addInvoiceDate(int no)
 {
   String a,b,c,d1,d2,d3,d4,g;
        try{
            sql=String.format("Select invoicedate,actualamount,accountno,customeraccno,discount,tax,balance from payment where invoiceno='%d' ;",no);
   System.out.println(sql);
 
            ResultSet rs=DBConnection.executeQuery(sql);
            while(rs.next())
            {
            a=rs.getDate("invoicedate").toString();
            b=rs.getString("accountno");
            c=rs.getString("customeraccno");
            double a1,a2,a3,a4;
            a1=rs.getDouble("tax");
            d1=Double.toString(a1);
           a4=rs.getDouble("balance");
           d4=Double.toString(a4);
           a2=rs.getDouble("discount");
            d2=Double.toString(a2);
            a3=rs.getDouble("actualamount");
            d3=Double.toString(a3);
            txtinvoicedate.setText(a);
            txtcustomerac.setText(c);
            txttax.setText(d1);
            txtdiscount.setText(d2);
            txtamount.setText(d3);
            txtbalance.setText(d4);
            txtac.setText(""+b);
            }
            }
        catch(Exception e)
        {
            System.out.println("========"+e.getMessage());
        }
 }


    

}