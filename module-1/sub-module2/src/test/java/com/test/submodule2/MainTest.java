package com.test.submodule2;

import org.junit.Test;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void convert(){
        Main main = new Main();
        try {
            sleep(15000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertEquals(main.convertCelciusToFahrenheit(25.0), 77.0, 0.0);
    }
}
