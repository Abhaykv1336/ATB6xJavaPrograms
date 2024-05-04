import java.util.Scanner;

public class Pass_Fail_Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        System.out.println("Enter marks of Mathematics");
        marks[0] = sc.nextFloat();
        System.out.println("Enter marks of Science");
        marks[1] = sc.nextFloat();
        System.out.println("Enter marks of English");
        marks[2] = sc.nextFloat();
        System.out.println("Enter marks of Hindi");
        marks[3] = sc.nextFloat();
        System.out.println("Enter marks of SST");
        marks[4] = sc.nextFloat();

       /* for(int i=0; i< marks.length; i++){
            if(marks[i]<33){
                System.out.println("You are failed in this subject:- "+ marks[i]);
            }
            else{
                System.out.println("You are passed & your are:- " + marks[i]);
            }
        }  */
        for (float mark : marks) {
            if (mark < 33) {
                System.out.println("You are failed in this subject:- " + mark);
            } else {
                System.out.println("You are passed & your are:- " + mark);
            }
        }
        sc.close();
    }
}
