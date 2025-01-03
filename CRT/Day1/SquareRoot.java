package CRT.Day1;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int count=0;
        for(int i=0;i<=num/2;i++){
            count+=1;
/*
            if((i*i)<=num){
                if((i+1)*(i+1)>num)
                    System.out.println("Result:"+ i);
            }
*/
            if( (i*i)<=num  && ((i+1)*(i+1))>num ){
                System.out.println("Result:"+ i);
                break;

            }
        }
        System.out.println(count);
    }
}

