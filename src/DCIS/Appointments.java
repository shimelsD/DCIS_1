package DCIS;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import javax.swing.*;
import java.sql.*;
import java.text.*;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.border.*;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author shime
 */
public class Appointments extends javax.swing.JFrame {
 public static String patientMRN;
 public static ImageIcon imgic=new ImageIcon(Toolkit.getDefaultToolkit().getImage(Admin_DB.class.getResource("/DCIS/photo_2018-12-09_15-04-39.jpg")));;
    
Connection con=ConnectionDB.ConnectDb();
PreparedStatement pst;
ResultSet rs;


//imgic=Toolkit.getDefaultToolkit().getImage(Admin_DB.class.getResource("/DCIS/photo_2018-12-09_15-04-39.jpg"));
    /**
     * Creates new form Appointments
     */
    public Appointments() {
       
        initComponents();
        createMenuBar();
        customStyler();
        fillMRN();
        fillDid();
        viewTodayAppointments();
        getCurrentDate();
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
     public final void fillDid(){
      try{  
          //con=DriverManager.getConnection("jdbc:mysql://localhost/dcis", "root", "");
        String sql="select * from dentists";
       pst=con.prepareStatement(sql);
       rs=pst.executeQuery();
       while(rs.next()){
           String item=rs.getString("DentistID");
           comboDid.addItem(item);
       }
      }catch(SQLException e){
          JOptionPane.showMessageDialog(null,e);
      }
      catch(Exception e){
          JOptionPane.showMessageDialog(null,e);
      }
    }
 public final void customStyler(){
    setIconImage(Toolkit.getDefaultToolkit().getImage(Admin_DB.class.getResource("/DCIS/photo_2018-12-09_15-04-39.jpg")));
    setTitle("Dental Clinic Information System");
   
		JPopupMenu popupMenu = new JPopupMenu();
              
		addPopup(user, popupMenu);
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent arg0) {
			setVisible(false);
			new Login().setVisible(true);
						
			}
		});
               // btnLogout.setIcon(new ImageIcon(Admin_DB.class.getResource("/DCIS/logt.jpg")));
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 16));
		popupMenu.add(btnLogout);
                JButton changePw = new JButton("Change Password");
                changePw.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent arg0) {
			new ChangePassword(new Appointments(),true).setVisible(true);
						
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
        public final void createMenuBar(){
             
        
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
                        @Override
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
                        @Override
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

        panel = new javax.swing.JPanel();
        panel_2 = new javax.swing.JPanel();
        user = new javax.swing.JButton();
        lblNurPhotoAppt = new javax.swing.JLabel();
        panel_3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblDashboared = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        apptTime = new javax.swing.JLabel();
        comboDid = new javax.swing.JComboBox<>();
        comboMrn = new javax.swing.JComboBox<>();
        mrnAppt1 = new javax.swing.JLabel();
        didAppt1 = new javax.swing.JLabel();
        apptServ = new javax.swing.JLabel();
        Date date = new Date();
        /*SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
        Date formattedDate=sdf.format(date).toString();*/
        SpinnerDateModel sm = new SpinnerDateModel(date, null, null, Calendar.HOUR);
        ApptTimeVal = new javax.swing.JSpinner(sm);
        apptDate1 = new javax.swing.JLabel();
        txtApptService = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnSaveAppt = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTodayAppt = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblCurrentDate = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

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

        lblNurPhotoAppt.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 153)));

        javax.swing.GroupLayout panel_2Layout = new javax.swing.GroupLayout(panel_2);
        panel_2.setLayout(panel_2Layout);
        panel_2Layout.setHorizontalGroup(
            panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNurPhotoAppt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_2Layout.setVerticalGroup(
            panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(lblNurPhotoAppt, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_3.setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        lblDashboared.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        lblDashboared.setForeground(new java.awt.Color(255, 255, 255));
        lblDashboared.setText("Appointments");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(422, 422, 422)
                .addComponent(lblDashboared)
                .addContainerGap(477, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDashboared, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Book Appointment", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        apptTime.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        apptTime.setForeground(new java.awt.Color(255, 255, 255));
        apptTime.setText("Appointment Time");
        apptTime.setToolTipText("");
        jPanel2.add(apptTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 170, 30));

        comboDid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        comboDid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---select DentistID---" }));
        jPanel2.add(comboDid, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 280, -1));

        comboMrn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        comboMrn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---select mrn---" }));
        jPanel2.add(comboMrn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 280, -1));

        mrnAppt1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mrnAppt1.setForeground(new java.awt.Color(255, 255, 255));
        mrnAppt1.setText("MRN");
        mrnAppt1.setToolTipText("");
        jPanel2.add(mrnAppt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 50, -1));

        didAppt1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        didAppt1.setForeground(new java.awt.Color(255, 255, 255));
        didAppt1.setText("Dentist ID");
        didAppt1.setToolTipText("");
        jPanel2.add(didAppt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 100, 30));

        apptServ.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        apptServ.setForeground(new java.awt.Color(255, 255, 255));
        apptServ.setText("Appointment Service");
        apptServ.setToolTipText("");
        jPanel2.add(apptServ, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, 30));

        JSpinner.DateEditor de = new JSpinner.DateEditor(ApptTimeVal, "HH:mm:ss");
        ApptTimeVal.setEditor(de);
        ApptTimeVal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(ApptTimeVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 280, 30));

        apptDate1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        apptDate1.setForeground(new java.awt.Color(255, 255, 255));
        apptDate1.setText("Appointment Date");
        apptDate1.setToolTipText("");
        jPanel2.add(apptDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 170, 30));

        txtApptService.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(txtApptService, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 280, -1));

        btnClear.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel2.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 110, 50));

        btnSaveAppt.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        btnSaveAppt.setText("Save");
        btnSaveAppt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveApptActionPerformed(evt);
            }
        });
        jPanel2.add(btnSaveAppt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 110, 50));

        jDateChooser1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 280, 30));

        tblTodayAppt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Patient Name", "Appointment Time", "Appointment Service", "With Dentist"
            }
        ));
        tblTodayAppt.setName(""); // NOI18N
        jScrollPane1.setViewportView(tblTodayAppt);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Today's Appointments ");

        lblCurrentDate.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lblCurrentDate.setForeground(new java.awt.Color(255, 255, 255));
        lblCurrentDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(lblCurrentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCurrentDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        searchField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchField.setForeground(new java.awt.Color(102, 102, 102));
        searchField.setText("search appointments(enter mrn)");
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

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DCIS/Icons/photo_2018-12-05_20-42-47.jpg"))); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_3Layout = new javax.swing.GroupLayout(panel_3);
        panel_3.setLayout(panel_3Layout);
        panel_3Layout.setHorizontalGroup(
            panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel_3Layout.createSequentialGroup()
                                .addComponent(searchField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        panel_3Layout.setVerticalGroup(
            panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(searchField)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE))
                .addGap(22, 22, 22))
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
                    .addComponent(panel_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        //logout
    }//GEN-LAST:event_userActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Nurse_DB ndb=new Nurse_DB();
       ndb.lblNurPhoto.setIcon(lblNurPhotoAppt.getIcon());
       ndb.setVisible(true);
       ndb.user.setText(user.getText());
       dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
 public String getNewDate(){
     DateFormat df=new SimpleDateFormat("YYYY-MM-dd");
String d1=df.format(jDateChooser1.getDate());
String d2=getCurrentDate();
String [] a=d1.split("-",0);
String s="";
for (int i = 0; i < a.length; i++){
    
  s=s+a[i];
 }
return s;
 }
  public String getToday(){
String d2=getCurrentDate();
String [] a=d2.split("-",0);
String s="";
for (int i = 0; i < a.length; i++){
    
  s=s+a[i];
 }

return s;
 }
    private void btnSaveApptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveApptActionPerformed
 int newdate=Integer.valueOf(getNewDate());
 int today=Integer.valueOf(getToday());

if(newdate >= today){
      addAppointment();
}
else{
JOptionPane.showMessageDialog(this,"You choose past date.please select date next to today.","ERROR",JOptionPane.ERROR_MESSAGE);  
}
      
    }//GEN-LAST:event_btnSaveApptActionPerformed

    private void searchFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchFieldMouseClicked
       if("search appointments(enter mrn)".equals(searchField.getText())){
        searchField.setText("");
        searchField.setForeground(Color.gray);
        //[153,153,153]
       }
    }//GEN-LAST:event_searchFieldMouseClicked

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        if("search appointments(enter mrn)".equals(searchField.getText()) || searchField.getText().isEmpty()==true ) {
                    JOptionPane.showMessageDialog(null, "Enter Patient MRN to search. ", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else {   
        
        try{
            String sql="SELECT PatientMRN FROM viewtodayappointments WHERE PatientMRN=?";  
            pst=con.prepareStatement(sql);
            pst.setString(1,searchField.getText());
            rs=pst.executeQuery();
           if(rs.next()){
             patientMRN=searchField.getText();
                   // JOptionPane.showMessageDialog(null,patientMRN);
                   AllApointments frm = new AllApointments(new Appointments(),true);
                   frm.setVisible(true); 
                   
                   searchField.setText("search appointments(enter mrn)");
               
               
           }
           else{
             JOptionPane.showMessageDialog(null,"Appointment record not found.Please try again with correct MRN.","Error", JOptionPane.ERROR_MESSAGE);   
              searchField.grabFocus();
           }
           }catch(Exception e){
               JOptionPane.showMessageDialog(null,e);
           }   
        }
              
              
              /*  if("search appointments(enter mrn)".equals(searchField.getText()) || searchField.getText().isEmpty()==true ) {
                    JOptionPane.showMessageDialog(null, "Enter search criteria", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else {
                   patientMRN=searchField.getText();
                   // JOptionPane.showMessageDialog(null,patientMRN);
                   new AllApointments().setVisible(true);
                   searchField.setText("search appointments(enter mrn)");
                    }*/
           
            
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
 
      clear();  
    }//GEN-LAST:event_btnClearActionPerformed
public void clear(){
         comboMrn.setSelectedItem("---select mrn---");
        comboDid.setSelectedItem("---select DentistID---");
        jDateChooser1.setDateFormatString("");
        
        txtApptService.setText("");  
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Appointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    //</editor-fold>
    
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Appointments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner ApptTimeVal;
    private javax.swing.JLabel apptDate1;
    private javax.swing.JLabel apptServ;
    private javax.swing.JLabel apptTime;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSaveAppt;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> comboDid;
    private javax.swing.JComboBox<String> comboMrn;
    private javax.swing.JLabel didAppt1;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCurrentDate;
    private javax.swing.JLabel lblDashboared;
    public javax.swing.JLabel lblNurPhotoAppt;
    private javax.swing.JLabel mrnAppt1;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel_2;
    public javax.swing.JPanel panel_3;
    private javax.swing.JTextField searchField;
    private javax.swing.JTable tblTodayAppt;
    private javax.swing.JTextField txtApptService;
    public javax.swing.JButton user;
    // End of variables declaration//GEN-END:variables
 public boolean checkdate(){
     boolean a=true;
     String var;
     try{
      var= jDateChooser1.getDate().toString();
     }
     catch(NullPointerException e){
         JOptionPane.showMessageDialog(this,"Please select appointment date.\nError: "+e,"Error",JOptionPane.ERROR_MESSAGE);
         a=false;
     }
  return a;   
 }
    public void addAppointment(){
        Pattern p2=Pattern.compile("[0-9@*<>/,&!%$?#]");
        Matcher m1=p2.matcher(txtApptService.getText());
        
       boolean b=checkdate();
       if(b==true){
        
        DateFormat df=new SimpleDateFormat("YYYY-MM-dd"); 
        DateFormat tf=new SimpleDateFormat("HH:mm:ss"); 
       String mrn=comboMrn.getSelectedItem().toString();
       String did=comboDid.getSelectedItem().toString();
       String time= tf.format(ApptTimeVal.getValue());
       String date=df.format(jDateChooser1.getDate());      
       String apptService=txtApptService.getText();
        if("---select mrn---".equals(comboMrn.getSelectedItem().toString())){
            JOptionPane.showMessageDialog(this,"You didn't select patient's MRN. ","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if("---select DentistID---".equals(comboDid.getSelectedItem().toString())){
            JOptionPane.showMessageDialog(this,"You didn't select dentist. ","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if("".equals(txtApptService.getText())){
            JOptionPane.showMessageDialog(this,"Please fill appointment service.","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(m1.find()){
            JOptionPane.showMessageDialog(this,"Invalid input.\n NB: Numbers and special characters not allowed in appointment service field.","Error",JOptionPane.ERROR_MESSAGE);
            txtApptService.grabFocus();
        }
        else{
       try{
           String sql="INSERT INTO appointment(MRN,DentistID,AppointmentDate,AppointmentTime,AppointmentService) VALUES(?,?,?,?,?)";
           pst=con.prepareStatement(sql);
           pst.setString(1,mrn);
           pst.setString(2, did);
           pst.setString(3,date);
           pst.setString(4, time);
           pst.setString(5, apptService);
           pst.execute();
           JOptionPane.showMessageDialog(null,"Appointment saved succesfully");
           viewTodayAppointments();
           clear();  
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
  if(0==lblCurrentDate.getText().length()){
  lblCurrentDate.setText("Date: "+day+"/"+(month + 1)+"/"+year);
  }
  return s;
    }
 public void viewTodayAppointments(){
     //tblTodayAppt
    try{
   String today=getCurrentDate();     
 String sql="SELECT * FROM viewtodayappointments where AppointmentDate=? ORDER BY AppointmentTime";
 pst=con.prepareStatement(sql); 
pst.setString(1,today);
 rs=pst.executeQuery();
 tblTodayAppt.setModel(DbUtils.resultSetToTableModel(rs));
}
 catch(Exception e){
     JOptionPane.showMessageDialog(null,e);
 }
 }
}//end of class