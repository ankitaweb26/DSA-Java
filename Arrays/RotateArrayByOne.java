/*
Problem: Rotate Array by One
Platform: GeeksforGeeks
Topic: Arrays
Difficulty: Easy

Approach:
Store the last element of the array.
Traverse the array from right to left and shift each element
one position to the right.
Finally, place the stored last element at index 0.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public void rotate(int[] arr) {

        int last = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;
    }
}
