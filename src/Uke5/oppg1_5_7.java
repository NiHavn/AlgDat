package Uke5;

import hjelpeklasser.Tabell;

public class oppg1_5_7 {

    //Oppgave 1 a)

    private static void kvikksortering1(int[] a, int v, int h)
    {
        System.out.println("a[" + v + ":" + h + "] legges på stakken");

        int p = Tabell.sParter0(a, v, h, (v + h) / 2);  // bruker midtverdien
        if (v < p - 1) kvikksortering1(a, v, p - 1);    // sorterer intervallet a[v : p - 1]
        if (p + 1 < h) kvikksortering1(a, p + 1, h);    // sorterer intervallet a[p + 1 : h]
    }

    public static void kvikksortering(int[] a) // sorterer hele tabellen
    {
        if (a.length > 1) kvikksortering1(a, 0, a.length - 1);
    }


    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        kvikksortering1(a, 0, 9);
    }
}
