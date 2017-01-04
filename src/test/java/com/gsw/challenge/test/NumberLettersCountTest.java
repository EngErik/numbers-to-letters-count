package com.gsw.challenge.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.gsw.challenge.app.NumberLettersCount;

public class NumberLettersCountTest {
    
    @Test
    public void numberLettersCountTest() {
        assertEquals("22894", new NumberLettersCount().execute());
    }
}
