package DCIS;

import java.awt.*;
import java.awt.Toolkit;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author shime
 */
public class ManageUser extends JFrame {
    Connection con=ConnectionDB.ConnectDb();
    PreparedStatement pst;
    ResultSet rs;
    String s,n,p;
 
public ManageUser() {
      //  createConnection();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(ManageUser.class.getResource("/DCIS/photo_2018-12-09_15-04-39.jpg")));
        initComponents();
        createMenuBar();

       // customizePanel();
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
			new ChangePassword(new ManageUser(),true).setVisible(true);

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
public void customizePanel(){

		contentPane.setBackground(UIManager.getColor("ComboBox.buttonDarkShadow"));
		//contentPane.add(panel, BorderLayout.CENTER);
		//new Resizer().resizePanel_2(panel, panel_2);
		//contentPane.setLayout(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPane = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        panel_2 = new javax.swing.JPanel();
        user = new javax.swing.JButton();
        lblProfPic = new javax.swing.JLabel();
        panel3 = new javax.swing.JPanel();
        tabDentist = new javax.swing.JTabbedPane();
        dentistTab3 = new javax.swing.JDesktopPane();
        jPanel10 = new javax.swing.JPanel();
        btnUpdate3 = new javax.swing.JButton();
        btnDelete3 = new javax.swing.JButton();
        btnAdd3 = new javax.swing.JButton();
        btnClear3 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        searchField = new javax.swing.JTextField();
        btnSearch3 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtQualification = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtDid = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblNameError = new javax.swing.JLabel();
        lblAgeError = new javax.swing.JLabel();
        lblContactError = new javax.swing.JLabel();
        lblUsernameError = new javax.swing.JLabel();
        lblDidError = new javax.swing.JLabel();
        lblPasswordError = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel39 = new javax.swing.JLabel();
        txtPhoto = new javax.swing.JTextField();
        btnUpload = new javax.swing.JButton();
        dentistTab1 = new javax.swing.JDesktopPane();
        jPanel4 = new javax.swing.JPanel();
        btnUpdate1 = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        btnAdd1 = new javax.swing.JButton();
        btnClear1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        searchField1 = new javax.swing.JTextField();
        btnSearch1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtQualification1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtAge1 = new javax.swing.JTextField();
        txtAddress1 = new javax.swing.JTextField();
        txtName1 = new javax.swing.JTextField();
        txtDid1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtContact1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtUsername1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtPassword1 = new javax.swing.JPasswordField();
        jLabel40 = new javax.swing.JLabel();
        txtPhotoNur = new javax.swing.JTextField();
        btnUploadNur = new javax.swing.JButton();
        nurPasswordErr = new javax.swing.JLabel();
        nurUsernameErr = new javax.swing.JLabel();
        nurContactErr = new javax.swing.JLabel();
        nurAgeErr = new javax.swing.JLabel();
        nurNameErr = new javax.swing.JLabel();
        nurNidErr = new javax.swing.JLabel();
        comGen = new javax.swing.JComboBox<>();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        jPanel7 = new javax.swing.JPanel();
        btnUpdate2 = new javax.swing.JButton();
        btnDelete2 = new javax.swing.JButton();
        btnAdd2 = new javax.swing.JButton();
        btnClear2 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        searchField2 = new javax.swing.JTextField();
        btnSearch2 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtQualification2 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtAge2 = new javax.swing.JTextField();
        txtAddress2 = new javax.swing.JTextField();
        txtName2 = new javax.swing.JTextField();
        txtDid2 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtContact2 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtUsername2 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtPassword2 = new javax.swing.JPasswordField();
        jLabel41 = new javax.swing.JLabel();
        txtPhPhoto = new javax.swing.JTextField();
        btnUploadPh = new javax.swing.JButton();
        phPidErr = new javax.swing.JLabel();
        phNameErr = new javax.swing.JLabel();
        phAgeErr = new javax.swing.JLabel();
        phContactErr = new javax.swing.JLabel();
        phUsernameErr = new javax.swing.JLabel();
        phPasswordErr = new javax.swing.JLabel();
        comboGen = new javax.swing.JComboBox<>();
        viewUserTab = new javax.swing.JDesktopPane();
        btnRefresh = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        searchField3 = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtResetUname = new javax.swing.JTextField();
        usernResetErr = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dental Clinical Information System");

        contentPane.setBackground(new java.awt.Color(153, 153, 153));
        contentPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        contentPane.setInheritsPopupMenu(true);

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

        panel_2.setBackground(new java.awt.Color(102, 102, 102));

        user.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        user.setText("Guest");
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        lblProfPic.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 153)));

        javax.swing.GroupLayout panel_2Layout = new javax.swing.GroupLayout(panel_2);
        panel_2.setLayout(panel_2Layout);
        panel_2Layout.setHorizontalGroup(
            panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addGroup(panel_2Layout.createSequentialGroup()
                        .addComponent(lblProfPic, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_2Layout.setVerticalGroup(
            panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(lblProfPic, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel3.setBackground(new java.awt.Color(102, 102, 102));
        panel3.setFocusable(false);
        panel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tabDentist.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        dentistTab3.setBackground(new java.awt.Color(204, 204, 204));

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnUpdate3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DCIS/Icons/icons8-update.png"))); // NOI18N
        btnUpdate3.setText("UPDATE");
        btnUpdate3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate3ActionPerformed(evt);
            }
        });

        btnDelete3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DCIS/Icons/icons8-cancel-48.png"))); // NOI18N
        btnDelete3.setText("DELETE");
        btnDelete3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete3ActionPerformed(evt);
            }
        });

        btnAdd3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DCIS/Icons/icons8-plus-48.png"))); // NOI18N
        btnAdd3.setText("ADD");
        btnAdd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd3ActionPerformed(evt);
            }
        });

        btnClear3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DCIS/Icons/photo_2018-12-05_21-01-24.jpg"))); // NOI18N
        btnClear3.setText("CLEAR");
        btnClear3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(btnClear3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdd3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(btnAdd3)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnDelete3)
                .addGap(32, 32, 32)
                .addComponent(btnClear3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Search Dentist ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 0, 14))); // NOI18N

        searchField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchField.setForeground(new java.awt.Color(153, 153, 153));
        searchField.setText("search here...");
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

        btnSearch3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DCIS/Icons/photo_2018-12-05_20-42-47.jpg"))); // NOI18N
        btnSearch3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchField, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchField)
                    .addComponent(btnSearch3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel30.setText("Address");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel31.setText("Dentist ID");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel32.setText("Qualification");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel33.setText("Age");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel34.setText("Name");

        txtQualification.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtQualification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQualificationActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel35.setText("Gender");

        txtAge.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAgeMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtAgeMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtAgeMouseReleased(evt);
            }
        });
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAgeKeyTyped(evt);
            }
        });

        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        txtName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNameMouseClicked(evt);
            }
        });
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        txtDid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDidMouseClicked(evt);
            }
        });
        txtDid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDidActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel36.setText("Contact");

        txtContact.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtContact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContactMouseClicked(evt);
            }
        });
        txtContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel37.setText("Password");

        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsernameMouseClicked(evt);
            }
        });
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel38.setText("Username");

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPasswordMouseClicked(evt);
            }
        });

        lblNameError.setForeground(new java.awt.Color(255, 0, 0));

        lblAgeError.setForeground(new java.awt.Color(255, 0, 0));

        lblContactError.setForeground(new java.awt.Color(255, 0, 0));

        lblUsernameError.setForeground(new java.awt.Color(255, 0, 0));

        lblDidError.setForeground(new java.awt.Color(255, 0, 0));

        lblPasswordError.setForeground(new java.awt.Color(255, 0, 0));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---select gender---", "Male", "Female" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel39.setText("Photo");

        txtPhoto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPhoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPhotoMouseClicked(evt);
            }
        });
        txtPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhotoActionPerformed(evt);
            }
        });

        btnUpload.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUpload.setText("Upload");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtContact)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBox1, 0, 226, Short.MAX_VALUE)
                                            .addComponent(txtQualification))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtAge, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblAgeError, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lblContactError, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUsername)
                                    .addComponent(txtPassword)))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(lblDidError, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUsernameError, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPasswordError, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                        .addComponent(txtPhoto)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDid, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDidError, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(jLabel33)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAgeError, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQualification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblContactError, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsernameError, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(lblPasswordError, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(btnUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        dentistTab3.setLayer(jPanel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dentistTab3.setLayer(jPanel11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dentistTab3Layout = new javax.swing.GroupLayout(dentistTab3);
        dentistTab3.setLayout(dentistTab3Layout);
        dentistTab3Layout.setHorizontalGroup(
            dentistTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dentistTab3Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );
        dentistTab3Layout.setVerticalGroup(
            dentistTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabDentist.addTab("Dentists", null, dentistTab3, "");

        dentistTab1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnUpdate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DCIS/Icons/icons8-update.png"))); // NOI18N
        btnUpdate1.setText("UPDATE");
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });

        btnDelete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DCIS/Icons/icons8-cancel-48.png"))); // NOI18N
        btnDelete1.setText("DELETE");
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });

        btnAdd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DCIS/Icons/icons8-plus-48.png"))); // NOI18N
        btnAdd1.setText("ADD");
        btnAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd1ActionPerformed(evt);
            }
        });

        btnClear1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DCIS/Icons/photo_2018-12-05_21-01-24.jpg"))); // NOI18N
        btnClear1.setText("CLEAR");
        btnClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(btnClear1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdd1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(btnAdd1)
                .addGap(25, 25, 25)
                .addComponent(btnUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnDelete1)
                .addGap(32, 32, 32)
                .addComponent(btnClear1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Search Nurse ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 0, 14))); // NOI18N

        searchField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchField1.setForeground(new java.awt.Color(153, 153, 153));
        searchField1.setText("search here...");
        searchField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchField1MouseClicked(evt);
            }
        });
        searchField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchField1ActionPerformed(evt);
            }
        });

        btnSearch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DCIS/Icons/photo_2018-12-05_20-42-47.jpg"))); // NOI18N
        btnSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchField1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Address");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Nurse ID");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Qualification");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Age");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Name");

        txtQualification1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtQualification1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQualification1ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Gender");

        txtAge1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAge1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAge1MouseClicked(evt);
            }
        });
        txtAge1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAge1ActionPerformed(evt);
            }
        });

        txtAddress1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAddress1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddress1ActionPerformed(evt);
            }
        });

        txtName1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtName1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtName1MouseClicked(evt);
            }
        });
        txtName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtName1ActionPerformed(evt);
            }
        });

        txtDid1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDid1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDid1MouseClicked(evt);
            }
        });
        txtDid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDid1ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Contact");

        txtContact1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtContact1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContact1MouseClicked(evt);
            }
        });
        txtContact1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContact1ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Password");

        txtUsername1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUsername1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsername1MouseClicked(evt);
            }
        });
        txtUsername1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsername1ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Username");

        txtPassword1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPassword1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPassword1MouseClicked(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel40.setText("Photo");

        txtPhotoNur.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPhotoNur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPhotoNurMouseClicked(evt);
            }
        });
        txtPhotoNur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhotoNurActionPerformed(evt);
            }
        });

        btnUploadNur.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUploadNur.setText("Upload");
        btnUploadNur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadNurActionPerformed(evt);
            }
        });

        nurPasswordErr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nurPasswordErr.setForeground(new java.awt.Color(255, 0, 0));

        nurUsernameErr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nurUsernameErr.setForeground(new java.awt.Color(255, 0, 0));

        nurContactErr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nurContactErr.setForeground(new java.awt.Color(255, 0, 0));

        nurAgeErr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nurAgeErr.setForeground(new java.awt.Color(255, 0, 0));

        nurNameErr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nurNameErr.setForeground(new java.awt.Color(255, 0, 0));

        nurNidErr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nurNidErr.setForeground(new java.awt.Color(255, 0, 0));

        comGen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comGen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---select gender---", "Male", "Female" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQualification1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(txtPhotoNur)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUploadNur))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(nurContactErr, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(79, 79, 79))
                                    .addComponent(txtContact1)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUsername1)
                                    .addComponent(txtPassword1)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nurPasswordErr, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nurUsernameErr, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comGen, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nurAgeErr, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAge1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                                    .addComponent(txtAddress1)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDid1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nurNameErr, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nurNidErr, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(20, 20, 20))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDid1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nurNidErr, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nurNameErr, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtAge1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(comGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nurAgeErr, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQualification1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContact1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nurContactErr, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nurUsernameErr, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nurPasswordErr, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(txtPhotoNur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUploadNur, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        dentistTab1.setLayer(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dentistTab1.setLayer(jPanel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dentistTab1Layout = new javax.swing.GroupLayout(dentistTab1);
        dentistTab1.setLayout(dentistTab1Layout);
        dentistTab1Layout.setHorizontalGroup(
            dentistTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dentistTab1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dentistTab1Layout.setVerticalGroup(
            dentistTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabDentist.addTab("Nurses", dentistTab1);

        jDesktopPane3.setBackground(new java.awt.Color(204, 204, 204));

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnUpdate2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DCIS/Icons/icons8-update.png"))); // NOI18N
        btnUpdate2.setText("UPDATE");
        btnUpdate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate2ActionPerformed(evt);
            }
        });

        btnDelete2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DCIS/Icons/icons8-cancel-48.png"))); // NOI18N
        btnDelete2.setText("DELETE");
        btnDelete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete2ActionPerformed(evt);
            }
        });

        btnAdd2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DCIS/Icons/icons8-plus-48.png"))); // NOI18N
        btnAdd2.setText("ADD");
        btnAdd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd2ActionPerformed(evt);
            }
        });

        btnClear2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DCIS/Icons/photo_2018-12-05_21-01-24.jpg"))); // NOI18N
        btnClear2.setText("CLEAR");
        btnClear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(btnClear2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdd2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(btnAdd2)
                .addGap(25, 25, 25)
                .addComponent(btnUpdate2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnDelete2)
                .addGap(32, 32, 32)
                .addComponent(btnClear2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Search Pharmacist ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 0, 14))); // NOI18N

        searchField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchField2.setForeground(new java.awt.Color(153, 153, 153));
        searchField2.setText("search here...");
        searchField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchField2MouseClicked(evt);
            }
        });
        searchField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchField2ActionPerformed(evt);
            }
        });

        btnSearch2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DCIS/Icons/photo_2018-12-05_20-42-47.jpg"))); // NOI18N
        btnSearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchField2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Address");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("Pharmacist ID");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("Qualification");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("Age");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setText("Name");

        txtQualification2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtQualification2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQualification2ActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setText("Gender");

        txtAge2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAge2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAge2MouseClicked(evt);
            }
        });
        txtAge2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAge2ActionPerformed(evt);
            }
        });

        txtAddress2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAddress2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddress2ActionPerformed(evt);
            }
        });

        txtName2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtName2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtName2MouseClicked(evt);
            }
        });
        txtName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtName2ActionPerformed(evt);
            }
        });

        txtDid2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDid2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDid2MouseClicked(evt);
            }
        });
        txtDid2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDid2ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setText("Contact");

        txtContact2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtContact2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContact2MouseClicked(evt);
            }
        });
        txtContact2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContact2ActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setText("Password");

        txtUsername2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUsername2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsername2MouseClicked(evt);
            }
        });
        txtUsername2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsername2ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setText("Username");

        txtPassword2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPassword2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPassword2MouseClicked(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel41.setText("Photo");

        txtPhPhoto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPhPhoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPhPhotoMouseClicked(evt);
            }
        });
        txtPhPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhPhotoActionPerformed(evt);
            }
        });

        btnUploadPh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUploadPh.setText("Upload");
        btnUploadPh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadPhActionPerformed(evt);
            }
        });

        phPidErr.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        phPidErr.setForeground(new java.awt.Color(255, 0, 0));

        phNameErr.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        phNameErr.setForeground(new java.awt.Color(255, 0, 0));

        phAgeErr.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        phAgeErr.setForeground(new java.awt.Color(255, 0, 0));

        phContactErr.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        phContactErr.setForeground(new java.awt.Color(255, 0, 0));

        phUsernameErr.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        phUsernameErr.setForeground(new java.awt.Color(255, 0, 0));

        phPasswordErr.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        phPasswordErr.setForeground(new java.awt.Color(255, 0, 0));

        comboGen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboGen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---select gender---", "Male", "Female" }));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(comboGen, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(355, 355, 355))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(phNameErr, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                                        .addGap(332, 332, 332)
                                                        .addComponent(phAgeErr, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addComponent(phPidErr, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                                        .addComponent(txtQualification2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(txtDid2, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(txtName2, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                                    .addGap(338, 338, 338)
                                                    .addComponent(txtAge2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(52, 52, 52)
                                        .addComponent(txtContact2, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(60, 60, 60)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(txtPhPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnUploadPh, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(phPasswordErr, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(phContactErr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                                                .addComponent(phUsernameErr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtPassword2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
                                                .addComponent(txtUsername2, javax.swing.GroupLayout.Alignment.LEADING)))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDid2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phPidErr, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phNameErr, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtAge2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(comboGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(phAgeErr, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQualification2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContact2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phContactErr, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(phUsernameErr, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phPasswordErr, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(txtPhPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUploadPh, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        jDesktopPane3.setLayer(jPanel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jPanel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane3Layout = new javax.swing.GroupLayout(jDesktopPane3);
        jDesktopPane3.setLayout(jDesktopPane3Layout);
        jDesktopPane3Layout.setHorizontalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane3Layout.setVerticalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabDentist.addTab("Pharmacists", jDesktopPane3);

        viewUserTab.setBackground(new java.awt.Color(204, 204, 204));

        btnRefresh.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DCIS/Icons/icons8-update-30.png"))); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Username", "Name", "Gender", "Age", "Qualification", "Address", "Contact", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        searchField3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchField3.setForeground(new java.awt.Color(153, 153, 153));
        searchField3.setText("search users(enter Full_name)");
        searchField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchField3MouseClicked(evt);
            }
        });
        searchField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchField3ActionPerformed(evt);
            }
        });

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DCIS/Icons/photo_2018-12-05_20-42-47.jpg"))); // NOI18N
        btnSearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        viewUserTab.setLayer(btnRefresh, javax.swing.JLayeredPane.DEFAULT_LAYER);
        viewUserTab.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        viewUserTab.setLayer(searchField3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        viewUserTab.setLayer(btnSearch, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout viewUserTabLayout = new javax.swing.GroupLayout(viewUserTab);
        viewUserTab.setLayout(viewUserTabLayout);
        viewUserTabLayout.setHorizontalGroup(
            viewUserTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewUserTabLayout.createSequentialGroup()
                .addGroup(viewUserTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewUserTabLayout.createSequentialGroup()
                        .addGap(0, 563, Short.MAX_VALUE)
                        .addComponent(searchField3, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        viewUserTabLayout.setVerticalGroup(
            viewUserTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewUserTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewUserTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchField3)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE))
        );

        tabDentist.addTab("View Users", viewUserTab);

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel1.setText("Reset Password");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Username");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("RESET");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtResetUname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtResetUname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtResetUnameMouseClicked(evt);
            }
        });
        txtResetUname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResetUnameActionPerformed(evt);
            }
        });

        usernResetErr.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernResetErr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtResetUname, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE))))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtResetUname, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usernResetErr, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabDentist.addTab("Reset User Password", jDesktopPane1);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Manage Users");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addContainerGap(302, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(531, 531, 531))
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabDentist, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabDentist)
                .addContainerGap())
        );

        tabDentist.getAccessibleContext().setAccessibleName("Dentists");

        javax.swing.GroupLayout contentPaneLayout = new javax.swing.GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        //logout
    }//GEN-LAST:event_userActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       Admin_DB adm=new Admin_DB();
         adm.setVisible(true);
         adm.user.setText(user.getText());
         adm.lblPhoto.setIcon(lblProfPic.getIcon());
         
         dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if("search users(enter Full_name)".equals(searchField3.getText()) || searchField3.getText().isEmpty()==true ) {
            JOptionPane.showMessageDialog(null, "Enter user's full name  to search. ", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else {

            try{
                boolean varb=checkuser(searchField3.getText());
                if(varb==true){
                    String sql="SELECT * FROM allusers WHERE Full_Name=?";
                    pst=con.prepareStatement(sql);
                    pst.setString(1,searchField3.getText());
                    rs=pst.executeQuery();

                    //JOptionPane.showMessageDialog(null,varb);

                    table.setModel(DbUtils.resultSetToTableModel(rs));
                    searchField3.setText("search users(enter Full_name)");
                }
                if(varb==false){

                    JOptionPane.showMessageDialog(null,"User not found.\nRetry with correct full name.","Sorry!", JOptionPane.INFORMATION_MESSAGE);
                    searchField3.grabFocus();
                    refreshData();
                }

            }

            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void searchField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchField3ActionPerformed

    private void searchField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchField3MouseClicked
        if("search users(enter Full_name)".equals(searchField3.getText())){
            searchField3.setText("");
        }
    }//GEN-LAST:event_searchField3MouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

        //get selected row

        try{

            int row= table.getSelectedRow();
            String table_click= table.getModel().getValueAt(row, 1).toString();
            String sql= "SELECT  allUsers.*,useraccount.ImagePath FROM allUsers,useraccount WHERE useraccount.ID=allUsers.ID AND  allUsers.username= '" + table_click + "'";
            pst=con.prepareStatement(sql);
            rs=  pst.executeQuery();
            if(rs.next()){

                String add1=rs.getString("role");
                if("Dentist".equals(add1)){
                    txtName.setText(rs.getString("Full_Name"));
                    txtDid.setText(rs.getString("ID"));
                    jComboBox1.setSelectedItem(rs.getString("Gender"));
                    txtAge.setText(rs.getString("Age"));
                    txtQualification.setText(rs.getString("Qualification"));
                    txtAddress.setText(rs.getString("Address"));
                    txtContact.setText(rs.getString("Contact"));
                    txtPhoto.setText(rs.getString("ImagePath"));
                    btnAdd3.setEnabled(false);
                    btnAdd2.setEnabled(true);
                    btnAdd1.setEnabled(true);
                    btnUpdate3.setEnabled(true);
                    btnDelete3.setEnabled(true);
                    btnClear3.setEnabled(true);
                    clearNurseField();
                    clearPharmacistField();

                }
                if("Nurse".equals(add1)){
                    txtName1.setText(rs.getString("Full_Name"));
                    txtDid1.setText(rs.getString("ID"));
                    comGen.setSelectedItem(rs.getString("Gender"));
                    txtAge1.setText(rs.getString("Age"));
                    txtQualification1.setText(rs.getString("Qualification"));
                    txtAddress1.setText(rs.getString("Address"));
                    txtContact1.setText(rs.getString("Contact"));
                    txtPhotoNur.setText(rs.getString("ImagePath"));
                    btnAdd1.setEnabled(false);
                    btnAdd2.setEnabled(true);
                    btnAdd3.setEnabled(true);
                    btnUpdate1.setEnabled(true);
                    btnDelete1.setEnabled(true);
                    btnClear1.setEnabled(true);
                    clearField();
                    clearPharmacistField();

                }
                if("Pharmacist".equals(add1)){
                    txtName2.setText(rs.getString("Full_Name"));
                    txtDid2.setText(rs.getString("ID"));
                    comboGen.setSelectedItem(rs.getString("Gender"));
                    txtAge2.setText(rs.getString("Age"));
                    txtQualification2.setText(rs.getString("Qualification"));
                    txtAddress2.setText(rs.getString("Address"));
                    txtContact2.setText(rs.getString("Contact"));
                    txtPhPhoto.setText(rs.getString("ImagePath"));
                    btnAdd2.setEnabled(false);
                    btnAdd3.setEnabled(true);
                    btnAdd1.setEnabled(true);
                    btnUpdate2.setEnabled(true);
                    btnDelete2.setEnabled(true);
                    btnClear2.setEnabled(true);
                    clearNurseField();
                    clearField();

                }

            }

        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }

    }//GEN-LAST:event_tableMouseClicked

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        searchField3.setText("search users(enter Full_name)");
        refreshData();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnUploadPhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadPhActionPerformed

        JFileChooser fileChooser=new JFileChooser();
        fileChooser.showSaveDialog(null);
        File selectedFile = fileChooser.getSelectedFile();
        String path = selectedFile.getAbsolutePath();
        txtPhPhoto.setText(path);
        p=path;
        Previewer p=new Previewer(new ManageUser(),true,path);
        p.setVisible(true);

    }//GEN-LAST:event_btnUploadPhActionPerformed

    private void txtPhPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhPhotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhPhotoActionPerformed

    private void txtPhPhotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPhPhotoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhPhotoMouseClicked

    private void txtPassword2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassword2MouseClicked
        phPasswordErr.setText("");
    }//GEN-LAST:event_txtPassword2MouseClicked

    private void txtUsername2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsername2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsername2ActionPerformed

    private void txtUsername2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsername2MouseClicked
        phUsernameErr.setText("");
    }//GEN-LAST:event_txtUsername2MouseClicked

    private void txtContact2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContact2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContact2ActionPerformed

    private void txtContact2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContact2MouseClicked
        phContactErr.setText("");
    }//GEN-LAST:event_txtContact2MouseClicked

    private void txtDid2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDid2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDid2ActionPerformed

    private void txtDid2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDid2MouseClicked
        phPidErr.setText("");
    }//GEN-LAST:event_txtDid2MouseClicked

    private void txtName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtName2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtName2ActionPerformed

    private void txtName2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtName2MouseClicked
        phNameErr.setText("");
    }//GEN-LAST:event_txtName2MouseClicked

    private void txtAddress2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddress2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddress2ActionPerformed

    private void txtAge2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAge2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAge2ActionPerformed

    private void txtAge2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAge2MouseClicked
        phAgeErr.setText("");
    }//GEN-LAST:event_txtAge2MouseClicked

    private void txtQualification2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQualification2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQualification2ActionPerformed

    private void btnSearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch2ActionPerformed
        Validator.searchPharmacist(searchField2, txtDid2, txtName2, txtAge2, comboGen, txtQualification2, txtContact2, txtAddress2, txtPhPhoto, rs, con, pst);
    }//GEN-LAST:event_btnSearch2ActionPerformed

    private void searchField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchField2ActionPerformed

    private void searchField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchField2MouseClicked
        if("search here...".equals(searchField2.getText())){
            searchField2.setForeground(Color.black);
            searchField2.setText("");
        }
    }//GEN-LAST:event_searchField2MouseClicked

    private void btnClear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear2ActionPerformed
        clearPharmacistField();
    }//GEN-LAST:event_btnClear2ActionPerformed

    private void btnAdd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd2ActionPerformed
        boolean b=Validator.validatePharmacist(txtDid2, txtAge2, txtName2, txtQualification2, txtContact2, txtUsername2, txtAddress2, txtPassword2, phAgeErr, phNameErr, phPidErr, phContactErr, phUsernameErr, phPasswordErr);
        if(b==true) {
        addPharmacist();
       }
       else{
           
       }
    }//GEN-LAST:event_btnAdd2ActionPerformed

    private void btnDelete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete2ActionPerformed
        String s= confirmDeletion2().toString();
        //JOptionPane.showMessageDialog(null,s);
        int val=Integer.parseInt(s);
        if(val==1){

        }
        else if (val==0){
            deletePharmacist();
        }

    }//GEN-LAST:event_btnDelete2ActionPerformed

    private void btnUpdate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate2ActionPerformed
        String s= confirmUpdate2().toString();
        //JOptionPane.showMessageDialog(null,s);
        int val=Integer.parseInt(s);
        if(val==1){

        }
        else if (val==0){
            updatePharmacist();
        }

    }//GEN-LAST:event_btnUpdate2ActionPerformed

    private void btnUploadNurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadNurActionPerformed
        JFileChooser fileChooser=new JFileChooser();
        fileChooser.showSaveDialog(null);
        File selectedFile = fileChooser.getSelectedFile();
        String path = selectedFile.getAbsolutePath();
        txtPhotoNur.setText(path);
        n=path;
        Previewer p=new Previewer(new ManageUser(),true,path);
        p.setVisible(true);
    }//GEN-LAST:event_btnUploadNurActionPerformed

    private void txtPhotoNurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhotoNurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhotoNurActionPerformed

    private void txtPhotoNurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPhotoNurMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhotoNurMouseClicked

    private void txtPassword1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassword1MouseClicked
        nurPasswordErr.setText("");
    }//GEN-LAST:event_txtPassword1MouseClicked

    private void txtUsername1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsername1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsername1ActionPerformed

    private void txtUsername1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsername1MouseClicked
        nurUsernameErr.setText("");
    }//GEN-LAST:event_txtUsername1MouseClicked

    private void txtContact1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContact1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContact1ActionPerformed

    private void txtContact1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContact1MouseClicked
        nurContactErr.setText("");
    }//GEN-LAST:event_txtContact1MouseClicked

    private void txtDid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDid1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDid1ActionPerformed

    private void txtDid1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDid1MouseClicked
        nurNidErr.setText("");
    }//GEN-LAST:event_txtDid1MouseClicked

    private void txtName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtName1ActionPerformed

    private void txtName1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtName1MouseClicked
        nurNameErr.setText("");
    }//GEN-LAST:event_txtName1MouseClicked

    private void txtAddress1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddress1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddress1ActionPerformed

    private void txtAge1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAge1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAge1ActionPerformed

    private void txtAge1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAge1MouseClicked
        nurAgeErr.setText("");
    }//GEN-LAST:event_txtAge1MouseClicked

    private void txtQualification1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQualification1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQualification1ActionPerformed

    private void btnSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch1ActionPerformed
        Validator.searchNurse(searchField1, txtDid1, txtName1, txtAge1, comGen, txtQualification1, txtContact1, txtAddress1, txtPhotoNur, rs, con, pst);
    }//GEN-LAST:event_btnSearch1ActionPerformed

    private void searchField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchField1ActionPerformed

    private void searchField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchField1MouseClicked
        if("search here...".equals(searchField1.getText())){
            searchField1.setForeground(Color.black);
            searchField1.setText("");
        }
    }//GEN-LAST:event_searchField1MouseClicked

    private void btnClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear1ActionPerformed
        clearNurseField();
        // TODO add your handling code here:
        //new NurseCustomizer().clearField(searchField1, txtDid1, txtName1, txtGender1, txtAge1, txtQualification1, txtAddress1, txtContact1, txtUsername1, txtPassword1);
    }//GEN-LAST:event_btnClear1ActionPerformed

    private void btnAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd1ActionPerformed
      boolean b=   Validator.validateNurse(txtDid1, txtAge, txtName1, txtQualification1, txtContact1, txtUsername1, txtAddress1, txtPassword1, nurAgeErr, nurNameErr, nurNidErr, nurContactErr, nurUsernameErr, nurPasswordErr);
        
      if(b==true) {
         addNurse();
       }
       else{
           
       }
        
        //new NurseCustomizer().addNurse(searchField1, txtDid1, txtName1, txtGender1, txtAge1, txtQualification1, txtAddress1, txtContact1, txtUsername1, txtPassword1);
        // new NurseCustomizer().addNurse(searchField1,txtDid1,txtName1,txtGender1,txtAge1,txtQualification1,txtAddress1,txtContact1,txtUsername1,txtPassword1);
    }//GEN-LAST:event_btnAdd1ActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed

        String s= confirmDeletion1().toString();
        //JOptionPane.showMessageDialog(null,s);
        int val=Integer.parseInt(s);
        if(val==1){

        }
        else if (val==0){
            deleteNurse();
        }

    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        String s= confirmUpdate1().toString();
        //JOptionPane.showMessageDialog(null,s);
        int val=Integer.parseInt(s);
        if(val==1){

        }
        else if (val==0){
            updateNurse();
        }

    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
        JFileChooser fileChooser=new JFileChooser();
        fileChooser.showSaveDialog(null);
        File selectedFile = fileChooser.getSelectedFile();
        String path = selectedFile.getAbsolutePath();

        //lblProfPic.setIcon(ResizeImage(path));
        txtPhoto.setText(path);
        s = path;

        Previewer p=new Previewer(new ManageUser(),true,path);
        p.setVisible(true);

    }//GEN-LAST:event_btnUploadActionPerformed

    private void txtPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhotoActionPerformed

    private void txtPhotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPhotoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhotoMouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void txtPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMouseClicked
        lblPasswordError.setText("");
    }//GEN-LAST:event_txtPasswordMouseClicked

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsernameMouseClicked
        lblUsernameError.setText("");
    }//GEN-LAST:event_txtUsernameMouseClicked

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactActionPerformed

    private void txtContactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContactMouseClicked
        lblContactError.setText("");
    }//GEN-LAST:event_txtContactMouseClicked

    private void txtDidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDidActionPerformed

    private void txtDidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDidMouseClicked
        lblDidError.setText("");
    }//GEN-LAST:event_txtDidMouseClicked

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNameMouseClicked
        lblNameError.setText("");
    }//GEN-LAST:event_txtNameMouseClicked

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtAgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeKeyTyped

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtAgeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAgeMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeMouseReleased

    private void txtAgeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAgeMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeMouseExited

    private void txtAgeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAgeMouseClicked
        lblAgeError.setText("");
    }//GEN-LAST:event_txtAgeMouseClicked

    private void txtQualificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQualificationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQualificationActionPerformed

    private void btnSearch3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch3ActionPerformed

        //code to search data
        if(searchField.getText().isEmpty()==true) {
            JOptionPane.showMessageDialog(null, "You must enter search criteria", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
            try {
                if("search here...".equals(searchField.getText()) || searchField.getText().isEmpty()==true ) {
                    JOptionPane.showMessageDialog(null, "Enter search criteria", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    String sql="SELECT * FROM dentists,useraccount where dentists.DentistID=? AND useraccount.ID=?";
                    pst=con.prepareStatement(sql);
                    pst.setString(1, searchField.getText());
                    pst.setString(2, searchField.getText());

                    rs=pst.executeQuery();
                    if(rs.next() ) {

                        String did=rs.getString("DentistID");
                        txtDid.setText(did);
                        String name =rs.getString("Name");
                        txtName.setText(name);
                        String age=rs.getString("Age");
                        txtAge.setText(age);
                        String gender=rs.getString("Gender");
                        jComboBox1.setSelectedItem(gender);
                        String qualification=rs.getString("Qualification");
                        txtQualification.setText(qualification);
                        String contact=rs.getString("Contact");
                        txtContact.setText(contact);
                        String address=rs.getString("Address");
                        txtAddress.setText(address);
                        String path=rs.getString("ImagePath");
                        txtPhoto.setText(path);
                        searchField.setText("search here...");

                    }
                    else {

                        JOptionPane.showMessageDialog(null, "Opps! Record not found.\n Please retry with correct DentistID");
                    }

                }
            }
            catch(Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

            /*sql="SELECT * FROM tblname WHERE DentistID='input'";
            *
            *
            * */
        }
        //searchData();
    }//GEN-LAST:event_btnSearch3ActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void searchFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchFieldMouseClicked
        if("search here...".equals(searchField.getText())){
            searchField.setForeground(Color.black);
            searchField.setText("");
        }

    }//GEN-LAST:event_searchFieldMouseClicked

    private void btnClear3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear3ActionPerformed
        // TODO add your handling code here:
        clearField();
    }//GEN-LAST:event_btnClear3ActionPerformed

    private void btnAdd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd3ActionPerformed
      boolean b= Validator.validateDentist(txtDid, txtAge, txtName, txtQualification, txtContact, txtUsername, txtAddress, txtPassword, lblAgeError, lblNameError, lblDidError, lblContactError, lblUsernameError, lblPasswordError);
      //boolean b= 
      if(b==true) {
           addDentist();
       }
       else{
           
       }
    }//GEN-LAST:event_btnAdd3ActionPerformed

    private void btnDelete3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete3ActionPerformed
        // TODO add your handling code here: yes=0 no-1
        //NO_OPTION YES_OPTION
        //returnSelectedValue();
        String s=confirmDeletion().toString();
        //JOptionPane.showMessageDialog(null,s);
        int val=Integer.parseInt(s);
        if(val==1){

        }
        else if (val==0){
            deleteDentist();
        }
    }//GEN-LAST:event_btnDelete3ActionPerformed

    private void btnUpdate3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate3ActionPerformed

        String s= confirmUpdate().toString();
        //JOptionPane.showMessageDialog(null,s);
        int val=Integer.parseInt(s);
        if(val==1){

        }
        else if (val==0){
            updateDentist();
        }

    }//GEN-LAST:event_btnUpdate3ActionPerformed
public boolean checkUsername(){
   
    boolean a=false;
    try{
     String sql="SELECT username FROM useraccount WHERE username=?";
    pst=con.prepareStatement(sql);
    pst.setString(1, txtResetUname.getText());
    rs=pst.executeQuery();
    if(rs.next()){
   String usrname=rs.getString("username");
    a=true;
    }
    else{
        a=false;
    }
    }
    catch(Exception e){
            
            }
     
  return a;   
}
public void resetPassword(){
    boolean b=checkUsername();
    
    if(b==true){
        try{
        String un=txtResetUname.getText();
        String sql="update useraccount set password=? where username=?"; 
        pst=con.prepareStatement(sql);
        pst.setString(1, un);
        pst.setString(2, un);
        pst.executeUpdate();
    JOptionPane.showMessageDialog(null,"Password reseted succesfully.","Success",JOptionPane.PLAIN_MESSAGE); 
      txtResetUname.setText(""); 
      txtResetUname.grabFocus();
        }
        catch(Exception e){
            
        }
    }
    else if(b==false){
        JOptionPane.showMessageDialog(null,"Please enter correct username.\nThis username doesn't exist in database.","Error",JOptionPane.ERROR_MESSAGE); 
     }
    }
public boolean validateReset(JTextField tx1,JLabel usernResetErr){
 boolean a=false;
 
 String un=tx1.getText();
 Pattern p=Pattern.compile("\\W");
 Matcher m=p.matcher(un);
if(m.find()) {
      
    usernResetErr.setText("Special characters not allowed.");
   tx1.grabFocus();
     }
else if("".equals(un)) {
     usernResetErr.setText("Enter username to reset password.");
     tx1.grabFocus();
   }
 else{
    a=true;
     }

return a;    
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      boolean a=validateReset(txtResetUname,usernResetErr);
      if (a==true){
          resetPassword();
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtResetUnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResetUnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResetUnameActionPerformed

    private void txtResetUnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtResetUnameMouseClicked
       usernResetErr.setText("");
    }//GEN-LAST:event_txtResetUnameMouseClicked
public Object confirmDeletion(){
     JOptionPane pane = new JOptionPane("Are you sure to delete this Dentist?",JOptionPane.QUESTION_MESSAGE,JOptionPane.YES_NO_OPTION);
    JDialog dialog = pane.createDialog(null, "Delete");
    dialog.setIconImage(Toolkit.getDefaultToolkit().getImage(ManageUser.class.getResource("/DCIS/photo_2018-12-09_15-04-39.jpg")));
     dialog.show();
    Object selectedValue= pane.getValue();
return selectedValue;
}
public Object confirmUpdate(){
     JOptionPane pane = new JOptionPane("Are you sure to Update this Dentist ?",JOptionPane.QUESTION_MESSAGE,JOptionPane.YES_NO_OPTION);
    JDialog dialog = pane.createDialog(null, "Update");
    dialog.setIconImage(Toolkit.getDefaultToolkit().getImage(ManageUser.class.getResource("/DCIS/photo_2018-12-09_15-04-39.jpg")));
     dialog.show();
    Object selectedValue= pane.getValue();
return selectedValue;
} public Object confirmDeletion1(){
     JOptionPane pane = new JOptionPane("Are you sure to delete this Nurse?",JOptionPane.QUESTION_MESSAGE,JOptionPane.YES_NO_OPTION);
    JDialog dialog = pane.createDialog(null, "Delete");
    dialog.setIconImage(Toolkit.getDefaultToolkit().getImage(ManageUser.class.getResource("/DCIS/photo_2018-12-09_15-04-39.jpg")));
     dialog.show();
    Object selectedValue= pane.getValue();
return selectedValue;
}
public Object confirmUpdate1(){
     JOptionPane pane = new JOptionPane("Are you sure to Update this Nurse ?",JOptionPane.QUESTION_MESSAGE,JOptionPane.YES_NO_OPTION);
    JDialog dialog = pane.createDialog(null, "Update");
    dialog.setIconImage(Toolkit.getDefaultToolkit().getImage(ManageUser.class.getResource("/DCIS/photo_2018-12-09_15-04-39.jpg")));
     dialog.show();
    Object selectedValue= pane.getValue();
return selectedValue;
}
public Object confirmDeletion2(){
     JOptionPane pane = new JOptionPane("Are you sure to delete this Pharmacist?",JOptionPane.QUESTION_MESSAGE,JOptionPane.YES_NO_OPTION);
    JDialog dialog = pane.createDialog(null, "Delete");
    dialog.setIconImage(Toolkit.getDefaultToolkit().getImage(ManageUser.class.getResource("/DCIS/photo_2018-12-09_15-04-39.jpg")));
     dialog.show();
    Object selectedValue= pane.getValue();
return selectedValue;
}
public Object confirmUpdate2(){
     JOptionPane pane = new JOptionPane("Are you sure to Update this Pharmacist ?",JOptionPane.QUESTION_MESSAGE,JOptionPane.YES_NO_OPTION);
    JDialog dialog = pane.createDialog(null, "Update");
    dialog.setIconImage(Toolkit.getDefaultToolkit().getImage(ManageUser.class.getResource("/DCIS/photo_2018-12-09_15-04-39.jpg")));
     dialog.show();
    Object selectedValue= pane.getValue();
return selectedValue;
} public boolean checkuser(String uname){
   String sql="select * from allusers where Full_name=?";
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
public ImageIcon ResizeImage(String imgPath){
        ImageIcon MyImage = new ImageIcon(imgPath);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(lblProfPic.getWidth(),lblProfPic.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
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
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ManageUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd1;
    private javax.swing.JButton btnAdd2;
    private javax.swing.JButton btnAdd3;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear1;
    private javax.swing.JButton btnClear2;
    private javax.swing.JButton btnClear3;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnDelete2;
    private javax.swing.JButton btnDelete3;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearch1;
    private javax.swing.JButton btnSearch2;
    private javax.swing.JButton btnSearch3;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JButton btnUpdate2;
    private javax.swing.JButton btnUpdate3;
    private javax.swing.JButton btnUpload;
    private javax.swing.JButton btnUploadNur;
    private javax.swing.JButton btnUploadPh;
    private javax.swing.JComboBox<String> comGen;
    private javax.swing.JComboBox<String> comboGen;
    private javax.swing.JPanel contentPane;
    private javax.swing.JDesktopPane dentistTab1;
    private javax.swing.JDesktopPane dentistTab3;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAgeError;
    private javax.swing.JLabel lblContactError;
    private javax.swing.JLabel lblDidError;
    private javax.swing.JLabel lblNameError;
    private javax.swing.JLabel lblPasswordError;
    public javax.swing.JLabel lblProfPic;
    private javax.swing.JLabel lblUsernameError;
    private javax.swing.JLabel nurAgeErr;
    private javax.swing.JLabel nurContactErr;
    private javax.swing.JLabel nurNameErr;
    private javax.swing.JLabel nurNidErr;
    private javax.swing.JLabel nurPasswordErr;
    private javax.swing.JLabel nurUsernameErr;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel_2;
    private javax.swing.JLabel phAgeErr;
    private javax.swing.JLabel phContactErr;
    private javax.swing.JLabel phNameErr;
    private javax.swing.JLabel phPasswordErr;
    private javax.swing.JLabel phPidErr;
    private javax.swing.JLabel phUsernameErr;
    private javax.swing.JTextField searchField;
    private javax.swing.JTextField searchField1;
    private javax.swing.JTextField searchField2;
    private javax.swing.JTextField searchField3;
    private javax.swing.JTabbedPane tabDentist;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAddress1;
    private javax.swing.JTextField txtAddress2;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtAge1;
    private javax.swing.JTextField txtAge2;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtContact1;
    private javax.swing.JTextField txtContact2;
    private javax.swing.JTextField txtDid;
    private javax.swing.JTextField txtDid1;
    private javax.swing.JTextField txtDid2;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtName1;
    private javax.swing.JTextField txtName2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPassword1;
    private javax.swing.JPasswordField txtPassword2;
    private javax.swing.JTextField txtPhPhoto;
    private javax.swing.JTextField txtPhoto;
    private javax.swing.JTextField txtPhotoNur;
    private javax.swing.JTextField txtQualification;
    private javax.swing.JTextField txtQualification1;
    private javax.swing.JTextField txtQualification2;
    private javax.swing.JTextField txtResetUname;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtUsername1;
    private javax.swing.JTextField txtUsername2;
    public javax.swing.JButton user;
    private javax.swing.JLabel usernResetErr;
    private javax.swing.JDesktopPane viewUserTab;
    // End of variables declaration//GEN-END:variables
public void addDentist() {
     String gender=(String) (jComboBox1.getSelectedItem());
   //  JOptionPane.showMessageDialog(null,gender);
     //JOptionPane.showMessageDialog(null,jComboBox1.getSelectedIndex());
	if(txtDid.getText().isEmpty()==false && txtName.getText().isEmpty()==false && txtAge.getText().isEmpty()==false
		 && gender != "---select gender---" && txtQualification.getText().isEmpty()==false
					&& txtAddress.getText().isEmpty()==false && txtContact.getText().isEmpty()==false
                                 && txtUsername.getText().isEmpty()==false && txtPassword.getText().isEmpty()==false) {


		         try{
                    InputStream in=new FileInputStream(new File(s));
                    String sql2="INSERT INTO useraccount (ID,Username,Password,Role,Photo,ImagePath) values(?,?,?,?,?,?)";
                    pst=con.prepareStatement(sql2);
                    pst.setString(1,txtDid.getText());
                    pst.setString(2, txtUsername.getText().toLowerCase());
                    pst.setString(3, txtPassword.getText().toLowerCase());
                    pst.setString(4, "Dentist");
                    pst.setBlob(5, in);
                    pst.setString(6,txtPhoto.getText());
                    pst.execute();
                 
		    String sql="INSERT INTO dentists (DentistID,Username,Name,Age,Gender,Qualification,Address,Contact) values(?,?,?,?,?,?,?,?)";
		    pst=con.prepareStatement(sql);
			pst =con.prepareStatement(sql);
		    pst.setString(1, txtDid.getText());
                    pst.setString(2,txtUsername.getText());
		    pst.setString(3, txtName.getText());
		    pst.setString(4, txtAge.getText());
		    pst.setString(5, jComboBox1.getSelectedItem().toString());
		    pst.setString(6, txtQualification.getText());
		    pst.setString(7, txtAddress.getText());
		    pst.setString(8, txtContact.getText());
                   
		    pst.execute();


		    JOptionPane.showMessageDialog(null, "The Data is Saved Succesfully");
		    clearField();
		    refreshData();

		}
		catch (SQLException e){
			JOptionPane.showMessageDialog(null,"OPs! SQLException :  "+e);
		}
		catch (Exception e){
	         JOptionPane.showMessageDialog(null,"OPs! Exception :"+e);
      }
	}
		else {

			JOptionPane.showMessageDialog(null, "You must fill all fields", "Error", JOptionPane.ERROR_MESSAGE);
		}

	 }
public void updateDentist() {
     String gender=jComboBox1.getSelectedItem().toString();
     String did=txtDid.getText();
     String name=txtName.getText();
     String age=txtAge.getText();
     String qualification=txtQualification.getText();
     String address=txtAddress.getText();
     String contact=txtContact.getText();
    if(txtDid.getText().isEmpty()==false && txtName.getText().isEmpty()==false && txtAge.getText().isEmpty()==false
		 && gender != "---select gender---" && txtQualification.getText().isEmpty()==false
					&& txtAddress.getText().isEmpty()==false && txtContact.getText().isEmpty()==false) {
			try{
		       
	/* InputStream in=new FileInputStream(new File(s));  
        
         String sql="UPDATE useraccount set Photo=?,ImagePath=? where ID=? ";  
          pst=con.prepareStatement(sql);
       
         pst.setBlob(1,in);
         pst.setString(2,txtPhoto.getText());  
         pst.setString(3,did);
          pst.executeUpdate(); */

        String sql2="UPDATE dentists set Name=?,Gender=?,Age=?,Qualification=?,Address=?,Contact=? WHERE DentistID=?";                      
		pst=con.prepareStatement(sql2);
                
                pst.setString(1,name);
                pst.setString(2,gender);
                pst.setString(3,age);
                pst.setString(4,qualification);
                pst.setString(5,address);
                pst.setString(6,contact);             
                pst.setString(7,did);
   	
       

			    pst.executeUpdate();
			    JOptionPane.showMessageDialog(null, "The Data is updated Succesfully");
			    clearField();
			    refreshData();

} /*catch (FileNotFoundException e){
		JOptionPane.showMessageDialog(null,"Your Image is not found!  ");
                txtPhoto.setText("");
		} 
  catch (PacketTooBigException e){
		JOptionPane.showMessageDialog(null,"Your Image is too Big. Please Choose small image!  ");
                txtPhoto.setText("");
		}*/
  catch (SQLException e){
	JOptionPane.showMessageDialog(null,"Ops! SQL exception:  "+e);
	}
  catch (Exception e){
	JOptionPane.showMessageDialog(null,"Ops !  "+e);
	}                       
    }else{
    JOptionPane.showMessageDialog(null, "You must fill all fields to update data.", "Error", JOptionPane.ERROR_MESSAGE);
}
}
public void deleteDentist() {
			if(txtDid.getText().isEmpty()==false) {
				try {
					String sql="DELETE FROM dentists where DentistID='"+txtDid.getText()+"'";
					pst=con.prepareStatement(sql);
					pst.executeUpdate();
                                        String sql2="DELETE FROM useraccount where ID='"+txtDid.getText()+"'";
                                        pst=con.prepareStatement(sql2);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "The Data is deleted Succesfully");
				    clearField();
				    refreshData();

				}
					catch(SQLException err) {
						JOptionPane.showMessageDialog(null,"Ops !  "+err);
					}
				catch(Exception err) {
					JOptionPane.showMessageDialog(null,"Ops !  "+err);
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "You must fill ID of a dentist you want to delete.", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
public void clearField(){
			try {
				//searchField.setText("");
				txtName.setText("");
				txtDid.setText("");
				jComboBox1.setSelectedItem("---select gender---");
				txtAge.setText("");
				txtQualification.setText("");
				txtAddress.setText("");
				txtContact.setText("");
				txtUsername.setText("");
			        txtPassword.setText("");
                                txtPhoto.setText("");
                                btnAdd3.setEnabled(true);
			}
			catch(Exception e) {
				 JOptionPane.showMessageDialog(null, e);
			}
		}
public void refreshData() {
				try {
					String sql="SELECT * FROM allUsers";
					pst=con.prepareStatement(sql);
					rs=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}
				catch (SQLException e){
					JOptionPane.showMessageDialog(null,e);
				}
				catch (Exception e){
			         JOptionPane.showMessageDialog(null,e);
		  }

		}
	      
/*Menu Bar*/

public void createMenuBar(){


		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		//menuBar.setForeground(new Color(128, 0, 0));
		//menuBar.setBackground(new Color(112, 128, 144));
		setJMenuBar(menuBar);

		JMenu filemenu=new JMenu("File");
		filemenu.setForeground(new Color(0, 0, 0));
                //formatmenu.setForeground(new Color(255, 255, 255));
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


         }//end of menu bar
         /*Manage Nurse*/
public void addNurse() {

    String gender=comGen.getSelectedItem().toString();
   //JOptionPane.showMessageDialog(null, gender);
    
    
	if(txtDid1.getText().isEmpty()==false && txtName1.getText().isEmpty()==false  && gender != "---select gender---" && txtAge1.getText().isEmpty()==false
		&& txtQualification1.getText().isEmpty()==false && txtAddress1.getText().isEmpty()==false && txtContact1.getText().isEmpty()==false) {
		         try{
                             InputStream in=new FileInputStream(new File(n));
                    String sql2="INSERT INTO useraccount (ID,Username,Password,Role,Photo,ImagePath) values(?,?,?,?,?,?)";
                    pst=con.prepareStatement(sql2);
                    pst.setString(1,txtDid1.getText());
                    pst.setString(2, txtUsername1.getText().toLowerCase());
                    pst.setString(3, txtPassword1.getText().toLowerCase());
                    pst.setString(4, "Nurse");
                   
                    pst.setBlob(5, in);
                    pst.setString(6,txtPhotoNur.getText());
                    pst.execute();

		  String sql="INSERT INTO nurse (NurseID,Username,Name,Gender,Age,Qualification,Address,Contact) values(?,?,?,?,?,?,?,?)";
		    pst=con.prepareStatement(sql);

		    pst.setString(1, txtDid1.getText());
                    pst.setString(2, txtUsername1.getText());
		    pst.setString(3, txtName1.getText());
		    pst.setString(4, gender);
                    pst.setString(5, txtAge1.getText());
		    pst.setString(6, txtQualification1.getText());
		    pst.setString(7, txtAddress1.getText());
		    pst.setString(8, txtContact1.getText());
		    pst.execute();

                    JOptionPane.showMessageDialog(null, "The Data is Saved Succesfully");
		   clearNurseField();
		  refreshData();

		}
		catch (SQLException e){
			JOptionPane.showMessageDialog(null,"OPs! SQLException :  "+e);
		}
		catch (Exception e){
	         JOptionPane.showMessageDialog(null,"OPs! Exception happened when the program tries to enter nurse information! Ex: "+e);
            }
	}
		else {

			JOptionPane.showMessageDialog(null, "You must fill all fields", "Error", JOptionPane.ERROR_MESSAGE);
		}

        }
public void updateNurse(){
			try{
				String nid=txtDid1.getText();
				String name=txtName1.getText();
				String gender=comGen.getSelectedItem().toString();
				String age=txtAge1.getText();
				String qualification1=txtQualification1.getText();
				String address=txtAddress1.getText();
				String contact=txtContact1.getText();
				
                               /* InputStream in=new FileInputStream(new File(n));
                                String sql2="UPDATE useraccount set ID=?,Photo=?,ImagePath=? where ID=? ";  
                                  pst=con.prepareStatement(sql2);
                                  pst.setString(1,nid);
                                  pst.setBlob(2,in);
                                  pst.setString(3,txtPhotoNur.getText());  
                                  pst.setString(4,nid);
                                  pst.executeUpdate();
                                */
                                
                                
		String sql="UPDATE nurse SET NurseID='"+nid+"', Name='"+name+"',Gender='"+gender+"',Age="+age+",Qualification='"
				+qualification1 +"',Address='"+address+"',Contact='"+contact+"' WHERE NurseID='"+nid+"' ";
				pst=con.prepareStatement(sql);
                                  
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null, "The Data is updated Succesfully");

        clearNurseField();
	refreshData();





				}
				catch (Exception e){
					JOptionPane.showMessageDialog(null,"Ops !  "+e);
				}

		}
public void deleteNurse() {
			if(txtDid1.getText().isEmpty()==false ) {
				try {
					String sql="DELETE FROM nurse where NurseID='"+txtDid1.getText()+"'";
					pst=con.prepareStatement(sql);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "The Data is deleted Succesfully");

        clearNurseField();
	refreshData();


				}
					catch(SQLException err) {
						JOptionPane.showMessageDialog(null,"Ops !  "+err);
					}
				catch(Exception err) {
					JOptionPane.showMessageDialog(null,"Ops !  "+err);
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "You must fill an Id of a nurse you want to delete.", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
public void clearNurseField(){
			try {
				searchField1.setText("");

				txtName1.setText("");
				txtDid1.setText("");
				comGen.setSelectedItem("---select gender---");
				txtAge1.setText("");
				txtQualification1.setText("");
				txtAddress1.setText("");
				txtContact1.setText("");
				txtUsername1.setText("");
			        txtPassword1.setText("");
                                txtPhotoNur.setText("");
                                btnAdd1.setEnabled(true);
			}
			catch(Exception e) {
				 JOptionPane.showMessageDialog(null, e);
			}
		}

       /*Manage pharmacist*/

public void addPharmacist() {
             String gender=comboGen.getSelectedItem().toString();
          
            
             if(txtDid2.getText().isEmpty()==false && txtName2.getText().isEmpty()==false && gender!="---select gender---" && txtAge2.getText().isEmpty()==false
		&& txtQualification2.getText().isEmpty()==false && txtAddress2.getText().isEmpty()==false && txtContact2.getText().isEmpty()==false &&
                        txtUsername2.getText().isEmpty()==false &&txtPassword2.getText().isEmpty()==false){
		         try{
                  InputStream in=new FileInputStream(new File(p));
                  String sql2="INSERT INTO useraccount (ID,Username,Password,Role,Photo,ImagePath) values(?,?,?,?,?,?)";
                    pst=con.prepareStatement(sql2);
                    pst.setString(1,txtDid2.getText());
                    pst.setString(2, txtUsername2.getText().toLowerCase());
                    pst.setString(3, txtPassword2.getText().toLowerCase());
                    pst.setString(4, "Pharmacist");
                    pst.setBlob(5, in);
                    pst.setString(6,txtPhPhoto.getText());
                    pst.execute();
		  String sql="INSERT INTO pharmacist (PharmacistID,Username,Name,Gender,Age,Qualification,Address,Contact) values(?,?,?,?,?,?,?,?)";
		    pst=con.prepareStatement(sql);

		    pst.setString(1, txtDid2.getText());
                    pst.setString(2, txtUsername2.getText());
		    pst.setString(3, txtName2.getText());
		    pst.setString(4, gender);
                    pst.setString(5, txtAge2.getText());
		    pst.setString(6, txtQualification2.getText());
		    pst.setString(7, txtAddress2.getText());
		    pst.setString(8, txtContact2.getText());
		    pst.execute();


                    JOptionPane.showMessageDialog(null, "The Data is Saved Succesfully");
		    clearPharmacistField();
		    refreshData();

		}
		catch (SQLException e){
			JOptionPane.showMessageDialog(null,"OPs! SQLException :  "+e);
		}
		catch (Exception e){
	         JOptionPane.showMessageDialog(null,"OPs! Exception happened when the program tries to enter pharmacist information! Ex: "+e);
            }
	}
		else {

			JOptionPane.showMessageDialog(null, "You must fill all fields", "Error", JOptionPane.ERROR_MESSAGE);
		}
    }
public void updatePharmacist(){
			try{
                            
                            
                            
				String pid=txtDid2.getText();
				String name=txtName2.getText();
				String gender=comboGen.getSelectedItem().toString();
				String age=txtAge2.getText();
				String qualification1=txtQualification2.getText();
				String address=txtAddress2.getText();
				String contact=txtContact2.getText();
                                /*
				InputStream in=new FileInputStream(new File(p));
                             
         String sql2="UPDATE useraccount set ID=?,Photo=?,ImagePath=? where ID=? ";  
          pst=con.prepareStatement(sql2);
         pst.setString(1,pid);
         pst.setBlob(2,in);
         pst.setString(3,txtPhPhoto.getText());  
         pst.setString(4,pid);
          pst.executeUpdate(); */
				String sql="UPDATE pharmacist SET PharmacistID='"+pid+"', Name='"+name+"',Gender='"+gender+"',Age="+age+",Qualification='"
				+qualification1 +"',Address='"+address+"',Contact='"+contact+"' WHERE PharmacistID='"+pid+"' ";
				pst=con.prepareStatement(sql);

				pst.executeUpdate();
				JOptionPane.showMessageDialog(null, "The Data is updated Succesfully");

        clearPharmacistField();
	refreshData();





				}
				catch (Exception e){
					JOptionPane.showMessageDialog(null,"Ops !  "+e);
				}

		}
public void deletePharmacist() {
			if(txtDid1.getText().isEmpty()==false) {
				try {
					String sql="DELETE FROM pharmacist where PharmacistID='"+txtDid2.getText()+"'";
					pst=con.prepareStatement(sql);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "The Data is deleted Succesfully");

                                       clearPharmacistField();
	refreshData();


				}
					catch(SQLException err) {
						JOptionPane.showMessageDialog(null,"Ops !  "+err);
					}
				catch(Exception err) {
					JOptionPane.showMessageDialog(null,"Ops !  "+err);
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "You must fill an Id of a pharmacist you want to delete.", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
public void clearPharmacistField(){
			try {
				searchField2.setText("");

				txtName2.setText("");
				txtDid2.setText("");
				comboGen.setSelectedItem("---select gender---");
				txtAge2.setText("");
				txtQualification2.setText("");
				txtAddress2.setText("");
				txtContact2.setText("");
				txtUsername2.setText("");
			        txtPassword2.setText("");
                                txtPhPhoto.setText("");
                                btnAdd2.setEnabled(true);
			}
			catch(Exception e) {
				 JOptionPane.showMessageDialog(null, e);
			}
		}

}//end of class