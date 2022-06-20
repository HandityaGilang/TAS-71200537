package org.CariSudut;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Buat {
    public static void createNewDatabase(String fileName) {
        //File ada di D:
        String url = "jdbc:sqlite:D:/" + fileName;

        try {
            Connection conn = DriverManager.getConnection(url);
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("Database sudah dibuat.");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
