package Uke4;

import eksempelklasser.Komparator;
import eksempelklasser.Person;
import eksempelklasser.Student;
import eksempelklasser.Studium;
import hjelpeklasser.Tabell;

import java.util.Arrays;

public class oppg1_4_6 {
    /*
    Oppgave 1
    Teste komparator for programkode 1.4.6 c, e og f.

    Oppgave 2
    Utvidet og sjekket programmet og lagt lambda uttrykket inn i metoden
    som argument ditkete

    Oppgave 3
    Lagde lambda uttrykk som sorterte på studium, fornavn og etternavn

    Oppgave 4
    Lagde maksmetode med komparator

    Oppgave 5
    Sorterte strengene i oppgaven etter lengde, og hvis like lang alfabetisk

    Oppgave 7
    Fasit endret ved å sette studium().name();


     */
    public static void main(String... args)
        {

            Student[] s = new Student[7];                             // en studenttabell
            s[0] = new Student("Kari","Svendsen", Studium.Data);      // Kari Svendsen
            s[1] = new Student("Boris","Zukanovic", Studium.IT);      // Boris Zukanovic
            s[2] = new Student("Ali","Kahn", Studium.Anvendt);        // Ali Kahn
            s[3] = new Student("Azra","Zukanovic", Studium.IT);       // Azra Zukanovic
            s[4] = new Student("Kari","Pettersen", Studium.Data);     // Kari Pettersen
            s[5] = new Student("Franz", "Ullf", Studium.Elektro);
            s[6] = new Student("Anders", "Fjellbakk", Studium.Enkeltemne);

            Komparator<Student> c = (s1,s2) ->
            {
                int cmp = s1.studium().name().compareTo(s2.studium().name());
                return cmp != 0 ? cmp : s1.compareTo(s2);
            };                            // Programkode 1.4.6 b)

            System.out.println(Arrays.toString(s));

            /*
            String[] s = {"Lars","Anders","Bodil","Kari","Per","Berit","21","18","8","13","20","6","16","25","3","10"};
            Tabell.innsettingssortering(s, (s1,s2) -> {
                int k = s1.length() - s2.length();
                if(k == 0)
                    k = s1.compareTo(s2);
                return k;
            });

            System.out.println(Arrays.toString(s));
            // Utskrift: [Per, Lars, Kari, Bodil, Berit, Anders]
            */


        }
    }

