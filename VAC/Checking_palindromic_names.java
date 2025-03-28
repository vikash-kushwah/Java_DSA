package VAC;

import java.util.Scanner;

public class Checking_palindromic_names {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.print(Check(s));
    }
    static int Check(String str){
        int l=str.length();
        if(l<1) return 0;
        for(int i=0;i<l-1;i++){
            if(str.charAt(i)!=str.charAt(l-1-i))
                return 0;
        }
        return 1;
    }
}
/*
Checking Palindromic Names
In a security firm, a system was developed to check if names on employee badges appear the same when reflected in a mirror.
The company wants to ensure that certain employee names read the same forwards and backwards,
as this symmetric property enhances security by allowing names to be recognized even if seen in a mirror.
Your task is to write a program that checks if a given name is a palindrome.
If it is a palindrome, return 1; otherwise, return 0.

Problem Statement
Write a program that reads a name (or any single word) and checks if it’s a palindrome.
If it is a palindrome, the output should be 1; if not, the output should be 0.

Note: A string is said to be a palindrome if the reverse of the string is the same as string.
For example, “abba” is a palindrome, but “abbc” is not a palindrome.

Input Format: Input consists of a single string representing the employee's name.
Output Format: Output 1 if the name is a palindrome, and 0 otherwise.

Example 1
Sample Input 1
Input1: level

Sample Output 1
1

Explanation: The reverse of string “level” is “level”. As they are the same hence the string is a palindrome.
*/
