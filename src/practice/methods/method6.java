package practice.methods;

import java.util.Scanner;

public class method6 {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter number");
        int number = kbd.nextInt();
        int powered = power(number);
        System.out.println("Power of  " + number + " is " +powered);

    }

    public static int power(int nr ) {
        return nr * nr;

    }




}
