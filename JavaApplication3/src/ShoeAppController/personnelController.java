package ShoeAppController;

import ConnectSQL.Connect;
import ShoeAppModel.accAdmin;
import ShoeAppModel.personnel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class personnelController {
    public static List<personnel> findAll() {
        Statement statement = null;
        List<personnel> listNCC = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(Connect.connectionUrl);
            String sql = "select * from QUANLY as ql, TAIKHOAN as tk where tk.IDPhanQuyen = 2 and tk.IDQuanLy = ql.IDQuanLy";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                personnel personnel = new personnel(
                    resultSet.getInt("IDQuanLy"),
                    resultSet.getString("TenQuanLy"),
                    resultSet.getString("SoDienThoai"),
                    resultSet.getString("DiaChi"),
                    resultSet.getString("NgaySinh")
                );
                listNCC.add(personnel);
            }
        } catch (SQLException ex) {
            System.err.println("Cannot connect database, " + ex);
        }
        return listNCC;
    }
    
    public static int LogInPersonnel(accAdmin acc) {
        try {
            Connection connection = DriverManager.getConnection(Connect.connectionUrl);
            String selectSql = "select * from TAIKHOAN "
                    + "where TaiKhoan = ? and MatKhau = ? and IDPhanQuyen = 2";
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
    
    public static void insertPersonnel(personnel personnel) {
        PreparedStatement statementPersonnel = null;
        try {
            Connection connection = DriverManager.getConnection(Connect.connectionUrl);
            String sqlPersonnel = "insert into QUANLY (IDQuanLy, TenQuanLy, SoDienThoai, DiaChi, NgaySinh)"
                    + "values (?, ?, ?, ?, ?)";
            statementPersonnel = connection.prepareCall(sqlPersonnel);

            statementPersonnel.setInt(1, personnel.getId_QuanLy());
            statementPersonnel.setString(2, personnel.getTenQuanLy());
            statementPersonnel.setString(3, personnel.getSoDienThoai());
            statementPersonnel.setString(4, personnel.getDiaChi());
            statementPersonnel.setString(5, personnel.getNgaySinh());

            statementPersonnel.execute();
        } catch (SQLException ex) {
            System.out.println("Loi: " + ex);
        }
    }
    
    public static void Delete(personnel personnel) {
        PreparedStatement statementPersonnel = null;
        PreparedStatement statementAcc = null;
        try {
            Connection connection = DriverManager.getConnection(Connect.connectionUrl);
            
            String sqlAcc = "delete from TAIKHOAN where IDQuanLy = ?";
            statementAcc = connection.prepareCall(sqlAcc);
            statementAcc.setInt(1, personnel.getId_QuanLy());
            String sqlPersonnel = "delete from QUANLY where IDQuanLy = ?";
            statementPersonnel = connection.prepareCall(sqlPersonnel);
            statementPersonnel.setInt(1, personnel.getId_QuanLy());
            
            statementAcc.execute();
            statementPersonnel.execute();
            
        } catch (SQLException ex) {
            System.out.println("Loi: " + ex);
        }
    }
    
    public static void Edit(personnel personnel) {
        PreparedStatement statementPersonnel = null;
        try {
            Connection connection = DriverManager.getConnection(Connect.connectionUrl);
            
            String sqlPersonnel = "update QUANLY set "
                    + "TenQuanLy = ?, SoDienThoai = ?, DiaChi = ?, NgaySinh = ? where IDQuanLy = ?";
            statementPersonnel = connection.prepareCall(sqlPersonnel);
            statementPersonnel.setString(1, personnel.getTenQuanLy());
            statementPersonnel.setString(2, personnel.getSoDienThoai());
            statementPersonnel.setString(3, personnel.getDiaChi());
            statementPersonnel.setString(4, personnel.getNgaySinh());
            statementPersonnel.setInt(5, personnel.getId_QuanLy());
            
            statementPersonnel.execute();
            
        } catch (SQLException ex) {
            System.out.println("Loi: " + ex);
        }
    }
}
