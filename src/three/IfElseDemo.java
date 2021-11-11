package three;

import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
        // profesor unosi broj poena
        System.out.println("unesi broj poena");
        int brojPoena = new Scanner(System.in).nextInt();
        char ocjena;
        if ((brojPoena >= 90)) {
            ocjena = 'a';
        } else if (brojPoena >= 80) {
            ocjena = 'b';
        } else if (brojPoena >= 70) {
            ocjena = 'c';
        } else if (brojPoena >= 60) {
            ocjena = 'd';}
            else {ocjena = 'e';

        }
        System.out.println("zasuzena ocjena: " + ocjena);



    }
}