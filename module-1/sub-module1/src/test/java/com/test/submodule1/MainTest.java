package com.test.submodule1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void addTests(){
        Main main = new Main();
        try {
            Thread.sleep(15000);
            assertEquals(main.plus(1.0,2.0), 3.0, 0.0);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void addMultiply(){
        Main main = new Main();
        try {
            Thread.sleep(15000);
            assertEquals(main.multiply(1.0,2.0), 2.0, 0.0);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void addDivide(){
        Main main = new Main();
        try {
            Thread.sleep(15000);
            assertEquals(main.divide(1.0,2.0), 0.5, 0.0);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void addMinus(){
        Main main = new Main();
        try {
            Thread.sleep(15000);
            assertEquals(main.minus(1.0,2.0), -1.0, 0.0);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
