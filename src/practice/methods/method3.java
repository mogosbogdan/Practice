package practice.methods;

import java.util.Random;

public class method3 {

    public static void main(String[] args) {
        double generateRandomDouble = generateRandomNumber();
        System.out.println(generateRandomDouble);
    }

    public static double generateRandomNumber() {
        return Math.random() * 10;
    }
}
