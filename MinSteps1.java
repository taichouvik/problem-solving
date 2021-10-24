import java.util.Arrays;
import java.util.Scanner;
/* Min Steps To One

Given a positive integer 'n', find and return the minimum number of steps that 'n' has to take to get reduced to 1. You can perform any one of the following 3 steps:
1.) Subtract 1 from it. (n = n - ­1) ,
2.) If its divisible by 2, divide by 2.( if n % 2 == 0, then n = n / 2 ) ,
3.) If its divisible by 3, divide by 3. (if n % 3 == 0, then n = n / 3 ).  
Write brute-force recursive solution for this.
Input format :
The first and the only line of input contains an integer value, 'n'.
Output format :
Print the minimum number of steps.
Constraints :
1 <= n <= 200

Time Limit: 1 sec
Sample Input 1 :
4
Sample Output 1 :
2 
Explanation of Sample Output 1 :
For n = 4
Step 1 :  n = 4 / 2  = 2
Step 2 : n = 2 / 2  =  1 
Sample Input 2 :
7
Sample Output 2 :
3
Explanation of Sample Output 2 :
For n = 7
Step 1 :  n = 7 ­- 1 = 6
Step 2 : n = 6  / 3 = 2 
Step 3 : n = 2 / 2 = 1   */
public class MinSteps1 {
    static int n;
    static int[] dp;

    static int solve(int n) {
        int m = Integer.MAX_VALUE;
        if (n == 1)
            return dp[1] = 0;
        if (n < 1)
            return m-n;
        if (dp[n] != -1)
            return dp[n];
        int a = (n % 2 == 0) ? 1 + solve(n / 2) : m;
        int b = (n % 3 == 0) ? 1 + solve(n / 3) : m;
        int c = 1 + solve(n - 1);

        // System.out.println(Arrays.toString(dp));
        return dp[n] = Math.min(a, Math.min(b, c));
    }
    public static void main(String[] args){
        n = new Scanner(System.in).nextInt();
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(solve(n));
    }
}