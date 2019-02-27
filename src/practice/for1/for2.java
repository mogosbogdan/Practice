package practice.for1;

import java.util.Scanner;

public class for2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        int number;

        System.out.println("Enter number");
        number = scanner.nextInt();

        for (int i =0; i<=number; i++) {
            System.out.println(i);
        }


    }


}
