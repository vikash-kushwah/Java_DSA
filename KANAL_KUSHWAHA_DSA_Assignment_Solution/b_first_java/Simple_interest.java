package KANAL_KUSHWAHA_DSA_Assignment_Solution.b_first_java;

import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Principal amount: ");
        double pa=sc.nextDouble();
        System.out.print("Enter Time:");
        float time=sc.nextFloat();
        System.out.print("Enter Rate");
        float rate=sc.nextFloat();
        double SI=(pa*time*rate)/100;
        System.out.println("Simple Interest: "+SI);

    }
}
