package ba.unsa.etf.rs;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int funkcija(double []niz, double n) {
        int broj=0;
        for(int i=0; i<niz.length; i++) {
            if(niz[i]>Math.sqrt(n))
                broj++;
        }
        return broj;
    }

    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        int broj = 0;
        do {
            System.out.println("Unesite broj clanova niza: ");
            broj = unos.nextInt();

        }while(broj < 0 || broj > 100);

        double []niz = null;
        niz = new double[broj];
        System.out.println("Unesite clanove niza: ");

        for(int i=0; i<broj; i++) {
            niz[i] = unos.nextDouble();
        }
        double najveciClan = Arrays.stream(niz).max().getAsDouble();
        int rezultat = funkcija(niz, najveciClan);
        System.out.println(rezultat);
    }
}
