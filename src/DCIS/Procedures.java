package DCIS;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.*;
import javax.swing.border.*;

/**
 *
 * @author shime
 */
public class Procedures extends javax.swing.JFrame {
Connection con=ConnectionDB.ConnectDb();
PreparedStatement pst=null;
ResultSet rs=null;
    /**
     * Creates new form Procedures
     */
    public Procedures() {
        initComponents();
        createMenuBar();
        customStyler();
        fillComboMRN();
        fillComboDentistID();
    }
    public void customStyler(){
    setIconImage(Toolkit.getDefaultToolkit().getImage(Admin_DB.class.getResource("/DCIS/photo_2018-12-09_15-04-39.jpg")));
    
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
			new ChangePassword(new Procedures(),true).setVisible(true);
						
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
		//menuBar.setForeground(new Color(0, 0, 0));
		//menuBar.setBackground(new Color(102, 102, 102));
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
    public void fillComboMRN(){
        try{
       // con=DriverManager.getConnection("jdbc:mysql://localhost/dcis","root","");
        String sql="select * from patinet";
        pst=con.prepareStatement(sql);
        rs=pst.executeQuery();
        while(rs.next()){
           String item= rs.getString("MRN");
           comboMRN.addItem(item);
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    
    }
      public void fillComboDentistID(){
        try{
       // con=DriverManager.getConnection("jdbc:mysql://localhost/dcis","root","");
        String sql="select * from dentists";
        pst=con.prepareStatement(sql);
        rs=pst.executeQuery();
        while(rs.next()){
           String item= rs.getString("DentistID");
           comboDentistID.addItem(item);
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
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

        jPanel1 = new javax.swing.JPanel();
        panel_2 = new javax.swing.JPanel();
        user = new javax.swing.JButton();
        lblNurPhotoProc = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtareaPostOpDx = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtareaProcedure = new javax.swing.JTextArea();
        comboDentistID = new javax.swing.JComboBox<>();
        btnClear = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        comboMRN = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtareaPreOpDx = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtareaFindings = new javax.swing.JTextArea();
        txtBloodLoss = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtFluidGiven = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtDrains = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnSaveProced = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtSpecimen = new javax.swing.JTextField();
        proceddate = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dental Clinic Iinformation System");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        panel_2.setBackground(new java.awt.Color(102, 102, 102));

        user.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        user.setText("Guest");
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        lblNurPhotoProc.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 153)));

        javax.swing.GroupLayout panel_2Layout = new javax.swing.GroupLayout(panel_2);
        panel_2.setLayout(panel_2Layout);
        panel_2Layout.setHorizontalGroup(
            panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNurPhotoProc, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        panel_2Layout.setVerticalGroup(
            panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(lblNurPhotoProc, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MRN");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dentist ID");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pre Operative Dx");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Post Oprrative Dx");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Findings");

        txtareaPostOpDx.setColumns(20);
        txtareaPostOpDx.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtareaPostOpDx.setRows(5);
        jScrollPane2.setViewportView(txtareaPostOpDx);

        txtareaProcedure.setColumns(20);
        txtareaProcedure.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtareaProcedure.setRows(5);
        jScrollPane3.setViewportView(txtareaProcedure);

        comboDentistID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboDentistID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---select DentistID---" }));
        comboDentistID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDentistIDActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DCIS/Icons/photo_2018-12-05_21-01-24.jpg"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Procedures done");

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Add Procedures");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(433, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(318, 318, 318))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        comboMRN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboMRN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---select MRN---" }));
        comboMRN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMRNActionPerformed(evt);
            }
        });

        txtareaPreOpDx.setColumns(20);
        txtareaPreOpDx.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtareaPreOpDx.setRows(5);
        jScrollPane4.setViewportView(txtareaPreOpDx);

        txtareaFindings.setColumns(20);
        txtareaFindings.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtareaFindings.setRows(5);
        jScrollPane5.setViewportView(txtareaFindings);

        txtBloodLoss.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Est. Blood loss");

        txtFluidGiven.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtFluidGiven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFluidGivenActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Fluid given");

        txtDrains.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Procedure date");

        btnSaveProced.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSaveProced.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DCIS/Icons/icons8-save-as-30.png"))); // NOI18N
        btnSaveProced.setText("Save");
        btnSaveProced.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveProcedActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Specimen");

        txtSpecimen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSpecimen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpecimenActionPerformed(evt);
            }
        });

        proceddate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Drains");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtBloodLoss, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboMRN, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDrains, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addComponent(proceddate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14)))
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                    .addComponent(comboDentistID, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2)
                    .addComponent(txtFluidGiven)
                    .addComponent(txtSpecimen))
                .addGap(45, 45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSaveProced, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnClear)
                .addGap(319, 319, 319))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboMRN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(comboDentistID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane3)
                                    .addComponent(jScrollPane5)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFluidGiven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtBloodLoss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDrains, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSpecimen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(proceddate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSaveProced, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );

        btnBack.setBackground(new java.awt.Color(102, 102, 102));
        btnBack.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DCIS/Icons/icons8-go-back-30.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        //logout
    }//GEN-LAST:event_userActionPerformed

    private void comboDentistIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDentistIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboDentistIDActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearField();
    }//GEN-LAST:event_btnClearActionPerformed

    private void comboMRNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMRNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMRNActionPerformed

    private void txtFluidGivenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFluidGivenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFluidGivenActionPerformed

public String getCurrentDate(){
   Calendar cal = new GregorianCalendar();
   
  int month = cal.get(Calendar.MONTH);
  int year = cal.get(Calendar.YEAR);
  int day = cal.get(Calendar.DAY_OF_MONTH); 
  String s= year+"-0"+(month + 1)+"-"+day;
  return s;
    }
public boolean checkdate(){
     boolean a=true;
     String var;
     try{
      var= proceddate.getDate().toString();
     }
     catch(NullPointerException e){
         JOptionPane.showMessageDialog(this,"Please select procedure date.\nError: "+e,"Error",JOptionPane.ERROR_MESSAGE);
         a=false;
     }
  return a;   
 }
    private void btnSaveProcedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveProcedActionPerformed
    //validate    
    boolean a=Validator.validateProcedure(txtareaPreOpDx,txtareaProcedure,txtBloodLoss,txtDrains,txtareaPostOpDx,txtareaFindings,txtFluidGiven,txtSpecimen);
           if(a==true){ 
        boolean b=checkdate();
       if(b==true){
        try{

            String mrn=(String) comboMRN.getSelectedItem();
            String dentistid=(String) comboDentistID.getSelectedItem();
            String prod=txtareaPreOpDx.getText();
            String psod=txtareaPostOpDx.getText();
            String proced=txtareaProcedure.getText();
            String findings=txtareaFindings.getText();
            String bloodloss=txtBloodLoss.getText();
            String fluidgiven=txtFluidGiven.getText();
            String drains=txtDrains.getText();
            String specimen=txtSpecimen.getText();
      
            String g=getCurrentDate();
        DateFormat df=new SimpleDateFormat("YYYY-MM-dd");       
        String procedureDate=df.format(proceddate.getDate());
            

            if("---select MRN---".equals(mrn)){
                JOptionPane.showMessageDialog(null,"Please select the MRN of a patient","Error",JOptionPane.ERROR_MESSAGE);
            
            }
            else if("---select DentistID---".equals(dentistid)){
              JOptionPane.showMessageDialog(null,"Please select the id  of a dentist who have done the procedure","Error",JOptionPane.ERROR_MESSAGE);
              
            }
            else if(!g.equals(procedureDate)){
            JOptionPane.showMessageDialog(this,"Procedure date must be today.\n"
                    + "select the red marked date in date chooser. ","Error",JOptionPane.ERROR_MESSAGE);
        }
            else if("".equals(txtareaPreOpDx.getText()) || "".equals(txtareaPostOpDx.getText())||
                    "".equals(txtareaProcedure.getText())|| "".equals(txtareaFindings.getText())||
                    "".equals(txtBloodLoss.getText())|| "".equals(txtFluidGiven.getText())||
                    "".equals(txtDrains.getText())||"".equals(txtSpecimen.getText())){
               JOptionPane.showMessageDialog(this,"Fill all fields!","Error",JOptionPane.ERROR_MESSAGE);
                
                
                
            }
            else{
                String sql="INSERT INTO procedures(MRN,DentistID,PreOpDX,PostOpDx,Procedures,Findings,EstimatedBloddLoss,FluidGiven,Drains,Specimen,procedureDate)"
                        + " VALUES(?,?,?,?,?,?,?,?,?,?,?)";
                pst=con.prepareStatement(sql);
                pst.setString(1, mrn);
                pst.setString(2, dentistid);
                pst.setString(3, prod);
                pst.setString(4, psod);
                pst.setString(5, proced);
                pst.setString(6,findings);
                pst.setString(7,bloodloss);
                pst.setString(8,fluidgiven);
                pst.setString(9,drains);
                pst.setString(10,specimen);
                pst.setString(11,procedureDate);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Procedure Saved Succesfully");
                clearField();

            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
       }
     }
           else{
           
       }  
    }//GEN-LAST:event_btnSaveProcedActionPerformed

    private void txtSpecimenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpecimenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSpecimenActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Nurse_DB ndb=new Nurse_DB();
         ndb.lblNurPhoto.setIcon(lblNurPhotoProc.getIcon());
         ndb.user.setText(user.getText());
         ndb.setVisible(true);
        this.dispose();
       
        
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(Procedures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Procedures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Procedures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Procedures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Procedures().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSaveProced;
    private javax.swing.JComboBox<String> comboDentistID;
    private javax.swing.JComboBox<String> comboMRN;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    public javax.swing.JLabel lblNurPhotoProc;
    private javax.swing.JPanel panel_2;
    private com.toedter.calendar.JDateChooser proceddate;
    private javax.swing.JTextField txtBloodLoss;
    private javax.swing.JTextField txtDrains;
    private javax.swing.JTextField txtFluidGiven;
    private javax.swing.JTextField txtSpecimen;
    private javax.swing.JTextArea txtareaFindings;
    private javax.swing.JTextArea txtareaPostOpDx;
    private javax.swing.JTextArea txtareaPreOpDx;
    private javax.swing.JTextArea txtareaProcedure;
    public javax.swing.JButton user;
    // End of variables declaration//GEN-END:variables
public void clearField(){
      comboMRN.setSelectedItem("---select MRN---");
      comboDentistID.setSelectedItem("---select DentistID---");
      txtareaPreOpDx.setText("");
      txtareaPostOpDx.setText("");
      txtareaProcedure.setText("");
      txtareaFindings.setText("");
      txtBloodLoss.setText("");
      txtFluidGiven.setText("");
      txtDrains.setText("");
      txtSpecimen.setText("");
      proceddate.setDateFormatString("");
}
}
