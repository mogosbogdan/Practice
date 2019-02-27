package practice.methods;

public class method1 {

    public static void main(String[] args) {

            //sayHello();
        sayHello100times();

    }

    public static void sayHello() {

        System.out.println("Hello");
    }

    public static void sayHello100times() {
        for (int i = 1; i<=100; i++) {
            System.out.println(i+" hello");
        }

    }

}
