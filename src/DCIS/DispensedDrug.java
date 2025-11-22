/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DCIS;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author shime
 */
public class DispensedDrug extends javax.swing.JDialog {

     Connection con=ConnectionDB.ConnectDb();
    PreparedStatement pst;
    ResultSet rs;
    private String drugID;
    private float drugcost;
    
    private int drugquantity;
    public DispensedDrug(java.awt.Frame parent, boolean modal,String presid, String txf1,String txf2) {
        super(parent, modal);
        setIconImage(Toolkit.getDefaultToolkit().getImage(Admin_DB.class.getResource("/DCIS/photo_2018-12-09_15-04-39.jpg")));
    
        
               initComponents();
               txtPrescId.setText(presid);
               drugname.setText(txf1);
               dquantity.setText(txf2);
               
               //String prescrid=Integer.parseInt(presid);
               
             
               String c=String.valueOf(getDrugCost());
               dcost.setText(c);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel_3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        dcost = new javax.swing.JTextField();
        btnClose = new javax.swing.JButton();
        presid = new javax.swing.JLabel();
        lblNP2 = new javax.swing.JLabel();
        txtPrescId = new javax.swing.JTextField();
        dquantity = new javax.swing.JTextField();
        lblNP3 = new javax.swing.JLabel();
        lblNP4 = new javax.swing.JLabel();
        sdate = new com.toedter.calendar.JDateChooser();
        btnSave1 = new javax.swing.JButton();
        drugname = new javax.swing.JTextField();
        lblUn1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DCIS - Dispense Drug");
        setModalityType(null);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        panel_3.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Dispense Drug", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dcost.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dcost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dcostActionPerformed(evt);
            }
        });
        jPanel2.add(dcost, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 300, 30));

        btnClose.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel2.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 110, 40));

        presid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        presid.setForeground(new java.awt.Color(255, 255, 255));
        presid.setText("PrescriptioID");
        presid.setToolTipText("");
        jPanel2.add(presid, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 130, 30));

        lblNP2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNP2.setForeground(new java.awt.Color(255, 255, 255));
        lblNP2.setText("Cost");
        lblNP2.setToolTipText("");
        jPanel2.add(lblNP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 50, 30));

        txtPrescId.setEditable(false);
        txtPrescId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(txtPrescId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 300, 30));

        dquantity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dquantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dquantityActionPerformed(evt);
            }
        });
        jPanel2.add(dquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 300, 30));

        lblNP3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNP3.setForeground(new java.awt.Color(255, 255, 255));
        lblNP3.setText("Quantity");
        lblNP3.setToolTipText("");
        jPanel2.add(lblNP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 80, 30));

        lblNP4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNP4.setForeground(new java.awt.Color(255, 255, 255));
        lblNP4.setText("Supplied Date");
        lblNP4.setToolTipText("");
        jPanel2.add(lblNP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 130, 30));

        sdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(sdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 300, 30));

        btnSave1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        btnSave1.setText("Save");
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 110, 40));

        drugname.setEditable(false);
        drugname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(drugname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 300, 30));

        lblUn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUn1.setForeground(new java.awt.Color(255, 255, 255));
        lblUn1.setText("Drug Name");
        lblUn1.setToolTipText("");
        jPanel2.add(lblUn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 110, 30));

        javax.swing.GroupLayout panel_3Layout = new javax.swing.GroupLayout(panel_3);
        panel_3.setLayout(panel_3Layout);
        panel_3Layout.setHorizontalGroup(
            panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_3Layout.setVerticalGroup(
            panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed
       //validateDisenseDrug();
       boolean a=Validator.validateDisenseDrug(txtPrescId, dquantity, dcost);
        if (a==true){
            dispenseDrug();
        }
        else{
            
        }
    }//GEN-LAST:event_btnSave1ActionPerformed

    private void dquantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dquantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dquantityActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void dcostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dcostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dcostActionPerformed
public String getDrugId(){
 try{
    String sql="select DrugID from drug where drug_name=?";
    pst=con.prepareStatement(sql);
    pst.setString(1,txtPrescId.getText());
    rs=pst.executeQuery();
    if(rs.next()){
     drugID=rs.getString("DrugID");  
    }
    
    }
    catch(Exception e){
         JOptionPane.showMessageDialog(null,e); 
    }
 return drugID;
}
public final float getDrugCost(){
 try{
    String sql="select Cost from drug where drug_name=?";
    pst=con.prepareStatement(sql);
    pst.setString(1,txtPrescId.getText());
    rs=pst.executeQuery();
    if(rs.next()){
     //DOUBLE=rs.getDouble();
     drugcost=(float) rs.getDouble("Cost");
    }
    
    }
    catch(Exception e){
         JOptionPane.showMessageDialog(null,e); 
    }
return  drugcost;
}
public int getDrugQuantity(){
 try{
    String sql="select Quantity from drug where drug_name=?";
    pst=con.prepareStatement(sql);
    pst.setString(1,txtPrescId.getText());
    rs=pst.executeQuery();
    if(rs.next()){
     //DOUBLE=rs.getDouble();
     drugquantity=rs.getInt("Quantity");
    }
    
    }
    catch(Exception e){
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
catch(Exception e){
 JOptionPane.showMessageDialog(null,e);
  }
}
public void clear(){
txtPrescId.setText("");
sdate.setDateFormatString("");
dquantity.setText("");
dcost.setText("");

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
       float cost=getDrugCost();
   if(!g.equals(presc_date)){
            JOptionPane.showMessageDialog(this,"Dispensed date must be today.\n"
                    + "select the red marked date in date chooser. ","Error",JOptionPane.ERROR_MESSAGE);
   sdate.grabFocus();
   }
   else if(drquantity==0){ 
       JOptionPane.showMessageDialog(this,"Drug not available.","Warning!",JOptionPane.WARNING_MESSAGE);

      }
  else if(quantity>drquantity){
       JOptionPane.showMessageDialog(null,"There is not "+quantity+" "+txtPrescId.getText()+ " available in the stock.\n"
               + "Only "+drquantity+" available in the stock.","Warning!",JOptionPane.WARNING_MESSAGE);
       txtPrescId.grabFocus();
      
    }
  else if("".equals(txtPrescId.getText())|| "".equals(dquantity.getText())
          ||"".equals(dcost.getText()) ){
       JOptionPane.showMessageDialog(null,"Fill all fields.","Error!",JOptionPane.ERROR_MESSAGE);
       txtPrescId.grabFocus();
      
    }
       else{
               try{
       String sql="INSERT INTO DispensedDrug(DrugID,Drug_name,Quantity,Cost,Date_dispensed,PrescriptionID) VALUES(?,?,?,?,?,?)";
    pst=con.prepareStatement(sql);
    pst.setString(1,drid);
    pst.setString(2,txtPrescId.getText());
    pst.setInt(3,quantity);
    pst.setFloat(4, cost);
    pst.setString(5,disp_date);
    pst.setString(6,txtPrescId.getText());
    pst.executeUpdate();   
       
       JOptionPane.showMessageDialog(this,"Drug dispensed succesfully.");
       decreaseDrugQuantity();
       drquantity=getDrugQuantity();
       
       if(drquantity<10){
          JOptionPane.showMessageDialog(this,"This drug is getting low in the stock.","Warning",JOptionPane.WARNING_MESSAGE);  
       }
      dispose();
}
    catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            }  
       } 
    }
}


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
            java.util.logging.Logger.getLogger(DispensedDrug.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DispensedDrug.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DispensedDrug.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DispensedDrug.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DispensedDrug dialog = new DispensedDrug(new javax.swing.JFrame(), true,"","","");
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSave1;
    public javax.swing.JTextField dcost;
    public javax.swing.JTextField dquantity;
    public javax.swing.JTextField drugname;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblNP2;
    private javax.swing.JLabel lblNP3;
    private javax.swing.JLabel lblNP4;
    private javax.swing.JLabel lblUn1;
    public javax.swing.JPanel panel_3;
    private javax.swing.JLabel presid;
    public com.toedter.calendar.JDateChooser sdate;
    public javax.swing.JTextField txtPrescId;
    // End of variables declaration//GEN-END:variables
}
