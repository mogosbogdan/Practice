package practice.while1;

import java.util.Scanner;

public class while1 {

    public static void main(String[] args) {
////        int index = 0;
////        while (index <100) {
////            System.out.println("index " + index);
////            index++;
//        }


        Scanner kbd = new Scanner(System.in);
        int guessNr = 7;
        int try1 = 0;
        System.out.println("Try to guess number");

        while (try1 != guessNr) {
            try1 = kbd.nextInt();
            if (try1 <guessNr) System.out.println("Too low");
            else if (try1 > guessNr) System.out.println("Too high");
        }

        System.out.println("You guessed it");
    }
}
