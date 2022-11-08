package hjelpeklasser;

import java.util.Iterator;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class EnkeltLenketListe<T> implements Liste<T>
{
    private static final class Node<T>       // en indre nodeklasse
    {
        private T verdi;                       // nodens verdi
        private Node<T> neste;                 // den neste noden

        private Node(T verdi,Node<T> neste)    // konstruktør
        {
            this.verdi = verdi;
            this.neste = neste;
        }
    }  // Node
    public EnkeltLenketListe(T[] a){
        this();

        int i = 0; for(; i < a.length && a[i] == null; i++);

        if (i < a.length){
            Node<T> p = hode = new Node<>(a[i], null);
            antall = 1;

            for(i++; i < a.length; i++){
                if(a[i] != null){
                    p = p.neste = new Node<>(a[i], null);
                    antall++;
                }
            }
            hale = p;
        }
    }
    private Node<T> hode, hale;  // pekere til første og siste node

    private int antall;          // antall verdier/noder i listen

    public EnkeltLenketListe()   // standardkonstruktør
    {
        hode = hale = null;        // hode og hale til null
        antall = 0;                // ingen verdier - listen er tom
    }

    @Override
    public boolean leggInn(T verdi)   // verdi legges bakerst
    {
        Objects.requireNonNull(verdi, "Ikke tillatt med null-verdier!");

        if (antall == 0)  hode = hale = new Node<>(verdi, null);  // tom liste
        else hale = hale.neste = new Node<>(verdi, null);         // legges bakerst

        antall++;        // en mer i listen
        return true;     // vellykket innlegging
    }

    @Override
    public void leggInn(int indeks, T verdi)    // verdi til posisjon indeks
    {
        Objects.requireNonNull(verdi, "Ikke tillatt med null-verdier!");

        indeksKontroll(indeks, true);        // true: indeks = antall er lovlig

        if (indeks == 0)                     // ny verdi skal ligge først
        {
            hode = new Node<>(verdi, hode);    // legges først
            if (antall == 0) hale = hode;      // hode og hale peker på samme node
        }
        else if (indeks == antall)           // ny verdi skal ligge bakerst
        {
            hale = hale.neste = new Node<>(verdi, null);  // legges bakerst
        }
        else
        {
            Node<T> p = hode;                  // p flyttes indeks - 1 ganger
            for (int i = 1; i < indeks; i++) p = p.neste;

            p.neste = new Node<>(verdi, p.neste);  // verdi settes inn i listen
        }

        antall++;                            // listen har fått en ny verdi
    }

    @Override
    public boolean inneholder(T verdi)
    {
        //throw new UnsupportedOperationException("Ikke laget ennå!");
        return indeksTil(verdi) != -1;
    }

    @Override
    public T hent(int indeks)
    {
        throw new UnsupportedOperationException("Ikke laget ennå!");
    }

    @Override
    public int indeksTil(T verdi)
    {
        //throw new UnsupportedOperationException("Ikke laget ennå!");
        if (verdi == null) return -1;

        Node<T> p = hode;

        for (int indeks = 0; indeks < antall; indeks++){
            if(p.verdi.equals(verdi)) return indeks;
            p = p.neste;
        }
        return -1;
    }
    public boolean fjernHvis(Predicate<? super T> predikat)
    {
        Objects.requireNonNull(predikat, "null-predikat!");

        Node<T> p = hode, q = null;
        int antallFjernet = 0;
        int endringer = 0;

        while (p != null)
        {
            if (predikat.test(p.verdi))
            {
                antallFjernet++;
                endringer++;

                if (p == hode)
                {
                    if (p == hale) hale = null;
                    hode = hode.neste;
                }
                else if (p == hale) q.neste = null;
                else q.neste = p.neste;
            }
            q = p;
            p = p.neste;
        }

        antall -= antallFjernet;

        return antallFjernet > 0;
    }
    public void forEach(Consumer<? super T> handling)
    {
        Objects.requireNonNull(handling, "handling er null!");

        Node<T> p = hode;
        while (p != null)
        {
            handling.accept(p.verdi);
            p = p.neste;
        }
    }

    public void forEachremaining(Consumer<? super T> handling){
        Objects.requireNonNull(handling, "handling er null!");

        Node<T> p = hode;
        while(p != null){
            handling.accept(p.verdi);
            p = p.neste;
        }
    }

    @Override
    public T oppdater(int indeks, T t)
    {
        throw new UnsupportedOperationException("Ikke laget ennå!");
    }

    @Override
    public T fjern(int indeks)
    {
        throw new UnsupportedOperationException("Ikke laget ennå!");
    }

    @Override
    public boolean fjern(T verdi)
    {
        //throw new UnsupportedOperationException("Ikke laget ennå!");
        if (verdi == null) return false;

        Node<T> q = hode, p = null;

        while (q != null){
            if ( q.verdi.equals(verdi)) break;
            p = q; q = q.neste;
        }
        if (q == null) return false;
        else if (q == hode) hode = hode.neste;
        else p.neste = q.neste;

        if (q == hale) hale = p;

        q.verdi = null;
        q.neste = null;

        antall--;

        return true;
    }

    @Override
    public int antall()
    {
        //throw new UnsupportedOperationException("Ikke laget ennå!");
        return antall;
    }

    @Override
    public boolean tom()
    {
        //throw new UnsupportedOperationException("Ikke laget ennå!");
        return antall == 0;
    }

    @Override
    public void nullstill()
    {
        //throw new UnsupportedOperationException("Ikke laget ennå!");
        Node<T> p = hode, q = null;

        while (p != null){
            q = p.neste;
            p.neste = null;
            p.verdi = null;
            p = q;      }
    }

    @Override
    public Iterator<T> iterator()
    {
        throw new UnsupportedOperationException("Ikke laget ennå!");
    }

    @Override
    public String toString()
    {
        //throw new UnsupportedOperationException("Ikke laget ennå!");
        StringBuilder s = new StringBuilder();

        s.append("[");

        if(!tom()){
            Node<T> p = hode;
            s.append(p.verdi);

            p = p.neste;

            while(p != null){
                s.append(',').append(' ').append(p.verdi);
                p = p.neste;
            }
        }
        s.append(']');

        return s.toString();
    }


}  // EnkeltLenketListe