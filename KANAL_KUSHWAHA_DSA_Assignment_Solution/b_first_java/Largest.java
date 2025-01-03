package KANAL_KUSHWAHA_DSA_Assignment_Solution.b_first_java;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b) System.out.println("Maximum Number: "+a);
        else System.out.println("Maximum Number: "+b);
    }
}
