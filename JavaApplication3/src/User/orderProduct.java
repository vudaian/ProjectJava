package User;

import ConnectSQL.Connect;
import ShoeAppController.orderController;
import ShoeAppController.productController;
import ShoeAppController.userController;
import ShoeAppModel.user;
import ShoeAppModel.order;
import ShoeAppModel.product;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class orderProduct extends javax.swing.JFrame {
    List<ShoeAppModel.user> UserList = new ArrayList<>();
    
    public orderProduct() {
        initComponents();
    }
    String tenSanPham = null;
    String Gia = null;
    String soLuong = null;
    String Loai = null;
    
    orderProduct(String tenSanPham, String Gia, String soLuong, String Loai) {
        initComponents();
        this.tenSanPham = tenSanPham;
        this.Gia = Gia;
        this.soLuong = soLuong;
        this.Loai = Loai;
        
        label_TenSanPham.setText(tenSanPham);
        int soLuongInt = Integer.parseInt(this.soLuong);
        Integer[] values = new Integer[soLuongInt];
        for (int i = 0; i < soLuongInt; i++) {
            values[i] = i + 1; 
        }
        ComboBox_SoLuong.setModel(new DefaultComboBoxModel<>(values));
        showInfo();
    }
    
    public void showInfo() {
        String emailKH = login.Name_User;
        UserList = userController.findKH(emailKH);
        
        String tenKh = null;
        String sdtKH = null;
        String diaChiKH = null;
        
        for (user user : UserList) {
            tenKh = user.getTenKhachHang();
            sdtKH = user.getSoDienThoai();
            diaChiKH = user.getDiaChi();
            lable_TenKhachHang.setText(user.getTenKhachHang());
            lable_SoDienThoai.setText(user.getSoDienThoai());
            lable_DiaChi.setText(user.getDiaChi());
        }
        Date currentDate = new Date();
        SimpleDateFormat date1 = new SimpleDateFormat("dd-MM-yyyy");
        String strDate1 = date1.format(currentDate);
        lable_NgayDat.setText(strDate1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel1 = new Design_Item.panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        textfield_NhanVien = new Design_Item.textfield();
        jLabel16 = new javax.swing.JLabel();
        btn_Order = new Design_Item.button();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        label_TenSanPham = new javax.swing.JLabel();
        lable_TenKhachHang = new javax.swing.JLabel();
        lable_SoDienThoai = new javax.swing.JLabel();
        lable_DiaChi = new javax.swing.JLabel();
        lable_NgayDat = new javax.swing.JLabel();
        ComboBox_SoLuong = new Design_Item.ComboBoxSuggestion();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        panel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 38)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("1");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("2");

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("STEP 1");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 153));
        jLabel6.setText("PRODUCT INFO");

        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("STEP 2");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PAY");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("3");

        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("STEP 3");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("PAY");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addComponent(jLabel1))
                .addGap(80, 80, 80)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)))
                .addGap(67, 67, 67))
        );

        jLabel3.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Product Info");

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Please fill out the information completely!");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Tên sản phẩm");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Tên khách hàng");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Số điện thoại khách hàng");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Địa chỉ khách hàng");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Ngày đặt");

        btn_Order.setBackground(new java.awt.Color(51, 153, 255));
        btn_Order.setForeground(new java.awt.Color(255, 255, 255));
        btn_Order.setText("Thanh toán");
        btn_Order.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OrderActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Số lượng");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Nhân viên bán hàng");

        label_TenSanPham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_TenSanPham.setForeground(new java.awt.Color(102, 102, 102));
        label_TenSanPham.setText("Tên sản phẩm");

        lable_TenKhachHang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lable_TenKhachHang.setForeground(new java.awt.Color(102, 102, 102));
        lable_TenKhachHang.setText("Số điện thoại khách hàng");

        lable_SoDienThoai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lable_SoDienThoai.setForeground(new java.awt.Color(102, 102, 102));
        lable_SoDienThoai.setText("Số điện thoại khách hàng");

        lable_DiaChi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lable_DiaChi.setForeground(new java.awt.Color(102, 102, 102));
        lable_DiaChi.setText("Số điện thoại khách hàng");

        lable_NgayDat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lable_NgayDat.setForeground(new java.awt.Color(102, 102, 102));
        lable_NgayDat.setText("Số điện thoại khách hàng");

        ComboBox_SoLuong.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_TenSanPham)
                            .addComponent(lable_TenKhachHang)
                            .addComponent(lable_SoDienThoai)
                            .addComponent(lable_DiaChi)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(223, 223, 223))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(184, 184, 184)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addComponent(jLabel18)
                            .addComponent(jLabel12)
                            .addComponent(jLabel17)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(128, 128, 128)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ComboBox_SoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lable_NgayDat)))
                            .addComponent(textfield_NhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Order, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(label_TenSanPham))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(lable_TenKhachHang))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(lable_SoDienThoai))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(lable_DiaChi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(lable_NgayDat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(ComboBox_SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textfield_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Order, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(40, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))))
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

    private void btn_OrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OrderActionPerformed
        String tenNhanVien = textfield_NhanVien.getText();
        String soLuong = ComboBox_SoLuong.getSelectedItem().toString();
        
        Date currentDate = new Date();
        SimpleDateFormat date = new SimpleDateFormat("MM-dd-yyyy");
        String strDate = date.format(currentDate);
        
        
        if (tenNhanVien.length() == 0) {
            ImageIcon icon = new ImageIcon("D:\\Workspace\\Java\\App\\img"
                            + "\\icons8-ask-question-50.png");
            Object[] options = {"Nhập lại"};
            JOptionPane.showOptionDialog(null,
                "Nhập thiếu thông tin nhân viên bán hàng",
                "Thông báo",
                JOptionPane.YES_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                options,
                options[0]);
        } else {
            try {
                String strGia = this.Gia;
                int intGia = Integer.parseInt(strGia);
                int soluongInt = Integer.parseInt(soLuong);
                
                Connection connection = Connect.getConnection();
                Statement statement = connection.createStatement();
                
                String id_DonHangString;
                int id_DonHangInt = 0;
                String IdDonHangSql = "SELECT MAX(IDDonHang) FROM DONHANG";
                ResultSet resultdDonHang = statement.executeQuery(IdDonHangSql);
                while (resultdDonHang.next()) {
                    id_DonHangString = resultdDonHang.getString(1);
                    id_DonHangInt = Integer.parseInt(id_DonHangString);
                    id_DonHangInt++;
                }
                
                String id_SanPhamString;
                int id_SanPhamInt = 0;
                String IdSanPhamSql = "SELECT * FROM SANPHAM WHERE TenSanPham = '"+ label_TenSanPham.getText() +"'";
                ResultSet resultIdSanPham = statement.executeQuery(IdSanPhamSql);
                while (resultIdSanPham.next()) {
                    id_SanPhamString = resultIdSanPham.getString(1);
                    id_SanPhamInt = Integer.parseInt(id_SanPhamString);
                }
                
                String id_KhachHangString;
                int id_KhachHangInt = 0;
                String IdKhachHangSql = "SELECT * FROM KHACHHANG WHERE TenKhachHang = '"+ lable_TenKhachHang.getText() +"'";
                ResultSet resultKhachHang = statement.executeQuery(IdKhachHangSql);
                while (resultKhachHang.next()) {
                    id_KhachHangString = resultKhachHang.getString(1);
                    id_KhachHangInt = Integer.parseInt(id_KhachHangString);
                }
                
                String id_NhanVienString;
                int id_NhanVienInt = 0;
                String IDNhanVienSql = "SELECT * FROM QUANLY WHERE TenQuanLy = '"+ tenNhanVien +"'";
                ResultSet resultIDNhanVien = statement.executeQuery(IDNhanVienSql);
                while (resultIDNhanVien.next()) {
                    id_NhanVienString = resultIDNhanVien.getString(1);
                    id_NhanVienInt = Integer.parseInt(id_NhanVienString);
                }
                if(id_NhanVienInt == 0) {
                    ImageIcon iconfalse = new ImageIcon("D:\\Workspace\\Java\\App\\img"
                            + "\\icons8-crying-50.png");
                    Object[] options = {"Nhập lại"};
                    JOptionPane.showOptionDialog(null,
                        "Không có nhân viên tên là " + tenNhanVien + " trong cửa hàng!",
                        "Cảnh báo",
                        JOptionPane.YES_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        iconfalse,
                        options,
                        options[0]);
                }
                else {
                    int soLuongIntAfter = Integer.parseInt(this.soLuong);
                    int soLuongIntBefor = soLuongIntAfter - soluongInt;
                    System.out.println(soLuongIntBefor);
                    order order = new order(id_DonHangInt,id_SanPhamInt, 
                        id_KhachHangInt, id_NhanVienInt, soluongInt, strDate);
                    product product = new product(id_SanPhamInt,soLuongIntBefor);
                    
                    productController.EditOrderProduct(product);
                    orderController.Insert(order);
                    Object[] options = {"Thanh toán", "Không"};
                    JOptionPane.showOptionDialog(null,
                        "Bạn muốn thanh toán?",
                        "Thông báo",
                        JOptionPane.YES_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        null,
                        options,
                        options[0]);
                    dispose();
                    new payProduct(id_DonHangInt, intGia, soluongInt).setVisible(true);
                    this.hide();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
    }//GEN-LAST:event_btn_OrderActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new orderProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Design_Item.ComboBoxSuggestion ComboBox_SoLuong;
    private Design_Item.button btn_Order;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_TenSanPham;
    private javax.swing.JLabel lable_DiaChi;
    private javax.swing.JLabel lable_NgayDat;
    private javax.swing.JLabel lable_SoDienThoai;
    private javax.swing.JLabel lable_TenKhachHang;
    private Design_Item.panel panel1;
    private Design_Item.textfield textfield_NhanVien;
    // End of variables declaration//GEN-END:variables
}
