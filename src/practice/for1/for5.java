package practice.for1;

import java.util.Scanner;

public class for5 {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.println("Enter number");
        int number = kbd.nextInt();

        for (int i = 0; i <=number; i++) {
            if (i%2 ==0) {
                System.out.println("par " + i);
            }else {
                System.out.println("impar " + i);
            }
        }

    }


}
