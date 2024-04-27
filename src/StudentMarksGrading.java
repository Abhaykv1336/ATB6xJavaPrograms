import java.util.Scanner;

public class StudentMarksGrading {
    public static void main(String[] args) {
       // Find grade of student marks<81-100-->A: 61-80-->B: 41-60-->C : <41-->Fail : >100-->Are you joking?
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your marks");
        int marks = sc.nextInt();
        if(marks<=100 && marks>=81){
            System.out.println("Your Grade is --> A");
        }else if(marks<81 && marks>60){
            System.out.println("Your Grade is --> B");
        } else if (marks<=60 && marks>40) {
            System.out.println("Your Grade is --> C");
            }else if(marks>100){
            System.out.println("Are you joking?");
        }else {
            System.out.println("You are failed!!");
        }
        sc.close();
        }

    }


