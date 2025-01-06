package Jan25;

import java.util.Scanner;

public class Lab06_CheckTriangleType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of side1, side2 & side3 & I will let you know type of triangle");
             int side1 = sc.nextInt();
             int side2 = sc.nextInt();
             int side3 = sc.nextInt();

             if((side1==side2) && (side2==side3)){
                 System.out.println("Equilateral triangle");
             } else if ((side1==side2)||(side1==side3)||(side2==side3)) {
                 System.out.println("Isosceles triangle");
             }else {
                 System.out.println("Scalene triangle");
             }
             sc.close();
    }
}
