package practice.while1;

import java.util.Scanner;

public class while4 {

    public static void main(String[] args) {

        Scanner keys = new Scanner(System.in);

        System.out.println( "Enter number" );

        int nr = keys.nextInt();

        while ( nr != 0){

            System.out.println( nr % 10 );

            nr = nr / 10;
        }

    }
}
