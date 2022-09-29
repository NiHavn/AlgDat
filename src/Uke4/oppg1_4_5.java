package Uke4;

import eksempelklasser.Student;
import eksempelklasser.Studium;
import hjelpeklasser.Tabell;


public class oppg1_4_5 {
    /*
    Oppgave 1
    Kjørt programkode 1.4.5 b)

    Oppgave 2
    Leste tekst i oppgaven om enumtyper

    Oppgave 3
    Skrevet av fasit oppgave 3

    Oppgave 4
    La inn elektro faget i Studium tabellen

    Oppgave 5
    Lagt inn studenter og dkrevet ut programkoden for 1.4.5 d)

     */
    public static void main(String[] args) {
        Student[] s = new Student[7];  // en Studenttabell

        s[0] = new Student("Kari", "Svendsen", Studium.Data);    // Kari Svendsen
        s[1] = new Student("Boris", "Zukanovic", Studium.IT);    // Boris Zukanovic
        s[2] = new Student("Ali", "Kahn", Studium.Anvendt);      // Ali Kahn
        s[3] = new Student("Azra", "Zukanovic", Studium.IT);     // Azra Zukanovic
        s[4] = new Student("Kari", "Pettersen", Studium.Data);   // Kari Pettersen
        s[5] = new Student("Kent", "Ali", Studium.Elektro);
        s[6] = new Student("Arild", "Gustavson", Studium.Enkeltemne);
        Tabell.innsettingssortering(s);                     // Programkode 1.4.2 e)
        for (Student t : s) System.out.println(t);
    }
}
