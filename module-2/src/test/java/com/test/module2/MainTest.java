package com.test.module2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void concat(){
        Main main = new Main();

        try {
            Thread.sleep(45000);
            assertEquals(main.concat("test1", "test2"), "test1test2");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
