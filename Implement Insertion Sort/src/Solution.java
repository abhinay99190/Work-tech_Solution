import java.util.Arrays;

/*
Given an array, sort it using insertion sort.

Testing
Input Format
The first line contains 'T' denoting the no. of test cases.

Next T lines each contain a number 'n' denoting the number of elements, followed by n space-separated numbers denoting
the array elements.

Output Format
T lines contain n numbers denoting the sorted array.

Sample Input
2
5 4 2 5 3 1
3 11 4 200

Expected Output
1 2 3 4 5
4 11 200

Constraints
0 <= T <= 100
1 <= N <= 100
1 <= array element <= 106
 */
public class Solution {
    static void insertionSort(int[] arr) {
        for (int i = 0; i <= arr.length-2; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int j, int second) {
        int temp = arr[j];
        arr[j] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 3, 1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
