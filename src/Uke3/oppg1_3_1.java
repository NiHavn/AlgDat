package Uke3;

import hjelpeklasser.Tabell;

public class oppg1_3_1 {

    //Oppgave 1
    /*
    Kopiert inn metoder fra kompendiet


    //Oppgave 2

    Finne neste permutasjon i tabellene

    //Oppgave 3

    Finne de 10 neste permutasjonene for:
    3, 1, 4, 9, 7, 10, 8, 6, 5, 2
    3, 1, 4, 9, 8, 2, 5, 6, 7, 10
    3, 1, 4, 9, 8, 2, 5, 6, 10, 7
    3, 1, 4, 9, 8, 2, 5, 7, 6, 10
    3, 1, 4, 9, 8, 2, 5, 7, 10, 6
    3, 1, 4, 9, 8, 2, 5, 10, 6, 7
    3, 1, 4, 9, 8, 2, 5, 10, 7, 6
    3, 1, 4, 9, 8, 2, 6, 5, 7, 10
    3, 1, 4, 9, 8, 2, 6, 5, 10, 7
    3, 1, 4, 9, 8, 2, 6, 7, 5, 10
    */
    public static void main(String[] args) {
        int[] a = {3, 1, 4, 9, 8, 2, 6, 5, 10, 7};

        Tabell.nestePermutasjon(a);
        Tabell.skriv(a);
    }

}
