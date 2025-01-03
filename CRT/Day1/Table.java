package CRT.Day1;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int input=sc.nextInt();
        for( int i=1; i<=10; i++){
            System.out.println(i*input);
        }
    }
}