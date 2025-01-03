package CRT.Day2;

//empty while gives error but for loop works and run for infinite time
public class Empty_while {
    public static void main(String[] args) {

        //empty while cannot run and it gives error during compile time
        //while empty for loop run for infinite time
        for(;;){
            System.out.println("hello");
        }
    }
}
