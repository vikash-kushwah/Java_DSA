package DSA_Assignment.b_first_java;

import java.util.Scanner;

public class Currency_INR_to_USD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter amount in Rupee:");
        float inr=sc.nextFloat();
        //printf used as output formatter .2f means upto 2 decimal places float number 
        System.out.printf("Amount in USD:%.2f ",inr/84.5);
    }
}
