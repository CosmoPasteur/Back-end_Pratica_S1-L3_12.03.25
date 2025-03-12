package esercizio_1;

import java.util.Scanner;

public class RettangoloMain {
    public static void main(String[] args){
        Rettangolo retta1 = new Rettangolo();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci Base");
        retta1.setBase(Scanner.nextInt());
        System.out.println("Inserisci Altezza");
        retta1.setAltezza(Scanner.nextInt());
        System.out.println("Perimetro :");
        retta1.perimetro(retta1.getBase(), retta1.getAltezza());
        System.out.println("Area");
        retta1.area(retta1.getBase(), retta1.getAltezza());

        retta1.perimetro(retta1.getBase(), retta1.getAltezza());

    }
}
