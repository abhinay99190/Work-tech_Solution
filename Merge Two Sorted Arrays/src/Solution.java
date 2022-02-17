/*
Given two sorted arrays A and B, find the merged sorted array C by merging A and B.

Example:
A: [1, 2, 3, 4, 4]
B: [2, 4, 5, 5]
C: [1, 2, 2, 3, 4, 4, 4, 5, 5]

Testing
Input Format
First-line contains an integer ‘T’ denoting the number of test cases.

For each test case the input has three lines:

Two space-separated integers ‘n’ and ‘m’ denoting the length of the array A and B respectively.
n space-separated integers denoting the elements of the array A.
m space-separated integers denoting the elements of the array B.

Output Format
For each test-case, the output has a line with n+m space separated integers denoting the elements of the array C.

Sample Input
2
5 2
1 3 3 4 4
5 6
6 2
1 3 3 3 3 4
9 11

Expected Output
1 3 3 4 4 5 6
1 3 3 3 3 4 9 11

Constraints
1 <= T <= 100
1 <= n, m <= 104
1 <= Ai, Bi <= 105
 */

import java.util.Arrays;

class Solution {
    public static int[] mergeSortedArrays(int[] A, int[] B) {
        int[] C = new int[A.length+ B.length];
        int i, j, k;
        i = 0;
        j = 0;
        k = 0;
        while (i < A.length && j < B.length) {
            if (A[i] <= B[j]) {
                C[k] = A[i];
                i++;
            } else {
                C[k] = B[j];
                j++;
            }
            k++;
        }
        if (i < A.length) {
            for (int p = i; p < A.length; p++) {
                C[k] = A[p];
                k++;
            }
        } else {
            for (int p = j; p < B.length; p++) {
                C[k] = B[p];
                k++;
            }
        }
        return C;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 4};
        int[] B = {2, 4, 5, 5};
        int[] ans = mergeSortedArrays(A,B);
        System.out.println(Arrays.toString(ans));
    }
}