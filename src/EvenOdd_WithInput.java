import com.sun.tools.javac.Main;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EvenOdd_WithInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();

         if (num%2==0){
             System.out.println("Your number "+num + " is even");
         }else {
             System.out.println("Your number "+num + " is odd");
         }
         sc.close();

    }

}
