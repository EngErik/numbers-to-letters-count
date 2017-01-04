/*
 * @(#)NumberLettersCount.java 1.0 03/01/2017
 *
 * Copyright (c) 2017, Erik Paula. All rights reserved.
 */
package com.gsw.challenge.app;

/**
 * Classe que contem a logica da resolucao do desafio
 * Numbers Letters Count.
 * 
 * @author Erik Paula
 *
 */
public class NumberLettersCount implements NumberLettersCountRunner {

    public static void main(String[] args) {
        System.out.println(new NumberLettersCount().execute());
    }

    public String execute() {
        int value = 0;
        for (int i = 1; i <= 1000; i++) {
            value += numberToLetter(i).length();
        }
        return Integer.toString(value);
    }

    private String numberToLetter(final int i) {
        if (0 <= i && i < 20)
            return ONEINONE[i];
        else if (20 <= i && i < 100)
            return TENINTEN[i / 10] + (i % 10 != 0 ? " e " + ONEINONE[i % 10] : "");
        else if (100 <= i && i <= 199) {
            final int ten = (i % 100);
            final int unit = ((i % 100) % 10);

            return (i % 100 != 0 ? "cento" + (ten > 0 ? " e " + numberToLetter(ten) : "") + (ten < 0 && unit > 0 ? " e " + numberToLetter(unit) : "") : "cem");
        }
        else if (200 <= i && i <= 999) {
            final int hundred = i / 100;
            final int ten = (i % 100);
            final int unit = ((i % 100) % 10);
            
            return (i % 100 != 0 ? HUNDREDINHUNDRED[hundred] + (ten > 0 ? " e " + numberToLetter(ten) : "") + (ten < 0 && unit > 0 ? " e " + numberToLetter(unit) : "") : HUNDREDINHUNDRED[hundred]);
        }
        else if (1000 <= i && i < 1000000)
            return (i / 1000 > 1 ? numberToLetter(i / 1000) + " mil" + (i % 1000 != 0 ? numberToLetter(i % 1000) : "") : "mil");
        else
            throw new IllegalArgumentException();
    }

    private static String[]  ONEINONE= { 
            "zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove",
            "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove" };
    
    private static String[] TENINTEN = {
            "", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa" };
    
    private static String[] HUNDREDINHUNDRED = {
            "", "", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos" };

}
