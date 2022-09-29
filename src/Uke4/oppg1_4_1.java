package Uke4;

import hjelpeklasser.Tabell;

public class oppg1_4_1 {
    /*
    Oppgave 1

    Test koden i 1.4.1 c)
     Gjort i main

     Oppgave 2

       public static int maks(String[] a)    // legges i class Tabell
  {
    int m = 0;                          // indeks til største verdi
    String maksverdi = a[0];            // største verdi

    for (int i = 1; i < a.length; i++) if (a[i].compareTo(maksverdi) > 0)
    {
      maksverdi = a[i];  // største verdi oppdateres
      m = i;             // indeks til største verdi oppdaters
    }
    return m;  // returnerer posisjonen til største verdi
  }

  ------------------------------
  Endret metode:

  public static int maks(char[] a)    // legges i class Tabell
  {
    int m = 0;                          // indeks til største verdi
    char maksverdi = a[0];            // største verdi

    for (int i = 1; i < a.length; i++) if (a[i] > maksverdi)
    {
      maksverdi = a[i];  // største verdi oppdateres
      m = i;             // indeks til største verdi oppdaters
    }
    return m;  // returnerer posisjonen til største verdi
  }

    Oppgave 3

    Bare gjøre om String ---> Integer

    Oppgave 4

    Kode: i.compareTo(j)

    hvis i er større enn j = 1
    hvis i er lik j        = 0
    hvis j er større enn i =-1

    Oppgave 5

    Kode: c1.compareTo(c2)

    Koden returnerer antall bokstaver mellom c1 og c2
    f.eks
    A --- F = 4
    F --- A =-4

    Oppgave 6

       System.out.println(Boolean.compare(false, true)); blir -1


     */


    public static void main(String[] args) {

        int[] a = {5,2,7,3,9,1,8,4,6};
        double[] d = {5.7,3.14,7.12,3.9,6.5,7.1,7.11};
        String[] s = {"Sohil","Per","Thanh","Fatima","Kari","Jasmin"};

        int k = Tabell.maks(a);     // posisjonen til den største i a
        int l = Tabell.maks(d);     // posisjonen til den største i d
        int m = Tabell.maks(s);     // posisjonen til den største i s

        System.out.println(a[k] + "  " + d[l] + "  " + s[m]);

        char[] c = "JASMIN".toCharArray();
        System.out.println(Tabell.maks(c));

        System.out.println(Tabell.maks(a));

        Integer i = 2, j = 1;


        System.out.println(i.compareTo(j));

        String c1 = "Z", c2 = "A";

        System.out.println(c1.compareTo(c2));

        System.out.println(Boolean.compare(false, true));
    }
}
