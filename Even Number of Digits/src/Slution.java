/*
Given an array of integers, find the elements which have an even number of digits.

Example
Array: [42, 564, 5775, 34, 123, 454, 1, 5, 45, 3556, 23442]
Answer: 42, 5775, 34, 45, 3556
The order of the returned elements should be the same as the order of the initial array.

Testing
Input Format
The first line contains 'T' denoting the no. of test cases.

Next T lines each contain a number 'n' denoting the number of elements, followed by n space-separated numbers denoting
the array elements.

Output Format
T lines contain n numbers denoting the elements with even digits.

Sample Input
2
11 42 564 5775 34 123 454 1 5 45 3556 23442
3 11 4 200

Expected Output
42 5775 34 45 3556
11

Constraints
0 <= T <= 100
1 <= N <= 100
0 <= array element <= 106
 */

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
class Solution {
    public static List<Integer> getEvenDigitNumbers (int[] arr) {
        int total;
        int n = arr.length;
        ArrayList<Integer> num = new ArrayList<>(n);
        for (int j : arr) {
            total = 1;
            int digit = j;
            while (digit >= 10) {
                digit = digit / 10;
                total++;
            }
            if (total % 2 == 0) {
                num.add(j);
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int[] arr = {254, 365, 8745, 4502, 1011};
        System.out.println(getEvenDigitNumbers(arr));
    }
}