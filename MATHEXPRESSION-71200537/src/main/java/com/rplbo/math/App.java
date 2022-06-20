package com.rplbo.math;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main (String[] args){
        System.out.println("TriplePythagoras Benar :");
        OperandNode op1 = new OperandNode(3);
        OperandNode op2 = new OperandNode(4);
        OperandNode op3 = new OperandNode(5);
        TernaryOperator Triple1 = new TriplePythagoras(op1,op2,op3);
        System.out.println(Triple1.hitung());

        System.out.println("TriplePythagoras Salah :");
        OperandNode opp1 = new OperandNode(1);
        OperandNode opp2 = new OperandNode(2);
        OperandNode opp3 = new OperandNode(3);
        TernaryOperator Triple2 = new TriplePythagoras(opp1,opp2,opp3);
        System.out.println(Triple2.hitung());

        System.out.println("Pangkat:");
        OperandNode of1 = new OperandNode(2);
        OperandNode of2 = new OperandNode(3);
        BinaryOperator Bo = new Pangkat(of1,of2);
        System.out.println(Bo.hitung());

    }
}
