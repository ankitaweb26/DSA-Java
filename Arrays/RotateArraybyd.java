/*
Problem: Rotate Array
Platform: GeeksforGeeks
Difficulty: Medium
Topic: Arrays

Approach:
1. Find the array length n and reduce d using d % n
   to handle rotations greater than the array length.
2. Reverse the first d elements.
3. Reverse the remaining n - d elements.
4. Reverse the entire array to complete the left rotation.
5. Use a helper method with two pointers to reverse each section
   in place without creating another array.

Time Complexity: O(n)
Auxiliary Space Complexity: O(1)
*/

class Solution {
    void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d % n;

        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
