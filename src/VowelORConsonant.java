import java.util.Scanner;

public class VowelORConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your character");
        char ch = sc.next().toLowerCase().charAt(0);
        if(ch == 'a' || ch =='e' || ch =='i' || ch =='o' || ch =='u'){
            System.out.println("Its a vowel");
        }else{
            System.out.println("Its a consonant");
        }
        sc.close();
    }
}
