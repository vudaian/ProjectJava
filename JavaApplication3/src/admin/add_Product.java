package admin;

import ConnectSQL.Connect;
import ShoeAppController.productController;
import ShoeAppModel.product;
import static ShoeAppController.checkValue.checkNumber;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class add_Product extends javax.swing.JFrame {
    public add_Product() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_AddProduct = new Design_Item.button();
        btn_Exit = new Design_Item.button();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textfield_imageProduct = new Design_Item.textfield();
        textfield_NameProduct = new Design_Item.textfield();
        textfield_princeProduct = new Design_Item.textfield();
        textfield_NumberProduct = new Design_Item.textfield();
        textfield_Loai = new Design_Item.textfield();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Thêm sản phẩm");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Tên sản phẩm");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Số lượng");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Link Ảnh");

        btn_AddProduct.setBackground(new java.awt.Color(0, 102, 255));
        btn_AddProduct.setForeground(new java.awt.Color(255, 255, 255));
        btn_AddProduct.setText("Lưu");
        btn_AddProduct.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_AddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddProductActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btn_AddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(50, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textfield_Loai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_AddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
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

    private void btn_AddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddProductActionPerformed
        String tenSP = textfield_NameProduct.getText();
        String gia = textfield_princeProduct.getText();
        String soLuong = textfield_NumberProduct.getText();
        String anh = textfield_imageProduct.getText();
        String phanLoai = textfield_Loai.getText();
        
        if(tenSP.length() == 0 || phanLoai.length() == 0 || soLuong.length() == 0 || anh.length() == 0 || gia.length() == 0) {
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
        else if(!checkNumber(soLuong) || !checkNumber(gia) || !checkNumber(phanLoai)) {
            ImageIcon icon = new ImageIcon("D:\\Workspace\\Java\\App\\img"
                + "\\icons8-disappointed-50.png");
            Object[] options = {"Nhập lại"};
            JOptionPane.showOptionDialog(null,
                "Số lượng, giá và ID phân loại phải là số!",
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
                
                String id_ProductString;
                int id_ProductInt = 0;
                //Kiểm tra id sản phẩm tự tăng
                Connection connection = Connect.getConnection();
                Statement statement = connection.createStatement();
                String IdSql = "SELECT MAX(IDSanPham) FROM SANPHAM";
                ResultSet resultId = statement.executeQuery(IdSql);
                while (resultId.next()) {
                    id_ProductString = resultId.getString(1);
                    id_ProductInt = Integer.parseInt(id_ProductString);
                    id_ProductInt++;
                }
                
                String selectSql = "SELECT * FROM SANPHAM WHERE TenSanPham = '"+ tenSP +"'";
                ResultSet result = statement.executeQuery(selectSql);
                
                if(result.next()) {
                    ImageIcon iconfalse = new ImageIcon("D:\\Workspace\\Java\\App\\img"
                            + "\\icons8-crying-50.png");
                    Object[] options = {"Nhập lại"};
                    JOptionPane.showOptionDialog(null,
                        "Sản phẩm này đã tồn tại!",
                        "Cảnh báo",
                        JOptionPane.YES_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        iconfalse,
                        options,
                        options[0]);
                }
                
                else {
                    String selectSqlLoai = "SELECT * FROM PHANLOAI WHERE IDPhanLoai = '"+ phanLoai +"'";
                    ResultSet resultLoai = statement.executeQuery(selectSqlLoai);
                    
                    if(!resultLoai.next()) {
                        ImageIcon iconfalse = new ImageIcon("D:\\Workspace\\Java\\App\\img"
                                + "\\icons8-crying-50.png");
                        Object[] options = {"Nhập lại"};
                        JOptionPane.showOptionDialog(null,
                            "Không có loại giày " + phanLoai + " trong của hàng!",
                            "Cảnh báo",
                            JOptionPane.YES_OPTION,
                            JOptionPane.INFORMATION_MESSAGE,
                            iconfalse,
                            options,
                            options[0]);
                    }
                    else {
                        product product = new product(id_ProductInt, tenSP, giaFloat, soLuongInt, anh, loaiInt);
                        Object[] options = {"OK"};
                        int chose = JOptionPane.showOptionDialog(null,
                            "Thêm thành công sản phẩm",
                            "Thông báo",
                            JOptionPane.YES_OPTION,
                            JOptionPane.INFORMATION_MESSAGE,
                            null,
                            options,
                            options[0]);
                        if (chose == 0) {
                            productController.insertProduct(product);
                            new product_Manager().setVisible(true);
                            this.dispose();
                        }
                    } 
                }

            } catch (Exception e) {
                e.getMessage();
            }
        }
    }//GEN-LAST:event_btn_AddProductActionPerformed

    private void btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExitActionPerformed
        new product_Manager().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_ExitActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_Product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Design_Item.button btn_AddProduct;
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
