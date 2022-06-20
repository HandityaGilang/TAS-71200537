package com.rplbo.math;

public class TriplePythagoras extends TernaryOperator {
    public TriplePythagoras(Node n, Node n2, Node n3) {
        super(n, n2, n3);
    }
    @Override
    public double hitung() {
        double i = this.getKetiga().hitung();
        double square =Math.pow(i,2);
        if(square == ( Math.pow(this.getPertama().hitung(),2))+(Math.pow(this.getKedua().hitung(),2))){
            return 1;}
        else {
            return -1;
        }
    }
}