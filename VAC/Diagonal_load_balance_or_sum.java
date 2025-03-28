package VAC;

import java.util.Scanner;

public class Diagonal_load_balance_or_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p_diagonal=0,s_diagonal=0;
        int [][]arr=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
                if(i==j) p_diagonal+=arr[i][j];
                if((i+j)==(n-1)) s_diagonal+=arr[i][j];
            }
        }
        System.out.print(p_diagonal+" "+s_diagonal);
    }
}
/*
Power Grid Monitoring - Computing Diagonal Load Balances
In a power distribution center, the load levels are monitored and recorded in a grid-like structure
to analyze how power is being distributed across different regions. The grid is represented as an n×n matrix,
where each element represents the load level at a specific point in the grid.

The engineers are interested in efficiently calculating the sum of load levels along the two main diagonals:

Primary diagonal: From the top-left to the bottom-right.
Secondary diagonal: From the top-right to the bottom-left.
Write a program to compute the sum of the load levels along both diagonals.

Input Format
The first line contains a single integer, nnn (the size of the square matrix).
The next nnn lines contain nnn integers each, representing the load levels in the grid.

Output Format
Print two integers: the sum of the primary diagonal and the sum of the secondary diagonal, separated by a space.
Sample Input
3
5 2 3
8 6 4
1 9 7

Sample Output
18 10
*/
