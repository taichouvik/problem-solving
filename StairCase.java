import java.util.Scanner;

/* Stair Case
Note: this problem considers that initially the child is not on the staircase, dont assume that child is on the 0th stair!
caveat: I've implemented assuming child is on 0th stair

A child runs up a staircase with 'n' steps and can hop either 1 step, 2 steps or 3 steps at a time. Implement a method to count and return all possible ways in which the child can run-up to the stairs.
Input format :
The first and the only line of input contains an integer value, 'n', denoting the total number of steps.
Output format :
Print the total possible number of ways.
 Constraints :
0 <= n <= 10 ^ 4

Time Limit: 1 sec
Sample Input 1:
4
Sample Output 1:
7
Sample Input 2:
10
Sample Output 2:
274 
*/

public class StairCase {
    static int n;

    static int[] dp;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
        }
        dp = new int[n + 1];
        for (int i = 0; i < dp.length; i++) {
        dp[i] = -1;
        }

        System.out.println(count(n));
    }

    static int count(int i) {
        if (i >= n)
            return 0;
        if (i == n - 1)
            return 1;
        if (dp[i] != -1)
            return dp[i];
        return dp[i] = count(i + 1) + count(i + 2) + count(i + 3);
    }
}
