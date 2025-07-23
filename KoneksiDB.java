import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KoneksiDB {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/rms";
        String user = "root";
        String password = "";

        try {
            // Load driver MySQL secara manual (wajib di Java 8)
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url, user, password);
            if (conn != null) {
                System.out.println("Koneksi ke database berhasil!");
                conn.close();
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Driver MySQL tidak ditemukan!");
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
    }
}