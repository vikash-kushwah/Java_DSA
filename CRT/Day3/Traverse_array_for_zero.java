package CRT.Day3;

public class Traverse_array_for_zero {
    public static void main(String[] args) {
//        int [] arr={7,0,1,0,3,4};
        int []arr={0,1,0,3,12};
        int [] arr2=new int[arr.length];
        int indx=0;
        for (int k : arr) {
            if (k > 0) {
                arr2[indx] = k;
                indx++;
            }
        }
        for (int j : arr2) {
            System.out.print(j + " ");
        }
    }
}
