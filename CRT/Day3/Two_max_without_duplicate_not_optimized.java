package CRT.Day3;

public class Two_max_without_duplicate_not_optimized {
    public static void main(String[] args) {
        int []arr={2,3,4,6,4,3,566,7,833,833,53,7};
        int size=arr.length;

        int [] arr3=new int[size];

        int max=arr[0];
        int indx=0;

        for(int i=1;i<size;i++){
            if(arr[i]>max){
                arr3[indx]=max;
                max=arr[i];
            }
            else if(arr[i]<max){
                arr3[indx]=arr[i];
            }
            else{
                arr3[indx]=0;        //duplicate values will be inserted as 0
            }
            indx++;

        }
        System.out.println(max);
        max=arr3[0];
        for(int i=1;i<arr3.length;i++){
            if(arr3[i]>max){
                max=arr3[i];
            }
        }
        System.out.println(max);
    }
}