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
        int[]a={9,6,8,4,1,7,4,8};

        System.out.println(min(a, 2, 7));
        System.out.print(min2(a));

    }
    // Oppgave 5

    
}

