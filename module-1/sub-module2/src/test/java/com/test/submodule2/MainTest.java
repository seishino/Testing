package com.test.submodule2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void convert(){
        Main main = new Main();
        assertEquals(main.convertCelciusToFahrenheit(25.0), 77.0, 0.0);
    }
}
