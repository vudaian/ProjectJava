package ShoeAppController;

import ConnectSQL.Connect;
import ShoeAppModel.product;
import ShoeAppModel.type;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class productController {
    public static List<product> findAll() {
        Statement statement = null;
        List<product> listNCC = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(Connect.connectionUrl);
            String sql = "select * from SANPHAM as sp, PHANLOAI as pl where sp.IDPhanLoai = pl.IDPhanLoai";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                product product = new product(
                    resultSet.getInt("IDSanPham"),
                    resultSet.getString("TenSanPham"),
                    resultSet.getFloat("Gia"),
                    resultSet.getInt("SoLuong"),
                    resultSet.getString("ImgURL"),
                    resultSet.getInt("IDPhanLoai")
                );
                listNCC.add(product);
            }
        } catch (SQLException ex) {
            System.err.println("Cannot connect database, " + ex);
        }
        return listNCC;
    }
    
    
    public static void insertProduct(product product) {
        PreparedStatement statementProduct = null;
        try {
            Connection connection = DriverManager.getConnection(Connect.connectionUrl);
            String sqlProduct = "insert into SANPHAM (IDSanPham, TenSanPham, Gia, SoLuong, ImgURL, IDPhanLoai)"
                    + "values (?, ?, ?, ?, ?, ?)";
            statementProduct = connection.prepareCall(sqlProduct);

            statementProduct.setInt(1, product.getId_SanPham());
            statementProduct.setString(2, product.getTenSanPham());
            statementProduct.setFloat(3, product.getGia());
            statementProduct.setInt(4, product.getSoLuong());
            statementProduct.setString(5, product.getImgUrl());
            statementProduct.setInt(6, product.getId_PhanLoai());
            
            statementProduct.execute();
        } catch (SQLException ex) {
            System.out.println("Loi: " + ex);
        }
    }
    
    public static void Delete(product product) {
        PreparedStatement statementProduct = null;
        PreparedStatement statementOrder = null;
        try {
            Connection connection = DriverManager.getConnection(Connect.connectionUrl);
            
            String sqlOrder = "delete from DONHANG where IDSanPham = ?";
            String sqlProduct = "delete from SANPHAM where IDSanPham = ?";
            
            statementOrder = connection.prepareCall(sqlOrder);
            statementProduct = connection.prepareCall(sqlProduct);
            
            statementOrder.setInt(1, product.getId_SanPham());
            statementProduct.setInt(1, product.getId_SanPham());
            
            statementOrder.execute();
            statementProduct.execute();
            
        } catch (SQLException ex) {
            System.out.println("Loi: " + ex);
        }
    }
    
    public static void Edit(product product) {
        PreparedStatement statementProduct = null;
        try {
            Connection connection = DriverManager.getConnection(Connect.connectionUrl);
            String sqlProduct = "update SANPHAM set "
                    + "TenSanPham = ?, Gia = ?, SoLuong = ?, ImgURL = ?, IDPhanLoai = ? "
                    + "where IDSanPham = ?";
            statementProduct = connection.prepareCall(sqlProduct);

            statementProduct.setString(1, product.getTenSanPham());
            statementProduct.setFloat(2, product.getGia());
            statementProduct.setInt(3, product.getSoLuong());
            statementProduct.setString(4, product.getImgUrl());
            statementProduct.setInt(5, product.getId_PhanLoai());
            statementProduct.setInt(6, product.getId_SanPham());
            
            statementProduct.execute();
        } catch (SQLException ex) {
            System.out.println("Loi: " + ex);
        }
    }
    
    public static void EditOrderProduct(product product) {
        PreparedStatement statementProduct = null;
        try {
            Connection connection = DriverManager.getConnection(Connect.connectionUrl);
            String sqlProduct = "update SANPHAM set "
                    + "SoLuong = ? "
                    + "where IDSanPham = ?";
            statementProduct = connection.prepareCall(sqlProduct);

            statementProduct.setInt(1, product.getSoLuong());
            statementProduct.setInt(2, product.getId_SanPham());
            
            statementProduct.execute();
        } catch (SQLException ex) {
            System.out.println("Loi: " + ex);
        }
    }
    
    public static DefaultTableModel findProduct() {
        Statement statement = null;
        DefaultTableModel model = new DefaultTableModel();
        try {
            Connection connection = DriverManager.getConnection(Connect.connectionUrl);
            String query = "select sp.TenSanPham, sp.Gia, sp.SoLuong, pl.TenPhanLoai from SANPHAM as sp, "
                    + "PHANLOAI as pl where sp.IDPhanLoai = pl.IDPhanLoai";
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            
            DecimalFormat decimalFormat = new DecimalFormat("#");
            
            ResultSetMetaData metaData = rs.getMetaData();
            
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(metaData.getColumnLabel(i));
            }
            while (rs.next()) {
                Object[] rowData = new Object[columnCount];
                Object[] rowData1 = new Object[]{};
                for (int i = 1; i <= columnCount; i++) {
                    if(i == 2) {
                        String formattedColumn1 = decimalFormat.format(rs.getObject(i));
                        rowData[i-1] = formattedColumn1;
                    } else {
                        rowData[i-1] = rs.getObject(i);
                    }
                    
                }
                model.addRow(rowData);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return model;
    }
    
    public static List<product> loadImg(String tenSanPham) {
        Statement statement = null;
        List<product> listImg = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(Connect.connectionUrl);
            String sql = "select * from SANPHAM where TenSanPham like N'"+ tenSanPham +"'";
            PreparedStatement pst = connection.prepareStatement(sql);
            statement = connection.createStatement();
            ResultSet resultSet = pst.executeQuery();
            while (resultSet.next()) {
                product product = new product(
                    resultSet.getString("ImgURL")
                );
                listImg.add(product);
            }
        } catch (SQLException ex) {
            System.err.println("Cannot connect database, " + ex);
        }
        return listImg;
    }
}
