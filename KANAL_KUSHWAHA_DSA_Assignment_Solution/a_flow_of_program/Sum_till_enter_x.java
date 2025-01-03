package KANAL_KUSHWAHA_DSA_Assignment_Solution.a_flow_of_program;

import java.util.Objects;
import java.util.Scanner;

public class Sum_till_enter_x {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 'x' to stop entering numbers:");
        int sum=0;
        for(;;){
            String a=sc.next();
            if(Objects.equals(a, "x")) break;
            else sum+=Integer.parseInt(a);
        }
        System.out.println(sum);

    }
}
