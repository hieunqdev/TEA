package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class KetNoiDB {
    public static void main(String[] args) {
        String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=SOF203_DE2;"
                + "user=sa;password=1234;instanceName=Admin\\SQLEXPRESS;encrypt=true;"
                + "trustServerCertificate=true";

        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String SQL = "SELECT * FROM DongVat";
            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {
                System.out.println(rs.getString("MaDV") + " " + rs.getString("TenDV"));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
