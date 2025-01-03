package CRT.Day2;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements:");
        int a=sc.nextInt();
        int []arr=new int[a];
        System.out.print("Enter the elements:");
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Array elements are:");
        int max_ele=0;
        int min_ele=arr[0];
        for(int i=0;i<a;i++){
            System.out.print(arr[i]+" ");
            if(arr[i]>max_ele){
                max_ele=arr[i];
            }
            if(arr[i]<min_ele){
                min_ele=arr[i];
            }
        }
        System.out.println("\nMaximum element of array: "+max_ele);
        System.out.println("Minimum element of array: "+min_ele);
        System.out.println("Span(Max-Min): "+(max_ele-min_ele));
    }
}
