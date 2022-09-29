package Uke3;

import hjelpeklasser.Tabell;
import hjelpeklasser.Test;

import java.sql.Time;
import java.util.Timer;

public class oppg1_3_4 {
    /*
    Oppgave 1

    Etter 7 iterasjoner vil det stå som

    3, 4, 5, 6, 7, 8, 10, 16, 21, 19, 23, 14, 15, 11, 17

    Oppgave 3
    Legge inn hjelpeklasse

    Oppgave 5

    Laget utvalgssorteringsmetode i Test-hjelpetabell og testet den mot
    Tabell.utvalgssortering().

    oppgave 9

    Laget utvalgssorteringsmetode i Tabell kalssen.


     */

    public static void main(String[] args) {
        //int[] a = Tabell.randPerm(100);
/*
        long start = System.currentTimeMillis();
        Tabell.utvalgssortering(a);
        long slutt = System.currentTimeMillis();
        Tabell.skriv(a);
        System.out.println();
        System.out.println("Metoden brukte " + (slutt - start)/1000 + " sekunder");
*/
        int[] a1 = {9, 8, 4, 9, 7, 0, 9,3,2};

        Tabell.skriv(a1);
        System.out.println();
        Tabell.utvalgssortering(a1, 0, 7);
        Tabell.skriv(a1);
    }
}
