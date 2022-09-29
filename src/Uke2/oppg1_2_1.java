package Uke2;
// Oppgave 1
public class oppg1_2_1 {
    public static int min(int[] a, int fra, int til){
        if (fra < 0 || til > a.length || fra >= til){
            throw new IllegalArgumentException("Ulovlig intervall");
        }
        int m = fra;
        int minimumverdi = a[fra];

        for(int i = fra + 1; i < til; i++){
            if (a[i] < minimumverdi){
                m = i;
                minimumverdi=a[m];
            }
        }
        return m;
    }
    public static int min2(int[] a){
        return min(a, 0, a.length);
    }
    public static void main(String [] args){
        int[]a={9,6,8,4,7,1,4,8};

        System.out.print("Minste indexen i arrayet er ");
        System.out.print(min2(a));

        // Oppgave 5

        int[] array = {1,3,8,5,3,9};

        for (int i : array){
            System.out.print(i + " ");
        }
    }

}

