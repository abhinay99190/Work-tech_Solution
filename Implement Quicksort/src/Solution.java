/*
Given an array, sort it using quicksort.

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
1 <= N <= 5000
1 <= array element <= 106
 */

import java.util.Arrays;

class Solution {
    static void quickSort (int[] arr) {
        quickSortUtil(arr, 0, arr.length - 1);
    }
    static void quickSortUtil(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }

        int pivot = partition (arr, low, high);

        quickSortUtil(arr, low, pivot - 1);
        quickSortUtil(arr, pivot + 1, high);
    }
    static int partition (int arr[], int low, int high) {
        int pivot = arr[high];

        int i = low - 1;

        for (int j = low; j  < high; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr={5, 4, 2, 5, 3, 1};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}