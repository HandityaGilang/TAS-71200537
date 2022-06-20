package com.rplbo.math;

public abstract class BinaryOperator extends Node {
    private Node x;
    private Node y;
    public BinaryOperator (Node kiri, Node kanan){
        this.x = kiri;
        this.y = kanan;
    }

    public Node getX() {
        return x;
    }

    public Node getY() {
        return y;
    }

    @Override
    public abstract double hitung();
}