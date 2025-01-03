package CRT.Day1;

import java.util.Scanner;

public class Prime_check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();

        int flag=0;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                flag=1;
                break;
            }
        }

        if(flag==0) System.out.println("Prime");
        else System.out.println("Not prime");

    }
}
