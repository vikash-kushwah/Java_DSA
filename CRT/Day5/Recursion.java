package CRT.Day5;

public class Recursion {
    static void pathzigzag(int n){
        if(n==0) return;
        System.out.println("Pre"+n);
        pathzigzag(n-1);
        System.out.println("In"+n);
        pathzigzag(n-1);
        System.out.println("Post"+n);
    }
    public static void main(String[] args){
        pathzigzag(2);
    }
}
