package com.test.module2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void concat(){
        Main main = new Main();
        System.out.println(main.concat("test1", "test2"));
        assertEquals(main.concat("test1", "test2"), "test1test2");
    }
}
