package Uke5;

public class oppg1_5_2 {

   // Oppgave 2
    public static int euklid(int a, int b)
    {
        System.out.println("euklid(" + a + (" og ") +  b + ") starter!");
        if (b == 0) return a;
        int r = a % b;            // r er resten
        System.out.println("euklid(" + a + b + ") er ferdig!");
        return euklid(b,r);       // rekursivt kall
    }


   // Oppgave 6
    // Trret for fib(5) har 15 noder, treet for fib(6) vil få 25 noder.



    public static void main(String[] args) {
        euklid(5, 10);
    }
}
