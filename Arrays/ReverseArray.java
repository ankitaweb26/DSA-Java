/*
Problem: Reverse Array
Platform: GeeksforGeeks
Topic: Arrays / Two Pointers
Difficulty: Easy

Approach:
1. Use two pointers: left at the beginning and right at the end of the array.
2. Swap the elements at arr[left] and arr[right].
3. Increment left and decrement right after every swap.
4. Continue until left becomes greater than or equal to right.
5. This reverses the array in-place without using an extra array.
6. Only the first half of the array needs to be processed because every swap handles two elements.

Example:
Input:  [1, 4, 3, 2, 6, 5]
Output: [5, 6, 2, 3, 4, 1]

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public void reverseArray(int[] arr) {

        // left starts from the first index
        int left = 0;

        // right starts from the last index
        int right = arr.length - 1;

        // Swap elements from both ends until they meet
        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
