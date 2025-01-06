package Jan25;

import java.util.Scanner;

public class Lab05_MaxofTwo {
    public static void main(String[] args) {
        System.out.println("Enter num1");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println("Enter num2");
        int num2 = sc.nextInt();

        int max = Math.max(num1,num2);
        System.out.println("Max by Math.max function() "+max);

        if(num1>num2){
            System.out.println("Max is --> "+ num1);
        }else {
            System.out.println("Max is --> "+num2);
        }
        sc.close();

    }



}
