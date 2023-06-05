package ShoeAppController;

import ConnectSQL.Connect;
import ShoeAppModel.accAdmin;
import ShoeAppModel.user;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class accAdminController {
    public static int LogInAdmin(accAdmin acc) {
        try {
            Connection connection = DriverManager.getConnection(Connect.connectionUrl);
            String selectSql = "select * from TAIKHOAN "
                    + "where TaiKhoan = ? and MatKhau = ? and IDPhanQuyen = 1";
            PreparedStatement pst = connection.prepareStatement(selectSql);
            pst.setString(1, acc.getTaiKhoan());
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
        return 0;
    }
    
    public static void insertAcc(accAdmin acc) {
        PreparedStatement statementAcc = null;
        try {
            Connection connection = DriverManager.getConnection(Connect.connectionUrl);
            String sqlAcc = "insert into TAIKHOAN (TaiKhoan, MatKhau, IDQuanLy, IDPhanQuyen)"
                    + "values (?, ?, ?, ?)";
            statementAcc = connection.prepareCall(sqlAcc);
            
            statementAcc.setString(1, acc.getTaiKhoan());
            statementAcc.setString(2, acc.getMatKhau());
            statementAcc.setInt(3, acc.getId_QuanLy());
            statementAcc.setInt(4, acc.getId_PhanQuyen());
            
            statementAcc.execute();
        } catch (SQLException ex) {
            System.out.println("Loi: " + ex);
        }
    } 
}
