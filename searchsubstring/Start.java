/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.searchsubstring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author caggi
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Start s=new Start();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String original = "", substring = "";
        Boolean b = false;

        try {
            System.out.println("INSERISCI STRINGA COMPLETA");
            original = r.readLine();

            System.out.println("INSERISCI SOTTOSTRINGA DA RICERCARE");
            substring = r.readLine();

            if (s.isInString(original, substring)) {
                System.out.println("SOTTOSTRINGA TROVATA!!");
            } else {
                System.out.println("SOTTOSTRINGA NON TROVATA  :(");
            }
        } catch (IOException e) {
            System.out.println("SI E' VERIFICATA UN'ECCEZIONE");
        }
    }

    public Boolean isInString(String original, String substring) {
        Boolean b = false;

        try {
            for (Integer i = 0; i < original.length(); i++) {
                if (original.substring(i, i + substring.length()).equals(substring)) {
                    b = true;
                    return b;
                }
            }
        } catch (StringIndexOutOfBoundsException ob) {
            b = false;
            return b;
        }

        return b;
    }

}
