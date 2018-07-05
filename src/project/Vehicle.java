/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import Classdoc.DBConnection;
import Classdoc.Dim;
import java.awt.Dimension;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import org.jdesktop.swingx.table.DatePickerCellEditor;

/**
 *
 * @author Neeraj
 */
public class Vehicle extends javax.swing.JPanel {

    /**
     * Creates new form Transport
     */
    public Vehicle(List<String> ar2,String u,Dimension dim) {
        initComponents();
        user=u;
        this.setSize(dim);
        txtUser.setText(user);
        txtInvoice.setText("" + new Dim().createInvoice());
        func(ar2);
             TableColumn dateColumn=tab.getColumnModel().getColumn(3);
        dateColumn.setCellEditor(new DatePickerCellEditor());

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
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtInvoice = new javax.swing.JTextField();
        txtMobile = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        cbName = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        txtType = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtNotes = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtNarration = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtDiscount = new javax.swing.JTextField();
        txtGross = new javax.swing.JTextField();
        txtTax = new javax.swing.JTextField();
        txtAmt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtTab = new javax.swing.JLabel();
        txtIndate = new com.github.lgooddatepicker.components.DatePicker();
        jLabel26 = new javax.swing.JLabel();
        txtCustomerac = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtComm = new javax.swing.JTextField();
        txtCid = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(252, 252, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setText("Invoice no.");
        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        jLabel15.setText("Customer id");
        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        jLabel16.setText("Customer name");
        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        jLabel17.setText("Cust. mobile no.");
        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        jLabel18.setText("Invoice Date");
        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, -1, -1));

        jLabel19.setText("User");
        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, -1, -1));

        txtInvoice.setEditable(false);
        jPanel1.add(txtInvoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 100, -1));

        txtMobile.setEnabled(false);
        txtMobile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtMobileMousePressed(evt);
            }
        });
        jPanel1.add(txtMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 100, 20));

        txtUser.setEditable(false);
        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserFocusGained(evt);
            }
        });
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, 110, -1));

        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Passenger", "Bus_Name", "Seat_No", "T_Date", "Time(24 hr)", "From", "To", "Class", "Amount", "Border_Tax", "Receipt_No"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tab);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 1010, 180));

        cbName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbNameItemStateChanged(evt);
            }
        });
        cbName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbNameMouseClicked(evt);
            }
        });
        jPanel1.add(cbName, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 100, -1));

        jLabel20.setText("Type");
        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        txtType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Tatkal" }));
        jPanel1.add(txtType, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 100, -1));

        jLabel21.setText("Notes");
        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 520, -1, -1));

        txtNotes.setColumns(20);
        txtNotes.setRows(5);
        jScrollPane3.setViewportView(txtNotes);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 540, 271, -1));

        jLabel22.setText("Narration");
        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, -1, -1));

        txtNarration.setColumns(20);
        txtNarration.setRows(5);
        jScrollPane4.setViewportView(txtNarration);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, 273, -1));

        jLabel23.setText("Gross Amt");
        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 490, -1, -1));

        jLabel24.setText("Tax");
        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, -1, -1));

        jLabel25.setText("Discount");
        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, -1));

        jLabel28.setText("Total Amt.");
        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 530, -1, -1));

        txtDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiscountActionPerformed(evt);
            }
        });
        jPanel1.add(txtDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 100, -1));

        txtGross.setEditable(false);
        txtGross.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtGross, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 490, 100, -1));
        jPanel1.add(txtTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, 100, -1));

        txtAmt.setEditable(false);
        txtAmt.setBackground(new java.awt.Color(204, 204, 204));
        txtAmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmtActionPerformed(evt);
            }
        });
        jPanel1.add(txtAmt, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 530, 100, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 670, 70, 20));

        jButton1.setText("Add row");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 440, 83, -1));

        jButton2.setText("Remove Row");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 440, -1, -1));

        txtTab.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(txtTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, 112, 21));

        txtIndate.setText(new SimpleDateFormat("MMMM dd, yyyy").format(new Date())
        );
        jPanel1.add(txtIndate, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 90, -1, -1));

        jLabel26.setText("Customer Acc.");
        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, -1));

        txtCustomerac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomeracActionPerformed(evt);
            }
        });
        jPanel1.add(txtCustomerac, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 100, -1));

        jLabel27.setText("Commission");
        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, -1, -1));
        jPanel1.add(txtComm, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, 100, -1));

        txtCid.setEnabled(false);
        txtCid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCidMousePressed(evt);
            }
        });
        jPanel1.add(txtCid, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 100, -1));

        jButton3.setText("ADD");
        jButton3.setBackground(new java.awt.Color(54, 33, 89));
        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 580, 100, 40));

        jButton5.setText("Refresh");
        jButton5.setBackground(new java.awt.Color(54, 33, 89));
        jButton5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 130, 100, 40));

        jSeparator8.setBackground(new java.awt.Color(54, 33, 89));
        jSeparator8.setPreferredSize(new java.awt.Dimension(0, 1));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1050, 10));

        jSeparator9.setBackground(new java.awt.Color(54, 33, 89));
        jSeparator9.setPreferredSize(new java.awt.Dimension(0, 1));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1020, 10));

        jSeparator10.setBackground(new java.awt.Color(54, 33, 89));
        jSeparator10.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator10.setPreferredSize(new java.awt.Dimension(0, 1));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, 10, 180));

        jSeparator11.setBackground(new java.awt.Color(54, 33, 89));
        jSeparator11.setPreferredSize(new java.awt.Dimension(0, 1));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 1050, 10));

        jSeparator12.setBackground(new java.awt.Color(54, 33, 89));
        jSeparator12.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator12.setPreferredSize(new java.awt.Dimension(0, 1));
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 10, 180));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Specific Details");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 90, 20));

        jSeparator13.setBackground(new java.awt.Color(54, 33, 89));
        jSeparator13.setPreferredSize(new java.awt.Dimension(0, 1));
        jPanel1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 1020, 10));

        jSeparator14.setBackground(new java.awt.Color(54, 33, 89));
        jSeparator14.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator14.setPreferredSize(new java.awt.Dimension(0, 1));
        jPanel1.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 220, 20, 260));

        jSeparator15.setBackground(new java.awt.Color(54, 33, 89));
        jSeparator15.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator15.setPreferredSize(new java.awt.Dimension(0, 1));
        jPanel1.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 10, 260));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("General Details");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 20));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1023, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    DefaultTableModel model;
    String sql, custname, user, invoicedate, type, custmobile, custid, notes, narration,customeraccount;
    int invoice;
    double discount,tax,gross,comm;
    List<String> ar;
    private void txtMobileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMobileMousePressed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_txtMobileMousePressed

    private void txtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserFocusGained

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void tabKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabKeyPressed

    }//GEN-LAST:event_tabKeyPressed

    private void cbNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbNameItemStateChanged
        // TODO add your handling code here:
        String ar[] = new Classdoc.Dim().addCustomerMobileID(cbName.getSelectedItem().toString());
        txtMobile.setText(ar[0]);
        txtCid.setText(ar[1]);
    }//GEN-LAST:event_cbNameItemStateChanged

    private void cbNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbNameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbNameMouseClicked

    private void txtDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiscountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiscountActionPerformed

    private void txtAmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        model.addRow(new Object[]{});
        tab.setModel(model);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int p = tab.getSelectedRow();
        if (p >= 0) {
            model = (DefaultTableModel) tab.getModel();
            model.removeRow(p);
            txtTab.setText("");
        } else {
            txtTab.setText("Select row to delete");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtCustomeracActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomeracActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomeracActionPerformed

    private void txtCidMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCidMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidMousePressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code her
     customeraccount=txtCustomerac.getText();
        custname = cbName.getSelectedItem().toString();
        custid = txtCid.getText().trim();
        custmobile = txtMobile.getText();
        invoicedate = txtIndate.getDateStringOrSuppliedString("yyyy-mm-dd");
        type = txtType.getSelectedItem().toString();
        notes = txtNotes.getText();
        narration = txtNarration.getText();

        if (custname.length() == 0  || custid.length() == 0 || custmobile.length() == 0
                || invoicedate.length() == 0 || type.length() == 0 || txtDiscount.getText().length() == 0
                || txtTax.getText().length() == 0 || txtComm.getText().length()==0) {

            jLabel1.setText("All fields are compulsary");
            return;
        }
        jLabel1.setText("");
        invoice = Integer.parseInt(txtInvoice.getText());
        discount = Double.parseDouble(txtDiscount.getText());
        tax = Double.parseDouble(txtTax.getText());
        comm=Double.parseDouble(txtComm.getText());
        if (custid.equals("Get Customer ID")) {
            jLabel1.setText("Choose Customer id");
            return;
        }
        jLabel1.setText("");
        int rowcount = tab.getRowCount();
        int colcount = tab.getColumnCount();
        String arr[][] = new String[rowcount][colcount];
        double amt = 0;
        double bordertax = 0;
        try {
            for (int i = 0; i < rowcount; i++) {
                for (int j = 0; j < colcount; j++) {
                    System.out.println(tab.getValueAt(i, j));
                    if(j==3)
                    {
                        SimpleDateFormat sdf=new SimpleDateFormat("MMM dd hh:mm:ss yyyy");
                        System.out.println("hey1");
                        System.out.println("date="+tab.getValueAt(i,j).toString().substring(4,19)+tab.getValueAt(i,j).toString().substring(23));
                        Date d=sdf.parse(tab.getValueAt(i,j).toString().substring(4,19)+tab.getValueAt(i,j).toString().substring(23));
                        sdf.applyPattern("yyyy-MM-dd");
                        System.out.println("hey2");
                        arr[i][j]=sdf.format(d);
                        System.out.println("date "+arr[i][j]);
                        continue;
                    }
                    arr[i][j] = tab.getValueAt(i, j).toString();
                    if (j == 8) {
                        amt = amt + Double.parseDouble(arr[i][j]);
                    }
                    if (j == 9) {
                        bordertax = bordertax + Double.parseDouble(arr[i][j]);
                    }
                }
            }
        } catch (Exception e) {
            txtTab.setText("All Fields in table are compulsary");
            return;
        }
        System.out.println("hey");
        txtTab.setText("");
        amt=amt+bordertax;
        txtGross.setText(""+amt);
        amt = amt - discount;
        amt = amt + tax+comm;
        txtAmt.setText("" + amt);

        for (int i = 0; i < rowcount; i++) {
            sql = String.format("insert into vehicle_details(invoice_no,cid,user,invoice_date,type,passenger,bus_name,seat_no,t_date,time,vfrom,vto,class,amount,border_tax,receipt_no,notes,narration,comm) values(%s,%s,'%s','%s','%s',%s,'%s','%s','%s','%s','%s','%s','%s','%s',%s,'%s','%s','%s',%s)",
                    invoice, custid, user, invoicedate, type, arr[i][0], arr[i][1], arr[i][2], arr[i][3], arr[i][4], arr[i][5], arr[i][6],
                    arr[i][7], arr[i][8], arr[i][9], arr[i][10], notes, narration,comm);
            System.out.println(sql);
            try {
                int result = DBConnection.executeUpdate(sql);
                if (result <= 0) {
                    txtTab.setText("Error in entering");
                    return;
                }
            } catch (SQLException e) {
                System.out.println("Railway data entry exception");
            }
        }


        sql=String.format("insert into payment(invoiceno,invoicedate,cid,customername,user,tax,discount,actualamount,balance,customeraccno,commission) values(%s,'%s',%s,'%s','%s',%s,%s,%s,%s,'%s',%s)"
                ,invoice,invoicedate,custid,custname,user,tax,discount,amt,amt,customeraccount,comm);
        System.out.println(sql);
        try{
        int result=DBConnection.executeUpdate(sql);
        if(result<1)
        {
            jLabel1.setText("something went wrong");
            return;
        }
         jLabel1.setText("saved");
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
        jButton3.setEnabled(false);
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable tab;
    private javax.swing.JTextField txtAmt;
    protected javax.swing.JTextField txtCid;
    private javax.swing.JTextField txtComm;
    private javax.swing.JTextField txtCustomerac;
    private javax.swing.JTextField txtDiscount;
    private javax.swing.JTextField txtGross;
    private com.github.lgooddatepicker.components.DatePicker txtIndate;
    private javax.swing.JTextField txtInvoice;
    protected javax.swing.JTextField txtMobile;
    private javax.swing.JTextArea txtNarration;
    private javax.swing.JTextArea txtNotes;
    private javax.swing.JLabel txtTab;
    private javax.swing.JTextField txtTax;
    private javax.swing.JComboBox<String> txtType;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
public void func(List<String> ar2) {
        cbName.setModel(new DefaultComboBoxModel(ar2.toArray()));       
        String ar[]=new Classdoc.Dim().addCustomerMobileID(ar2.get(0));
        txtMobile.setText(ar[0]);
        txtCid.setText(ar[1]);
    }
}
