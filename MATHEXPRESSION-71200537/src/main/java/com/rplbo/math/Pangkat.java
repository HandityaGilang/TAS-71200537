package com.rplbo.math;

public class Pangkat extends BinaryOperator {
    public Pangkat(Node n, Node n2) {
        super(n, n2);
    }

    @Override
    public double hitung() {
        double penjumlahan = getX().hitung();
        double hasil = Math.pow(penjumlahan, getY().hitung());
        return hasil;
    }



}
