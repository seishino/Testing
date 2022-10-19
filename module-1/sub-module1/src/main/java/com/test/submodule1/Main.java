package com.test.submodule1;

public class Main {
    public double plus(double op1, double op2) throws InterruptedException {
        Thread.sleep(15000);
        return op1 + op2;
    }
    public double minus(double op1, double op2) throws InterruptedException {
        Thread.sleep(15000);
        return op1 - op2;
    }
    public double multiply(double op1, double op2) throws InterruptedException {
        Thread.sleep(15000);
        return op1 * op2;
    }
    public double divide(double op1, double op2) throws InterruptedException {
        Thread.sleep(15000);
        return op1/op2;
    }
}
