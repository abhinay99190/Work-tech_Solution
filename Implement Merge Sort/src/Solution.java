/*
Given an array, sort it using merge sort.

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
    public static void mergeSort (int[] arr) {
        mergesort(arr,0, arr.length);
    }
    public static void mergesort(int[] arr, int start, int end){
        if (end-start==1){
            return;
        }
        int mid = (start+end)/2;
        mergesort(arr,start,mid);
        mergesort(arr,mid,end);
        sort(arr,start,mid,end);
    }

    private static void sort(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end-start];
        int i=start;
        int j=mid;
        int k=0;
        while (i < mid && j < end){
            if (arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i < mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < end){
            mix[k] = arr[j];
            j++;
            k++;
        }
        System.arraycopy(mix, 0, arr, start, mix.length);
    }

    public static void main(String[] args) {
        int []arr = {4, 2, 5, 3, 1};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}