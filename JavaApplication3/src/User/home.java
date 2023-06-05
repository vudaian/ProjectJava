package User;

import admin.login_admin;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class home extends javax.swing.JFrame {
    public home() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        panel2 = new Design_Item.panel();
        btn_Close = new javax.swing.JLabel();
        picturebox1 = new Design_Item.picturebox();
        jLabel2 = new javax.swing.JLabel();
        Next_btnRegister = new Design_Item.button();
        Next_btnLogin = new Design_Item.button();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        panel2.setBackground(new java.awt.Color(255, 255, 255));

        btn_Close.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_Close.setText("X");
        btn_Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CloseMouseClicked(evt);
            }
        });

        picturebox1.setImage(new javax.swing.ImageIcon("D:\\Workspace\\Java\\App\\img\\z2141131059396_38873119835434492c2749e13e4604aa.jpg")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setText("WELCOME MY APP");
        picturebox1.add(jLabel2);
        jLabel2.setBounds(60, 40, 450, 80);

        Next_btnRegister.setText("Register");
        Next_btnRegister.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Next_btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next_btnRegisterActionPerformed(evt);
            }
        });
        picturebox1.add(Next_btnRegister);
        Next_btnRegister.setBounds(220, 320, 120, 40);

        Next_btnLogin.setBackground(new java.awt.Color(51, 153, 255));
        Next_btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        Next_btnLogin.setText("Login");
        Next_btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Next_btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next_btnLoginActionPerformed(evt);
            }
        });
        picturebox1.add(Next_btnLogin);
        Next_btnLogin.setBounds(70, 320, 120, 40);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Designs that you will love, from our store to your feet.");
        picturebox1.add(jLabel7);
        jLabel7.setBounds(60, 150, 440, 40);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("*Sản phẩm này của công ty Mr.An");
        picturebox1.add(jLabel1);
        jLabel1.setBounds(540, 400, 170, 16);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("The shoes are as unique as the person wearing them.");
        picturebox1.add(jLabel8);
        jLabel8.setBounds(60, 180, 430, 40);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("You can buy all kinds of shoes here");
        picturebox1.add(jLabel9);
        jLabel9.setBounds(60, 120, 300, 40);

        jLabel3.setText("HOME");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setText("ABOUT");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel5.setText("ADMIN");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 153, 255));
        jLabel6.setText("CongChua");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addGap(145, 145, 145)
                .addComponent(jLabel3)
                .addGap(57, 57, 57)
                .addComponent(jLabel4)
                .addGap(57, 57, 57)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addComponent(btn_Close)
                .addContainerGap())
            .addComponent(picturebox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_Close)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(picturebox1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btn_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CloseMouseClicked
        ImageIcon icon = new ImageIcon("D:\\Workspace\\Java\\App\\img"
                                + "\\icons8-ask-question-50.png");
        Object[] options = {"Có", "Không"};
        int dialogResult = 
            JOptionPane.showOptionDialog(null,
            "Bạn muốn thoát chương trình",
            "Cảnh báo",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE,
            icon,
            options,
            options[0]);
        if(dialogResult == JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_btn_CloseMouseClicked

    private void Next_btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next_btnRegisterActionPerformed
        new register().setVisible(true);
        this.hide();
    }//GEN-LAST:event_Next_btnRegisterActionPerformed

    private void Next_btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next_btnLoginActionPerformed
        new login().setVisible(true);
        this.hide();
    }//GEN-LAST:event_Next_btnLoginActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        new login_admin().setVisible(true);
        this.hide();
    }//GEN-LAST:event_jLabel5MouseClicked

    public static void main(String args[]) {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Design_Item.button Next_btnLogin;
    private Design_Item.button Next_btnRegister;
    private javax.swing.JLabel btn_Close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private Design_Item.panel panel2;
    private Design_Item.picturebox picturebox1;
    // End of variables declaration//GEN-END:variables
}
