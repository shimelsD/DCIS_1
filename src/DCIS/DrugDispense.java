/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

/**
 *
 * @author shime
 */
public class DrugDispense extends javax.swing.JFrame {
     Connection con=ConnectionDB.ConnectDb();
    PreparedStatement pst;
    ResultSet rs;
    private String drugID;
    private int drugquantity;
    public DrugDispense() {
         initComponents();
         setIconImage(Toolkit.getDefaultToolkit().getImage(Admin_DB.class.getResource("/DCIS/photo_2018-12-09_15-04-39.jpg")));
         setTitle("Dental Clinic Information System");
         createMenuBar();
         customStyler();
    }

    public final void createMenuBar(){
             setIconImage(Toolkit.getDefaultToolkit().getImage(Admin_DB.class.getResource("/DCIS/photo_2018-12-09_15-04-39.jpg")));
    
        
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		//menuBar.setForeground(new Color(128, 0, 0));
		//menuBar.setBackground(new Color(0, 0, 0));
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
                        @Override
			public void actionPerformed(ActionEvent arg0) {
JOptionPane.showMessageDialog(null, "DCIS software is a desktop based system developed by University of Gondar,"
        + "College of Medicine and Health Science, Health Informatics\n" +
"graduating students for degree program fulfilment.\n" +
"The system is aim to provide comprehensive software solution for the dental clinics.\n", "About",1,Appointments.imgic);
			
				
			
			}
		});
		about.setIcon(new ImageIcon(Admin_DB.class.getResource("/DCIS/about.jpg")));
		
		
		JMenuItem exit=new JMenuItem("Exit              Alt+X ");
		exit.setMnemonic('x');
		exit.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent arg0) {
			
			System.exit(0);
			
			}
		});
		exit.setIcon(new ImageIcon(Admin_DB.class.getResource("/DCIS/exit.jpg")));
		filemenu.add(about);
		filemenu.add(exit);
		
		
         }
   public final void customStyler(){
    //setTitle("Dental Clinic Information System");
		JPopupMenu popupMenu = new JPopupMenu();
              
		addPopup(user, popupMenu);
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
                        @Override
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
                        @Override
			public void actionPerformed(ActionEvent arg0) {
			new ChangePassword(new Prescriptions(),true).setVisible(true);
						
			}
		});
                changePw.setFont(new Font("Tahoma", Font.BOLD, 16));
		popupMenu.add(changePw);
}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
                        @Override
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
                        @Override
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        panel_2 = new javax.swing.JPanel();
        user = new javax.swing.JButton();
        lbldispPhoto = new javax.swing.JLabel();
        panel_3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbPharmacistDB = new javax.swing.JLabel();
        panel_4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        dcost = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblUn = new javax.swing.JLabel();
        lblNP2 = new javax.swing.JLabel();
        drugname = new javax.swing.JTextField();
        dquantity = new javax.swing.JTextField();
        lblNP3 = new javax.swing.JLabel();
        lblNP4 = new javax.swing.JLabel();
        sdate = new com.toedter.calendar.JDateChooser();
        btnClear = new javax.swing.JButton();
        txtPrescId = new javax.swing.JTextField();
        presid = new javax.swing.JLabel();
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

        lbldispPhoto.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 153)));

        javax.swing.GroupLayout panel_2Layout = new javax.swing.GroupLayout(panel_2);
        panel_2.setLayout(panel_2Layout);
        panel_2Layout.setHorizontalGroup(
            panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbldispPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panel_2Layout.setVerticalGroup(
            panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(lbldispPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_3.setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        lbPharmacistDB.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        lbPharmacistDB.setForeground(new java.awt.Color(255, 255, 255));
        lbPharmacistDB.setText("Dispense Drug");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(403, 403, 403)
                .addComponent(lbPharmacistDB)
                .addContainerGap(456, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbPharmacistDB, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        panel_4.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dcost.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dcost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dcostActionPerformed(evt);
            }
        });
        jPanel2.add(dcost, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 520, 40));

        btnSave.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel2.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 150, 50));

        lblUn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUn.setForeground(new java.awt.Color(255, 255, 255));
        lblUn.setText("Drug Name");
        lblUn.setToolTipText("");
        jPanel2.add(lblUn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 110, 30));

        lblNP2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNP2.setForeground(new java.awt.Color(255, 255, 255));
        lblNP2.setText("Cost");
        lblNP2.setToolTipText("");
        jPanel2.add(lblNP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 50, 30));

        drugname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(drugname, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 520, 40));

        dquantity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dquantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dquantityActionPerformed(evt);
            }
        });
        jPanel2.add(dquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 520, 40));

        lblNP3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNP3.setForeground(new java.awt.Color(255, 255, 255));
        lblNP3.setText("Quantity");
        lblNP3.setToolTipText("");
        jPanel2.add(lblNP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 80, 30));

        lblNP4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNP4.setForeground(new java.awt.Color(255, 255, 255));
        lblNP4.setText("Dispensed Date");
        lblNP4.setToolTipText("");
        jPanel2.add(lblNP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 150, 30));

        sdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(sdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 520, 40));

        btnClear.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel2.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 130, 50));

        txtPrescId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(txtPrescId, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 520, 30));

        presid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        presid.setForeground(new java.awt.Color(255, 255, 255));
        presid.setText("PrescriptioID");
        presid.setToolTipText("");
        jPanel2.add(presid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 130, 30));

        javax.swing.GroupLayout panel_4Layout = new javax.swing.GroupLayout(panel_4);
        panel_4.setLayout(panel_4Layout);
        panel_4Layout.setHorizontalGroup(
            panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_4Layout.setVerticalGroup(
            panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_4Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_3Layout = new javax.swing.GroupLayout(panel_3);
        panel_3.setLayout(panel_3Layout);
        panel_3Layout.setHorizontalGroup(
            panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        panel_3Layout.setVerticalGroup(
            panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        //logout
    }//GEN-LAST:event_userActionPerformed

    private void dcostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dcostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dcostActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
         boolean a=Validator.validateDisenseDrug(drugname, dquantity, dcost);
        if (a==true){
        dispenseDrug();
        }
        else{
            
        }
    }//GEN-LAST:event_btnSaveActionPerformed
public String getDrugId(){
 try{
    String sql="select DrugID from drug where drug_name=?";
    pst=con.prepareStatement(sql);
    pst.setString(1,drugname.getText());
    rs=pst.executeQuery();
    if(rs.next()){
     drugID=rs.getString("DrugID");  
    }
    
    }
    catch(SQLException e){
         JOptionPane.showMessageDialog(null,e); 
    }
 return drugID;
}
public String getCurrentDate(){
   Calendar cal = new GregorianCalendar();
   
  int month = cal.get(Calendar.MONTH);
  int year = cal.get(Calendar.YEAR);
  int day = cal.get(Calendar.DAY_OF_MONTH); 
  String s= year+"-0"+(month + 1)+"-"+day;
  return s;
    }
public boolean checkdate(){
     String dx_date;
     boolean a=true;
        try{    
       dx_date=sdate.getDate().toString();
        }
        catch(NullPointerException e){
        JOptionPane.showMessageDialog(this,"Select date.\n "+e,"Error",JOptionPane.ERROR_MESSAGE);
         a=false;
         
        }
return a;
}
public void dispenseDrug(){
     boolean b=checkdate();
          
         if (b==true){
        String g=getCurrentDate();
        DateFormat dff=new SimpleDateFormat("YYYY-MM-dd");       
        String presc_date=dff.format(sdate.getDate());
         
       
       String drid=getDrugId();
      int drquantity=getDrugQuantity();
      int quantity = Integer.parseInt(dquantity.getText());
       
       DateFormat df=new SimpleDateFormat("YYYY-MM-dd");       
       String disp_date=df.format(sdate.getDate());
       
   if(!g.equals(presc_date)){
            JOptionPane.showMessageDialog(this,"Dispensed date must be today.\n"
                    + "select the red marked date in date chooser. ","Error",JOptionPane.ERROR_MESSAGE);
   sdate.grabFocus();
   }
   else if(drquantity==0){ 
       JOptionPane.showMessageDialog(this,"Drug not available.","Warning!",JOptionPane.WARNING_MESSAGE);

      }
  else if(quantity>drquantity){
       JOptionPane.showMessageDialog(null,"There is not "+quantity+" "+drugname.getText()+ " available in the stock.\n"
               + "Only "+drquantity+" available in the stock.","Error!",JOptionPane.ERROR_MESSAGE);
       drugname.grabFocus();
      
    }
   else if("".equals(drugname.getText())|| "".equals(dquantity.getText())
          ||"".equals(dcost.getText()) ){
       JOptionPane.showMessageDialog(null,"Fill all fields.","Error!",JOptionPane.ERROR_MESSAGE);
       drugname.grabFocus();
      
    }
       else{
               try{
       String sql="INSERT INTO DispensedDrug(DrugID,Drug_name,Quantity,Cost,Date_dispensed,prescriptionid) VALUES(?,?,?,?,?,?)";
    pst=con.prepareStatement(sql);
    pst.setString(1,drid);
    pst.setString(2,drugname.getText());
    pst.setInt(3,Integer.valueOf(dquantity.getText()));
    pst.setString(4, dcost.getText());
    pst.setString(5,disp_date);
    pst.setString(6,txtPrescId.getText());
    pst.executeUpdate();   
       
       JOptionPane.showMessageDialog(this,"Drug dispensed succesfully.");
       decreaseDrugQuantity();
       drquantity=getDrugQuantity();
        if(drquantity==0){
          JOptionPane.showMessageDialog(this,"This drug is out of stock.","Warning",JOptionPane.WARNING_MESSAGE);  
       }
      else if(drquantity<10){
          JOptionPane.showMessageDialog(this,"This drug is getting low in the stock.","Warning",JOptionPane.WARNING_MESSAGE);  
       }
      clear();
}
    catch(     HeadlessException | NumberFormatException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
            }  
       } 
   }
}
public void clear(){
  drugname.setText("");  
  dquantity.setText("");
  dcost.setText("");
  sdate.setDateFormatString("");
}
public int getDrugQuantity(){
 try{
    String sql="select Quantity from drug where drug_name=?";
    pst=con.prepareStatement(sql);
    pst.setString(1,drugname.getText());
    rs=pst.executeQuery();
    if(rs.next()){
     //DOUBLE=rs.getDouble();
     drugquantity=rs.getInt("Quantity");
    }
    
    }
    catch(SQLException e){
         JOptionPane.showMessageDialog(null,e); 
    }
return  drugquantity;
}
public void decreaseDrugQuantity(){

try{
String sql="UPDATE drug SET quantity=?-? WHERE drugid=?";
 String drid=getDrugId();
 int quant=getDrugQuantity();
pst=con.prepareStatement(sql);
pst.setInt(1, quant);
pst.setInt(2,  Integer.valueOf(dquantity.getText()));
pst.setString(3,drid);
pst.executeUpdate();
}
catch(SQLException e){
 JOptionPane.showMessageDialog(null,e);
  }
}
    private void dquantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dquantityActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_dquantityActionPerformed
 /*
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
  */    
   public void btnBackActionPerformed(java.awt.event.ActionEvent evt) {     
        PharmacistDB pdb=new PharmacistDB();
        pdb.setVisible(true);
        pdb.user.setText(user.getText());
        pdb.lblPhPhoto.setIcon(lbldispPhoto.getIcon());
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
       clear();
    }//GEN-LAST:event_btnClearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) { 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DrugDispense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         //</editor-fold>
         
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DrugDispense().setVisible(true);
            }
        });
    }
//dcost ddescription dmanufacturer dquantity drugname dsupplier sdate
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    public javax.swing.JTextField dcost;
    public javax.swing.JTextField dquantity;
    public javax.swing.JTextField drugname;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbPharmacistDB;
    private javax.swing.JLabel lblNP2;
    private javax.swing.JLabel lblNP3;
    private javax.swing.JLabel lblNP4;
    private javax.swing.JLabel lblUn;
    public javax.swing.JLabel lbldispPhoto;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel_2;
    public javax.swing.JPanel panel_3;
    public javax.swing.JPanel panel_4;
    private javax.swing.JLabel presid;
    public com.toedter.calendar.JDateChooser sdate;
    public javax.swing.JTextField txtPrescId;
    public javax.swing.JButton user;
    // End of variables declaration//GEN-END:variables
}
