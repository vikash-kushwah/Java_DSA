package CRT.Day4;

import java.util.Scanner;
public class SortArray {

    //bubble sort compares adjacent elements and put the largest element at the last
    public static int[] BubbleSort(int[] arr){
        System.out.println("Using BubbleSort");
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j< n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //using third varibale
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;

                    //without using another variable
                    arr[j]=arr[j]+arr[j+1];
                    arr[j+1]=arr[j]-arr[j+1];
                    arr[j]=arr[j]-arr[j+1];
                }
            }
        }
        return arr;
    }

    //Insertion Sort
    public static int[] InsertionSort(int[] arr){
        System.out.println("Using InsertionSort");
        int n=arr.length;
        for(int i=0;i<n;i++){
            int temp=arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        return arr;
    }

    //Selection sort
    public static int[] SelectionSort(int[] arr) {
        System.out.println("Using SelectionSort");
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // Swap elements
            if (min != i) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }

    public static void PrintArray(int [] arr){
        for(int i: arr)
            System.out.print(i + " ");
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements in Array: ");
        int n=sc.nextInt();
        int [] arr1=new int[n];
        System.out.print("Enter "+n+" Array elements:");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }

        PrintArray(InsertionSort(arr1));
        PrintArray(BubbleSort(arr1));
        PrintArray(SelectionSort(arr1));

    }
}