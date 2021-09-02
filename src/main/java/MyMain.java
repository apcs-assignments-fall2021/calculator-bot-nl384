import java.util.Scanner;

public class MyMain {

    public static int median(int a, int b, int c) {
        return a + b + c - Math.min(Math.min(a, b), c) - Math.max(Math.max(a, b), c);
    }

    public static int magnitude(int a, int b) {
        if (Math.abs(a) > Math.abs(b)) {
            return a;
        }
        else {
            return b;
        }
    }

    public static double pythagoras(int a, int b) {
        return Math.sqrt(a*a + b*b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What command would you like to carry out?");
        String command = scan.next();

        if (command.equals("median")) {
            System.out.println("What is the first number?");
            int x = scan.nextInt();
            System.out.println("What is the second number?");
            int y = scan.nextInt();
            System.out.println("What is the third number?");
            int z = scan.nextInt();

            System.out.println("The median is " + median(x, y, z));
        }
        else if (command.equals("magnitude")) {
            System.out.println("What is the first number?");
            int x = scan.nextInt();
            System.out.println("What is the second number?");
            int y = scan.nextInt();
            System.out.println("The number with the larger magnitude is " + magnitude(x, y));
        }
        else if (command.equals("pythagoras")) {
            System.out.println("What is the first number?");
            int x = scan.nextInt();
            System.out.println("What is the second number?");
            int y = scan.nextInt();
            System.out.println("The third side of that triangle is " + pythagoras(x, y));
        }
    }
}