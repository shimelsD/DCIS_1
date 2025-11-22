package DCIS;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author shime
 */
public class ViewPrescription extends javax.swing.JFrame {
    Connection con=ConnectionDB.ConnectDb();
    PreparedStatement pst=null;
    ResultSet rs=null;
    public ViewPrescription() {
        initComponents();
        loadTable();
         customStyler();
        createMenuBar();
    }
     public void customStyler(){
    setIconImage(Toolkit.getDefaultToolkit().getImage(Admin_DB.class.getResource("/DCIS/photo_2018-12-09_15-04-39.jpg")));
    setTitle("Dental Clinic Information System");
		JPopupMenu popupMenu = new JPopupMenu();
              
		addPopup(user, popupMenu);
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			new Login().setVisible(true);
                        setVisible(false);
						
			}
		});
               // btnLogout.setIcon(new ImageIcon(Admin_DB.class.getResource("/DCIS/logt.jpg")));
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 16));
		popupMenu.add(btnLogout);
                JButton changePw = new JButton("Change Password");
                changePw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			new ChangePassword(new ViewPrescription(),true).setVisible(true);
						
			}
		});
                changePw.setFont(new Font("Tahoma", Font.BOLD, 16));
		popupMenu.add(changePw);
}

private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
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
 public void loadTable() {                                     
   try{
String sql="SELECT prescriptionid AS PID,DrugID,MRN,PrescriberName AS Prescribed_By,Diagnosis,DrugName,PrescriptionDate,DosageForm,Dose,Frequency,Duration,Quantity,Strength "
               + "FROM prescription ORDER BY PrescriptionDate";
       pst=con.prepareStatement(sql);
      rs=pst.executeQuery();
      tblViewPresc.setModel(DbUtils.resultSetToTableModel(rs));
   }
   catch(Exception e){
     JOptionPane.showMessageDialog(null,e); 
   }
    } 
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        panel_2 = new javax.swing.JPanel();
        user = new javax.swing.JButton();
        lblPrPhoto = new javax.swing.JLabel();
        panel_3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbPharmacistDB = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblViewPresc = new javax.swing.JTable();
        btnSearch3 = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        btnRefresh = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(153, 153, 153));

        panel_2.setBackground(new java.awt.Color(102, 102, 102));

        user.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        user.setText("Guest");
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        lblPrPhoto.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 153)));

        javax.swing.GroupLayout panel_2Layout = new javax.swing.GroupLayout(panel_2);
        panel_2.setLayout(panel_2Layout);
        panel_2Layout.setHorizontalGroup(
            panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panel_2Layout.setVerticalGroup(
            panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lblPrPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_3.setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        lbPharmacistDB.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        lbPharmacistDB.setForeground(new java.awt.Color(255, 255, 255));
        lbPharmacistDB.setText("View prescriptions");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbPharmacistDB)
                .addGap(378, 378, 378))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbPharmacistDB, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        tblViewPresc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        tblViewPresc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblViewPrescMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblViewPresc);

        btnSearch3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DCIS/Icons/photo_2018-12-05_20-42-47.jpg"))); // NOI18N
        btnSearch3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnSearch3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch3ActionPerformed(evt);
            }
        });

        searchField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchField.setForeground(new java.awt.Color(153, 153, 153));
        searchField.setText("search here (by MRN)");
        searchField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchFieldMouseClicked(evt);
            }
        });
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        btnRefresh.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DCIS/Icons/icons8-update-30.png"))); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_3Layout = new javax.swing.GroupLayout(panel_3);
        panel_3.setLayout(panel_3Layout);
        panel_3Layout.setHorizontalGroup(
            panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1028, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panel_3Layout.setVerticalGroup(
            panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearch3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(searchField, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnBack.setBackground(new java.awt.Color(102, 102, 102));
        btnBack.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DCIS/Icons/icons8-go-back-30.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
       
    }//GEN-LAST:event_userActionPerformed

    private void searchFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchFieldMouseClicked
        if("search here (by MRN)".equals(searchField.getText())){
            searchField.setForeground(Color.black);
            searchField.setText("");
        }

    }//GEN-LAST:event_searchFieldMouseClicked

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void btnSearch3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch3ActionPerformed

     
                if("search here (by MRN)".equals(searchField.getText()) || searchField.getText().isEmpty()==true ) {
                    JOptionPane.showMessageDialog(null, "Enter Patients MRN to search prescriptions", "Error", JOptionPane.ERROR_MESSAGE);
                    searchField.grabFocus();
                }
                else {
                    try {
                        boolean varb=checkPrescription(searchField.getText());
                 if(varb==true){
             String sql= "SELECT DrugID,First_Name AS Patient_Name,prescription.MRN,PrescriberName,Diagnosis,DrugName,PrescriptionDate,DosageForm,Dose,Frequency,Duration,Quantity FROM prescription,patinet WHERE patinet.MRN=prescription.MRN  AND prescription.MRN=?";            
                    //String sql="SELECT DrugID,MRN,PrescriberName,DentistID,Diagnosis,DrugName,PrescriptionDate,DosageForm,Dose,Frequency,Duration,Quantity,Strength FROM prescription where MRN=?";
                    pst=con.prepareStatement(sql);
                    pst.setString(1, searchField.getText());
                    rs=pst.executeQuery();
                    tblViewPresc.setModel(DbUtils.resultSetToTableModel(rs));
                    searchField.setText("search here (by MRN)");
                      }
                if(varb==false){
                        JOptionPane.showMessageDialog(null, "Record not found","Sorry",JOptionPane.INFORMATION_MESSAGE); 
                        searchField.setText("");
                        searchField.grabFocus();
                        }
                    
                }
           
            catch(  HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
          
        }
   //searchData();
    }//GEN-LAST:event_btnSearch3ActionPerformed
public boolean checkPrescription(String uname){
   String sql="SELECT * FROM prescription where MRN=?";
   boolean var=false;
   try{
   PreparedStatement pst1=con.prepareStatement(sql);
   pst1.setString(1,uname);
   ResultSet result=pst1.executeQuery();
   if(result.next()){
       var= true;
   }
   else{
       var= false;
   }
   
   
   }
   catch(SQLException e){
       
   }
   return var;
 }
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        PharmacistDB pdb=new PharmacistDB();
        pdb.setVisible(true);
        pdb.user.setText(user.getText());
        pdb.lblPhPhoto.setIcon(lblPrPhoto.getIcon());
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        
        loadTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void tblViewPrescMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblViewPrescMouseClicked
       
                     try{
           
            int row= tblViewPresc.getSelectedRow();
            String drugid= tblViewPresc.getModel().getValueAt(row, 1).toString();
           // JOptionPane.showMessageDialog(this,"drug id  "+drugid); 
            String sql= "SELECT drugid,prescriptionid,drugname,quantity  FROM prescription where drugid="+ drugid;
            pst=con.prepareStatement(sql);
            //pst.setString(1,table_click);
            rs=pst.executeQuery();
            // JOptionPane.showMessageDialog(this,"rs"+rs); 
            while(rs.next()){
        DispensedDrug frm = new DispensedDrug(new ViewPrescription(),true,rs.getString("prescriptionid"),rs.getString("drugname"),rs.getString("quantity"));
        frm.setVisible(true);          
               
                 
            }
        
          
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }  
    }//GEN-LAST:event_tblViewPrescMouseClicked

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
            java.util.logging.Logger.getLogger(ViewPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPrescription().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbPharmacistDB;
    public javax.swing.JLabel lblPrPhoto;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel_2;
    public javax.swing.JPanel panel_3;
    private javax.swing.JTextField searchField;
    private javax.swing.JTable tblViewPresc;
    public javax.swing.JButton user;
    // End of variables declaration//GEN-END:variables
}
