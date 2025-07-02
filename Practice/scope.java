package Practice;

public class scope {
    static int a=10, b=20;   //share a single copy of variable among all objects at a class level

    public static void main(String[] args) {
        int c=80;
        System.out.println(c);
        { //value initialised in this block will remain in this block
            int a=50,b=60;
//            int c=100;     //we cannot declare this again
            c=100;   //we can use and modify it or initialise it
            System.out.println(a+" "+b);

            int d=30;
        }  //scope of a,b,d ends here which are declare inside the block

        int d=90; //therefore we can declare d here
        System.out.println(c);

        System.out.println(a+" "+b);
        swap();
        System.out.println(a+" "+b);
    }
    static void swap(){
        int temp=a;
        a=b;
        b=temp;
    }
}
