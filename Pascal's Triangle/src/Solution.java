/*
Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:--
Input: rowIndex = 3
Output: [1,3,3,1]

Example 2:--
Input: rowIndex = 0
Output: [1]

Example 3:--
Input: rowIndex = 1
Output: [1,1]


Constraints:

0 <= rowIndex <= 33

 */

import java.util.Arrays;
public class Solution {
    public static int[] pascalTriangleRow(int rowNo) {
        int[] value = new int[rowNo];
        int i,j;
        for (i = 0; i < rowNo; i++) {
            for (j = i; j >=0 ; j--) {
                if (j==0||j==i){
                    value[j] = 1;
                }else {
                    value[j]= value[j-1] + value[j];
                }
            }
        }
        return value;
    }

    public static void main(String[] args) {
        int rowIndex = 4;
        System.out.println(Arrays.toString(pascalTriangleRow(rowIndex)));
    }
}


