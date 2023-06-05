package ShoeAppController;

import ConnectSQL.Connect;
import ShoeAppModel.pay;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class payController {
    public static void insert(pay pay) {
        PreparedStatement statementPersonnel = null;
        try {
            Connection connection = DriverManager.getConnection(Connect.connectionUrl);
            String sqlPersonnel = "insert into THANHTOAN (IDThanhToan, IDDonHang, ThanhTien, TrangThaiThanhToan, HinhThucThanhToan) "
                    + "values (?, ?, ?, ?, ?)";
            statementPersonnel = connection.prepareCall(sqlPersonnel);

            statementPersonnel.setInt(1, pay.getId_ThanhToan());
            statementPersonnel.setInt(2, pay.getId_DonHang());
            statementPersonnel.setInt(3, pay.getThanhTien());
            statementPersonnel.setString(4, pay.getTrangThaiThanhToan());
            statementPersonnel.setString(5, pay.getHinhThucThanhToan());

            statementPersonnel.execute();
        } catch (SQLException ex) {
            System.out.println("Loi: " + ex);
        }
    }
}
