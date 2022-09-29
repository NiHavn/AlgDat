package Uke4;

import eksempelklasser.Heltall;
import eksempelklasser.*;
import hjelpeklasser.Tabell;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class oppg1_4_4 {
    /*
    Oppgave 1

    a)
    Kjørt et program

    b)
    Endret compareTo metoden og virker fortsatt

    c)
    Virket for min metode, men hvis tallene blir for store eller for små
    vil det gi fortegnsfeil eller galt svar.

    d)
    Laget program som tester compareTo og equals metodene
    compareTo sjekker fysisk likhet, mens equals sjekker logisk likhet.

    e)
    Laget program som tester hashCode funksjonen.

    Oppgave 2
    a)
    La inn flere personer i tabellen

    b)
    Kjørte programkoden etter endringer

    c)
    Brukte sort metoden fra arrays

    d)
    La inn kode fra fasit i konstruktøren

    e)
    Lagde en mer direkte versjon av equals, fulgte fasit

    f)
    Lagde metoden public Boolean equals(Person p) ut ifra
    kode fra forrige oppgave

    g)
    Leste teksten i fastit

    h)
    Byttet ut toString med String.join

    i)


     */
    public static void main(String[] args) {

        int[] a = {5,2,7,3,9,1,8,10,4,6};          // en int-tabell
        Heltall[] h = new Heltall[a.length];       // en Heltall-tabell

        for (int i = 0; i < h.length; i++) h[i] = new Heltall(a[i]);
        Tabell.innsettingssortering(h);           // generisk sortering
        System.out.println(Arrays.toString(h));   // utskrift

        Heltall x = new Heltall(3), y = new Heltall(3);  // x og y er like
        System.out.println(x.compareTo(y) + "  " + x.equals(y));

        Heltall z = new Heltall(3), c = new Heltall(3);  // x og y er like
        System.out.println(z.hashCode() + "  " + c.hashCode());

        Person[] p = new Person[7];                   // en persontabell

        p[0] = new Person("Kari","Svendsen");         // Kari Svendsen
        p[1] = new Person("Boris","Zukanovic");       // Boris Zukanovic
        p[2] = new Person("Ali","Kahn");              // Ali Kahn
        p[3] = new Person("Azra","Zukanovic");        // Azra Zukanovic
        p[4] = new Person("Kari","Pettersen");        // Kari Pettersen
        p[5] = new Person("Beate", "Kristoffersen");
        p[6] = new Person("Kåre", "Bonkers");

        int m = Tabell.maks(p);                       // posisjonen til den største
        System.out.println(p[m] + " er størst");      // skriver ut den største

        Arrays.sort(p);               // generisk sortering
        System.out.println(Arrays.toString(p));       // skriver ut sortert

        Arrays.stream(p).max(Comparator.naturalOrder()).ifPresent(System.out::println);

    }
}
