/*
Problem: Reverse Array in Groups
Platform: GeeksforGeeks
Topic: Arrays
Difficulty: Basic

Approach:
1. Traverse the array in groups of size k.
2. For each group, set:
   - left = starting index of the group
   - right = ending index of the group
3. Use two pointers to reverse the group by swapping elements.
4. Math.min() ensures that right does not go beyond the last
   valid index when the final group has fewer than k elements.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public void reverseInGroups(int[] arr, int k) {
        int n = arr.length;

        for (int i = 0; i < n; i += k) {

            int left = i;
            int right = Math.min(i + k - 1, n - 1);

            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
    }
}
