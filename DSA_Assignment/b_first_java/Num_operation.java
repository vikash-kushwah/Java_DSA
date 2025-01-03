package DSA_Assignment.b_first_java;

import java.util.Scanner;

public class Num_operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.print("Enter operator(+,-,*,/,%): ");
        char op = sc.next().charAt(0);

        if (op == '+') System.out.println("Sum: " + (a + b));
        else if (op == '-') System.out.println("Difference: " + (a - b));
        else if (op == '*') System.out.println("Product: " + (a * b));
        else if (op == '/') System.out.println("Division: " + (a / b));
        else if (op == '%') System.out.println("Remainder: " + (a % b));
    }
}
