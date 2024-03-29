import java.util.Arrays;
import java.util.Scanner;
/* Minimum Number Of Squares

Given an integer N, find and return the count of minimum numbers required to represent N as a sum of squares.
That is, if N is 4, then we can represent it as : {1^2 + 1^2 + 1^2 + 1^2} and {2^2}. The output will be 1, as 1 is the minimum count of numbers required to represent N as sum of squares.
Input format :
The first and the only line of input contains an integer value, 'N'.
 Output format :
Print the minimum count of numbers required.
Constraints :
0 <= n <= 10 ^ 4

Time Limit: 1 sec
Sample Input 1 :
12
Sample Output 1 :
3
Explanation of Sample Output 1 :
12 can be represented as : 
A) (1^1) + (1^1) + (1^1) + (1^1) + (1^1) + (1^1) + (1^1) + (1^1) + (1^1) + (1^1) + (1^1) + (1^1)

B) (1^1) + (1^1) + (1^1) + (1^1) + (1^1) + (1^1) + (1^1) + (1^1)  + (2 ^ 2)

C) (1^1) + (1^1) + (1^1) + (1^1) + (2 ^ 2) + (2 ^ 2)

D) (2 ^ 2) + (2 ^ 2) + (2 ^ 2)

As we can see, the output should be 3.
Sample Input 2 :
9
Sample Output 2 :
1 */
public class MinSquaresSum {
    static int n;
    static int[] dp;

    static int solve(int n) {
        if (n == 0)
            return dp[n] = 0;
        if (n < 0)
            return Integer.MAX_VALUE;
        if (dp[n] != -1)
            return dp[n];
        dp[n] = Integer.MAX_VALUE;
        for (int i = 1; i * i <= n; i++) {
            dp[n] = Math.min(dp[n], 1 + solve(n - i * i));
        }
        // System.out.println(Arrays.toString(dp));
        return dp[n];
    }

    public static void main(String[] args) {
        n = new Scanner(System.in).nextInt();
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(solve(n));
    }
}