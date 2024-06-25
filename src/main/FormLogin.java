/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;
import view.FormRegisterAkun;
import controller.LoginController;
import java.awt.Color;
import javax.swing.JOptionPane;
import view.MenuAdmin;
import view.MenuUser;
import model.LoggedInUser;
import model.User;

/**
 *
 * @author Dell
 */
public class FormLogin extends javax.swing.JFrame {

    /**
     * Creates new form FormLogin
     */
    int xx,xy;
    public FormLogin() {
        initComponents();
        
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        button_cancle = new javax.swing.JButton();
        label_nama = new javax.swing.JLabel();
        label_welcome = new javax.swing.JLabel();
        label_username = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        label_password = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        button_login = new javax.swing.JButton();
        label_welcome1 = new javax.swing.JLabel();
        label_welcome2 = new javax.swing.JLabel();
        registerLink = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(89, 23, 23));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.red);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jLabel2.setBackground(new java.awt.Color(0, 102, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/A child character with black hair, large glasses, and a blue shirt, seated on the ground, reading a manga with intense focus. Surrounding the character are more books and loose papers scattered on.png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        button_cancle.setBackground(new java.awt.Color(0, 102, 255));
        button_cancle.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        button_cancle.setForeground(new java.awt.Color(255, 255, 255));
        button_cancle.setText("X");
        button_cancle.setBorderPainted(false);
        button_cancle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_cancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_cancleActionPerformed(evt);
            }
        });

        label_nama.setBackground(new java.awt.Color(255, 255, 255));
        label_nama.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        label_nama.setForeground(new java.awt.Color(255, 255, 255));
        label_nama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/white.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(button_cancle)
                            .addGap(12, 12, 12))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(label_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(63, 63, 63)))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button_cancle)
                .addGap(4, 4, 4)
                .addComponent(label_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        label_welcome.setBackground(new java.awt.Color(255, 255, 255));
        label_welcome.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        label_welcome.setForeground(new java.awt.Color(102, 102, 102));
        label_welcome.setText("Welcome");

        label_username.setBackground(new java.awt.Color(255, 255, 255));
        label_username.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        label_username.setForeground(new java.awt.Color(102, 102, 102));
        label_username.setText("Username");

        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        label_password.setBackground(new java.awt.Color(255, 255, 255));
        label_password.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        label_password.setForeground(new java.awt.Color(102, 102, 102));
        label_password.setText("Password");

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        button_login.setBackground(new java.awt.Color(0, 102, 255));
        button_login.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        button_login.setForeground(new java.awt.Color(255, 255, 255));
        button_login.setText("LOGIN");
        button_login.setToolTipText("");
        button_login.setBorderPainted(false);
        button_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_loginActionPerformed(evt);
            }
        });
        button_login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                button_loginKeyPressed(evt);
            }
        });

        label_welcome1.setBackground(new java.awt.Color(255, 255, 255));
        label_welcome1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        label_welcome1.setForeground(new java.awt.Color(102, 102, 102));
        label_welcome1.setText("Belum punya akun?");

        label_welcome2.setBackground(new java.awt.Color(255, 255, 255));
        label_welcome2.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        label_welcome2.setForeground(new java.awt.Color(102, 102, 102));
        label_welcome2.setText("Hello,");

        registerLink.setBackground(new java.awt.Color(255, 255, 255));
        registerLink.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        registerLink.setForeground(new java.awt.Color(51, 51, 255));
        registerLink.setText("daftar di sini");
        registerLink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerLinkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerLinkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerLinkMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(48, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(label_password)
                                .addComponent(passwordField)
                                .addComponent(label_username)
                                .addComponent(usernameField)
                                .addComponent(button_login, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                            .addComponent(label_welcome)
                            .addComponent(label_welcome2))
                        .addGap(49, 49, 49))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(label_welcome1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(registerLink)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(label_welcome2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_welcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(button_login)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_welcome1)
                    .addComponent(registerLink))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
         // TODO add your handling code here:
         xx=evt.getX();
         xy=evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        int x= evt.getXOnScreen();
        int y= evt.getYOnScreen();
        this.setLocation(x-xx,y-xy);
    }//GEN-LAST:event_formMouseDragged

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void button_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_loginActionPerformed
        // TODO add your handling code here:
        String usernameInput = usernameField.getText();
        String passwordInput = new String(passwordField.getPassword());
        if (usernameInput.isEmpty() || passwordInput.isEmpty()) {
            JOptionPane.showMessageDialog(this, "NIM dan Password tidak boleh kosong", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        LoginController loginController = new LoginController();
        User loggedInUser = loginController.authenticateUser(usernameInput, passwordInput);

        if (loggedInUser != null) {
            LoggedInUser.setUser(loggedInUser);

            if (loggedInUser.getRole() == 1) {
                MenuAdmin menuAdmin = new MenuAdmin(loggedInUser);
                menuAdmin.setVisible(true);
            } else if (loggedInUser.getRole() == 2) {
                MenuUser menuUser = new MenuUser(loggedInUser);
                menuUser.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Peran pengguna tidak diketahui.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Autentikasi gagal. Periksa NIM dan password Anda.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_button_loginActionPerformed

    private void button_cancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_cancleActionPerformed
        // TODO add your handling code here:
        dispose();
        System.exit(0);
    }//GEN-LAST:event_button_cancleActionPerformed

    private void registerLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerLinkMouseClicked
        // TODO add your handling code here:
        new FormRegisterAkun().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registerLinkMouseClicked

    private void registerLinkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerLinkMouseEntered
        // TODO add your handling code here:
        registerLink.setForeground(new Color(0, 0, 128));
    }//GEN-LAST:event_registerLinkMouseEntered

    private void registerLinkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerLinkMouseExited
        // TODO add your handling code here:
        registerLink.setForeground(Color.BLUE);
    }//GEN-LAST:event_registerLinkMouseExited

    private void button_loginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_button_loginKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_loginKeyPressed

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
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_cancle;
    private javax.swing.JButton button_login;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label_nama;
    private javax.swing.JLabel label_password;
    private javax.swing.JLabel label_username;
    private javax.swing.JLabel label_welcome;
    private javax.swing.JLabel label_welcome1;
    private javax.swing.JLabel label_welcome2;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel registerLink;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
