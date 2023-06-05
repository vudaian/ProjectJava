package admin;

import ShoeAppController.accAdminController;
import ShoeAppController.personnelController;
import ShoeAppModel.accAdmin;
import User.home;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import personnel.manager_personnel;

public class login_admin extends javax.swing.JFrame {
    public static String Name_admin;
    
    public login_admin() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_LoginAdmin = new Design_Item.button();
        picturebox2 = new Design_Item.picturebox();
        textfield_username = new Design_Item.textfield();
        textfield_password = new Design_Item.textfieldpassword();
        messager_email = new javax.swing.JLabel();
        messager_pass = new javax.swing.JLabel();
        picturebox1 = new Design_Item.picturebox();
        btn_backHome = new Design_Item.picturebox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Tên tài khoản");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Mật khẩu");

        btn_LoginAdmin.setBackground(new java.awt.Color(51, 153, 255));
        btn_LoginAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btn_LoginAdmin.setText("Đăng nhập");
        btn_LoginAdmin.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        btn_LoginAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LoginAdminActionPerformed(evt);
            }
        });

        picturebox2.setImage(new javax.swing.ImageIcon("D:\\Workspace\\Java\\App\\img\\360_F_227450952_KQCMShHPOPebUXklULsKsROk5AvN6H1H.jpg")); // NOI18N

        textfield_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_usernameActionPerformed(evt);
            }
        });

        messager_email.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        messager_email.setForeground(new java.awt.Color(153, 153, 153));

        messager_pass.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        messager_pass.setForeground(new java.awt.Color(153, 153, 153));

        picturebox1.setImage(new javax.swing.ImageIcon("D:\\Workspace\\Java\\App\\img\\admin-login-sign-made-of-wood-on-a-table-2H36631.jpg")); // NOI18N

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
                .addComponent(picturebox1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_LoginAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(textfield_username, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(messager_email)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(messager_pass)
                                .addGap(0, 0, 0)
                                .addComponent(textfield_password, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(picturebox2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(picturebox2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textfield_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(messager_email)
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(messager_pass))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textfield_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61)
                .addComponent(btn_LoginAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        this.dispose();
    }//GEN-LAST:event_btn_backHomeMouseClicked

    private void textfield_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_usernameActionPerformed

    private void btn_LoginAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LoginAdminActionPerformed
        String username = textfield_username.getText();
        Name_admin = username;
        String password = String.valueOf(textfield_password.getPassword());
        if (username.equals("") && password.equals("")){
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
        } else if(username.equals("")) {
            ImageIcon icon = new ImageIcon("D:\\Workspace\\Java\\App\\img"
                + "\\icons8-disappointed-50.png");
            Object[] options = {"Nhập lại"};
            JOptionPane.showOptionDialog(null,
                "Nhập thiếu tên tài khoản, vui lòng nhập đầy đủ!",
                "Thông báo",
                JOptionPane.YES_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                options,
                options[0]);
        } else if(password.equals("")) {
            ImageIcon icon = new ImageIcon("D:\\Workspace\\Java\\App\\img"
                + "\\icons8-disappointed-50.png");
            Object[] options = {"Nhập lại"};
            JOptionPane.showOptionDialog(null,
                "Nhập thiếu mật khẩu, vui lòng nhập đầy đủ!",
                "Thông báo",
                JOptionPane.YES_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                options,
                options[0]);
        }
        else {
            accAdmin accAdmin = new accAdmin(username, password);
            accAdmin accPersonnel = new accAdmin(username, password);
            if (accAdminController.LogInAdmin(accAdmin) == 1) {
                ImageIcon icon = new ImageIcon("D:\\Workspace\\Java\\App\\img"
                            + "\\icons8-anime-emoji-50.png");
                Object[] options = {"Yes"};
                JOptionPane.showOptionDialog(null,
                    "Chào mừng giám đốc",
                    "Thông báo",
                    JOptionPane.YES_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    icon,
                    options,
                    options[0]);
                dispose();
                new manager_admin().setVisible(true);
            }
            else if(personnelController.LogInPersonnel(accPersonnel) == 1) {
                ImageIcon icon = new ImageIcon("D:\\Workspace\\Java\\App\\img"
                            + "\\icons8-anime-emoji-50.png");
                Object[] options = {"Yes"};
                JOptionPane.showOptionDialog(null,
                    "Chào mừng nhân viên",
                    "Thông báo",
                    JOptionPane.YES_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    icon,
                    options,
                    options[0]);;
                dispose();
                new manager_personnel().setVisible(true);
            }
            else {
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
    }//GEN-LAST:event_btn_LoginAdminActionPerformed

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
            java.util.logging.Logger.getLogger(login_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Login_admin().setVisible(true);
//            }
//        });
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Login_admin().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Design_Item.button btn_LoginAdmin;
    private Design_Item.picturebox btn_backHome;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel messager_email;
    private javax.swing.JLabel messager_pass;
    private Design_Item.picturebox picturebox1;
    private Design_Item.picturebox picturebox2;
    private Design_Item.textfieldpassword textfield_password;
    private Design_Item.textfield textfield_username;
    // End of variables declaration//GEN-END:variables
}
