package three;


import java.util.Arrays;

public class ArrayCopyDemo {
    public static void main(String[] args) {
    char[] slova = {'g','T','a','r','i','k',' ','t','e','j'};
    char[] slova2 =Arrays.copyOfRange(slova,1,6);
        System.out.println(slova2);


    }
}
