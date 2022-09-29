package Uke2;

import hjelpeklasser.Tabell;

public class oppg1_2_3 {
    public static void main(String[] args) {
        int [] a = Tabell.randPerm(10);
        Tabell.skriv(a, 0, 0);
        Tabell.skrivln(a, 0, 4);
    }
}
