package KANAL_KUSHWAHA_DSA_Assignment_Solution.a_flow_of_program;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Year:");
        int year=sc.nextInt();
        if(year>0){
            if((year%4==0 && year%100!=0) || (year%100==0 && year%400==0)){
                System.out.println("Leap year!");
            }
            else System.out.println("Not a Leap year!");
        }
        else System.out.println("Not a valid year!");
    }
}
