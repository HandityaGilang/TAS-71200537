package org.CariSudut;

import java.sql.*;

public class Main {

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
    public static void Printtable() {
        //File ada di D:
        String url = "jdbc:sqlite:D:/waktu.db";

        try {
            Connection conn = DriverManager.getConnection(url);
            Statement state = conn.createStatement();
            ResultSet result = state.executeQuery("SELECT * FROM waktu");
            System.out.println("Nomor \t \tWaktu \t \t    Sudut");
            while (result.next()){
                System.out.println(result.getString("nomor")+"\t \t \t"+result.getString("waktu")+"\t \t \t"+result.getString("sudut"));
            }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
        }
    }


    public static void createNewTable() {
        String url = "jdbc:sqlite:D:/waktu.db";
        String sql = "create table waktu (\n"
                + " nomor integer not null constraint waktu_pk primary key autoincrement,\n"
                + " waktu text not null,\n"
                + " sudut real null\n"
                + ");";
        try {
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


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

    public static void main(String[] args) {
        createNewDatabase("waktu.db");
        createNewTable();
        Select db = new Select();
        db.insert("15:00");
        db.insert("07:30");
        db.insert("08:05");
        db.insert("17:35");
        db.insert("11:01");

        Carisudut sd = new Carisudut();
        double a1 = sd.carisudut(15, 00);
        double a2 =sd.carisudut(7,30);
        double a3 =sd.carisudut(8,05);
        double a4  =sd.carisudut(17,35);
        double a5 =sd.carisudut(11,01);

        db.update(90,1);
        db.update(45,2);
        db.update(147.5, 3);
        db.update(42.5,4);
        db.update(35.5,5);

        Printtable();

    }
}


