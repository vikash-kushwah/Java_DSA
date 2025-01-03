package CRT.Day4;

import java.util.Scanner;

public class Search_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 30, 10, 20, 30, 5, 40, 20, 50, 35, 25, 5, 2, 6};
        System.out.print("Enter Number:");
        int target = sc.nextInt();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == target) {
//                System.out.println("Found at index: " + i);
//                System.exit(1);
//            }
//        }
//        System.out.println(-1);

        int indx=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                indx=i;
                break;
            }
        }
        System.out.print("found at index:"+indx);
    }
}
