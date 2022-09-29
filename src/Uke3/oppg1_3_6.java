package Uke3;

import hjelpeklasser.*;


public class oppg1_3_6 {
    /*
    oppgave 3

    Sjekket med 2. versjon av binærsøk for tallene 4, 7, 10, 15


    oppgave 4

    Testet med 3. versjon av binærsøk med samme tall

     */
    public static void main(String[] args) {

        int[] a = {1, 3, 4, 4, 5, 7, 7, 7, 7, 8, 9, 10, 10, 12, 15, 15, 15};

        System.out.println(Tabell.binærsøk(a, 0, a.length, 10));
    }
}
