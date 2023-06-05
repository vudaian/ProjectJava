package ShoeAppController;

import ConnectSQL.Connect;
import ShoeAppModel.order;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class orderController {
    public static List<order> findAll() {
        Statement statement = null;
        List<order> listNCC = new ArrayList<>();
        
        try {
            Connection connection = DriverManager.getConnection(Connect.connectionUrl);
            String sql = "select * from DONHANG";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                order order = new order(
                    resultSet.getInt("IDDonHang"),
                    resultSet.getInt("IDSanPham"),
                    resultSet.getInt("IDKhachHang"),    
                    resultSet.getInt("IDQuanLy"),
                    resultSet.getInt("SoLuongSanPham"),
                    resultSet.getString("NgayDat")
                );
                listNCC.add(order);
            }
        } catch (SQLException ex) {
            System.err.println("Cannot connect database, " + ex);
        }
        return listNCC;
    }
    
    public static void Insert(order order) {
        PreparedStatement statementOrder = null;
        try {
            Connection connection = DriverManager.getConnection(Connect.connectionUrl);
            
            String sqlOrder = "insert into DONHANG (IDDonHang, IDSanPham, IDKhachHang, IDQuanLy, SoLuongSanPham, NgayDat) "
                    + "values (?, ?, ?, ?, ?, ?)";
            statementOrder = connection.prepareCall(sqlOrder);
            
            statementOrder.setInt(1, order.getId_donhang());
            statementOrder.setInt(2, order.getId_sanpham());
            statementOrder.setInt(3, order.getId_khachhang());
            statementOrder.setInt(4, order.getId_quanly());
            statementOrder.setInt(5, order.getSoLuong());
            statementOrder.setString(6, order.getNgaydat());
            
            statementOrder.execute();
            
        } catch (SQLException ex) {
            System.out.println("Loi: " + ex);
        }
    }
    
    public static void Delete(order order) {
        PreparedStatement statementOrder = null;
        try {
            Connection connection = DriverManager.getConnection(Connect.connectionUrl);
            
            String sqlOrder = "delete from DONHANG where IDDonHang = ?";
            statementOrder = connection.prepareCall(sqlOrder);
            statementOrder.setInt(1, order.getId_donhang());
            statementOrder.execute();
            
        } catch (SQLException ex) {
            System.out.println("Loi: " + ex);
        }
    }
    
    public static void Edit(order order) {
        PreparedStatement statementOrder = null;
        try {
            Connection connection = DriverManager.getConnection(Connect.connectionUrl);
            
            String sqlOrder = "update DONHANG set "
                    + "IDSanPham = ?, IDKhachHang = ?, IDQuanLy = ?, "
                    + "SoLuongSanPham = ?, NgayDat = ? where IDDonHang = ?";
            statementOrder = connection.prepareCall(sqlOrder);
            statementOrder.setInt(6, order.getId_donhang());
            statementOrder.setInt(1, order.getId_sanpham());
            statementOrder.setInt(2, order.getId_khachhang());
            statementOrder.setInt(3, order.getId_quanly());
            statementOrder.setInt(4, order.getSoLuong());
            statementOrder.setString(5, order.getNgaydat());
            
            statementOrder.execute();
            
        } catch (SQLException ex) {
            System.out.println("Loi: " + ex);
        }
    }
}
