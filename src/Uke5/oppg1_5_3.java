package Uke5;

import hjelpeklasser.Tabell;

public class oppg1_5_3 {
    static int antall = 0;
    //Oppgave 1
    public static int sum(int[] a, int n)   // summen av de n første
    {
        if (n == 1) return a[0];       // summen er verdien selv
        antall++;
        return sum(a,n-1) + a[n-1];    // summen av de n-1 første + a[n-1]
    }


    //Oppgave 2


    public static void main(String[] args) {
        int[] tall = {1, 3, 5, 6, 7, 8, 10};
        System.out.println(sum(tall, 7));
        System.out.println(antall);


        int[] a = Tabell.randPerm(100);       // en permutasjon av tallene fra 1 til 100
        System.out.println(sum(a,a.length));  // Utskrift: 5050
    }

}
