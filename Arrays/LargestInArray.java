/*
Problem: Largest in Array
Platform: GeeksforGeeks
Topic: Arrays
Difficulty: Easy

Approach:
Assume the first element is the largest.
Traverse the remaining elements and update the largest
whenever a bigger element is found.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public static int largest(int[] arr) {
        
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
