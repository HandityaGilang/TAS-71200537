package com.rplbo.math;

public abstract class UnaryOperator extends Node {
    private Node node;

    public UnaryOperator (Node n){
        this.node = n;
    }

    public Node getNode() {
        return node;
    }

    @Override
    public abstract double hitung();
}
