package CRT.Day4;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a element to search:");
        int el=sc.nextInt();
        int [] arr ={7,14,23,38,44,61,79};
        int min=0,max=arr.length-1,mid;
        while(min<=max){
            mid=(min+max)/2;
            if(arr[mid]==el){
                System.out.print("Element found at index: "+mid);
                System.exit(1);
            }
            else if(arr[mid]>el){
                max=mid-1;
            }
            else{
                min=mid+1;
            }
        }
        System.out.println("Element not found!");
    }
}