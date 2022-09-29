package Uke4;

import eksempelklasser.Dato;
import eksempelklasser.Tid;
import hjelpeklasser.Tabell;

import java.awt.*;
import java.util.Arrays;
import java.util.Comparator;

public class oppg1_4_9 {
    /*
    Oppgave 1
    Gjort om fra Komparator til Comparator i maks og innsettingsmetoden

    Oppgave 2
    Kopierte inn alle metodene inn i Tabell fra fasitt

    Oppgave 3
    a)
    Gir riktig utskrift

    b)
    Det funker med testet Comparator

    c)
    Det virket

    d)
    Man får feilmelding fordi maskinen ikke vet hva slags type p er.

    e)
    Prøvd med comparingDouble og thenComparingDouble.

    f)
    Prøvd, men måtte se på fasit

    g)


    Oppgave 4
    a)
    Flyttet dato til eksempelklasse

    b)
    Brukt c.compare for å sortere datoer

    c)


    d)
    Lagt til en equals metode i Dato klassen

    e)
    Testet å fjerne hashkode, men fikk ingen gul knapp eller feil

    f)
    Lagt inn ekstra konstruktør i Dato klassen som tar inn Måned klassen som parameter

    Oppgave 5
    Laget klasse klokkeslett


    Oppgave 6
    Måtte se fasit


     */
    public static void main(String[] args) {
/*
        int[] x = {3,5,6,2,6,1,4,7,7,4};         // x-koordinater
        int[] y = {3,6,3,5,5,2,1,4,2,4};         // y-koordinater

        Point[] punkt = new Point[x.length];     // en punkttabell
        for (int i = 0; i < punkt.length; i++) punkt[i] = new Point(x[i],y[i]);

        for (Point p : punkt) System.out.print("(" + p.x + "," + p.y + ") ");
        System.out.println();                    // linjeskift

        Tabell.innsettingssortering(punkt, (p1, p2) ->
        {
            int d = (p1.x*p1.x + p1.y*p1.y) - (p2.x*p2.x + p2.y*p2.y);
            if(d != 0) return d; else return p1.y - p2.y;

        });

        for (Point p : punkt) System.out.print("(" + p.x + "," + p.y + ") ");



        // Utskriften blir:
        // (3,3) (5,6) (6,3) (2,5) (6,5) (1,2) (4,1) (7,4) (7,2) (4,4)
        // (1,2) (2,5) (3,3) (4,1) (4,4) (5,6) (6,3) (6,5) (7,2) (7,4)

        Dato[] d = new Dato[5];           // en datotabell
        d[0] = new Dato(24,12,2014);      // 24/12-2014
        d[1] = new Dato(24,12,2012);      // 24/12-2012
        d[2] = new Dato(9,12,2013);       // 9/12-2013
        d[3] = new Dato(25,12,2012);      // 25/12-2012
        d[4] = new Dato(10,12,2013);      // 10/12-2013

        Tabell.innsettingssortering(d);
        for (Dato x : d) System.out.print(x + " ");

        // Utskrift: 24/12-2012 25/12-2012 9/12-2013 10/12-2013 24/12-2014
*/
        Tid[] tider = new Tid[4];

        tider[0] = new Tid(24,12,2014,"15:30");
        tider[1] = new Tid(24,12,2014,"12:00");
        tider[2] = new Tid(23,12,2014,"12:00");
        tider[3] = new Tid(23,12,2014,"09:00");

        Tabell.innsettingssortering(tider);

        for (Tid tid : tider) System.out.println(tid);

    }
}
