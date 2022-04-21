/*
Consider an array that is divided into two parts and both of the parts are sorted individually. Given the mentioned
array and the end index of the first part, merge them to create a sorted array. Update the same array with the merged
elements. You can use extra auxiliary space.

Expected Time Complexity: O(n) where n denotes the size of the array.

Example
Array: [1, 3, 5, 7, 9, 11, 0, 4, 6, 8]
End Index: 5
Array after merging: [0, 1, 3, 4, 5, 6, 7, 8, 9, 11]

Testing
Input Format
First-line contains an integer ‘T’ denoting the number of test cases.
For each test case the input has two lines:
Two space-separated integers ‘n’ and ‘endIndex’ denoting the length of the array and the end index of the first part
respectively. n space-separated integers denoting the elements of the array.

Output Format
For each test case, the output has a line with n space-separated integers denoting the elements of the merged array.

Sample Input
2
10 5
1 3 5 7 9 11 0 4 6 8
8 3
3 3 9 11 1 3 3 4

Expected Output
0 1 3 4 5 6 7 8 9 11
1 3 3 3 3 4 9 11

Constraints:--
1 <= T <= 100
1 <= n <= 104
0 <= endIndex < n
-105 <= array element <= 10
 */

import java.util.Arrays;

class sol {
    static void merge(int[] arr, int endIndex) {
        int[]arr2 = new int[arr.length];
        int start = 0;
        int end = endIndex+1;
        int i = 0;
        while (start <endIndex && end < arr.length){
            if (arr[start] <= arr[end]){
                arr2[i] = arr[start];
                start++;
            }else {
                arr2[i] = arr[end];
                end++;
            }
            i++;
        }
        if (start<endIndex){
            for (int j = start; j <= endIndex; j++) {
                arr2[i] = arr[j];
                i++;
            }
        }
        else {
            for (int j = endIndex+1; j < arr.length; j++) {
                arr2[i] = arr[j];
                j++;
            }
        }
        for (int j = 0; j < arr2.length; j++) {
            arr[j] = arr2[j];
        }
    }
    public static void main(String[] args) {
        int []arr ={45,47,49,51,53,55,57,59,61,44,46,48,50,52,54,56,58,60};
        int endindex = 8;
        merge(arr,endindex);
        System.out.println(Arrays.toString(arr));

    }
}