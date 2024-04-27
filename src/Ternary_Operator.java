import java.sql.SQLOutput;

public class Ternary_Operator {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c= 15;
    // find the max of these 3 numbers using ternary operator.
        int max = a > b ? ((a>c) ? a : c) : ((b>c) ? b : c);
        System.out.println(max);
    }
}
