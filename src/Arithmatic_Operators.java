import java.util.Scanner;

public class Arithmatic_Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter num1: ");
        int num1 = sc.nextInt();

        System.out.println("Please enter your operation: ");
        char operator = sc.next().charAt(0);

        System.out.println("Please enter num2: ");
        int num2 = sc.nextInt();

        if (operator == '+') {
            System.out.println(num1 + num2);
        }
        if (operator == '-') {
            System.out.println(num1 - num2);
        }
        if (operator == '*') {
            System.out.println(num1 * num2);
        }
        if (operator == '/') {
            System.out.println(num1 / num2);
        }
        if (operator == '%') {
            System.out.println(num1 % num2);

        }

    }


}


