package CRT.Day1;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("sum: "+sum);


        int result=1;
        while (b > 0) {
            result=result*a;
            b=b-1;
        }
        System.out.println("a**b:"+result);


        int x=1;
        x=x++ + ++x * --x - x--;
        System.out.println("x:"+x);

    }
}
