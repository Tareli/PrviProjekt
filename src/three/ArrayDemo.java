package three;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        // tip varijable vrednosti;
        int number1 = 23;
        //slozeni tipovi podataka
        //nacin konstrukcije niza
        int[] brojevi = new int[3];
        System.out.println("unesi prvi broj");
        brojevi[0] = new Scanner(System.in).nextInt();
        System.out.println("unesi drugi broj");
        brojevi[1] = new Scanner(System.in).nextInt();
        System.out.println("unesi treci broj");
        brojevi[2] = new Scanner(System.in).nextInt();
        System.out.println("prvi element u nizu: " + brojevi[0]);
        System.out.println(brojevi[0]+","+brojevi[1]+","+brojevi[2]+",");

        // drugi nacin
        int[] drugiNiz = {23,13,133};



    }
}
