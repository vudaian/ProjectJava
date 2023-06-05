package User;

import ConnectSQL.Connect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.sql.SQLException;

public class product_details extends javax.swing.JFrame {
    DefaultTableModel tableModel;
    List<ShoeAppModel.product> productList = new ArrayList<>();
    List<String> myStringList = new ArrayList<String>();
    public product_details() {
        initComponents();
    }
    
    String tenSanPham = null;
    String Gia = null;
    String soLuong = null;
    String Loai = null;
    
    product_details(String tenSanPham, String Gia, String soLuong, String Loai) {
        initComponents();
        this.tenSanPham = tenSanPham;
        this.Gia = Gia;
        this.soLuong = soLuong;
        this.Loai = Loai;
        
        Label_tenSanPham.setText(tenSanPham);
        Label_Gia.setText(Gia);
        Label_Loai.setText(Loai);
        
        ResultSet resultSet = null;
        String imgStr = null;
        try (Connection connection = DriverManager.getConnection(Connect.connectionUrl);
                Statement statement = connection.createStatement();) {
            String selectSql = "SELECT * from SANPHAM WHERE TenSanPham = '"+ tenSanPham +"'";
            resultSet = statement.executeQuery(selectSql);

            while (resultSet.next()) {
                imgStr = resultSet.getString(5);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        
        ImageIcon icon = new ImageIcon(imgStr);
        JLabel label = new JLabel(icon);
        label.setBounds(30,40,354,340);
        jPanel2.add(label);
        setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Label_tenSanPham = new javax.swing.JLabel();
        Label_Gia = new javax.swing.JLabel();
        Label_Loai = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btn_buy = new javax.swing.JButton();
        btn_Exit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jPanel2ComponentAdded(evt);
            }
        });

        Label_tenSanPham.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        Label_tenSanPham.setForeground(new java.awt.Color(102, 102, 102));
        Label_tenSanPham.setText("Tên sản phẩm");

        Label_Gia.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Label_Gia.setForeground(new java.awt.Color(255, 51, 51));
        Label_Gia.setText("69.000");

        Label_Loai.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Label_Loai.setForeground(new java.awt.Color(102, 102, 102));
        Label_Loai.setText("Loại ");

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Thêm vào giỏ hàng");

        btn_buy.setBackground(new java.awt.Color(0, 153, 255));
        btn_buy.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_buy.setForeground(new java.awt.Color(255, 255, 255));
        btn_buy.setText("Mua ngay");
        btn_buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buyActionPerformed(evt);
            }
        });

        btn_Exit.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_Exit.setText("X");
        btn_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_buy, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Label_Loai)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Label_tenSanPham)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Label_Gia)
                                .addGap(28, 28, 28))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Exit)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Exit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 355, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_tenSanPham)
                    .addComponent(Label_Gia))
                .addGap(18, 18, 18)
                .addComponent(Label_Loai)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buy, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ExitMouseClicked
        ImageIcon icon = new ImageIcon("D:\\Workspace\\Java\\App\\img"
                                + "\\icons8-ask-question-50.png");
        Object[] options = {"Đúng", "Không"};
        int dialogResult = 
            JOptionPane.showOptionDialog(null,
            "Bạn chưa muốn mua hàng",
            "Cảnh báo",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE,
            icon,
            options,
            options[0]);
        if(dialogResult == JOptionPane.YES_OPTION)
        {
            new product().setVisible(true);
            this.hide();
        }
    }//GEN-LAST:event_btn_ExitMouseClicked

    private void jPanel2ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jPanel2ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2ComponentAdded

    private void btn_buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buyActionPerformed
        new orderProduct(tenSanPham, Gia, soLuong, Loai).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_buyActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new product_details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_Gia;
    private javax.swing.JLabel Label_Loai;
    private javax.swing.JLabel Label_tenSanPham;
    private javax.swing.JLabel btn_Exit;
    private javax.swing.JButton btn_buy;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}