package CRT.Day3;

import java.util.Scanner;

public class Operations_on_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr={10,30,10,20,30,5,40,20,50,35,25,5,2,6};
        System.out.print("Enter Number:");
        int target=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("first occurance at index: "+i);
                break;
            }
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==target){
                System.out.println("Last occurance at index: "+i);
                break;
            }
        }
        int count=0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==target){
                count++;
            }
        }

        System.out.println("total occurances: "+count);
    }
}