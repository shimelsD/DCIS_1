/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DCIS;

import java.awt.Toolkit;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;
/**
 *
 * @author shime
 */
public class OPDReport extends javax.swing.JFrame {

    Connection con=ConnectionDB.ConnectDb();
     JButton userHandler=new JButton("");
    JLabel lblHandler=new JLabel("");
    
    public OPDReport() {
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(ManageUser.class.getResource("/DCIS/photo_2018-12-09_15-04-39.jpg")));
       this.setTitle("Dental Clinic Information System");
        createMenuBar();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        viwerPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DCIS/Icons/icons8-go-back-30.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 140, -1));

        viwerPanel.setBackground(new java.awt.Color(0, 51, 51));
        viwerPanel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout viwerPanelLayout = new javax.swing.GroupLayout(viwerPanel);
        viwerPanel.setLayout(viwerPanelLayout);
        viwerPanelLayout.setHorizontalGroup(
            viwerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1320, Short.MAX_VALUE)
        );
        viwerPanelLayout.setVerticalGroup(
            viwerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        jPanel1.add(viwerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 1320, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Reports rept=new Reports();
        rept.setVisible(true);
        rept.user.setText(userHandler.getText());
        rept.lblProfPic.setIcon(lblHandler.getIcon());
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

  public void viewReport(){
          try{
           
       
        // JasperReport jr =JasperCompileManager.compileReport("opd report.jrxml");
         JasperPrint jp=JasperFillManager.fillReport("opd report.jasper", null,con);
          viwerPanel.removeAll();
          viwerPanel.setLayout(new BorderLayout());
          viwerPanel.repaint();
          viwerPanel.add(new JRViewer(jp));
         viwerPanel.revalidate();
     
       }
      catch(Exception e){
    
           JOptionPane.showMessageDialog(null,"Oops! Exception: "+e);
       }
    }
  public void createMenuBar(){
             
        
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		//menuBar.setForeground(new Color(128, 0, 0));
		//menuBar.setBackground(new Color(112, 128, 144));
		setJMenuBar(menuBar);
	
		JMenu filemenu=new JMenu("File");
		filemenu.setForeground(new Color(0, 0, 0));
		filemenu.setFont(new Font("Segoe UI", Font.BOLD, 16));
		JMenuItem about=new JMenuItem("About              Alt+I ");
		about.setMnemonic('i');
		menuBar.add(filemenu);
		
		
		JMenu formatmenu=new JMenu("Format");
		formatmenu.setForeground(new Color(0, 0, 0));
		formatmenu.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(formatmenu);
		
		JMenu viewmenu=new JMenu("View");
		viewmenu.setForeground(new Color(0, 0, 0));
		viewmenu.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(viewmenu);
      	about.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		JOptionPane.showMessageDialog(null, "DCIS software is a desktop based system developed by University of Gondar,"
        + "College of Medicine and Health Science, Health Informatics\n" +
"graduating students for degree program fulfilment.\n" +
"The system is aim to provide comprehensive software solution for the dental clinics.\n\n" +
"Developer\n \tShimels Derso(+251940219818/shime4d@gmail.com) ", "About",1,Appointments.imgic);
			
			}
		});
		about.setIcon(new ImageIcon(Admin_DB.class.getResource("/DCIS/about.jpg")));
		
		
		JMenuItem exit=new JMenuItem("Exit              Alt+X ");
		exit.setMnemonic('x');
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			System.exit(0);
			
			}
		});
		exit.setIcon(new ImageIcon(Admin_DB.class.getResource("/DCIS/exit.jpg")));
		filemenu.add(about);
		filemenu.add(exit);
		
		
         }
    
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
            java.util.logging.Logger.getLogger(OPDReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OPDReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OPDReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OPDReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OPDReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel viwerPanel;
    // End of variables declaration//GEN-END:variables
}
