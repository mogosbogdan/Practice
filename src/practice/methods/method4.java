package practice.methods;

import java.util.Scanner;

public class method4 {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter number");
        int month = kbd.nextInt();
        String enteredMonth = currentMonth(month);
        System.out.println(enteredMonth);

    }

    public static String currentMonth (int number) {

        switch (number) {
            case  1 : return "January";
            case  2 : return "February";
            case  3 : return "March";
            case  4 : return "April";
            case  5 : return "May";
            case  6 : return "June";
            case  7 : return "July";
            case  8 : return "August";
            case  9 : return "September";
            case  10 : return "October";
            case  11 : return "November";
            case  12 : return "December";
            default: return "Invalid";
        }

    }



}
