package practice.for1;

import java.util.Scanner;

public class for3 {


    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        int startNr, finalNr, skip;
        System.out.println("Enter start nr");
        startNr = kbd.nextInt();

        System.out.println("Enter final nr");
        finalNr = kbd.nextInt();

        System.out.println("Enter increment nr");
        skip = kbd.nextInt();

        for ( ; startNr < finalNr; startNr = startNr + skip) {

            System.out.println(startNr);
        }


    }
}
