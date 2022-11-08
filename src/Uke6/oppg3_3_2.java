package Uke6;

import hjelpeklasser.EnkeltLenketListe;
import hjelpeklasser.Liste;

public class oppg3_3_2 {
/*
    Oppgave 1
    Laget EnkeltLenketListe klassen

    Oppgave 2
    Laget metodene i oppg 2

    Oppgave 3
    Laget konstruktøren

    Oppgave 4
    Laget program i main metode under
*/

    public static void main(String... args)   // hovedprogram
    {
        Liste<Integer> liste = new EnkeltLenketListe<>();

        System.out.println("Antall i listen: " + liste.antall());
        System.out.println("Listen inneholder: " + liste);

        for (int i = 0; i < 10; i++) liste.leggInn(i + 1);

        System.out.println("Antall i listen: " + liste.antall());
        System.out.println("Listen inneholder: " + liste);

        liste.nullstill();
        System.out.println("Antall i listen: " + liste.antall());

        for (int i = 0; i < 10; i++) liste.leggInn(liste.antall()/2, i + 1);

        System.out.println("Antall i listen: " + liste.antall());
        System.out.println("Listen inneholder: " + liste);

    } // main
}
