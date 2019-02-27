package practice.while1;

import java.util.Scanner;

public class while3 {

    public static void main(String[] args) {

        int sum = 0;

        Scanner kbd = new Scanner(System.in);

        while ( true) {
            System.out.println("Enter number");
            int enteredNumber =  kbd.nextInt();
            if (enteredNumber == 0) break;
            else System.out.println("sum is " + (sum += enteredNumber));
        }

        System.out.println("Total is " + sum);


    }
}
