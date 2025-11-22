package DCIS;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class Prescriptions extends javax.swing.JFrame {
Connection con=ConnectionDB.ConnectDb();
PreparedStatement pst;
ResultSet rs;
    private String dentistName;
    private String dentistID;
    private String drugID;
    
    public Prescriptions() {
        
        initComponents();
       createMenuBar();
       customStyler();
        fillMRN();
        fillDname();
        fillDx();
      // comboDid.setSelectedItem(con); combodname.getSelectedItem().toString();
    }
   public final void fillDname(){
      try{  
          //con=DriverManager.getConnection("jdbc:mysql://localhost/dcis", "root", "");
        String sql="select drug_name from drug";
       pst=con.prepareStatement(sql);
       rs=pst.executeQuery();
       while(rs.next()){
           String item=rs.getString("drug_name");
           combodname.addItem(item);
       }
      }catch(SQLException e){
          JOptionPane.showMessageDialog(null,e);
      }
      catch(Exception e){
          JOptionPane.showMessageDialog(null,e);
      }
    } 
    public final void fillDx(){
      try{  
        
        String sql="SELECT * FROM diagnosis";
       pst=con.prepareStatement(sql);
      
       rs=pst.executeQuery();
       while(rs.next()){
           String item=rs.getString("Dignosis");
           combodx.addItem(item);
       }
      }catch(SQLException e){
          JOptionPane.showMessageDialog(null,e);
      }
      catch(Exception e){
          JOptionPane.showMessageDialog(null,e);
      }
    }
  
    public final void fillMRN(){
      try{  
        
        String sql="select * from patinet";
       pst=con.prepareStatement(sql);
       rs=pst.executeQuery();
       while(rs.next()){
           String item=rs.getString("MRN");
           comboMrn.addItem(item);
       }
      }catch(SQLException e){
          JOptionPane.showMessageDialog(null,e);
      }
      catch(Exception e){
          JOptionPane.showMessageDialog(null,e);
      }
    }
    public void customStyler(){
    //setTitle("Dental Clinic Information System");
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
			new ChangePassword(new Prescriptions(),true).setVisible(true);
						
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        panel_2 = new javax.swing.JPanel();
        user = new javax.swing.JButton();
        lblDenPhotoPr = new javax.swing.JLabel();
        panel_3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblDashboared = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        mrnAppt1 = new javax.swing.JLabel();
        comboMrn = new javax.swing.JComboBox<>();
        apptServ = new javax.swing.JLabel();
        apptServ1 = new javax.swing.JLabel();
        txtStrength = new javax.swing.JTextField();
        apptServ2 = new javax.swing.JLabel();
        apptServ3 = new javax.swing.JLabel();
        txtDosageForm = new javax.swing.JTextField();
        apptServ4 = new javax.swing.JLabel();
        apptServ5 = new javax.swing.JLabel();
        apptServ7 = new javax.swing.JLabel();
        txtDuration = new javax.swing.JTextField();
        apptServ8 = new javax.swing.JLabel();
        apptServ9 = new javax.swing.JLabel();
        txtFreq = new javax.swing.JTextField();
        apptServ10 = new javax.swing.JLabel();
        txtDose = new javax.swing.JTextField();
        apptServ11 = new javax.swing.JLabel();
        txtQuant = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtHwToUse = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtOtherInfo = new javax.swing.JTextArea();
        combodname = new javax.swing.JComboBox<>();
        combodx = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dental Clinic Information System");

        panel.setBackground(new java.awt.Color(153, 153, 153));

        panel_2.setBackground(new java.awt.Color(102, 102, 102));

        user.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        user.setText("Guest");
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        lblDenPhotoPr.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 153)));

        javax.swing.GroupLayout panel_2Layout = new javax.swing.GroupLayout(panel_2);
        panel_2.setLayout(panel_2Layout);
        panel_2Layout.setHorizontalGroup(
            panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDenPhotoPr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_2Layout.setVerticalGroup(
            panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblDenPhotoPr, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(311, Short.MAX_VALUE))
        );

        panel_3.setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        lblDashboared.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        lblDashboared.setForeground(new java.awt.Color(255, 255, 255));
        lblDashboared.setText("Prescriptions");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(373, 373, 373)
                .addComponent(lblDashboared)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDashboared, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Add Prescription", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mrnAppt1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mrnAppt1.setForeground(new java.awt.Color(255, 255, 255));
        mrnAppt1.setText("MRN");
        mrnAppt1.setToolTipText("");
        jPanel2.add(mrnAppt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 50, 30));

        comboMrn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        comboMrn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---select mrn---" }));
        comboMrn.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboMrnItemStateChanged(evt);
            }
        });
        jPanel2.add(comboMrn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 290, -1));

        apptServ.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        apptServ.setForeground(new java.awt.Color(255, 255, 255));
        apptServ.setText("Diagnosis");
        apptServ.setToolTipText("");
        jPanel2.add(apptServ, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 90, 30));

        apptServ1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        apptServ1.setForeground(new java.awt.Color(255, 255, 255));
        apptServ1.setText("Drug Name");
        apptServ1.setToolTipText("");
        jPanel2.add(apptServ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 110, 30));

        txtStrength.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(txtStrength, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 290, 30));

        apptServ2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        apptServ2.setForeground(new java.awt.Color(255, 255, 255));
        apptServ2.setText("Strength");
        apptServ2.setToolTipText("");
        jPanel2.add(apptServ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 90, 30));

        apptServ3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        apptServ3.setForeground(new java.awt.Color(255, 255, 255));
        apptServ3.setText("Dosage Form");
        apptServ3.setToolTipText("");
        jPanel2.add(apptServ3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 120, 30));

        txtDosageForm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(txtDosageForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 290, 30));

        apptServ4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        apptServ4.setForeground(new java.awt.Color(255, 255, 255));
        apptServ4.setText("How to use");
        apptServ4.setToolTipText("");
        jPanel2.add(apptServ4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 110, 30));

        apptServ5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        apptServ5.setForeground(new java.awt.Color(255, 255, 255));
        apptServ5.setText("other Info");
        apptServ5.setToolTipText("");
        jPanel2.add(apptServ5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 100, 30));

        apptServ7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        apptServ7.setForeground(new java.awt.Color(255, 255, 255));
        apptServ7.setText("Prescription Date");
        apptServ7.setToolTipText("");
        jPanel2.add(apptServ7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 160, 30));

        txtDuration.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(txtDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 290, 30));

        apptServ8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        apptServ8.setForeground(new java.awt.Color(255, 255, 255));
        apptServ8.setText("Duration");
        apptServ8.setToolTipText("");
        jPanel2.add(apptServ8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 80, 30));

        apptServ9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        apptServ9.setForeground(new java.awt.Color(255, 255, 255));
        apptServ9.setText("Frequency");
        apptServ9.setToolTipText("");
        jPanel2.add(apptServ9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 100, 30));

        txtFreq.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(txtFreq, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 290, 30));

        apptServ10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        apptServ10.setForeground(new java.awt.Color(255, 255, 255));
        apptServ10.setText("Dose");
        apptServ10.setToolTipText("");
        jPanel2.add(apptServ10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 50, 30));

        txtDose.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(txtDose, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 290, 30));

        apptServ11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        apptServ11.setForeground(new java.awt.Color(255, 255, 255));
        apptServ11.setText("Quantity");
        apptServ11.setToolTipText("");
        jPanel2.add(apptServ11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 80, 30));

        txtQuant.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(txtQuant, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 290, 30));

        jButton3.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DCIS/Icons/icons8-save-as-30.png"))); // NOI18N
        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 170, 60));

        jButton4.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DCIS/Icons/photo_2018-12-05_21-01-24.jpg"))); // NOI18N
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, 180, 60));

        jDateChooser1.setFont(new java.awt.Font("Tahoma", 0, 18));
        jPanel2.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 290, 30));

        txtHwToUse.setColumns(20);
        txtHwToUse.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtHwToUse.setRows(5);
        jScrollPane1.setViewportView(txtHwToUse);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 290, -1));

        txtOtherInfo.setColumns(20);
        txtOtherInfo.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtOtherInfo.setRows(5);
        jScrollPane2.setViewportView(txtOtherInfo);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, 290, -1));

        combodname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        combodname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Drug" }));
        jPanel2.add(combodname, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 290, 30));

        combodx.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        combodx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---select diagnosis---" }));
        jPanel2.add(combodx, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 290, 30));

        javax.swing.GroupLayout panel_3Layout = new javax.swing.GroupLayout(panel_3);
        panel_3.setLayout(panel_3Layout);
        panel_3Layout.setHorizontalGroup(
            panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_3Layout.createSequentialGroup()
                .addGroup(panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1025, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_3Layout.setVerticalGroup(
            panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DCIS/Icons/icons8-go-back-30.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Dentist_DB ddb=new Dentist_DB();
        ddb.lblDenPhoto.setIcon(lblDenPhotoPr.getIcon());
        ddb.setVisible(true);
        ddb.user.setText(user.getText());
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      boolean a=Validator.validatePrescription(txtDosageForm,txtHwToUse,txtDose,txtFreq,txtDuration,txtQuant,txtStrength,txtOtherInfo);
        if(a==true){
        addPrecriptions();
        }
        else{
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed
public String getDentist(){
 try{
    String sql="select Name from dentists where Username=?";
    pst=con.prepareStatement(sql);
    pst.setString(1,Login.usernameHandler);
    rs=pst.executeQuery();
    if(rs.next()){
      dentistName=rs.getString("Name");  
    }
    
    }
    catch(Exception e){
         JOptionPane.showMessageDialog(null,e); 
    }
 return dentistName; 
}
public String getDid(){
 try{
    String sql="select DentistID from dentists where Username=?";
    pst=con.prepareStatement(sql);
    pst.setString(1,Login.usernameHandler);
    rs=pst.executeQuery();
    if(rs.next()){
      dentistID=rs.getString("DentistID");  
    }
    
    }
    catch(Exception e){
         JOptionPane.showMessageDialog(null,e); 
    }
 return dentistID;
}
public String getDrugId(){
 try{
    String sql="select DrugID from drug where drug_name=?";
    pst=con.prepareStatement(sql);
    pst.setString(1,combodname.getSelectedItem().toString());
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
       dx_date=jDateChooser1.getDate().toString();
        }
        catch(NullPointerException e){
        JOptionPane.showMessageDialog(this,"Select prescription date.\n "+e,"Error",JOptionPane.ERROR_MESSAGE);
         a=false;
         
        }
return a;
}
public void addPrecriptions(){
        boolean b=checkdate();
          
         if (b==true){
        String g=getCurrentDate();
        DateFormat df=new SimpleDateFormat("YYYY-MM-dd");       
        String presc_date=df.format(jDateChooser1.getDate());
         
        if("---select mrn---".equals(comboMrn.getSelectedItem().toString())){
            JOptionPane.showMessageDialog(this,"You didn't choose patient. ","Error",JOptionPane.ERROR_MESSAGE);
        }
        else  if(!g.equals(presc_date)){
            JOptionPane.showMessageDialog(this,"Prescription date must be today.\n"
                    + "select the red marked date in date chooser. ","Error",JOptionPane.ERROR_MESSAGE);
        }
       else  if("Select Drug".equals(combodname.getSelectedItem().toString())){
            JOptionPane.showMessageDialog(this,"You didn't prescribe drug. ","Error",JOptionPane.ERROR_MESSAGE);
        }
      else  if("---select diagnosis---".equals(combodx.getSelectedItem().toString())){
            JOptionPane.showMessageDialog(this,"You didn't select diagnosis. ","Error",JOptionPane.ERROR_MESSAGE);
        }
      else  if(
              "".equals(txtDosageForm.getText()) || "".equals(txtFreq.getText())||
                    "".equals(txtDose.getText())|| "".equals(txtDuration.getText())||
                    "".equals(txtOtherInfo.getText())|| "".equals(txtQuant.getText())||
                    "".equals(txtStrength.getText())
              
              ){
            JOptionPane.showMessageDialog(this,"Fill all fields.\n NB: All fields are required.","Error",JOptionPane.ERROR_MESSAGE);
        }
       else{
              try{
      String mrn= comboMrn.getSelectedItem().toString();
       String prescriberName=getDentist();
       String did=getDid();
       String dx=combodx.getSelectedItem().toString(); 
       String drid=getDrugId();
       String drugname=combodname.getSelectedItem().toString();
       
       String dosageForm=txtDosageForm.getText();
       String how=txtHwToUse.getText();
       String dose=txtDose.getText();
       String feq=txtFreq.getText();
       String duration=txtDuration.getText();
       String quantity=txtQuant.getText();
       String strength=txtStrength.getText();
       String otherinfo=txtOtherInfo.getText();
       
       
String sql="insert into prescription(DrugID,MRN,PrescriberName,DentistID,Diagnosis,DrugName,PrescriptionDate,DosageForm,Dose,Frequency,Duration,Quantity,Strength,HowToUse,otherInfo)"
        + " values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";    
       pst=con.prepareStatement(sql);
       pst.setString(1,drid);
       pst.setString(2,mrn);
       pst.setString(3,prescriberName);
       pst.setString(4,did);
       pst.setString(5,dx);
       pst.setString(6,drugname);
       pst.setString(7,presc_date);
       pst.setString(8,dosageForm);
       pst.setString(9,dose);
       pst.setString(10,feq);
       pst.setString(11,duration);
       pst.setString(12,quantity);
       pst.setString(13,strength);
       pst.setString(14,how);
       pst.setString(15,otherinfo);
       pst.execute();
       JOptionPane.showMessageDialog(null,"Data Saved succesfully");
       clearFiled();
    }
  catch(MySQLIntegrityConstraintViolationException e){
         JOptionPane.showMessageDialog(null,"Please fill all fields\nError: "+e,"Eroor",JOptionPane.ERROR_MESSAGE); 
    }  
    catch(Exception e){
         JOptionPane.showMessageDialog(null,e); 
    }
    }
         }
}
private void clearFiled(){
        comboMrn.setSelectedItem("---select mrn---");
      combodx.setSelectedItem("---select diagnosis---"); 
       combodname.setSelectedItem("Select Drug");
       jDateChooser1.setDateFormatString("");
       txtDosageForm.setText("");
       txtHwToUse.setText("");
       txtDose.setText("");
       txtFreq.setText("");
       txtDuration.setText("");
       txtQuant.setText("");
       txtStrength.setText("");
       txtOtherInfo.setText("");
         
         
     }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       clearFiled();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void comboMrnItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboMrnItemStateChanged

    }//GEN-LAST:event_comboMrnItemStateChanged

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
            java.util.logging.Logger.getLogger(Prescriptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prescriptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prescriptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prescriptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prescriptions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apptServ;
    private javax.swing.JLabel apptServ1;
    private javax.swing.JLabel apptServ10;
    private javax.swing.JLabel apptServ11;
    private javax.swing.JLabel apptServ2;
    private javax.swing.JLabel apptServ3;
    private javax.swing.JLabel apptServ4;
    private javax.swing.JLabel apptServ5;
    private javax.swing.JLabel apptServ7;
    private javax.swing.JLabel apptServ8;
    private javax.swing.JLabel apptServ9;
    private javax.swing.JComboBox<String> comboMrn;
    private javax.swing.JComboBox<String> combodname;
    private javax.swing.JComboBox<String> combodx;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDashboared;
    public javax.swing.JLabel lblDenPhotoPr;
    private javax.swing.JLabel mrnAppt1;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel_2;
    public javax.swing.JPanel panel_3;
    private javax.swing.JTextField txtDosageForm;
    private javax.swing.JTextField txtDose;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtFreq;
    private javax.swing.JTextArea txtHwToUse;
    private javax.swing.JTextArea txtOtherInfo;
    private javax.swing.JTextField txtQuant;
    private javax.swing.JTextField txtStrength;
    public javax.swing.JButton user;
    // End of variables declaration//GEN-END:variables
}
