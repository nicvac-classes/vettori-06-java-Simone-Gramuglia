//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

public class Esercizio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanti atleti ci sono in gara?");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] nomi = new String[n];
        String[] nazionali = new String[n];
        float[] tempi = new float[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nome " + (i + 1) + "° atleta: ");
            nomi[i] = scanner.nextLine();
            System.out.println("Nazionale " + (i + 1) + "° atleta: ");
            nazionali[i] = scanner.nextLine();
            System.out.println("Tempo " + (i + 1) + "° atleta: ");
            tempi[i] = scanner.nextFloat();
            scanner.nextLine();  // Consuma la newline rimasta dopo nextFloat()
        }

        System.out.println("Informazioni inserite:");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "° atleta: " + nomi[i] + "; nazionale: " + nazionali[i] + "; tempo: " + tempi[i]);
        }

        System.out.println("Ricerca dell'atleta vincitore");
        int iMin = 0;
        float min = tempi[0];
        for (int i = 1; i < n; i++) {
            if (tempi[i] < min) {
                iMin = i;
                min = tempi[i];
            }
        }

        System.out.println("Atleta vincitore: " + nomi[iMin] + "; nazionale: " + nazionali[iMin] + "; tempo: " + tempi[iMin]);

        scanner.close();
    }
}


//LEGGERE LE ISTRUZIONI NEL FILE README.md