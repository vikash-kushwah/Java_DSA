package Practice;

import java.util.Scanner;

public class IsAnagram {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String a=sc.next().toLowerCase();;
        String b=sc.next().toLowerCase();;
        if(isAnagram(a,b)){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("Not Anagrams");
        }
    }
    //method for checking for Anagrams
    public static boolean isAnagram(String a, String b) {
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                char ch = a.charAt(i);
                if (countChar(a, ch) != countChar(b, ch)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    // Helper method to count occurrences of a character in a string
    private static int countChar(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}

//https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true