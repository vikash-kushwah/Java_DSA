package CRT.Day2;

import java.util.Scanner;

public class Double_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                if(i==1 || j==1 || j==a-i+1){
                    System.out.print(j +" ");
                }
                else System.out.print("  ");
            }
            System.out.println("");
        }
        for(int i=2;i<=a;i++){
            for(int j=1;j<=i;j++){
                if(i==a || j==1 || j==i){
                    System.out.print(j +" ");
                }
                else System.out.print("  ");

            }
            System.out.println("");

        }

    }
}