package CRT.Day1;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Numbers before swapping:"+a +" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Numbers after swapping: "+a+" "+b);

    }
}
