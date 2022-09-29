package Uke4;

import hjelpeklasser.Tabell;

import java.util.Arrays;

public class oppg1_4_2 {
    /*
    Oppgave 1 og 2

    Lagt til Comparable metodene og fjernet String metode

     */
    public static void main(String[] args) {

        String[] s = {"Sohil","Per","Thanh","Fatima","Kari","Jasmin"};
        int k = Tabell.maks(s);        // hvilken maks-metode?
        System.out.println(s[k]);      // Utskrift:  Thanh


        String[] t = {"Per","Kari","Ole","Anne","Ali","Eva"};
        Tabell.innsettingssortering(t);
        System.out.println(Arrays.toString(t));  // [Ali, Anne, Eva, Kari, Ole, Per]
    }
}
