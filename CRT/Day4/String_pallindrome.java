package CRT.Day4;

import java.util.Scanner;

public class String_pallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String:");
        String str=sc.next();
        int flag=0;
        int len=str.length();
        for(int i=0;i<str.length()/2;i++){
            if((str.substring(i,i+1)).charAt(0) != (str.substring(len-i-1,len-i)).charAt(0)) {
                flag = 1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not Pallindrome");
        }
    }
}

