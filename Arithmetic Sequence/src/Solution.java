/*
An Arithmetic progression (AP) or arithmetic sequence is a sequence of numbers such that the difference between the
consecutive terms is constant. For instance, the sequence 5, 7, 9, 11, 13, 15, . . . is an arithmetic progression with
a common difference of 2.

Given an unsorted array, find if it can be reordered to form an arithmetic sequence.

Examples
Array: [9, 13, 5, 15, 7, 11]
Answer: true
Explanation: This can be reordered to [5, 7, 9, 11, 13, 15] or [15, 13, 11, 9, 7, 5] both of which are arithmetic sequences.

Array: [1, 1, 1]
Answer: true
Explanation: This is an arithmetic sequence with a difference 0.

Array: [4, 1, 2]
Answer: false
Explanation: This cannot be reordered to form an arithmetic sequence.

Testing

Input Format
The first line contains 'T' denoting the no. of test cases.

Next T lines each contain a number 'n' denoting the number of elements, followed by n space-separated numbers denoting
the array elements.

Output Format
T lines each contain true or false denoting whether the array for that test case can be used to form an arithmetic sequence.

Sample Input
3
6 9 13 5 15 7 11
3 1 1 1
3 4 1 2

Expected Output
true
true
false
Constraints
0 <= T <= 100
1 <= N <= 1000
-107 <= value of array element <= 107
 */

import java.util.ArrayList;
import java.util.Arrays;
// unsolved
class Solution {
    static boolean isArithmeticSequence (int[] arr) {
        Arrays.sort(arr);
        if (arr.length==2||arr.length==1){
            return true;
        }
        ArrayList<Integer> value = new ArrayList<>();
        for (int j : arr) {
            value.add(j);
        }
        int diff = value.get(1)-value.get(0);
        for (int i = 2; i < value.size(); i++) {
            if (value.get(i)-value.get(i-1)!=diff){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[]arr = {45,47,49,51,53,55,57,59,61,44,46,48,50,52,54,56,58,60};
        System.out.println(isArithmeticSequence (arr));
    }
}


