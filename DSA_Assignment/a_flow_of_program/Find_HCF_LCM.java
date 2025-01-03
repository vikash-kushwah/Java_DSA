package DSA_Assignment.a_flow_of_program;

import java.util.Scanner;

import static java.lang.Math.max;

public class Find_HCF_LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("HCF: "+HCF(a,b));
        System.out.println("LCM: "+LCM(a,b));

/*
         //we can also use the formula lcm= (a*b)/hcf
        System.out.println("LCM: "+((a*b)/HCF(a,b)));
*/
    }

    static int HCF(int x,int y){
        while(x!=y){
            if(x>y) x = x - y;
            else y=y-x;
        }
        return x;
    }
    static int LCM(int x,int y){
        int max=Math.max(x,y);    //using Math.max(a,b) for maximum
//        int max=x>y?x:y;        //using conditional statement for maximum
        for(int i=max;;i++)
            if (i%x == 0 && i%y == 0) return i;
    }
}
