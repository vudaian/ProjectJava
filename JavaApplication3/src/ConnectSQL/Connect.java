package ConnectSQL;
import java.sql.DriverManager;
import java.sql.Connection;

public class Connect {
    public static String connectionUrl =
        "jdbc:sqlserver://localhost:1433;"
        + "database=ShoeApp;"
        + "user=sa;"
        + "password=24012002;"
        + "encrypt=true;"   
        + "trustServerCertificate=true";
    public static Connection getConnection() {
        Connection con = null;
        try {
            con = (Connection) DriverManager.getConnection(connectionUrl);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    }
}
