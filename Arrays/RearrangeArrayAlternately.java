/*
Problem: Rearrange Array Alternately
Platform: GeeksforGeeks
Difficulty: Medium
Topic: Arrays, Sorting, Two Pointers

Approach:
1. Sort the array in ascending order.
2. Use two pointers: left for the smallest and right for the largest.
3. Store the largest, then the smallest, alternately in a temporary array.
4. Copy the rearranged elements back into the original array.

Time Complexity: O(n log n)
Auxiliary Space Complexity: O(n)
*/

import java.util.Arrays;

class Solution {
    public void rearrange(int arr[]) {
        Arrays.sort(arr);

        int n = arr.length;
        int[] temp = new int[n];
        int left = 0, right = n - 1, index = 0;

        while (left <= right) {
            temp[index++] = arr[right--];

            if (left <= right) {
                temp[index++] = arr[left++];
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}
