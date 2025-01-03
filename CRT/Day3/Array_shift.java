package CRT.Day3;

public class Array_shift {
    public static void main(String[] args) {
        int [] array={29,76,42,68,13,71};
        int temp=3;
        int len=array.length;
        for(int i=1;i<len;i++){
            array[i-1]=array[i];
        }
        array[len-1]=temp;
        for(int i=0; i<len;i++){
            System.out.print(array[i]+" ");
        }
    }
}
