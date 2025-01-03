package KANAL_KUSHWAHA_DSA_Assignment_Solution.b_first_java;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name: ");
        String name=sc.nextLine();
        System.out.print("Hi "+name+"!\nHow are you?");
    }
}
