
/* Count Words

For a given input string(str), find and return the total number of words present in it.
It is assumed that two words will have only a single space in between. Also, there wouldn't be any leading and trailing spaces in the given input string.
Input Format:
The first and only line of input contains a string without any leading and trailing spaces.
Output Format:
The only line of output prints an integer value denoting the tool number of words present in the string.
Note:
You are not required to print anything. It has already been taken care of.
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 sec
Sample Input 2:
this is a sample string
Sample Output 2:
5 
*/
import java.lang.System;
import java.util.*;

class CountWords {
    static int countWords(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                ans++;
            }
        }
        return (ans == 0) ? 0 : ans + 1;
    }

    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            String in = s.nextLine();

            System.out.println(countWords(in));
        }
    }

}