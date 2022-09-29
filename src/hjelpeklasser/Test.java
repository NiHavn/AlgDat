package hjelpeklasser;

import java.util.NoSuchElementException;

public class Test {
    public static void selectionSort(int[] a){
        for(int i = 0; i < a.length-1; i++){
            int index = i;
            for(int j = i + 1; j < a.length; j++){
                if(a[j] < a[index]){
                    index = j;
                }
            }
            int min = a[index];
            a[index] = a[i];
            a[i] = min;
        }
    }
    public static int lineærsøk(int[] a, int verdi) // legges i class Tabell
    {
        if (a.length == 0 || verdi > a[a.length-1])
            return -(a.length + 1);  // verdi er større enn den største

        int i = a.length-1; for( ; a[i] > verdi; i--);  // siste verdi er vaktpost

        return verdi == a[i] ? i : -(i + 1);   // sjekker innholdet i a[i]
    }


    public static int lineærsøk(int[] a, int verdi, int k) // legges i class Tabell
    {
        if(k < 1)
            throw new IllegalArgumentException("Må ha k > 0");

        int j = k - 1;
        for(; j < a.length && verdi > a[j]; j += k);

        int i = j - k + 1;
        for(; i < a.length && verdi > a[i]; i++);

        if(i < a.length && a[i] == verdi) return i;
        else return -(i +1);
    }

    public static int kvadratrotsøk(int[] a, int verdi){
        return lineærsøk(a, verdi, (int)Math.sqrt(a.length));
    }

    public static int binærsøk(int[] a, int fra, int til, int verdi)
    {
        Tabell.fratilKontroll(a.length,fra,til);  // se Programkode 1.2.3 a)
        int v = fra, h = til - 1;    // v og h er intervallets endepunkter

        while (v <= h)  // fortsetter så lenge som a[v:h] ikke er tom
        {
            int m = (v + h)/2;     // heltallsdivisjon - finner midten
            int midtverdi = a[m];  // hjelpevariabel for  midtverdien

            if (verdi > midtverdi) v = m + 1;        // verdi i a[m+1:h]
            else if (verdi < midtverdi) h = m - 1;   // verdi i a[v:m-1]
            else return m;                           // funnet
        }

        return -(v + 1);   // ikke funnet, v er relativt innsettingspunkt
    }
    public static void skriv(Object[] a, int fra, int til){
        if(a.length == 0) return;
        int i = fra;
        for(; i < til; i++){
            if(i == til - 1){
                System.out.print(a[i]);
            }else{
                System.out.print(a[i] + " ");
            }
        }
    }
    public static void skriv(Object[] a){
        skriv(a, 0, a.length);
    }
    public static void skrivln(Object[] a, int fra, int til){
        if(a.length == 0) return;
        int i = fra;
        for(; i < til; i++){
            if(i == til - 1){
                System.out.print(a[i] + "\n");
            }else{
                System.out.print(a[i] + " ");
            }
        }
    }
    public static void skrivln(Object[] a){
        skrivln(a, 0, a.length);
    }
    public static void bytt(Object[] a, int i, int j)
    {
        Object temp = a[i]; a[i] = a[j]; a[j] = temp;
    }
}
