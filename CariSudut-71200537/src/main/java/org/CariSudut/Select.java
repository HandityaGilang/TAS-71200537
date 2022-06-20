package org.CariSudut;
import java.sql.*;

public class Select {
    private Connection connect() {
        String url = "jdbc:sqlite:D:/waktu.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    public void insert(String waktu) {
        String sql = "INSERT INTO waktu(waktu) VALUES(?)";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, waktu);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void update(double sudut, int nomor) {
        String sql = "UPDATE waktu SET sudut=? WHERE nomor=?";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // set the corresponding param
            pstmt.setInt(2, nomor);
            pstmt.setDouble(1,sudut);
            // update
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
