/*
Problem: Move All Zeroes to End
Platform: GeeksforGeeks
Topic: Arrays / Two Pointers
Difficulty: Easy

Approach:
1. Traverse the array using a for loop.
2. Use a variable j to keep track of the position where the next non-zero element should be placed.
3. If arr[i] is not 0, place arr[i] at arr[j] and increment j.
4. After traversing the complete array, fill all remaining positions with 0.
5. This keeps the relative order of non-zero elements unchanged.
6. The array is modified in-place, so no extra array is required.

Example:
Input:  [1, 2, 0, 4, 3, 0, 5, 0]
Output: [1, 2, 4, 3, 5, 0, 0, 0]

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public void pushZerosToEnd(int[] arr) {

        // j stores the position for the next non-zero element
        int j = 0;

        // Place all non-zero elements at the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }

        // Fill the remaining positions with zero
        while (j < arr.length) {
            arr[j] = 0;
            j++;
        }
    }
}
