package practice.for1;

import java.util.Scanner;

public class for4 {

    public static void main(String[] args) {


        double x = 0.5;


        for ( double i = -10; i<=10; i+=x) {
            System.out.println(i);
            System.out.println(Math.pow(i,2));
        }

    }
}
