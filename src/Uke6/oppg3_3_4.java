package Uke6;

import hjelpeklasser.EnkeltLenketListe;
import hjelpeklasser.Liste;

import java.util.Iterator;

public class oppg3_3_4 {
    /*
    Oppgave 1
    Den gir Exception

    Oppgave 2
    Får error fordi iterator ikke er laget enda

    Oppgave 3
    Kodet gjernHvis direkte inn i EnkeltLenketListe

    Oppgave 4
    Kodet forEach direkte inn i EnkeltLenketListe

    Oppgave 5


     */

    public static void main(String[] args) {
        Liste<Integer> liste = new EnkeltLenketListe<>();
        for (int i = 1; i <= 10; i++) liste.leggInn(i);
        System.out.println(liste);

        // fjerner partallene
        liste.fjernHvis(x -> x % 2 == 0);

        // skriver ut
        liste.forEach(x -> System.out.print(x + " "));
    }
}
