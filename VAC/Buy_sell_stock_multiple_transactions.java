package VAC;

import java.util.Scanner;

public class Buy_sell_stock_multiple_transactions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of element:");
        int N=sc.nextInt();
        int[] prices =new int[N];
        System.out.print("Enter elements:");
        for(int i=0;i<N;i++)
            prices[i]=sc.nextInt();
        int profit=0;
        for(int i=0;i<N-1;i++){
            if(prices[i]<prices[i+1])
                profit+=prices[i+1]-prices[i];
        }
        System.out.println("Profit:"+profit);
    }
}
