package two;

/**
 * unarni operatori
 * +
 * -
 * ++ pre i post
 * -- pre i post
 * ! negacia
 */
public class UnaryDemo {
    public static void main(String[] args) {
        int broj1 = +23;
        System.out.println("broj 1 sa +"+broj1);

        broj1 = broj1;
        System.out.println("broj 2 sa -"+broj1);
        broj1=23;
        broj1++;
        System.out.println("post increment: "+broj1);
        broj1=23;
        ++broj1;
        System.out.println("pre increment: "+broj1);

        broj1 = 23;
        System.out.println(broj1++); // 23 posalji u konzolu .... uvecaj za 1
        System.out.println(broj1); //24

        broj1=23;
        System.out.println(++broj1); // uvecaj za 1i salji u konzolu
        System.out.println(broj1); // 24

        // post dekrement

        broj1=23;
        System.out.println(broj1--); // 23
        System.out.println(broj1); // 22

        // pre dekrement
        broj1=23;
        System.out.println(--broj1); // 22
        System.out.println(broj1); // 22

        boolean lav = false;
        System.out.println(!lav);













    }
}
