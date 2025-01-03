package CRT.Day3;

public class Two_max_without_duplicate_optimized {
    public static void main(String[] args) {
        int [] arr={3,4,5,4,453,453,675,877,6665,6667,6667};
        int max=arr[0];
        int smax=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }
            else if(arr[i]>smax && arr[i]<max){
                smax=arr[i];
            }
        }
        System.out.println("Maximum: "+max);
        System.out.println("Second Maximum: "+smax);
    }
}