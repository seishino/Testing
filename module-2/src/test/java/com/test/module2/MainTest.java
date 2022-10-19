package com.test.module2;

import org.junit.Test;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void concat(){
        Main main = new Main();

        try {
            sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(main.concat("test1", "test2"));
        assertEquals(main.concat("test1", "test2"), "test1test2");
    }
}
