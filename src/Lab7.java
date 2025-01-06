import java.time.DayOfWeek;
import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number between 1 to 7 to know day name");
        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("Mon!");
                break;
            case 2:
                System.out.println("Tues!");
                break;
            case 3:
                System.out.println("Wed!");
                break;
            case 4:
                System.out.println("Thurs!");
                break;
            case 5:
                System.out.println("Fri!");
                break;
            case 6:
                System.out.println("Sat!");
                break;
            case 7:
                System.out.println("Sun!");
                break;
            default:
                System.out.println("Only number between 1 - 7 are allowed");
        }
        System.out.println("End of Program");
    }
}
