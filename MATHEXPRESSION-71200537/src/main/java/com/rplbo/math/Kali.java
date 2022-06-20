package com.rplbo.math;

public class Kali extends OperatorNode {

    public Kali(Node kiri, Node kanan) {
        super(kiri, kanan);
    }

    @Override
    public double hitung() {
        return this.getKiri().hitung() * this.getKanan().hitung();
    }

}
