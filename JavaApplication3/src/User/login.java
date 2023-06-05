/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package User;

import ShoeAppModel.user;
import ShoeAppController.userController;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {
    
    public static int idUser;
    public static String Name_User;
    public login() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_CheckLogin = new Design_Item.button();
        jLabel5 = new javax.swing.JLabel();
        btn_nextRegister = new javax.swing.JLabel();
        picturebox2 = new Design_Item.picturebox();
        textfield_Email = new Design_Item.textfield();
        textfield_password = new Design_Item.textfieldpassword();
        messager_email = new javax.swing.JLabel();
        messager_pass = new javax.swing.JLabel();
        picturebox1 = new Design_Item.picturebox();
        btn_backHome = new Design_Item.picturebox();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Email");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Mật khẩu");

        btn_CheckLogin.setBackground(new java.awt.Color(51, 153, 255));
        btn_CheckLogin.setForeground(new java.awt.Color(255, 255, 255));
        btn_CheckLogin.setText("Đăng nhập");
        btn_CheckLogin.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        btn_CheckLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CheckLoginActionPerformed(evt);
            }
        });

        jLabel5.setText("Bạn chưa có tài khoản?");

        btn_nextRegister.setForeground(new java.awt.Color(51, 153, 255));
        btn_nextRegister.setText("Đăng ký");
        btn_nextRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_nextRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_nextRegisterMouseClicked(evt);
            }
        });

        picturebox2.setImage(new javax.swing.ImageIcon("D:\\Workspace\\Java\\App\\img\\images.png")); // NOI18N

        textfield_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_EmailActionPerformed(evt);
            }
        });

        messager_email.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        messager_email.setForeground(new java.awt.Color(153, 153, 153));
        messager_email.setText("Nhập đầy đủ thông tin và có @gmail.");

        messager_pass.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        messager_pass.setForeground(new java.awt.Color(153, 153, 153));
        messager_pass.setText("Mật khẩu phải trên 8 chữ số.");

        picturebox1.setImage(new javax.swing.ImageIcon("D:\\Workspace\\Java\\App\\img\\pngtree-chatting-website-signing-in-page-isometric-design-with-dating-users-love-picture-image_1796202.jpg")); // NOI18N

        btn_backHome.setImage(new javax.swing.ImageIcon("D:\\Workspace\\Java\\App\\img\\135210286.png")); // NOI18N
        btn_backHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_backHomeMouseClicked(evt);
            }
        });
        picturebox1.add(btn_backHome);
        btn_backHome.setBounds(10, 10, 28, 21);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(picturebox1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_CheckLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(textfield_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(messager_email)
                            .addComponent(jLabel4)
                            .addComponent(textfield_password, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(messager_pass))
                        .addGap(39, 39, 39))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(picturebox2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_nextRegister)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(picturebox2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(textfield_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messager_email)
                .addGap(40, 40, 40)
                .addComponent(jLabel4)
                .addGap(2, 2, 2)
                .addComponent(textfield_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messager_pass)
                .addGap(26, 26, 26)
                .addComponent(btn_CheckLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btn_nextRegister))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(picturebox1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backHomeMouseClicked
        new home().setVisible(true);
        this.hide();
    }//GEN-LAST:event_btn_backHomeMouseClicked

    private void textfield_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_EmailActionPerformed

    private void btn_nextRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nextRegisterMouseClicked
        new register().setVisible(true);
        this.hide();
    }//GEN-LAST:event_btn_nextRegisterMouseClicked

    private void btn_CheckLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CheckLoginActionPerformed
        String username = textfield_Email.getText();
        Name_User = username;
        String password = String.valueOf(textfield_password.getPassword());
        if (username.equals("") || password.equals("")){
            ImageIcon icon = new ImageIcon("D:\\Workspace\\Java\\App\\img"
                            + "\\icons8-disappointed-50.png");
            Object[] options = {"Nhập lại"};
            JOptionPane.showOptionDialog(null,  
                "Nhập thiếu thông tin, vui lòng nhập đầy đủ!",
                "Thông báo",
                JOptionPane.YES_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                options,
                options[0]);
        }
        else {
            user UC = new user(username, password);
            if (userController.LogIn(UC) == 1) {
                ImageIcon icon = new ImageIcon("D:\\Workspace\\Java\\App\\img"
                            + "\\icons8-anime-emoji-50.png");
                Object[] options = {"Yes"};
                JOptionPane.showOptionDialog(null,
                    "Chào mừng bạn đến với cửa hàng của chúng tôi",
                    "Thông báo",
                    JOptionPane.YES_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    icon,
                    options,
                    options[0]);
                dispose();
                product pr = new product();
                pr.setVisible(true);
            } else {
                ImageIcon iconfalse = new ImageIcon("D:\\Workspace\\Java\\App\\img"
                            + "\\icons8-crying-50.png");
                Object[] options = {"Nhập lại"};
                JOptionPane.showOptionDialog(null,
                    "Tài khoản hoặc mật khẩu sai!",
                    "Cảnh báo",
                    JOptionPane.YES_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    iconfalse,
                    options,
                    options[0]);
            }
        }
    }//GEN-LAST:event_btn_CheckLoginActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new login().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Design_Item.button btn_CheckLogin;
    private Design_Item.picturebox btn_backHome;
    private javax.swing.JLabel btn_nextRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel messager_email;
    private javax.swing.JLabel messager_pass;
    private Design_Item.picturebox picturebox1;
    private Design_Item.picturebox picturebox2;
    private Design_Item.textfield textfield_Email;
    private Design_Item.textfieldpassword textfield_password;
    // End of variables declaration//GEN-END:variables
}
