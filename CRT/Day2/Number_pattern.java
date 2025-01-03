package CRT.Day2;

import java.util.Scanner;

public class Number_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //forward number pattern
        System.out.print("Enter a number:");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++) {                //for(int j=i;j>0;j--)
                System.out.print(j);
            }
            System.out.println("");
        }

        //reverse number pattern
        System.out.print("Enter another number:");
        int b=sc.nextInt();
        for(int i=1;i<=b;i++){
            for(int j=b-i;j>0; j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
