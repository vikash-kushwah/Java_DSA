package CRT.Day5;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        String s="hello hi";
        System.out.println(s.length());
        int [] arr={5,6,4,3,3,4};
        System.out.println(arr.length);
        ArrayList<Integer> mylist=new ArrayList<>(10);
        for(int i=0;i<=10;i++){
            mylist.add(i);
        }
        System.out.println(mylist);
    }
}