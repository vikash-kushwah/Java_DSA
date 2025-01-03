package KANAL_KUSHWAHA_DSA_Assignment_Solution.c_conditionals_loops;

import java.util.Scanner;

import static java.lang.System.exit;

public class Area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float radius,base,h,b,area=0;
        while(true){
            System.out.println("1. Circle\n2. Triangle\n3. Square\n4. Rectangle\n5. Parallelogram\n6. Exit");
            System.out.print("Enter your choice:");
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Enter radius:");
                    radius=sc.nextFloat();
                    area= (float) (3.14*radius*radius);
                    break;
                case 2:
                    System.out.print("Enter Base:");
                    base=sc.nextFloat();
                    System.out.print("Enter Height:");
                    h=sc.nextFloat();
                    area= (float) (0.5*base*h);
                    break;
                case 3:
                    System.out.print("Enter length:");
                    b=sc.nextFloat();
                    area=b*b;
                    break;
                case 4,5:
                    System.out.print("Enter Breadth:");
                    b=sc.nextFloat();
                    System.out.print("Enter Height:");
                    h=sc.nextFloat();
                    area=b*h;
                    break;
                case 6:
                    System.out.println("Exiting...");
                    exit(1);
                default:
                    System.out.println("Wrong choice, try again!");
            }
            System.out.println("Area:"+area);
        }
    }
}
