/*
Given an array of numbers, return an array that contains the squares of all the numbers in non-decreasing order.

Example
Array: [6, -8, 3, -1, 4]
Answer: [1, 9, 16, 36, 64]

Testing

Input Format
The first line contains 'T' denoting the no. of test cases.

T lines each contain a number 'n' denoting the number of elements, followed by n space-separated numbers denoting the
array elements.

Output Format
T lines each contain n numbers denoting the sorted square array.

Sample Input
2
4 -3 1 2 4
5 6 -8 3 -1 4

Expected Output
1 4 9 16
1 9 16 36 64

Constraints
0 <= T <= 100
1 <= N <= 1000
-1000 <= value of array element <= 1000
 */

import java.util.Arrays;

class Solution {
    static int[] getSquareSortedArray(int[] arr) {
        // add your logic here
        //int [] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.pow(arr[i],2);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j-1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {6, -8, 3, -1, 4};
        System.out.println(Arrays.toString(getSquareSortedArray(arr)));
    }
}