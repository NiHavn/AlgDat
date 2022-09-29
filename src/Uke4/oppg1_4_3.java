package Uke4;

import hjelpeklasser.Tabell;
import hjelpeklasser.Test;

import java.util.Arrays;

public class oppg1_4_3 {
    /*
    Oppgave 2

    Integer.compare(-1, 1);  = -1 fordi -1 er mindre enn 1
    Integer.compareUnsigned(-1, 1) er 1 fordi Binærkoden til -1 har
    32 1-biter. Men det er tallet 4294967295 når vi ser bort fra
    fortegn. Men 4294967295 er større enn 1. Dermed returnerer metoden 1.

    Oppgave 5

    Lagt til bytt, skriv og skrivln med Object[] datatype


    Oppgave 6

    Lagt til randPermInteger og bytt metodene og sett at de funker


    Oppgave 7

    Gjort om double[] til Double[] og sorterte og skrev den ut

    Oppgave 8

    Hvis du har tilgang til begge metodene i et program, vil
    metodekallet f(1,1); føre til at kompilatoren gir en feilmelding
    som denne: Reference to f is ambiguous. Both method f(int,Integer)
    og method f(Integer,int) match. Det kommer av at hvis den første
    f-en skal brukes, må det andre 1-tallet konverteres til en Integer.
    Hvis derimot den andre f-en skal brukes, må de første 1-tallet
    konverteres til en Integer. Det ene er ikke noe riktigere enn det
    andre. Derfor er det tvetydig.
    Hvis en av metodene tas vekk, vil metodekallet f(1,1); bli utført.
     Det er det samme hvilken som tas vekk.
    En kan bestemme hvem av dem som skal brukes ved å konvertere ett
    av tallene til en Integer:

    f(1, (Integer)1);  // nå brukes f(int a, Integer b)
    f((Integer)1,1);   // f(Integer a, int b)

     */
    public static void main(String[] args) {

        Object[] f = {1,2,3,4,5,6,7,8};
        Test.skrivln(f, 3, 6);
        System.out.println(Integer.compare(-1, 1));
        System.out.println(Integer.compareUnsigned(-1, 1));

        Integer[] a = Tabell.randPermInteger(20);
        System.out.println(Arrays.toString(a));
        // En mulig utskrift: [7, 1, 8, 2, 10, 3, 4, 6, 5, 9]

        Tabell.innsettingssortering(a);
        System.out.println(Arrays.toString(a));
        // Utskrift: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        Tabell.bytt(a, 3, 5);
        System.out.println(Arrays.toString(a));

        double[] d = {5.7,3.14,7.12,3.9,6.5,7.1,7.11};
        Double[] D = new Double[d.length];

        for(int i = 0; i < d.length; i++){
            D[i] = d[i];
        }
        Tabell.innsettingssortering(D);
        Tabell.skriv(D);
    }
}
