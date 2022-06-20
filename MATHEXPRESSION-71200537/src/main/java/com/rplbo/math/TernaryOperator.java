package com.rplbo.math;

public abstract class TernaryOperator extends Node {
    private Node pertama;
    private Node kedua;
    private Node ketiga;

    public Node getPertama() {
        return pertama;
    }

    public Node getKedua() {
        return kedua;
    }

    public Node getKetiga() {
        return ketiga;
    }

    public TernaryOperator (Node kiri, Node tengah, Node kanan){
        this.pertama = kiri;
        this.kedua = tengah;
        this.ketiga = kanan;
    }

    @Override
    public abstract double hitung();
}
