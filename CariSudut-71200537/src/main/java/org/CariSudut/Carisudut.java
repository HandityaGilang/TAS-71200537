package org.CariSudut;

public class Carisudut {

    public static double carisudut (double jam, double menit) {
        double Jam = (0.5* (jam*60+menit));
        double Menit = (6* menit);
        double jadi = Math.abs(Jam-Menit);
        double hasil = Math.min(360-jadi,jadi);
        System.out.println("Sudut: "+hasil+" sudah diupdate!");
        return Math.abs(hasil);
    }
}

