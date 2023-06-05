package admin;

import ConnectSQL.Connect;
import ShoeAppController.orderController;
import ShoeAppModel.order;
import static ShoeAppController.checkValue.checkNumber;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class edit_Order extends javax.swing.JFrame {
    public edit_Order() {
        initComponents();
    }
    
    int id_DonHang = 0;
    int id_SanPham = 0;
    int id_KhachHang = 0;
    int id_QuanLy = 0;
    int SoLuongSanPham = 0;
    String NgayDat = null;
    edit_Order(int id_DonHang, int id_SanPham, int id_KhachHang, 
            int id_QuanLy, int SoLuongSanPham, String NgayDat) {
        initComponents();
        this.id_DonHang = id_DonHang;        
        this.id_SanPham = id_SanPham;
        this.id_KhachHang = id_KhachHang;
        this.id_QuanLy = id_QuanLy;
        this.SoLuongSanPham = SoLuongSanPham;
        this.NgayDat = NgayDat;
        
        String strId_SanPham = Integer.toString(id_SanPham);
        String strId_KhachHang = Integer.toString(id_KhachHang);
        String strId_QuanLy = Integer.toString(id_QuanLy);
        String strSoLuongSanPham = Integer.toString(SoLuongSanPham);
        
        String date = NgayDat;
        String[] dateParts = date.split("-");
        String day = dateParts[2]; 
        String month = dateParts[1];
        String year = dateParts[0];
        id_DonHang = id_DonHang;
        
        textfield_IDSanPham.setText(strId_SanPham);
        textfield_IDKhachHang.setText(strId_KhachHang);
        textfield_IDNhanVien.setText(strId_QuanLy);
        textfield_SoLuongSanPham.setText(strSoLuongSanPham);
        textfield_day.setText(day);
        textfield_month.setText(month);
        textfield_year.setText(year);
    }
    
    
    public boolean isValidDate(String userInput) {
        try {
            LocalDate inputDate = LocalDate.parse(userInput);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_EditOrder = new Design_Item.button();
        btn_Exit = new Design_Item.button();
        textfield_IDKhachHang = new Design_Item.textfield();
        textfield_IDSanPham = new Design_Item.textfield();
        textfield_IDNhanVien = new Design_Item.textfield();
        textfield_year = new Design_Item.textfield();
        textfield_day = new Design_Item.textfield();
        textfield_month = new Design_Item.textfield();
        btn_DeleteOrder = new Design_Item.button();
        textfield_SoLuongSanPham = new Design_Item.textfield();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Thông tin đơn hàng");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Mã sản phẩm");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Mã nhân viên");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Mã khách hàng");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Ngày đặt");

        btn_EditOrder.setBackground(new java.awt.Color(0, 102, 255));
        btn_EditOrder.setForeground(new java.awt.Color(255, 255, 255));
        btn_EditOrder.setText("Sửa");
        btn_EditOrder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_EditOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditOrderActionPerformed(evt);
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

        btn_DeleteOrder.setForeground(new java.awt.Color(0, 153, 204));
        btn_DeleteOrder.setText("Xóa");
        btn_DeleteOrder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_DeleteOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteOrderActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Số lượng sản phẩm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textfield_IDSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(textfield_IDNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(textfield_SoLuongSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(textfield_IDKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textfield_day, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textfield_month, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textfield_year, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addGap(68, 68, 68))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_DeleteOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_EditOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
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
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textfield_IDSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textfield_IDKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfield_IDNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfield_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfield_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfield_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textfield_SoLuongSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_EditOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_DeleteOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_EditOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditOrderActionPerformed
        
        String ID_SanPham = textfield_IDSanPham.getText();
        String ID_KhachHang = textfield_IDKhachHang.getText();
        String ID_NhanVien = textfield_IDNhanVien.getText();
        String SoLuongSanPham = textfield_SoLuongSanPham.getText();
        String day = textfield_day.getText();
        String month = textfield_month.getText();
        String year = textfield_year.getText();
        String time = month + "-" + day + "-" + year;
        
        String timeCheck = year + "-" + month + "-" + day;
        
        if(!isValidDate(timeCheck)) {
            ImageIcon icon = new ImageIcon("D:\\Workspace\\Java\\App\\img"
                + "\\icons8-disappointed-50.png");
            Object[] options = {"Nhập lại"};
            JOptionPane.showOptionDialog(null,
                "Ngày, tháng, năm sai định dạng!",
                "Thông báo",
                JOptionPane.YES_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                options,
                options[0]);
        }
        if(ID_SanPham.length() == 0 || ID_KhachHang.length() == 0 || ID_NhanVien.length() == 0
                 || SoLuongSanPham.length() == 0 || day.length() == 0 || month.length() == 0 || year.length() == 0) {
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
        else if(!checkNumber(SoLuongSanPham)) {
            ImageIcon icon = new ImageIcon("D:\\Workspace\\Java\\App\\img"
                            + "\\icons8-disappointed-50.png");
            Object[] options = {"Nhập lại"};
            JOptionPane.showOptionDialog(null,
                "Số lượng phải là số nguyên lớn hơn 0",
                "Thông báo",
                JOptionPane.YES_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                options,
                options[0]);
        }
        else if(!checkNumber(ID_SanPham) || !checkNumber(ID_KhachHang) || !checkNumber(ID_NhanVien)) {
            ImageIcon icon = new ImageIcon("D:\\Workspace\\Java\\App\\img"
                + "\\icons8-disappointed-50.png");
            Object[] options = {"Nhập lại"};
            JOptionPane.showOptionDialog(null,
                "Các trường ID phải là số!",
                "Thông báo",
                JOptionPane.YES_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                options,
                options[0]);
        }
        else if(!checkNumber(day) || !checkNumber(month) || !checkNumber(year)) {
            ImageIcon icon = new ImageIcon("D:\\Workspace\\Java\\App\\img"
                + "\\icons8-disappointed-50.png");
            Object[] options = {"Nhập lại"};
            JOptionPane.showOptionDialog(null,
                "Các ô nhập ngày, tháng, năm phải là số!",
                "Thông báo",
                JOptionPane.YES_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                options,
                options[0]);
        }
        else {
            try {
                int ID_DonHang = id_DonHang;
                int ID_SanPhamInt = Integer.parseInt(ID_SanPham);
                int ID_KhachHangInt = Integer.parseInt(ID_KhachHang);
                int ID_NhanVienInt = Integer.parseInt(ID_NhanVien);
                int SoLuongSanPhamInt = Integer.parseInt(SoLuongSanPham);

                Connection connection = Connect.getConnection();
                Statement statement = connection.createStatement();
                String selectSql = "SELECT * FROM SANPHAM WHERE IDSanPham = '"+ ID_SanPham +"'";
                ResultSet result = statement.executeQuery(selectSql);
                if(!result.next()) {
                    ImageIcon iconfalse = new ImageIcon("D:\\Workspace\\Java\\App\\img"
                            + "\\icons8-crying-50.png");
                    Object[] options = {"Nhập lại"};
                    JOptionPane.showOptionDialog(null,
                        "Không có sản phẩm này!",
                        "Cảnh báo",
                        JOptionPane.YES_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        iconfalse,
                        options,
                        options[0]);
                }
                else {
                    String selectSqlKH = "SELECT * FROM KHACHHANG WHERE IDKhachHang = '"+ ID_KhachHang +"'";
                    ResultSet resultKH = statement.executeQuery(selectSqlKH);
                    if(!resultKH.next()) {
                        ImageIcon iconfalse = new ImageIcon("D:\\Workspace\\Java\\App\\img"
                                + "\\icons8-crying-50.png");
                        Object[] options = {"Nhập lại"};
                        JOptionPane.showOptionDialog(null,
                            "Không có khách hàng có mã là " + ID_KhachHang + " trong của hàng!",
                            "Cảnh báo",
                            JOptionPane.YES_OPTION,
                            JOptionPane.INFORMATION_MESSAGE,
                            iconfalse,
                            options,
                            options[0]);
                    }
                    else {
                        String selectSqlNV = "SELECT * FROM QUANLY WHERE IDQuanLy = '"+ ID_NhanVien +"'";
                        ResultSet resultNV = statement.executeQuery(selectSqlNV);
                        if(!resultNV.next()) {
                            ImageIcon iconfalse = new ImageIcon("D:\\Workspace\\Java\\App\\img"
                                    + "\\icons8-crying-50.png");
                            Object[] options = {"Nhập lại"};
                            JOptionPane.showOptionDialog(null,
                                "Không có nhân viên có mã là " + ID_KhachHang + " trong của hàng!",
                                "Cảnh báo",
                                JOptionPane.YES_OPTION,
                                JOptionPane.INFORMATION_MESSAGE,
                                iconfalse,
                                options,
                                options[0]);
                        }
                        else {
                            //Sửa thông tin đơn hàng
                            order order = new order(ID_DonHang,ID_SanPhamInt, 
                                    ID_KhachHangInt, ID_NhanVienInt, SoLuongSanPhamInt, time);
                            ImageIcon iconfalse = new ImageIcon("D:\\Workspace\\Java\\App\\img"
                                                + "\\icons8-crying-50.png");
                            Object[] options = {"OK"};
                            int chose = JOptionPane.showOptionDialog(null,
                                "Bạn muốn sửa thông tin đơn hàng " + ID_DonHang,
                                "Cảnh báo",
                                JOptionPane.YES_NO_OPTION,
                                JOptionPane.INFORMATION_MESSAGE,
                                iconfalse,
                                options,
                                options[0]);
                            if (chose == 0) {
                                orderController.Edit(order);
                                new order_Manager().setVisible(true);
                                this.dispose();
                            }
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btn_EditOrderActionPerformed

    private void btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExitActionPerformed
        new order_Manager().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_ExitActionPerformed

    private void btn_DeleteOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteOrderActionPerformed
        int ID_DonHang = id_DonHang;
        String ID_SanPham = textfield_IDSanPham.getText();
        int ID_SanPhamInt = Integer.parseInt(ID_SanPham);
        String ID_KhachHang = textfield_IDKhachHang.getText();
        int ID_KhachHangInt = Integer.parseInt(ID_KhachHang);
        String ID_NhanVien = textfield_IDNhanVien.getText();
        int ID_NhanVienInt = Integer.parseInt(ID_NhanVien);
        String SoLuongSanPham = textfield_SoLuongSanPham.getText();
        int SoLuongSanPhamInt = Integer.parseInt(SoLuongSanPham);
        String day = textfield_day.getText();
        String month = textfield_month.getText();
        String year = textfield_year.getText();
        String time = month + "-" + day + "-" + year;
        
        order order = new order(ID_DonHang,ID_SanPhamInt, 
                    ID_KhachHangInt, ID_NhanVienInt, SoLuongSanPhamInt, time);
        
        ImageIcon iconfalse = new ImageIcon("D:\\Workspace\\Java\\App\\img"
                            + "\\icons8-crying-50.png");
        Object[] options = {"OK"};
        int chose = JOptionPane.showOptionDialog(null,
            "Bạn muốn xóa đơn hàng " + ID_DonHang,
            "Cảnh báo",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            iconfalse,
            options,
            options[0]);
        if (chose == 0) {
            orderController.Delete(order);
            new order_Manager().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btn_DeleteOrderActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new edit_Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Design_Item.button btn_DeleteOrder;
    private Design_Item.button btn_EditOrder;
    private Design_Item.button btn_Exit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private Design_Item.textfield textfield_IDKhachHang;
    private Design_Item.textfield textfield_IDNhanVien;
    private Design_Item.textfield textfield_IDSanPham;
    private Design_Item.textfield textfield_SoLuongSanPham;
    private Design_Item.textfield textfield_day;
    private Design_Item.textfield textfield_month;
    private Design_Item.textfield textfield_year;
    // End of variables declaration//GEN-END:variables
}
