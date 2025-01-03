package CRT.Day5;

import java.util.Scanner;

public class Factorial {
    static int Fact(int n){
        if(n==1) return 1;
        else return n * Fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int a=sc.nextInt();
//        int result=Fact(a);    //when we want to store the result in some variable
        System.out.println("Factorial: "+Fact(a));   //direct method to call and print result without storing it on another variable
    }
}