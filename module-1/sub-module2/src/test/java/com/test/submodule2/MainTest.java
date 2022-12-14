package com.test.submodule2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void convert(){
        Main main = new Main();
        try {
            Thread.sleep(10000);
            assertEquals(main.convertCelciusToFahrenheit(25.0), 77.0, 0.0);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
