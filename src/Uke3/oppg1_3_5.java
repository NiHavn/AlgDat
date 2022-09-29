package Uke3;

import hjelpeklasser.Tabell;
import hjelpeklasser.Test;

public class oppg1_3_5 {
    /*
    oppgave 2

    Testet metoden linærsøk

    oppgave 3

    Gjort så linærsøk finner den siste verdien hvis verdien forekommer
    flere ganger i Test klassen

    Oppgave 5

    a)

    Laget metode med steglangde

    b)

    Testet med ulike steglengder

    c)

    Lags metode kvadratrotsøk og testet den



     */
    public static void main(String[] args) {
        /*
        int[] a = {1, 2, 3, 4, 5, 6, 7, 7, 7, 7, 7, 8, 9, };
        Tabell.skriv(a);
        System.out.println();
        System.out.println(Test.lineærsøk(a, 9));
        */

        int[] a1 = Tabell.randPerm(100000);
        Tabell.utvalgssortering(a1);
        long start = System.currentTimeMillis();
        System.out.println(Test.kvadratrotsøk(a1, 52367));
        long slutt = System.currentTimeMillis();
        long tid = (slutt - start);

        System.out.println("Det tok " + tid + " millisekunder");

    }
}
