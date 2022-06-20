package com.rplbo.math;

public class Kuadrat extends UnaryOperator {


    public Kuadrat(Node n) {
        super(n);
    }

    @Override
    public double hitung() {
        return this.getNode().hitung() * this.getNode().hitung();
    }
}
