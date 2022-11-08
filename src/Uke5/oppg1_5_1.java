package Uke5;

import static hjelpeklasser.Tabell.maks;

public class oppg1_5_1 {

    //Oppgave 1
    public static int a(int n){
        if(n < 0) throw new IllegalArgumentException("Kan ikke være negativ");
        int x = 0, y = 1, z = 1;
        for(int i = 0; i < n; i++){
            z = 2*y + 3*x; x = y; y = z;
        }
        return z;
    }


    //Oppgave 3
    public static int tverrsum(int n){
        if(n < 10) return n;
        //jeg er en ape
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }


    //Oppgave 4
    public static int sifferrot(int n){
        if(n < 10) return n;
        int sum = 0;
        while(n > 10){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }


    //Oppgave 7
    
    public static int kvadrattall(int n){
        int tall = 0;

        for(int i = 1; i <= n; i++){
            tall += i*i;
        }
        return tall;
    }

    //Oppgave 8
    public static int sum(int n, int k){
        {
            if (n == k) return n;
            int m = (n + k)/2;
            return sum(n,m) + sum(m+1,k);
        }
    }


    //Oppgave 9
    public static int maks(int[] a, int v, int h){
        if(v == h) return v;
        int m = (v + h)/2;
        int mv = maks(a,v,m);
        int mh = maks(a, m+1, h);

        return a[mv] >= a[mh] ? mv : mh;
    }

    public static int maks(int[] a){
        return maks(a,0,a.length-1);
    }


    //Oppgave 10
    public static int fakultet(int n){
        return n < 2 ? 1 : fakultet(n-1)*n;
    }

    //Oppgave 11
    public static int fib(int n)         // det n-te Fibonacci-tallet
    {
        if (n <= 1) return n;              // fib(0) = 0, fib(1) = 1
        else return fib(n-1) + fib(n-2);   // summen av de to foregående
    }


    public static void main(String[] args) {
        System.out.println(fib(50));
    }
}
