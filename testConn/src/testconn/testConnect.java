package testconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class testConnect extends javax.swing.JFrame {
    private Connection conn = null;
    public testConnect() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_ConnectSQL = new javax.swing.JButton();
        btn_CLoseSQL = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_ConnectSQL.setText("Mở");
        btn_ConnectSQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConnectSQLActionPerformed(evt);
            }
        });

        btn_CLoseSQL.setText("Đóng");
        btn_CLoseSQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CLoseSQLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(btn_ConnectSQL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(btn_CLoseSQL)
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ConnectSQL)
                    .addComponent(btn_CLoseSQL))
                .addContainerGap(168, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ConnectSQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConnectSQLActionPerformed
        String connectionUrl =
                "jdbc:sqlserver://localhost:1433;"
                + "database=ShoeApp;"
                + "user=sa;"
                + "password=24012002;"
                + "encrypt=true;"
                + "trustServerCertificate=true";

        ResultSet resultId = null;

        try (Connection connection = DriverManager.getConnection(connectionUrl);
                Statement statement = connection.createStatement();) {
            String id_QuanLyString;
            int id_QuanLyInt = 0;
            // Create and execute a SELECT SQL statement.
            String IdSql = "SELECT MAX(IDQuanLy) FROM QUANLY";
            resultId = statement.executeQuery(IdSql);

            // Print results from select statement
            while (resultId.next()) {
                id_QuanLyString = resultId.getString(1);
                id_QuanLyInt = Integer.parseInt(id_QuanLyString);
                id_QuanLyInt++;
                }
            System.out.println(id_QuanLyInt);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_ConnectSQLActionPerformed

    private void btn_CLoseSQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CLoseSQLActionPerformed
        if (conn != null) {
            try {
                conn.close();
                System.out.println("Đóng kết nối");
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_btn_CLoseSQLActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new testConnect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CLoseSQL;
    private javax.swing.JButton btn_ConnectSQL;
    // End of variables declaration//GEN-END:variables
}
