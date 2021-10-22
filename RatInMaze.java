/* Code: Rat In A Maze

You are given a N*N maze with a rat placed at maze[0][0]. Find whether any path exist that rat can follow to reach its destination i.e. maze[N-1][N-1]. Rat can move in any direc­tion ( left, right, up and down).
Value of every cell in the maze can either be 0 or 1. Cells with value 0 are blocked means rat can­not enter into those cells and those with value 1 are open.
Input Format
Line 1: Integer N
Next N Lines: Each line will contain ith row elements (separated by space)
Output Format :
The output line contains true if any path exists for the rat to reach its destination otherwise print false.
Sample Input 1 :
3
1 0 1
1 0 1
1 1 1
Sample Output 1 :
true
Sample Input 2 :
3
1 0 1
1 0 1
0 1 1
Sample Output 2 :
 false 
 */

import java.util.Scanner;

public class RatInMaze {
    static int n;
    static int[][] a;

    static boolean solve(int x, int y) {
        if (x == n || y == n)
            return false;
        if (x < 0 || y < 0)
            return false;
        if (a[x][y] == 0)
            return false;
        if (x == n - 1 && y == n - 1)
            return true;
        if (a[x][y] == -1)
            return false;

        a[x][y] = -1;
        if (solve(x + 1, y)) {
            
            return true;
        }
        if (solve(x, y + 1)) {
            
            return true;
        }
        if (solve(x - 1, y)) {
            
            return true;
        }
        if (solve(x, y - 1)) {

            return true;
        }
        a[x][y] = 1;
        return false;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
            a = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
        }
        System.out.println(solve(0, 0));
    }
}
