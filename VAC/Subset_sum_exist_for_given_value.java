package VAC;

import java.util.Scanner;

public class Subset_sum_exist_for_given_value {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int elements[]=new int[N];
        for(int i=0;i<N;i++){
            elements[i]=sc.nextInt();
        }
        if(Subset_sum(elements,N,M))
            System.out.print("yes");
        else
            System.out.print("no");
    }
    public static boolean Subset_sum(int []arr,int n,int sum){
        if(sum==0) return true;
        if(n==0) return false;
        if(arr[n-1]>sum) return Subset_sum(arr,n-1,sum);
        return Subset_sum(arr,n-1,sum) || Subset_sum(arr,n-1,sum-arr[n-1]);
    }
}

/*
Subset Sum
Given a set of non-negative integers, and a value sum, determine if there is a subset of
the given set with sum equal to given sum.



Input Format:
Input consists of two lines. The first line consists of two integer N and M.
The second line consists of N space separated elements.



Output Format:
Output yes or no depending on whether sum M could be formed with some integers from the set.

Example 1:
Sample Input 1:
5 5
1 2 3 4 5

Sample Output 1:
yes

Explanation: 5 can be formed by the sum of 2 + 3 and 1 + 4.
*/
