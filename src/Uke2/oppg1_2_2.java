package Uke2;

import hjelpeklasser.Tabell;

public class oppg1_2_2 {
//Oppgave1 Lag Class Tabell

//Oppgave2 Kjør programmet i Programkode 1.2.2 b).

    public static void main(String ... args)      // hovedprogram
    {
        int[] a = Tabell.randPerm(20);              // en tilfeldig tabell
        for (int k : a) System.out.print(k + " ");  // skriver ut a

        int m = Tabell.maks(a);   // finner posisjonen til største verdi

        System.out.println("\nStørste verdi ligger på plass " + m);

//Oppgave3
// Lag metoden public static void bytt(char[] c, int i, int j).
// Den skal bytte om innholdet i posisjon i og j  i char-tabellen c.
// Legg metoden i samleklassen Tabell.

//Oppgave4
/*
Tabell.skriv(a);

Tabell.skrivln(a);
Testet
*/

    } // main

}
