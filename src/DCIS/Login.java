package DCIS;
import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login extends JFrame {
    Login frame;
    Statement st=null;
    Connection con=ConnectionDB.ConnectDb();
    ResultSet rs=null;
	private JPanel contentPane;
        JPanel panel,panel_1,panel_2;
	public JTextField usernamefield;
	private JPasswordField passwordField;
	private JComboBox jCombo_role;
        public static String usernameHandler;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}
				
			}
		});
	}


   
	public Login() {
		setTitle("Dental Clinic Information System");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/DCIS/photo_2018-12-09_15-04-39.jpg")));
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 907, 516);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
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
                
                JMenuItem changebg=new JMenuItem("Change Background Color         Alt+B ");
		changebg.setMnemonic('b');
                viewmenu.add(changebg);
                
               changebg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                          
                           // frame.setBackground(Color.gray);
                           panel_2.setBackground(Color.gray);
                           panel_1.setBackground(Color.gray);
                           panel.setBackground(Color.gray);
                          //  panel_2.setForeground(Color.black);
                             
                        }
		});
		changebg.setIcon(new ImageIcon(Admin_DB.class.getResource("/DCIS/Icons/setting.jpg"))); 
                
                
                
                
                
                JMenu helpmenu=new JMenu("Help");
		helpmenu.setForeground(new Color(0, 0, 0));
		helpmenu.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(helpmenu);
                JMenuItem help=new JMenuItem("User Guide              Alt+U ");
		help.setMnemonic('u');
                helpmenu.add(help);
                
               help.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            //  new UserGuide().setVisible(true);
                             new UserGuide(frame,true).setVisible(true);
                             
                        }
		});
		help.setIcon(new ImageIcon(Admin_DB.class.getResource("/DCIS/Icons/help.jpg"))); 
    
                about.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
JOptionPane.showMessageDialog(contentPane, "DCIS software is a desktop based system developed by University of Gondar,"
        + "College of Medicine and Health Science, Health Informatics\n" +
"graduating students for degree program fulfilment.\n" +
"The system is aim to provide comprehensive software solution for the dental clinics.\n", "About",1,Appointments.imgic);
			
			
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
		filemenu.add(exit);;
		
		 
		 
		
		
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBackground(UIManager.getColor("Button.darkShadow"));
		panel_1.setBounds(298, 5, 593, 443);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblWelcomeToOur = new JLabel("    WELCOME TO OUR SYSTEM");
		lblWelcomeToOur.setForeground(new Color(255, 255, 255));
		lblWelcomeToOur.setFont(new Font("Baskerville Old Face", Font.BOLD | Font.ITALIC, 23));
		lblWelcomeToOur.setBounds(110, 9, 368, 57);
		panel_1.add(lblWelcomeToOur);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 2, true), "Login", TitledBorder.CENTER, TitledBorder.TOP, null, Color.WHITE));
		panel_2.setBackground(UIManager.getColor("Button.darkShadow"));
		panel_2.setBounds(41, 65, 520, 327);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		usernamefield = new JTextField();
		usernamefield.setBounds(228, 55, 158, 28);
		panel_2.add(usernamefield);
		usernamefield.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		usernamefield.setColumns(10);
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setBounds(97, 54, 107, 28);
		panel_2.add(lblUsername);
		lblUsername.setForeground(new Color(255, 255, 255));
		lblUsername.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		
		JLabel lblRole = new JLabel("ROLE");
		lblRole.setBounds(133, 158, 60, 28);
		panel_2.add(lblRole);
		lblRole.setForeground(Color.WHITE);
		lblRole.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setBounds(97, 108, 107, 28);
		panel_2.add(lblPassword);
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		
		passwordField = new JPasswordField();
		passwordField.setBounds(228, 108, 158, 26);
		panel_2.add(passwordField);
		passwordField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		passwordField.setColumns(10);
		
		jCombo_role = new JComboBox();
		jCombo_role.setBounds(228, 156, 164, 32);
		panel_2.add(jCombo_role);
		jCombo_role.setBackground(Color.BLACK);
		jCombo_role.setForeground(Color.WHITE);
		jCombo_role.setFont(new Font("Tahoma", Font.BOLD, 18));
		jCombo_role.setModel(new DefaultComboBoxModel(new String[] {"---select role---", "Adminstrator","Nurse", "Dentist", "Pharmacist"}));
		
		JButton btnSignIn = new JButton("Sign in");
		btnSignIn.setBounds(195, 230, 131, 44);
		panel_2.add(btnSignIn);
		btnSignIn.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				   
                            String s1 =usernamefield.getText().toLowerCase();
			    String s2=passwordField.getText().toLowerCase();
                            Pattern p5=Pattern.compile("\\W");   
       Matcher m5=p5.matcher(usernamefield.getText());
       Matcher m7=p5.matcher(passwordField.getText());           
                  if(m5.find()) {
                      JOptionPane.showMessageDialog(null,"please enter valid username","Error",JOptionPane.ERROR_MESSAGE);
                      usernamefield.grabFocus();
     }                
               else if(m7.find()) {
                   JOptionPane.showMessageDialog(null,"Special characters  are not allowed in password field.","Error",JOptionPane.ERROR_MESSAGE);
                      passwordField.grabFocus();
     }                    
             else{
                                  
	String role= (jCombo_role.getSelectedItem().toString());
					
	if(role!="---select role---" && s1.isEmpty()==false && s2.isEmpty()==false ) {
					
	try {
            String sql=" SELECT Username,PASSWORD ,role,Photo FROM useraccount WHERE Username = '"+s1+"' AND PASSWORD = '"+s2+"' AND role = '"+role+"'";
						 
		st=con.createStatement();
		rs=st.executeQuery(sql);
		if(rs.next()){
                  
                  byte [] img=rs.getBytes("Photo");
                  ImageIcon image=new ImageIcon(img);
                  Image im=image.getImage();
                           
                    
		if(s1.equals(rs.getString("Username")) && s2.equals(rs.getString("Password")) && role.equals(rs.getString("Role"))) {
		//JOptionPane.showMessageDialog(null, "Verified user!");
						 
		if("---select role---".equals(role)) {
			JOptionPane.showMessageDialog(panel_1, "You must enter your role ", "Error", JOptionPane.ERROR_MESSAGE);
									
		}
		if("Adminstrator".equals(role)) {
									
		 
                 Admin_DB adb=new Admin_DB();
                        Image myImage=im.getScaledInstance(adb.lblPhoto.getWidth(),adb.lblPhoto.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon newImage=new ImageIcon(myImage);
                        adb.lblPhoto.setIcon(newImage);
                        adb.setVisible(true);
                        adb.user.setText(s1);
                        usernameHandler=rs.getString("Username");
                        dispose();
		}
		if("Dentist".equals(role)) {
		
                 Dentist_DB ddb=new Dentist_DB();
                 Image myImage=im.getScaledInstance(ddb.lblDenPhoto.getWidth(),ddb.lblDenPhoto.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon newImage=new ImageIcon(myImage);
                        ddb.lblDenPhoto.setIcon(newImage);
                        ddb.setVisible(true);
                        dispose();
                       ddb.user.setText(s1);
                       usernameHandler=rs.getString("Username");
                      // ddb.handler.setText(rs.getString("Username"));
                      
                       //JOptionPane.showMessageDialog(null,rs.getString("Username"));
                       //ddb.handler.setText(rs.getString("Username"));
		}
		if("Nurse".equals(role)) {
                    
		    Nurse_DB nursedb=new Nurse_DB();
                    Image myImage=im.getScaledInstance(nursedb.lblNurPhoto.getWidth(),nursedb.lblNurPhoto.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon newImage=new ImageIcon(myImage);
                    nursedb.lblNurPhoto.setIcon(newImage);
		    nursedb.setVisible(true);
                    dispose();
                    nursedb.user.setText(s1);
                    usernameHandler=rs.getString("Username");
                                                                      
                     }
		if("Pharmacist".equals(role)) {
		 PharmacistDB pdb=new PharmacistDB();
                 Image myImage=im.getScaledInstance(pdb.lblPhPhoto.getWidth(),pdb.lblPhPhoto.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon newImage=new ImageIcon(myImage);
                    pdb.lblPhPhoto.setIcon(newImage);
		 
		  pdb.setVisible(true);
                  setVisible(false);
		 pdb.user.setText(s1);
                 usernameHandler=rs.getString("Username");
               // JOptionPane.showMessageDialog(null, "Cooming soon! Not programmed Not yet", "Info", JOptionPane.INFORMATION_MESSAGE);
		 }
	}
	 
                
                
                
                
                
         }//end of rs.next();
else{
JOptionPane.showMessageDialog(null, "Incorect username/password combination! Login failed","Error",JOptionPane.ERROR_MESSAGE);  
  }
						
}//ende try	  
					catch(Exception e) {
						JOptionPane.showMessageDialog(null,e);
					}
				}//end of first if statment
				else {
					JOptionPane.showMessageDialog(panel_1, "You must enter your username/password and select your role ", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}//to be deleted if error occured
                  }
		});
		btnSignIn.setBackground(new Color(255, 255, 255));
		
		
		
		panel = new JPanel();
		panel.setBounds(0, 5, 288, 443);
		contentPane.add(panel);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBackground(UIManager.getColor("Button.darkShadow"));
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(10, 11, 268, 421);
		panel.add(label);
		label.setIcon(new ImageIcon(Login.class.getResource("/DCIS/photo_2018-12-09_09-11-24.jpg")));
	}
}
