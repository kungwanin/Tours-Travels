/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import ImageUtilities.Aura;
import Utility.TabbedPaneUtility;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import static project.NewDashBoard.cTbp;

/**
 *
 * @author Preetam Ahuja
 */
public class TabLookAndFeel extends javax.swing.JPanel {

    /**
     * Creates new form TabLookAndFeel
     */
    JPanel panel = null;
    JTabbedPane pane = null;

    public TabLookAndFeel(String str, JPanel panel, JTabbedPane pane, String loc) {
        initComponents();
        
        transparent.setBackground(new Color(0,0,0,0));
        Title.setText(str);
        try {
            Image image = ImageIO.read(getClass().getResource(loc));
            ImageIcon ii = new ImageIcon(image);
            Img.setIcon(ii);
        } catch (Exception e) {
        }
        
        this.panel = panel;
        this.pane = pane;
        close = (ImageIcon) Close.getIcon();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title1 = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        transparent = new javax.swing.JLabel();
        Img = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();

        Title1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title1.setToolTipText("");
        Title1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Title1MouseClicked(evt);
            }
        });

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(160, 30));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Close.setBackground(new java.awt.Color(255, 255, 255));
        Close.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tab_close_icon.png"))); // NOI18N
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CloseMouseExited(evt);
            }
        });
        add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 5, 20, 20));

        transparent.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        transparent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        transparent.setToolTipText("");
        transparent.setPreferredSize(new java.awt.Dimension(160, 30));
        transparent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transparentMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                transparentMousePressed(evt);
            }
        });
        add(transparent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, 160, 40));

        Img.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Img.setToolTipText("");
        Img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImgMouseClicked(evt);
            }
        });
        add(Img, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 30, 20));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setToolTipText("");
        Title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TitleMouseClicked(evt);
            }
        });
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 5, 90, 20));
    }// </editor-fold>//GEN-END:initComponents
ImageIcon close = null;
    private void CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseEntered
        // TODO add your handling code here:
        //Close.setIcon(Aura.bufferedImageToImageIcon(Aura.changeColor(Aura.imageIconToBufferedImage(close), Color.red)));
    }//GEN-LAST:event_CloseMouseEntered

    private void CloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseExited
        // TODO add your handling code here:
        Close.setIcon(close);
    }//GEN-LAST:event_CloseMouseExited

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        // TODO add your handling code here:
        TabbedPaneUtility.removeTab(panel);
    }//GEN-LAST:event_CloseMouseClicked

    private void TitleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_TitleMouseClicked

    private void Title1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Title1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Title1MouseClicked

    private void ImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImgMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ImgMouseClicked

    private void transparentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transparentMouseClicked
        // TODO add your handling code here:
        TabbedPaneUtility.select(panel);
    }//GEN-LAST:event_transparentMouseClicked

    private void transparentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transparentMousePressed
        // TODO add your handling code here:
                TabbedPaneUtility.select(panel);

    }//GEN-LAST:event_transparentMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JLabel Img;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Title1;
    private javax.swing.JLabel transparent;
    // End of variables declaration//GEN-END:variables
}
