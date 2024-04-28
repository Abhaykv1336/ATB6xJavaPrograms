import java.util.Scanner;

public class MathVariableValue {
    public static void main(String[] args) {
        // Write a formula to print value of x,y&z given by user
        // formula:- 3√(x^2 + y^2 - |z|)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        double x = sc.nextDouble();
        System.out.println("Enter the value of y: ");
        double y = sc.nextDouble();
        System.out.println("Enter the value of z: ");
        double z = sc.nextDouble();

        double result;
        result = Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));
        System.out.println(result);

        sc.close();
    }

}
