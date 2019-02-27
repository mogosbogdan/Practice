package practice.while1;

import java.util.Scanner;

public class while2 {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter repeated message");
//        String message =kbd.nextLine();
//
//
//
//        int counter = 0;
//        while (counter<5) {
//            counter++;
//            System.out.println( counter*10 +". " + message);
//
//        }

        String repeatedMessage = kbd.nextLine();
        System.out.println("How many times ?");
        int repeats = kbd.nextInt();

        while (repeats > 0) {
            System.out.println(repeatedMessage);
            repeats--;
        }

    }
}
