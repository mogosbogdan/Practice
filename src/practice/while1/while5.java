package practice.while1;

import java.util.Scanner;

public class while5 {

    public static void main(String[] args) {

        System.out.println("Enter number");
        Scanner kbd = new Scanner(System.in);
        int a = kbd.nextInt();
        int opposite = 0;
        int lastNumber;

        int initialValue = a;

        while (a != 0) {
            lastNumber = a % 10;
            a = a / 10;
            System.out.println(lastNumber);

            opposite = opposite * 10 + lastNumber;
            System.out.println("Opposite is " + opposite);

        }

        if (initialValue == opposite) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("It's not a palindrome");

        }
    }
}
