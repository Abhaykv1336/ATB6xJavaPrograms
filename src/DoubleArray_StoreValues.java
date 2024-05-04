public class DoubleArray_StoreValues {
    public static void main(String[] args) {
        int [] arrays = {10,20,30,40};
        int [] array2 = new int[4];
        for (int i=0; i< arrays.length; i++){
            array2[i]= arrays[i]*2;
        }
        for (int i=0; i< array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}
