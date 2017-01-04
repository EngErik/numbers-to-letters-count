/*
 * @(#)NumberLettersCountTest.java 1.0 03/01/2017
 *
 * Copyright (c) 2017, Erik Paula. All rights reserved.
 */
package com.gsw.challenge.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.gsw.challenge.app.NumberLettersCount;

/**
 * Classe de testes do desafio Numbers Letters Count
 * @author Erik Paula
 *
 */
public class NumberLettersCountTest {
    
    /**
     * Verifica se o numero de letras dos numeros escritos por extenso
     * de um a mil correspondem ao resultado esperado. 
     * 
     * Valor esperado {@value 22894}
     *
     */
    @Test
    public void numberLettersCountTest() {
        assertEquals("22894", new NumberLettersCount().execute());
    }
}
