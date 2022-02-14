/*
The cumulative sum of an array at index i is defined as the sum of all elements of the array from index 0 to index i.

Examples
Initial Array: [1, 2, 3, 4]
Cumulative Sum: [1, 3, 6, 10]

Initial Array: [1, 1, 1, 1, 1]
Cumulative Sum: [1, 2, 3, 4, 5]

Initial Array: [1, 3, 5, 7, 9]
Cumulative Sum: [1, 4, 9, 16, 25]

Given an array, return its cumulative sum.

The first line contains 'T' denoting the no. of test cases.

Next T lines each contain a number 'n' denoting the number of elements, followed by n space-separated numbers denoting
the array elements.

Output Format:-- T lines each contain n numbers denoting the cumulative sum of the respective indices.

Sample Input
3
4 1 2 3 4
5 1 1 1 1 1
5 1 3 5 7 9

Expected Output
1 3 6 10
1 2 3 4 5
1 4 9 16 25

Constraints
0 <= T <= 1000
1 <= N <= 10000
-104 <= array element <= 104
 */

import java.util.Arrays;

public class Solution {
    public static int[] getCumulativeSum (int[] arr) {
        // add your logic here
        int []sum = new int[arr.length];
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
            sum[i] = total;
        }
        return sum;
    }
    public static void main(String[] args) {
        int []arr = {1 ,2 ,3,4};
        System.out.println(Arrays.toString(getCumulativeSum(arr)));
    }
}
