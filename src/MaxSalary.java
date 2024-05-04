public class MaxSalary {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int [] salaries = {45, 32, 60, 65, 80, 25, 24, 75};
        int max = Integer.MIN_VALUE;   // Assigning minimum value range of Integer.
      //  int max = 0; :--> can also be used in place of line 5 if salary is greater than 0
        for (int i=0; i<salaries.length; i++) {
            if(max<salaries[i]) {
                max = salaries[i];
            }
        }
        System.out.println("Maximum salary is :- "+ max);

    }

}

