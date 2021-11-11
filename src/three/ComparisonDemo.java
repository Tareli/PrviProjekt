package three;


import java.util.Scanner;

public class ComparisonDemo {
    public static void main(String[] args) {
        System.out.println("unesi cijeli broj 1: ");
        int number1 = new Scanner



                (System.in) .nextInt();
        System.out.println("unesi drugi cijel broj:");
        int number2 = new Scanner(System.in).nextInt();
        if (number1 == number2) {
        System.out.println("hej umio si dva jednaka broja");
        if (number1 != number2){
        System.out.println("hej unjeli ste dva razlicita broja");
        if (number1<number2) {
        System.out.println("prvi broj je veci od drugog");
        if (number1>=number2){
        System.out.println("prvi broj je manji ili jednak drugom");
        if (number1<number2){



            System.out.println("prvi broj je manji od drugog");

        }
        }

        }



            }
        }


    }
}
