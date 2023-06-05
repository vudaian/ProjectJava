/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package User;

import ConnectSQL.Connect;
import static ShoeAppController.checkValue.checkEmail;
import static ShoeAppController.checkValue.checkNumber;
import ShoeAppController.userController;
import ShoeAppModel.user;
import static com.microsoft.sqlserver.jdbc.StringUtils.isEmpty;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;

public class register extends javax.swing.JFrame {
    public register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        picturebox1 = new Design_Item.picturebox();
        btn_backHome = new Design_Item.picturebox();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_CheckRegister = new Design_Item.button();
        jLabel5 = new javax.swing.JLabel();
        btn_nextLogin = new javax.swing.JLabel();
        picturebox2 = new Design_Item.picturebox();
        textfield_Email = new Design_Item.textfield();
        textfield_password = new Design_Item.textfieldpassword();
        messager_email = new javax.swing.JLabel();
        messager_pass = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textfield_username = new Design_Item.textfield();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textfield_numberphone = new Design_Item.textfield();
        textfield_address = new Design_Item.textfield();
        picturebox3 = new Design_Item.picturebox();
        btn_backHome2 = new Design_Item.picturebox();

        jLabel1.setText("jLabel1");

        btn_backHome.setImage(new javax.swing.ImageIcon("D:\\Workspace\\Java\\App\\img\\135210286.png")); // NOI18N
        btn_backHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_backHomeMouseClicked(evt);
            }
        });
        picturebox1.add(btn_backHome);
        btn_backHome.setBounds(10, 10, 28, 21);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Email*");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Mật khẩu*");

        btn_CheckRegister.setBackground(new java.awt.Color(51, 153, 255));
        btn_CheckRegister.setForeground(new java.awt.Color(255, 255, 255));
        btn_CheckRegister.setText("Đăng ký");
        btn_CheckRegister.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        btn_CheckRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CheckRegisterActionPerformed(evt);
            }
        });

        jLabel5.setText("Bạn đã có tài khoản?");

        btn_nextLogin.setForeground(new java.awt.Color(51, 153, 255));
        btn_nextLogin.setText("Đăng nhập");
        btn_nextLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_nextLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_nextLoginMouseClicked(evt);
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
        messager_email.setText("VD: example@gmail.com");

        messager_pass.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        messager_pass.setForeground(new java.awt.Color(153, 153, 153));
        messager_pass.setText("Mật khẩu phải trên 8 chữ số.");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Tên khách hàng");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Số điện thoại");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Địa chỉ");

        picturebox3.setImage(new javax.swing.ImageIcon("D:\\Workspace\\Java\\App\\img\\pngtree-chatting-website-signing-in-page-isometric-design-with-dating-users-love-picture-image_1796202.jpg")); // NOI18N

        btn_backHome2.setImage(new javax.swing.ImageIcon("D:\\Workspace\\Java\\App\\img\\135210286.png")); // NOI18N
        btn_backHome2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_backHome2MouseClicked(evt);
            }
        });
        picturebox3.add(btn_backHome2);
        btn_backHome2.setBounds(10, 10, 28, 21);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(picturebox3, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_nextLogin)
                        .addContainerGap(105, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_CheckRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                                    .addComponent(jLabel3)
                                    .addComponent(textfield_Email, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                                    .addComponent(messager_email)
                                    .addComponent(jLabel4)
                                    .addComponent(textfield_password, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                                    .addComponent(messager_pass)
                                    .addComponent(jLabel6)
                                    .addComponent(textfield_username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textfield_address, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(textfield_numberphone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(picturebox2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(171, 171, 171))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(picturebox2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addComponent(textfield_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(messager_email)
                .addGap(13, 13, 13)
                .addComponent(jLabel4)
                .addGap(1, 1, 1)
                .addComponent(textfield_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(messager_pass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textfield_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(textfield_numberphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(textfield_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_CheckRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btn_nextLogin))
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(picturebox3, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CheckRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CheckRegisterActionPerformed
        //Code đăng ký
        String email = textfield_Email.getText();
        String password = String.valueOf(textfield_password.getPassword());
        String username = textfield_username.getText();
        String numberphone = textfield_numberphone.getText();
        String address = textfield_address.getText();
        if (email.equals("") || password.equals("") || username.equals("") || numberphone.equals("") || address.equals("")){
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
        else if(password.length() < 6 || !checkEmail(email)) {
            ImageIcon icon = new ImageIcon("D:\\Workspace\\Java\\App\\img"
                            + "\\icons8-disappointed-50.png");
            Object[] options = {"Nhập lại"};
            JOptionPane.showOptionDialog(null,
                "Mật khẩu phải lớn hơn 6 ký tự và định dang Email là example@gmail.com",
                "Thông báo",
                JOptionPane.YES_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                options,
                options[0]);
        }
        else if(!checkNumber(numberphone) || numberphone.length() != 10) {
            ImageIcon icon = new ImageIcon("D:\\Workspace\\Java\\App\\img"
                            + "\\icons8-disappointed-50.png");
            Object[] options = {"Nhập lại"};
            JOptionPane.showOptionDialog(null,
                "Số điện thoại phải có 10 số",
                "Thông báo",
                JOptionPane.YES_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                options,
                options[0]);
        }
        else {
            try {
                //Kiểm tra tài khoản này đã tồn tại hay chưa
                Connection connection = Connect.getConnection();
                Statement statement = connection.createStatement();
                String selectSql = "SELECT * FROM KHACHHANG WHERE Email = '"+ email +"'";
                ResultSet result = statement.executeQuery(selectSql);
                if(result.next()) {
                    //Tài khoản đã tồn tại
                    messager_email.setText("Tài khoản này đã tồn tại");
                    messager_email.setForeground(Color.red);
                }
                else {
                    //Đăng ký tài khoản mới
                    user user = new user(email, password, username, numberphone, address);
                    userController.Register(user);
                    Object[] options = {"Yes"};
                    JOptionPane.showOptionDialog(null,
                        "Chào mừng bạn đến với cửa hàng của chúng tôi, hãy đăng nhập",
                        "Thông báo",
                        JOptionPane.YES_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        null,
                        options,
                        options[0]);
                    dispose();
                    login lg = new login();
                    lg.show();
                }      
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }//GEN-LAST:event_btn_CheckRegisterActionPerformed

    private void btn_nextLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nextLoginMouseClicked
        login lg = new login();
        lg.show();
        this.hide();
    }//GEN-LAST:event_btn_nextLoginMouseClicked

    private void textfield_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_EmailActionPerformed
        
    }//GEN-LAST:event_textfield_EmailActionPerformed

    private void btn_backHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backHomeMouseClicked
        
    }//GEN-LAST:event_btn_backHomeMouseClicked

    private void btn_backHome2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backHome2MouseClicked
        new home().setVisible(true);
        this.hide();
    }//GEN-LAST:event_btn_backHome2MouseClicked

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new login().setVisible(true);
//            }
//        });
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new login().setVisible(true);
//            }
//        });
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new login().setVisible(true);
//            }
//        });
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new login().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Design_Item.button btn_CheckRegister;
    private Design_Item.picturebox btn_backHome;
    private Design_Item.picturebox btn_backHome2;
    private javax.swing.JLabel btn_nextLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel messager_email;
    private javax.swing.JLabel messager_pass;
    private Design_Item.picturebox picturebox1;
    private Design_Item.picturebox picturebox2;
    private Design_Item.picturebox picturebox3;
    private Design_Item.textfield textfield_Email;
    private Design_Item.textfield textfield_address;
    private Design_Item.textfield textfield_numberphone;
    private Design_Item.textfieldpassword textfield_password;
    private Design_Item.textfield textfield_username;
    // End of variables declaration//GEN-END:variables
}
