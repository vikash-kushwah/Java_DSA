package CRT.Day4;

import java.util.Scanner;

public class Recursion_Print12n {
    static void Print12n(int n){
        if(n>0){
            Print12n(n-1);
            System.out.print(n+" ");
        }
    }

    static void Printn21(int n){
        if(n>0){
            System.out.print(n+" ");
            Printn21(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        Print12n(num);
        System.out.println();
        Printn21(num);
    }
}
