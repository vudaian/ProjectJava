package ShoeAppController;

import ConnectSQL.Connect;
import ShoeAppModel.user;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class userController {
    public static int LogIn(user acc) {
        try {
            Connection connection = DriverManager.getConnection(Connect.connectionUrl);
            String selectSql = "select IDKhachHang, Email, MatKhau, TenKhachHang, SoDienThoai, DiaChi from KHACHHANG "
                    + "where Email = ? and MatKhau = ?";
            PreparedStatement pst = connection.prepareStatement(selectSql);
            pst.setString(1, acc.getEmail());
            pst.setString(2, acc.getMatKhau());
            ResultSet resultSet = pst.executeQuery();
            if (resultSet.next()) {
                return 1;
            } else {
                return 2;
            }
        }
        catch (SQLException e) {
            System.err.println("Cannot connect database, " + e);
        }
        return 0 ;
    }
    
    public static void Register(user user) {
        PreparedStatement statement = null;
        try {
            Connection connection = DriverManager.getConnection(Connect.connectionUrl);
            String sql = "insert into KHACHHANG (Email, MatKhau, TenKhachHang, SoDienThoai, DiaChi)"
                    + "values (?, ?, ?, ?, ?)";
            statement = connection.prepareCall(sql);

            statement.setString(1, user.getEmail());
            statement.setString(2, user.getMatKhau());
            statement.setString(3, user.getTenKhachHang());
            statement.setString(4, user.getSoDienThoai());
            statement.setString(5, user.getDiaChi());

            statement.execute();
        } catch (SQLException ex) {
            System.err.println("Cannot connect database, " + ex);
        }
    }
    
    public static List<user> findKH(String str) {
        Statement statement = null;
        List<user> listNCC = new ArrayList<>();
        
        try {
            Connection connection = DriverManager.getConnection(Connect.connectionUrl);
            String sql = "select * from KHACHHANG where Email = '"+ str +"'";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                user user = new user(
                    resultSet.getString("Email"),
                    resultSet.getString("MatKhau"),
                    resultSet.getString("TenKhachHang"),    
                    resultSet.getString("SoDienThoai"),
                    resultSet.getString("DiaChi")
                );
                listNCC.add(user);
            }
        } catch (SQLException ex) {
            System.err.println("Cannot connect database, " + ex);
        }
        return listNCC;
    }
}
