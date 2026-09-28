/*
Problem: Array or List Traversal
Platform: GeeksforGeeks
Topic: Arrays
Difficulty: Basic

Approach:
Traverse the array from index 0 to the last index.
Print each element.
Print a space only between elements to avoid an extra space
after the last element.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public void arrayTraversal(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]);

            if (i < arr.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
