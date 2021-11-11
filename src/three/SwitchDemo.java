package three;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        System.out.println("unesi broj od 1do7");
        int brojDanaUSedmici = new Scanner(System.in).nextInt();
        switch (brojDanaUSedmici){
            case  1:
                System.out.println("ponedjeljak");
                break;
            case  2:
                System.out.println("utorak");
                break;
            case 3:
                System.out.println("srijeda");
                break;
            case 4:
                System.out.println("cetvrtak");
                break;
            case 5:
                System.out.println("petak");
                break;
            case 6:
                System.out.println("subota");
                break;
            case 7:
                System.out.println("nedjelja");
                break;

            default:
                System.out.println("netacan broj dana u sedmici");
        }

    }
}
