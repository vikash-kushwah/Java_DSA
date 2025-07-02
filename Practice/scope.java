package Practice;

public class swap {
    static int a=10, b=20;
    public static void main(String[] args) {
        {
            int a=50,b=60;
            System.out.println(a+" "+b);
        }
        System.out.println(a+" "+b);
        print();
        System.out.println(a+" "+b);
    }
    static void print(){
        int temp=a;
        a=b;
        b=temp;
    }
}
