package KANAL_KUSHWAHA_DSA_Assignment_Solution.b_first_java;

import java.util.Scanner;

public class Odd_even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a=sc.nextInt();
        if(a%2==0) System.out.println("Even");
        else System.out.println("Odd");
    }
}
