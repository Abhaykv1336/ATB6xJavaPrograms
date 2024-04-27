import java.util.Scanner;

public class MaxOf2_With_Input {
    public static void main(String[] args) {
        System.out.println("Enter num1");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println("Enter num2");
        int num2 = sc.nextInt();

        if(num1>num2){
            System.out.println(num1 + " is max");
        }else if(num2>num1){
            System.out.println(num2 + " is max");
        }else{
            System.out.println("Both numbers are equal");
        }
        sc.close();

    }
}
