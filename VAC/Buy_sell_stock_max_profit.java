package VAC;

import java.util.Scanner;

public class Buy_sell_stock_max_profit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int []price=new int[N];
        for(int i=0;i<N;i++){
            price[i]=sc.nextInt();
        }
        int profit=0;
        for(int i=0;i<N-1;i++){
            for(int j=i;j<N;j++){
                if(price[j]-price[i]>profit)
                    profit=price[j]-price[i];
            }
        }
        System.out.println(profit);
    }
}
