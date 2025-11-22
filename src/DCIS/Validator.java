
package DCIS;
import java.util.regex.*;
import javax.swing.*;
import java.sql.*;
/**
 *
 * @author shime
 */
public class Validator {
    public Validator(){
        
    }

    
    public static boolean validateDentist(JTextField txtDid,JTextField txtAge,JTextField txtName,JTextField txtQualification,
            JTextField txtContact,JTextField txtUsername,JTextField txtAddress,JPasswordField txtPassword,JLabel lblAgeError,
            JLabel lblNameError,JLabel lblDidError,JLabel lblContactError,JLabel lblUsernameError,JLabel lblPasswordError) {
      boolean a=false;
        
        Pattern p1=Pattern.compile("\\D");
    // Pattern p1=Pattern.compile("[a-zA-Z @&!%$?#]");
     Pattern p2=Pattern.compile("[^a-zA-Z ]");//don't allow digits and special characters
      // Pattern p2=Pattern.compile("\\W");
      Pattern ps=Pattern.compile("\\d");
      Pattern p3=Pattern.compile("\\D");
       //Pattern p4=Pattern.compile("[a-zA-Z0-9]");
       Pattern p5=Pattern.compile("\\W");
      Matcher m=p1.matcher(txtAge.getText());
      Matcher m2=p2.matcher(txtName.getText());
      Matcher ms=ps.matcher(txtName.getText());
       Matcher m3=p3.matcher(txtContact.getText());
       //Matcher m4=p4.matcher(txtUsername.getText());
      Matcher m5=p5.matcher(txtUsername.getText());
       Matcher m6=p5.matcher(txtDid.getText());
       Matcher m7=p5.matcher(txtPassword.getText());
      
     if(m.find()||txtAge.getText().length()>3){
         //JOptionPane.showMessageDialog(null,"Please enter number only","error",JOptionPane.ERROR_MESSAGE);
      lblAgeError.setText("please enter valid age value");
      txtAge.setText("");
    
     }
     else if(m2.find()){
      lblNameError.setText("please enter only Letters");
      txtName.setText("");
     }
      else if(m3.find()||txtContact.getText().length()>14) {
      lblContactError.setText("please enter valid phone number");
      txtContact.setText("");
     }
    
      else if(m5.find()) {
      lblUsernameError.setText("please enter valid username");
      txtUsername.setText("");
     }
      else if(m6.find()) {
      lblDidError.setText("please enter valid Dentist Id. *only alphanumeric values are allowed!");
      txtDid.setText("");
     }
       else if(m7.find()) {
      lblPasswordError.setText("*Special characters  are not allowed!");
      txtPassword.setText("");
     }
     else{
    a=true;
     }
   return a;
    }
    public static boolean  validateNurse(JTextField txtDid1,JTextField txtAge1,JTextField txtName1,JTextField txtQualification1,
            JTextField txtContact1,JTextField txtUsername1,JTextField txtAddress1,JPasswordField txtPassword1,JLabel nurAgeErr,
            JLabel nurNameErr,JLabel nurNidErr,JLabel nurContactErr,JLabel nurUsernameErr,JLabel nurPasswordErr) {
        
        
          boolean a=false;
        Pattern p1=Pattern.compile("\\D");
    // Pattern p1=Pattern.compile("[a-zA-Z @&!%$?#]");
     Pattern p2=Pattern.compile("[^a-zA-Z ]");
      // Pattern p2=Pattern.compile("\\W");
      Pattern ps=Pattern.compile("\\d");
      Pattern p3=Pattern.compile("\\D");
       //Pattern p4=Pattern.compile("[a-zA-Z0-9]");
       Pattern p5=Pattern.compile("\\W");
      Matcher m=p1.matcher(txtAge1.getText());
      Matcher m2=p2.matcher(txtName1.getText());
      Matcher ms=ps.matcher(txtName1.getText());
       Matcher m3=p3.matcher(txtContact1.getText());
       //Matcher m4=p4.matcher(txtUsername.getText());
      Matcher m5=p5.matcher(txtUsername1.getText());
       Matcher m6=p5.matcher(txtDid1.getText());
       Matcher m7=p5.matcher(txtPassword1.getText());
      
     if(m.find()||txtAge1.getText().length()>3){
         //JOptionPane.showMessageDialog(null,"Please enter number only","error",JOptionPane.ERROR_MESSAGE);
      nurAgeErr.setText("please enter valid age value");
      txtAge1.setText("");
    
     }
     else if(m2.find()){
      nurNameErr.setText("please enter only Letters");
      txtName1.setText("");
     }
      else if(m3.find()||txtContact1.getText().length()>14) {
      nurContactErr.setText("please enter valid phone number");
      txtContact1.setText("");
     }
    
      else if(m5.find()) {
      nurUsernameErr.setText("please enter valid username");
      txtUsername1.setText("");
     }
      else if(m6.find()) {
      nurNidErr.setText("please enter valid Nurse Id. *only alphanumeric values are allowed!");
      txtDid1.setText("");
     }
       else if(m7.find()) {
      nurPasswordErr.setText("*Special characters  are not allowed!");
      txtPassword1.setText("");
     }
     else{
      a=true;
     }
        
        
        
        
   return a;     
  }
    
     public static boolean validatePharmacist(JTextField txtDid2,JTextField txtAge2,JTextField txtName2,JTextField txtQualification2,
            JTextField txtContact2,JTextField txtUsername2,JTextField txtAddress2,JPasswordField txtPassword2,JLabel phAgeErr,
            JLabel phNameErr,JLabel phPidErr,JLabel phContactErr,JLabel phUsernameErr,JLabel phPasswordErr) {
        
        
          boolean a=false;
        Pattern p1=Pattern.compile("\\D");
    // Pattern p1=Pattern.compile("[a-zA-Z @&!%$?#]");
     Pattern p2=Pattern.compile("[^a-zA-Z ]");
      // Pattern p2=Pattern.compile("\\W");
      Pattern ps=Pattern.compile("\\d");
      Pattern p3=Pattern.compile("\\D");
       //Pattern p4=Pattern.compile("[a-zA-Z0-9]");
       Pattern p5=Pattern.compile("\\W");
      Matcher m=p1.matcher(txtAge2.getText());
      Matcher m2=p2.matcher(txtName2.getText());
      Matcher ms=ps.matcher(txtName2.getText());
       Matcher m3=p3.matcher(txtContact2.getText());
       //Matcher m4=p4.matcher(txtUsername.getText());
      Matcher m5=p5.matcher(txtUsername2.getText());
       Matcher m6=p5.matcher(txtDid2.getText());
       Matcher m7=p5.matcher(txtPassword2.getText());
      
     if(m.find()||txtAge2.getText().length()>3){
         //JOptionPane.showMessageDialog(null,"Please enter number only","error",JOptionPane.ERROR_MESSAGE);
      phAgeErr.setText("please enter valid age value");
      txtAge2.setText("");
    
     }
     else if(m2.find()){
      phNameErr.setText("please enter only Letters");
      txtName2.setText("");
     }
      else if(m3.find()||txtContact2.getText().length()>14) {
      phContactErr.setText("please enter valid phone number");
      txtContact2.setText("");
     }
    
      else if(m5.find()) {
      phUsernameErr.setText("please enter valid username");
      txtUsername2.setText("");
     }
      else if(m6.find()) {
      phPidErr.setText("please enter valid Pharmacist Id. *only alphanumeric values are allowed!");
      txtDid2.setText("");
     }
       else if(m7.find()) {
      phPasswordErr.setText("*Special characters  are not allowed!");
      txtPassword2.setText("");
     }
     else{
       a=true;
     }
        
     return a;
  } 
     
     
   public static void searchNurse(JTextField searchField1,JTextField txtDid1,JTextField txtName1,
           JTextField txtAge1,JComboBox comGen,JTextField txtQualification1,JTextField txtContact1,JTextField txtAddress1,
           JTextField txtPhotoNur,ResultSet rs,Connection con,PreparedStatement pst){  
     if(searchField1.getText().isEmpty()==true) {
            JOptionPane.showMessageDialog(null, "You must enter search criteria", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
            try {
               if("search here...".equals(searchField1.getText()) || searchField1.getText().isEmpty()==true ) {
                    JOptionPane.showMessageDialog(null, "Enter search criteria", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else {
                String sql="SELECT * FROM nurse,useraccount where nurse.NurseID=? AND useraccount.ID=?";
                pst=con.prepareStatement(sql);
                pst.setString(1, searchField1.getText());
               pst.setString(2, searchField1.getText());
                rs=pst.executeQuery();
                   if(rs.next() ) {

                        String did=rs.getString("NurseID");
                        txtDid1.setText(did);
                        String name =rs.getString("Name");
                        txtName1.setText(name);
                        String age=rs.getString("Age");
                        txtAge1.setText(age);
                        String gender=rs.getString("Gender");
                        comGen.setSelectedItem(gender);
                        String qualification=rs.getString("Qualification");
                        txtQualification1.setText(qualification);
                        String contact=rs.getString("Contact");
                        txtContact1.setText(contact);
                        String address=rs.getString("Address");
                        txtAddress1.setText(address);
                        String path=rs.getString("ImagePath");
                        txtPhotoNur.setText(path);
                        searchField1.setText("search here...");
                        
                    }
                    else {

                        JOptionPane.showMessageDialog(null, "Opps! Record not found.\n Please retry with correct DentistID");
                    }
            
                  
                }
            }
            catch(Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
     
     
     
     
   }  
   
public static void searchPharmacist(JTextField searchField2,JTextField txtDid2,JTextField txtName2,
           JTextField txtAge2,JComboBox comboGen,JTextField txtQualification2,JTextField txtContact2,JTextField txtAddress2,
           JTextField txtPhPhoto,ResultSet rs,Connection con,PreparedStatement pst){  
     if(searchField2.getText().isEmpty()==true) {
            JOptionPane.showMessageDialog(null, "You must enter search criteria", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
            try {
               if("search here...".equals(searchField2.getText()) || searchField2.getText().isEmpty()==true ) {
                    JOptionPane.showMessageDialog(null, "Enter search criteria", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else {
                String sql="SELECT * FROM pharmacist,useraccount where pharmacist.PharmacistID=? AND useraccount.ID=?";
                pst=con.prepareStatement(sql);
                pst.setString(1, searchField2.getText());
               pst.setString(2, searchField2.getText());
                rs=pst.executeQuery();
                   if(rs.next() ) {

                        String did=rs.getString("PharmacistID");
                        txtDid2.setText(did);
                        String name =rs.getString("Name");
                        txtName2.setText(name);
                        String age=rs.getString("Age");
                        txtAge2.setText(age);
                        String gender=rs.getString("Gender");
                        comboGen.setSelectedItem(gender);
                        String qualification=rs.getString("Qualification");
                        txtQualification2.setText(qualification);
                        String contact=rs.getString("Contact");
                        txtContact2.setText(contact);
                        String address=rs.getString("Address");
                        txtAddress2.setText(address);
                        String path=rs.getString("ImagePath");
                        txtPhPhoto.setText(path);
                        searchField2.setText("search here...");
                        
                    }
                    else {

                        JOptionPane.showMessageDialog(null, "Opps! Record not found.\n Please retry with correct DentistID");
                    }
            
                  
                }
            }
            catch(Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
     
     
     
     
   }
   /*Tested validation*/
public static boolean validatePtHistory(JTextField tx1,JTextField tx2,JTextArea j1,JTextArea j2){
    boolean a=false;
   // Pattern p2=Pattern.compile("[0-9@&!%$?#]");
    Pattern p3=Pattern.compile("[^0-9a-zA-Z ]");
   Pattern p4=Pattern.compile("[^a-zA-Z ]");
    
    Matcher m2=p4.matcher(j1.getText());//chiefcomplaint only letter and whitespace
    Matcher m3=p4.matcher(j2.getText());//history of present illness only letter and whitespace
    
    Matcher m4=p3.matcher(tx1.getText());//bedno digit and letter
    Matcher m5=p3.matcher(tx2.getText());//ward digit and letter
    if(m2.find()||m3.find()){
             JOptionPane.showMessageDialog(null,"Enter valid data.\nDigits Not allowed in chief complaint and history of present illness fields. ","ERROR",JOptionPane.ERROR_MESSAGE);
            j1.grabFocus();
}
    else if(m4.find()||m5.find()){
 JOptionPane.showMessageDialog(null,"Enter valid data.\n"
         + "*special characters not allowed in bedno and ward fields. ","ERROR",JOptionPane.ERROR_MESSAGE);
            
}
    
  else if("".equals(j1.getText()) 
        || "".equals(j2.getText())
        || "".equals(tx1.getText())
        || "".equals(tx2.getText())){
    JOptionPane.showMessageDialog(null,"Fill all fields. ","ERROR",JOptionPane.ERROR_MESSAGE);
    
}
else{
    a=true;
}  
    return a;
}
 /*Tested validation*/
public static boolean validateDx(JTextArea j1,JTextArea j2,JTextArea j3,JTextArea j4,JTextField tx1,JTextArea j5,JTextField tx2){
    boolean a=false;
    Pattern p2=Pattern.compile("[0-9@&/<|>!*%$?^#]");
    Pattern p=Pattern.compile("[a-zA-Z*&%<$|>#@!?]");
    Matcher m2=p2.matcher(j1.getText());
    Matcher m3=p2.matcher(j2.getText());
    Matcher m4=p2.matcher(j3.getText());
    Matcher m5=p2.matcher(j4.getText());
    
    Matcher m6=p2.matcher(tx1.getText());
    Matcher m7=p2.matcher(j5.getText());
    Matcher m8=p.matcher(tx2.getText());


if(m2.find()||m3.find()||m4.find()||m5.find()||m6.find()||m7.find()){
JOptionPane.showMessageDialog(null,"Enter valid data.Digits Not allowed in all fields. ","ERROR",JOptionPane.ERROR_MESSAGE);


}
else if(m8.find()){
    JOptionPane.showMessageDialog(null,"Enter valid blood pressure value. ","ERROR",JOptionPane.ERROR_MESSAGE);
    
}
else if("".equals(j4.getText()) 
        || "".equals(j1.getText())
        || "".equals(j2.getText())
        || "".equals(j3.getText())
        ||"".equals(j5.getText())
        || "".equals(tx1.getText())
        || "".equals(tx2.getText())){
    JOptionPane.showMessageDialog(null,"Fill all fields. ","ERROR",JOptionPane.ERROR_MESSAGE);
    
}
else{
    a=true;
}
return a;
}
 /*Tested validation*/
public static boolean validateDisenseDrug(JTextField tx1,JTextField tx2, JTextField tx3){//drugname, dquantity, dcost
    boolean a=false;
    Pattern p2=Pattern.compile("[0-9@&!<|>*%$?#]");
    Pattern p=Pattern.compile("[a-zA-Z@&*!|%$?#>/<]");
    Pattern ps=Pattern.compile("[^a-zA-Z0-9. ]");
      
    Matcher m1=p2.matcher(tx1.getText());
    Matcher m2=p.matcher(tx2.getText());
    Matcher m3=ps.matcher(tx3.getText());
    if(m1.find()){
JOptionPane.showMessageDialog(null,"Enter valid drug name.\nNB: Digits and special characters not allowed.","ERROR",JOptionPane.ERROR_MESSAGE);
tx1.grabFocus();
    }
else  if(m2.find()){
JOptionPane.showMessageDialog(null,"Enter valid drug quantity.","ERROR",JOptionPane.ERROR_MESSAGE);
tx2.grabFocus();
}
else  if(m3.find()){
JOptionPane.showMessageDialog(null,"Enter valid drug cost.","ERROR",JOptionPane.ERROR_MESSAGE);
tx3.grabFocus();
}
else  if("".equals(tx1.getText()) || "".equals(tx2.getText()) || "".equals(tx3.getText()) ){
JOptionPane.showMessageDialog(null,"Fill all fields.","ERROR",JOptionPane.ERROR_MESSAGE);
}
else{
        a=true;
    }
     
    
    return a;
}
/*tested validation*/
public static boolean validatePrescription(JTextField tx1,JTextArea j1,
       JTextField tx2, JTextField tx3, JTextField tx4, JTextField tx5, JTextField tx6,
       JTextArea j2){//txtDosageForm,txtHwToUse,txtDose,txtFreq,txtDuration,txtQuant,txtStrength,txtOtherInfo
    boolean a=false;
    Pattern p2=Pattern.compile("[0-9@&!%$|<*>?#]");
    Pattern p=Pattern.compile("[a-zA-Z]");
    Pattern ps=Pattern.compile("[^a-zA-Z0-9. ]");//special character except white space
   Pattern pd=Pattern.compile("[^a-zA-Z ]");
    Matcher m1=pd.matcher(tx1.getText().trim() );//dosage form allow letters and white space
    
   
    Matcher m2=ps.matcher(j1.getText());//how to use allow letters only
    Matcher m3=ps.matcher(tx2.getText());//dose allow letter and digit
    Matcher m4=ps.matcher(tx3.getText());//frequency allow letter and digit
    
    Matcher m5=ps.matcher(tx4.getText());//duration allow letter and digit
    Matcher m6=p.matcher(tx5.getText());//quantity  allow only digits 
    Matcher m7=p2.matcher(tx6.getText());//strength allow letter only
    Matcher m8=ps.matcher(j2.getText());//othe info allow letter and digit

if(m1.find()||m7.find()){
JOptionPane.showMessageDialog(null,"Enter valid data.Check your input again.\nNB: Digits Not allowed in dosage form and strength fields . ","ERROR",JOptionPane.ERROR_MESSAGE);


}
else if(m2.find()){
JOptionPane.showMessageDialog(null,"Enter valid data.Check your input again.","ERROR",JOptionPane.ERROR_MESSAGE);
j1.grabFocus();

}
else if(m3.find()||m4.find()||m5.find()||m8.find()){
    JOptionPane.showMessageDialog(null,"Enter valid value.\n *special characters and white space not allowed in all fields.","ERROR",JOptionPane.ERROR_MESSAGE);
    tx5.grabFocus();
}
else if(m6.find()){
    JOptionPane.showMessageDialog(null,"Enter valid quantity value.\nNB: Only number is required. ","ERROR",JOptionPane.ERROR_MESSAGE);
    tx5.grabFocus();
}
else{
    a=true;
}
return a;
}
/*tested validation*/
public static boolean validateProcedure(JTextArea j1,JTextArea j2,
       JTextField tx1, JTextField tx2, JTextArea j3, JTextArea j4, JTextField tx3,
       JTextField tx4){
    //txtareaPreOpDx,txtareaProcedure,txtBloodLoss,txtDrains,txtareaPostOpDx,txtareaFindings,txtFluidGiven,txtSpecimen
    boolean a=false;
    Pattern p2=Pattern.compile("[0-9@&!%$?#</>]");//nums and sp chars
    Pattern p=Pattern.compile("[a-zA-Z@&!%$?#>/<]");//letters and sp chars
    Pattern ps=Pattern.compile("[^0-9a-zA-Z. ]");//special character
    
    Matcher m1=p2.matcher(j1.getText());//allow letters only
    Matcher m2=p2.matcher(j2.getText());//allow letters only
    
    Matcher m3=ps.matcher(tx1.getText());//allow letter and digit
    Matcher m4=ps.matcher(tx2.getText());//allow letter and digit
    
    Matcher m5=p2.matcher(j3.getText());// allow letter only
    Matcher m6=p2.matcher(j4.getText());//allow letters only
    
    Matcher m7=ps.matcher(tx3.getText());//allow letter and digit
    Matcher m8=p2.matcher(tx4.getText());//allow letters only

if(m1.find()||m2.find()||m5.find()||m6.find()||m8.find()){
JOptionPane.showMessageDialog(null,"Enter valid data.Check your input again.","ERROR",JOptionPane.ERROR_MESSAGE);


}
else if(m3.find()||m4.find()||m7.find()){
    JOptionPane.showMessageDialog(null,"Enter valid value.\n *special characters not allowed in all fields.","ERROR",JOptionPane.ERROR_MESSAGE);
    
}
else{
    a=true;
}
return a;
}
}   