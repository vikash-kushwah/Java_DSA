package DSA_Assignment.a_flow_of_program;

import java.util.Scanner;

public class Sum_of_two_nums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int a=sc.nextInt();
        System.out.print("Enter second number:");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("sum is: "+sum);
    }
}
