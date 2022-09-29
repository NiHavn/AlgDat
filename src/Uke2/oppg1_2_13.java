package Uke2;

import hjelpeklasser.Tabell;

public class oppg1_2_13 {
    //Oppgave 1
    public static int[] nestMaks(int[] a)   // en turnering
    {
        int n = a.length;                // for å forenkle notasjonen

        if (n < 2) // må ha minst to verdier!
            throw new IllegalArgumentException("a.length(" + n + ") < 2!");

        int[] b = new int[2*n];          // turneringstreet
        System.arraycopy(a,0,b,n,n);     // legger a bakerst i b

        for (int k = 2*n-2; k > 1; k -= 2)   // lager turneringstreet
            b[k/2] = Math.max(b[k],b[k+1]);

        int maksverdi = b[1], nestmaksverdi = Integer.MIN_VALUE;

        for (int m = 2*n - 1, k = 2; k < m; k *= 2)
        {
            int tempverdi = b[k+1];  // ok hvis maksverdi er b[k]
            if (maksverdi != b[k]) { tempverdi = b[k]; k++; }
            if (tempverdi > nestmaksverdi) nestmaksverdi = tempverdi;
        }

        return new int[] {maksverdi,nestmaksverdi}; // størst og nest størst

    } // nestMaks

    // Oppgave 3

    public static void kopier(int[] a, int i, int[] b, int j, int ant){

        for (int n = i + ant; i < n;) b[j++] = a[i++];
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 7, 4, 7, 8, 11, 21, 0};

        int[] b = nestMaks(a);

        for(int i : b){
            System.out.println(i);
        }
        System.out.println("---Oppgave 3---\n");

        int[] i = Tabell.randPerm(10);
        int[] j = Tabell.randPerm(10);

        for(int c : i) System.out.print(c + " ");
        System.out.println();

        for(int d : j) System.out.print(d + " ");
        System.out.println();

        System.arraycopy(i, 0, j, 0, i.length);

        System.arraycopy(i, 0, j, j.length - i.length, i.length);

        System.arraycopy(i, 0, j, (j.length - i.length)/2, i.length);

    }
}
