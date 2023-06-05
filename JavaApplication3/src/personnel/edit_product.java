package personnel;

import ConnectSQL.Connect;
import static ShoeAppController.checkValue.checkNumber;
import admin.*;
import ShoeAppController.productController;
import ShoeAppModel.product ;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class edit_product extends javax.swing.JFrame {
    DefaultTableModel tableModel;
    List<product> productList = new ArrayList<>();
    public edit_product() {
        initComponents();
    }
    
    int Id_sanPham = 0;
    String tenSanPham = null;
    float Gia = 0;
    int soLuong = 0;
    String Anh = null;
    int id_phanLoai = 0;
    edit_product(int id_sanPham, String tenSanPham, float Gia, int soLuong, String Anh, int id_phanLoai) {
        initComponents();
        this.Id_sanPham = id_sanPham;        
        this.tenSanPham = tenSanPham;
        this.Gia = Gia;
        this.soLuong = soLuong;
        this.Anh = Anh;
        this.id_phanLoai = id_phanLoai;
        
        String strGia = Float.toString(Gia);
        String strSoLuong = Integer.toString(soLuong);
        String strPhanLoai = Integer.toString(id_phanLoai);
        
        Id_sanPham = id_sanPham;
        textfield_NameProduct.setText(tenSanPham);
        textfield_princeProduct.setText(strGia);
        textfield_NumberProduct.setText(strSoLuong);
        textfield_imageProduct.setText(Anh);
        textfield_Loai.setText(strPhanLoai);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_EditProduct = new Design_Item.button();
        btn_Exit = new Design_Item.button();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textfield_imageProduct = new Design_Item.textfield();
        textfield_NameProduct = new Design_Item.textfield();
        textfield_princeProduct = new Design_Item.textfield();
        textfield_NumberProduct = new Design_Item.textfield();
        textfield_Loai = new Design_Item.textfield();
        btn_DeleteProduct = new Design_Item.button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Sửa sản phẩm");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Tên sản phẩm");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Số lượng");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Link Ảnh");

        btn_EditProduct.setBackground(new java.awt.Color(0, 102, 255));
        btn_EditProduct.setForeground(new java.awt.Color(255, 255, 255));
        btn_EditProduct.setText("Sửa");
        btn_EditProduct.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_EditProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditProductActionPerformed(evt);
            }
        });

        btn_Exit.setForeground(new java.awt.Color(102, 102, 102));
        btn_Exit.setText("Thoát");
        btn_Exit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExitActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Giá");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("ID Phân loại");

        btn_DeleteProduct.setForeground(new java.awt.Color(51, 153, 255));
        btn_DeleteProduct.setText("Xóa");
        btn_DeleteProduct.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_DeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btn_DeleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btn_EditProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textfield_NameProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7)
                                    .addComponent(textfield_princeProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                    .addComponent(jLabel8)
                                    .addComponent(textfield_Loai, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(textfield_NumberProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(textfield_imageProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textfield_NameProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textfield_NumberProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfield_princeProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfield_imageProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jLabel8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textfield_Loai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 96, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_DeleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_EditProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))))
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

    private void btn_EditProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditProductActionPerformed
        //code sửa thông nhân viên
        int id_SanPham = Id_sanPham;
        String tenSP = textfield_NameProduct.getText();
        String gia = textfield_princeProduct.getText();
        String soLuong = textfield_NumberProduct.getText();
        String anh = textfield_imageProduct.getText();
        String phanLoai = textfield_Loai.getText();
        
        
        if (tenSP.length() == 0 || gia.length() == 0 || soLuong.length() == 0 || phanLoai.length() == 0) {
            ImageIcon icon = new ImageIcon("D:\\Workspace\\Java\\App\\img"
                            + "\\icons8-ask-question-50.png");
            Object[] options = {"Nhập lại"};
            JOptionPane.showOptionDialog(null,
                "Nhập thiếu thông tin sản phẩm",
                "Thông báo",
                JOptionPane.YES_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                options,
                options[0]);
        }
        
        else if(!checkNumber(soLuong) || !checkNumber(gia)) {
            ImageIcon icon = new ImageIcon("D:\\Workspace\\Java\\App\\img"
                + "\\icons8-disappointed-50.png");
            Object[] options = {"Nhập lại"};
            JOptionPane.showOptionDialog(null,
                "Số lượng và giá phải là số!",
                "Thông báo",
                JOptionPane.YES_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                options,
                options[0]);
        }
        
        else {
            try {
                int soLuongInt = Integer.parseInt(soLuong);
                int loaiInt = Integer.parseInt(phanLoai);
                float giaFloat = Float.parseFloat(gia);
                
                Connection connection = Connect.getConnection();
                Statement statement = connection.createStatement();
                String selectSql = "SELECT * FROM PHANLOAI WHERE IDPhanLoai = '"+ phanLoai +"'";
                ResultSet result = statement.executeQuery(selectSql);
                if(!result.next()) {
                    ImageIcon iconfalse = new ImageIcon("D:\\Workspace\\Java\\App\\img"
                            + "\\icons8-crying-50.png");
                    Object[] options = {"Nhập lại"};
                    JOptionPane.showOptionDialog(null,
                        "Không có loại sản phẩm này!",
                        "Cảnh báo",
                        JOptionPane.YES_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        iconfalse,
                        options,
                        options[0]);
                }
                else {
                    product product = new product(id_SanPham, tenSP, giaFloat, soLuongInt, anh, loaiInt);
                    ImageIcon iconfalse = new ImageIcon("D:\\Workspace\\Java\\App\\img"
                                        + "\\icons8-crying-50.png");
                    Object[] options = {"OK"};
                    int chose = JOptionPane.showOptionDialog(null,
                        "Bạn muốn sửa thông tin " + tenSP,
                        "Cảnh báo",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        iconfalse,
                        options,
                        options[0]);
                    if (chose == 0) {
                        productController.Edit(product);
                        new product_Manager().setVisible(true);
                        this.dispose();
                    }
                }
            } catch (Exception e) {
            }
            
        }
    }//GEN-LAST:event_btn_EditProductActionPerformed

    private void btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExitActionPerformed
        new product_manager().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_ExitActionPerformed

    private void btn_DeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteProductActionPerformed
        //Code xóa thông tin sản phẩm
        int id_SanPham = Id_sanPham;
        String tenSP = textfield_NameProduct.getText();
        String gia = textfield_princeProduct.getText();
        String soLuong = textfield_NumberProduct.getText();
        String anh = textfield_imageProduct.getText();
        String phanLoai = textfield_Loai.getText();
        int soLuongInt = Integer.parseInt(soLuong);
        int loaiInt = Integer.parseInt(phanLoai);
        float giaFloat = Float.parseFloat(gia);
        product product = new product(id_SanPham, tenSP, giaFloat, soLuongInt, anh, loaiInt);
        ImageIcon iconfalse = new ImageIcon("D:\\Workspace\\Java\\App\\img"
                            + "\\icons8-crying-50.png");
        Object[] options = {"OK"};
        int chose = JOptionPane.showOptionDialog(null,
            "Bạn muốn xóa " + tenSP,
            "Cảnh báo",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            iconfalse,
            options,
            options[0]);
        if (chose == 0) {
            productController.Delete(product);
            new product_manager().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btn_DeleteProductActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new edit_product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Design_Item.button btn_DeleteProduct;
    private Design_Item.button btn_EditProduct;
    private Design_Item.button btn_Exit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private Design_Item.textfield textfield_Loai;
    private Design_Item.textfield textfield_NameProduct;
    private Design_Item.textfield textfield_NumberProduct;
    private Design_Item.textfield textfield_imageProduct;
    private Design_Item.textfield textfield_princeProduct;
    // End of variables declaration//GEN-END:variables
}
