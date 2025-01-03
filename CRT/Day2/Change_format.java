package CRT.Day2;

import java.util.Scanner;

public class Change_format {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n= sc.nextInt();
        System.out.print("Enter a value:");
        int k= sc.nextInt();
/*
        int n=45678;
        int k=7;
*/
        int count=0;
        {
            int temp=n;
            while(temp>0){
                count++;
                temp/=10;
            }
        }
        System.out.println("count:"+count);
        if(k>count){
            k=k%count;
        }
        if(k<0){
            k=k+count;
        }
        while(k>0) {
            n = (n % 10) * (int) Math.pow(10, count - 1) + n / 10;
            k--;
        }
        System.out.println(n);
    }
}