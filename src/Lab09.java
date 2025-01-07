import java.util.Scanner;

public class Lab09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char, i will tell you if it is a vowel or consonant");

        char user_input = sc.next().charAt(0);


        switch (user_input) {
            case 'a', 'e', 'i', 'o', 'u' -> {
                System.out.println("vowel!");
                break;
            }
            default -> System.out.println("Consonant");
        }
        }
    }

