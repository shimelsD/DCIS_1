package DCIS;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

/**
 *
 * @author shime
 */
public class Diagnosis extends javax.swing.JFrame {
Connection con=ConnectionDB.ConnectDb();
PreparedStatement pst;
ResultSet rs;
private String dentistID;


    public Diagnosis() {
        initComponents();
        createMenuBar();
         fillMRN();
       customStyler();
    }
 
    public final void fillMRN(){
      try{  
          //con=DriverManager.getConnection("jdbc:mysql://localhost/dcis", "root", "");
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
			new ChangePassword(new Diagnosis(),true).setVisible(true);
						
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
"Developer\n \tShimels Derso(+251940219818/shime4d@gmail.com) ", "About",1,Appointments.imgic);}
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        panel_3 = new javax.swing.JPanel();
        user = new javax.swing.JButton();
        lblDenPhotoDx = new javax.swing.JLabel();
        panel_4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblDashboared = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        mrnAppt1 = new javax.swing.JLabel();
        comboMrn = new javax.swing.JComboBox<>();
        apptServ = new javax.swing.JLabel();
        apptServ1 = new javax.swing.JLabel();
        apptServ7 = new javax.swing.JLabel();
        apptServ3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtptcondtion = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtActivity = new javax.swing.JTextArea();
        apptServ2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtNurCare = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtInvestg = new javax.swing.JTextArea();
        apptServ5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtTreatments = new javax.swing.JTextArea();
        apptServ6 = new javax.swing.JLabel();
        apptServ8 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        spTemp = new javax.swing.JSpinner();
        apptServ10 = new javax.swing.JLabel();
        apptServ11 = new javax.swing.JLabel();
        spHR = new javax.swing.JSpinner(new SpinnerNumberModel(50,10 ,3000,1));
        spRR = new javax.swing.JSpinner(new SpinnerNumberModel(20,10 ,3000,1));
        apptServ4 = new javax.swing.JLabel();
        apptServ9 = new javax.swing.JLabel();
        txtBP = new javax.swing.JTextField();
        btnSavedx = new javax.swing.JButton();
        comboDx = new javax.swing.JComboBox<>();
        txtDiet = new javax.swing.JTextField();
        dxdate = new com.toedter.calendar.JDateChooser();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(153, 153, 153));

        panel_3.setBackground(new java.awt.Color(102, 102, 102));

        user.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        user.setText("Guest");
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        lblDenPhotoDx.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 153)));

        javax.swing.GroupLayout panel_3Layout = new javax.swing.GroupLayout(panel_3);
        panel_3.setLayout(panel_3Layout);
        panel_3Layout.setHorizontalGroup(
            panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_3Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDenPhotoDx, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        panel_3Layout.setVerticalGroup(
            panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_3Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(lblDenPhotoDx, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_4.setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        lblDashboared.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        lblDashboared.setForeground(new java.awt.Color(255, 255, 255));
        lblDashboared.setText("Diagnosis And Treatment");

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
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel2.setForeground(new java.awt.Color(0, 153, 102));
        jPanel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mrnAppt1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mrnAppt1.setForeground(new java.awt.Color(255, 255, 255));
        mrnAppt1.setText("MRN");
        mrnAppt1.setToolTipText("");
        jPanel2.add(mrnAppt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 50, 30));

        comboMrn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        comboMrn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---select mrn---" }));
        comboMrn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMrnActionPerformed(evt);
            }
        });
        jPanel2.add(comboMrn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 290, 30));

        apptServ.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        apptServ.setForeground(new java.awt.Color(255, 255, 255));
        apptServ.setText("Diet");
        apptServ.setToolTipText("");
        jPanel2.add(apptServ, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 80, 30));

        apptServ1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        apptServ1.setForeground(new java.awt.Color(255, 255, 255));
        apptServ1.setText("Pt Condition");
        apptServ1.setToolTipText("");
        jPanel2.add(apptServ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 110, 30));

        apptServ7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        apptServ7.setForeground(new java.awt.Color(255, 255, 255));
        apptServ7.setText("Diagnosis Date");
        apptServ7.setToolTipText("");
        jPanel2.add(apptServ7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 140, 30));

        apptServ3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        apptServ3.setForeground(new java.awt.Color(255, 255, 255));
        apptServ3.setText("Activity");
        apptServ3.setToolTipText("");
        jPanel2.add(apptServ3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 80, 30));

        txtptcondtion.setColumns(20);
        txtptcondtion.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtptcondtion.setRows(5);
        jScrollPane1.setViewportView(txtptcondtion);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 290, 80));

        txtActivity.setColumns(20);
        txtActivity.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtActivity.setRows(5);
        jScrollPane2.setViewportView(txtActivity);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 290, 80));

        apptServ2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        apptServ2.setForeground(new java.awt.Color(255, 255, 255));
        apptServ2.setText("Diagnosis");
        apptServ2.setToolTipText("");
        jPanel2.add(apptServ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 90, 30));

        txtNurCare.setColumns(20);
        txtNurCare.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtNurCare.setRows(5);
        jScrollPane3.setViewportView(txtNurCare);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 290, 80));

        txtInvestg.setColumns(20);
        txtInvestg.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtInvestg.setRows(5);
        jScrollPane4.setViewportView(txtInvestg);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 290, 80));

        apptServ5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        apptServ5.setForeground(new java.awt.Color(255, 255, 255));
        apptServ5.setText("Investigations");
        apptServ5.setToolTipText("");
        jPanel2.add(apptServ5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 130, 30));

        txtTreatments.setColumns(20);
        txtTreatments.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtTreatments.setRows(5);
        jScrollPane5.setViewportView(txtTreatments);

        jPanel2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, 290, 90));

        apptServ6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        apptServ6.setForeground(new java.awt.Color(255, 255, 255));
        apptServ6.setText("Treatments");
        apptServ6.setToolTipText("");
        jPanel2.add(apptServ6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 110, 30));

        apptServ8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        apptServ8.setForeground(new java.awt.Color(255, 255, 255));
        apptServ8.setText("Nursing care");
        apptServ8.setToolTipText("");
        jPanel2.add(apptServ8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 120, 30));

        btnClear.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DCIS/Icons/photo_2018-12-05_21-01-24.jpg"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel2.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, 150, 50));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Vital Sign", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        SpinnerNumberModel model = new SpinnerNumberModel(37.0,-1000.0 ,1000.0,0.1);
        spTemp = new javax.swing.JSpinner(model);
        spTemp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        apptServ10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        apptServ10.setForeground(new java.awt.Color(255, 255, 255));
        apptServ10.setText("Body teamprature(In Celcius)");
        apptServ10.setToolTipText("");

        apptServ11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        apptServ11.setForeground(new java.awt.Color(255, 255, 255));
        apptServ11.setText("Heart Rate(in bpm)");
        apptServ11.setToolTipText("");

        spHR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        spRR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        apptServ4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        apptServ4.setForeground(new java.awt.Color(255, 255, 255));
        apptServ4.setText("Respiratory Rate(in bpm)");
        apptServ4.setToolTipText("");

        apptServ9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        apptServ9.setForeground(new java.awt.Color(255, 255, 255));
        apptServ9.setText("Blood pressure(in mmHg)");
        apptServ9.setToolTipText("");

        txtBP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(apptServ4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apptServ11, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apptServ9))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(spHR, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                        .addComponent(spRR))
                    .addComponent(txtBP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(apptServ10, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(apptServ10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apptServ11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spHR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apptServ4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spRR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apptServ9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 450, 210));

        btnSavedx.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        btnSavedx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DCIS/Icons/icons8-save-as-30.png"))); // NOI18N
        btnSavedx.setText("Save");
        btnSavedx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavedxActionPerformed(evt);
            }
        });
        jPanel2.add(btnSavedx, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, 150, 50));

        comboDx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboDx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select Diagnosis---", "K001 - Disorder of tooth development and eruption", "K002 - Supernumerary teeth", "K003 - Dental disorder (Abnormalities of size and form of teeth)", "K004 - Dental disorder (fluorosis; Abnormalities of size and form of teeth)", "K005 - Disturbances in tooth formation", "K006 - Hereditary disturbances in tooth structure; not elsewhere classified", "K007 - Disturbances in tooth eruption", "K008 - other disorders of tooth development", "K009 - Dental disorder (disorders of tooth development, unspecified)", "K010 - Embedded and impacted teeth", "K011 - Dental disorder (impacted teeth)", "K012 - Dental caries (dental caries) ", "K013 - Dental caries (caries limited to enamel)", "K014 - Dental caries (caries of dentine)", "K015 - Dental caries (caries of cementum)", "K016 - Dental caries (Arrested dental caries)", "K017 - Other disorder of hard tissues of teeth", "K018 - Occupational erosion of teeth (excessive attrition of teeth)", "K019 -   Dental abrasion (abrasion of teeth)", "K020 -   Dental disorder (erosion of teeth)", "K021 -   Teeth resorption (pathological resorption of teeth) ", "K022 -  Hypercementosis", "K023 -  Ankylosis of teeth", "K024 - Dental disorder (deposits [accertions] on teeth)", "K025 -  postruptivecolour change of dental hard tissues", "K026  -  Other specified diseases of hard tissues of teeth", "K027 - Dental disorder (diseases of hard tissues of teeth, unspecified)", "K028 - Disease of pulp and periapical tissues", "K029 - pulpitis ", "K0 - 30 Pulp (Necrosis of pulp)", "K031 - Abnormal hard tissue formation of pulp", "K032 - Gingivitis (Acute plaque induced)", "K033 - Chronic apical periodontitis", "K034 - periapical abscess with sinus ", "K035 - Radicular cyst", "K036 - Other and unspecified disease of pulp and periapical tissues", "K037 - Gingivitis, periodontal (Gingivitis and periodontal disease)", "K038 - Acute Gingivitis", "K039 - Chronic Gingivitis", "K040 - Periodontitis (acute periodontitis)", "K041 - Periodontitis (chronic periodontitis)", "K042 - Periodontitis", "K043 - Periodontal (Periodontal disease, unspecified)", "K044 - Gingival recession", "K045 - Gingival enlargement", "K046 - Dentofacial anomalies [including malocclusion]", "K047 - Major anomalies of jaw size ", "K048 - Anomalies of dental arch relationship", "K049 - Anomalies of tooth position", "K050 - Malocclusion, unspecified", "K051 - Dentofacial functional abnormalities", "K052 - Joint disorders (Temporomandibular joint disorders)", "K053 - Other disorders of teeth and supporting structures", "K054 - Dental disorders (loose of teeth due to accident, extraction or local periodontal)", "K055 - Retained dental root", "K056 - Dental disorders (disorders of teeth and supporting structures, unspecified)", "K057 - Cyst (Other cysts of oral region, not elsewhere classified)", "K058 - Other diseases of jaws", "K059 - Dental disorder (fracture of tooth)", "K060 - Fracture of mandible", "K061 - Fracture (fracture of skull and facial bones, part unspecified)", "K062 - Dislocation, sprain and strain of joints and ligaments of head", "K063 - Dislocation of jaws", "K064 - Dental dis order (dislocation of tooth)", "K065 - Sprain and strain of jaw" }));
        jPanel2.add(comboDx, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 290, 30));

        txtDiet.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jPanel2.add(txtDiet, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, 290, 30));

        dxdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(dxdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 290, 30));

        javax.swing.GroupLayout panel_4Layout = new javax.swing.GroupLayout(panel_4);
        panel_4.setLayout(panel_4Layout);
        panel_4Layout.setHorizontalGroup(
            panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_4Layout.setVerticalGroup(
            panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
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

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 23, Short.MAX_VALUE)
                .addComponent(panel_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       Dentist_DB ddb=new Dentist_DB();
       ddb.lblDenPhoto.setIcon(lblDenPhotoDx.getIcon());
       ddb.setVisible(true);
       ddb.user.setText(user.getText());
       dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
    clearFiled();

    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSavedxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavedxActionPerformed
      boolean b=Validator.validateDx(txtptcondtion, txtActivity, txtNurCare, txtInvestg, txtDiet, txtTreatments, txtBP);
       if(b==true) {
           addDiagnosis();
       }
       else{
           
       }
    }//GEN-LAST:event_btnSavedxActionPerformed

    private void comboMrnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMrnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMrnActionPerformed

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
            java.util.logging.Logger.getLogger(Diagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Diagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Diagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Diagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Diagnosis().setVisible(true);
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
    private javax.swing.JLabel apptServ6;
    private javax.swing.JLabel apptServ7;
    private javax.swing.JLabel apptServ8;
    private javax.swing.JLabel apptServ9;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSavedx;
    private javax.swing.JComboBox<String> comboDx;
    private javax.swing.JComboBox<String> comboMrn;
    private com.toedter.calendar.JDateChooser dxdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblDashboared;
    public javax.swing.JLabel lblDenPhotoDx;
    private javax.swing.JLabel mrnAppt1;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel_3;
    public javax.swing.JPanel panel_4;
    private javax.swing.JSpinner spHR;
    private javax.swing.JSpinner spRR;
    private javax.swing.JSpinner spTemp;
    private javax.swing.JTextArea txtActivity;
    private javax.swing.JTextField txtBP;
    private javax.swing.JTextField txtDiet;
    private javax.swing.JTextArea txtInvestg;
    private javax.swing.JTextArea txtNurCare;
    private javax.swing.JTextArea txtTreatments;
    private javax.swing.JTextArea txtptcondtion;
    public javax.swing.JButton user;
    // End of variables declaration//GEN-END:variables
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
public boolean checkdate(){
     String dx_date;
     boolean a=true;
        try{    
       dx_date=dxdate.getDate().toString();
        }
        catch(NullPointerException e){
        JOptionPane.showMessageDialog(this,"Select diagnosis date.\n "+e,"Error",JOptionPane.ERROR_MESSAGE);
         a=false;
         
        }
return a;
}
public void addDiagnosis(){ 

          boolean b=checkdate();
          
         if (b==true){
        String g=getCurrentDate();
        DateFormat df=new SimpleDateFormat("YYYY-MM-dd");
        String dx_date=df.format(dxdate.getDate());
        if(!g.equals(dx_date)){
            JOptionPane.showMessageDialog(this,"Diagnosis date must be today.\n"
                    + "select the red marked date in date chooser. ","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if("---select mrn---".equals(comboMrn.getSelectedItem().toString())){
            JOptionPane.showMessageDialog(this,"You didn't select patient's MRN. ","Error",JOptionPane.ERROR_MESSAGE);
        }
       
        else if("---Select Diagnosis---".equals(comboDx.getSelectedItem().toString())){
            JOptionPane.showMessageDialog(this,"You didn't select diagnosis. ","Error",JOptionPane.ERROR_MESSAGE);
        }
      
       else{
              try{
       String mrn= comboMrn.getSelectedItem().toString();
       String did=getDid();
       String dx=comboDx.getSelectedItem().toString(); 
       //String dx_date=df.format(dxdate.getDate());
       String ptcondtion=txtptcondtion.getText();
       String Activity=txtActivity.getText();
       //vital signs
       String temp=spTemp.getValue().toString();
       String hrate=spHR.getValue().toString();
       String resprate=spRR.getValue().toString();
       String bloodpress=txtBP.getText();
       
       String diet=txtDiet.getText();
       String nurCare=txtNurCare.getText();
       String investg=txtInvestg.getText();
       String rx=txtTreatments.getText();
       
       
String sql="insert into Diagnosis(MRN,DentistID,Dignosis,DiagnosisDate,PtCondition,Activity,BodyTeamprature,HeartRate,RespiratoryRate,BloodPressure,Diet,NursingCare,Investigation,Treatments)"
        + " values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";    
       pst=con.prepareStatement(sql);
       pst.setString(1,mrn);
       pst.setString(2,did);
       pst.setString(3,dx);
       pst.setString(4,dx_date);
       pst.setString(5,ptcondtion);
       pst.setString(6,Activity);
       pst.setString(7,temp);
       pst.setString(8,hrate);
       pst.setString(9,resprate);
       pst.setString(10,bloodpress);
       pst.setString(11,diet);
       pst.setString(12,nurCare);
       pst.setString(13,investg);
       pst.setString(14,rx);
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
public String getCurrentDate(){
   Calendar cal = new GregorianCalendar();
   
  int month = cal.get(Calendar.MONTH);
  int year = cal.get(Calendar.YEAR);
  int day = cal.get(Calendar.DAY_OF_MONTH); 
  String s= year+"-0"+(month + 1)+"-"+day;
  return s;
    }
 private void clearFiled(){//spTemp spHR,spRR comboMrn txtptcondtion comboDx dxdate txtNurCare txtInvestg txtDiet txtActivity txtTreatments txtBP
        comboMrn.setSelectedItem("---select mrn---");
        txtptcondtion.setText(""); 
       comboDx.setSelectedItem("---Select Diagnosis---");
       dxdate.setDateFormatString("");
       txtNurCare.setText("");
       txtInvestg.setText("");
      txtDiet.setText("");
     txtActivity.setText("");
      txtTreatments.setText("");
      /*spTemp.setText("");
      spHR.setText("");
      spRR.setText("");*/
      txtBP.setText("");
         
         
     }
}
