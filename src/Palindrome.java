import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check if it is palindrome or not");
        String User_Input = sc.next();
        StringBuilder sb = new StringBuilder(User_Input);
        String Rev_String = sb.reverse().toString();
        if(User_Input.equalsIgnoreCase(Rev_String)){
            System.out.println("Palindrom --> "+User_Input);
        }
        else {
            System.out.println("Nope!!!");
        }
    }
}
