package CRT.Day5;

import java.util.Scanner;

public class Print_Decreasing_increasing {
    static void PDI(int n) {
        if (n > 0) {
            System.out.println(n);
            PDI(n - 1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        PDI(num);
    }
}