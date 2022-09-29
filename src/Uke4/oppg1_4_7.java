package Uke4;

import eksempelklasser.Komparator;
import eksempelklasser.Person;
import hjelpeklasser.Tabell;

import java.util.Arrays;

public class oppg1_4_7 {
    /*
    Oppgave 1
    Flyttet over komparatorer til eksempelklasser

    Oppgave 2
    Sorterte tabellen d begge veier fra størst til minst og omvendt
    med omvendtOrden og NaturligOrden

    Oppgave 3
    Sorterte Boolean tabellen b med naturligOrden.

    Oppgave 4
    Sortert etter etternavn med naturligOrden

    Oppgave 5
    Så fasit, skjønte ikke helt hvordan det funket

     */

    public static void main(String[] args) {

        /*
        Double[] d = {5.7,3.14,7.12,3.9,6.5,7.1,7.11};

        Tabell.innsettingssortering(d, Komparator.omvendtOrden());

        System.out.println(Arrays.toString(d));

        Boolean[] b = {false, true, true, false, false, true, false, true};

        Tabell.innsettingssortering(b, Komparator.naturligOrden());
        System.out.println(Arrays.toString(b));


        Person[] p = new Person[5];                       // en persontabell
        p[0] = new Person("Kari", "Svendsen");            // Kari Svendsen
        p[1] = new Person("Boris", "Zukanovic");          // Boris Zukanovic
        p[2] = new Person("Ali", "Kahn");                 // Ali Kahn
        p[3] = new Person("Azra", "Zukanovic");           // Azra Zukanovic
        p[4] = new Person("Kari", "Pettersen");           // Kari Pettersen


        Tabell.innsettingssortering(p, Komparator.naturligOrden());


        String[] s = {"Lars","Anders","Bodil","Kari","Per","Berit"};
        Tabell.innsettingssortering(s, Komparator.orden(x -> -x.length()));
        Tabell.innsettingssortering(s, (s1,s2) -> s2.length() - s1.length());


        System.out.println(Arrays.toString(s));

         */
    }

}
