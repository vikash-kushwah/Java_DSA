package CRT.Day3;

import java.util.Scanner;

public class Rotate_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr={1,2,32,4,53,64};
        System.out.print("Enter a value:");
        int val=sc.nextInt();
        int []temp=new int[val];
        for(int i=0;i<val;i++){
            temp[i]=arr[arr.length-val];
        }
        for(int i=0;i< arr.length;i++){
            if(i<val){
                System.out.print("");
            }
        }
    }
}
