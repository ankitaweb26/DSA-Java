/*
Problem: Duplicates in Limited Range Array
Platform: GeeksforGeeks
Topic: Arrays / Frequency Counting
Difficulty: Easy

Approach:
1. The elements are in the range 1 to n.
2. Create a count array where the index represents the number.
3. Traverse the input array and increase the count of each number.
4. Traverse from 1 to n.
5. If count[i] == 2, add i to the result.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {

        int n = arr.length;

        // count[i] stores how many times number i appears
        int[] count = new int[n + 1];

        ArrayList<Integer> result = new ArrayList<>();

        // Count occurrences of each number
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Find numbers that appeared exactly twice
        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) {
                result.add(i);
            }
        }

        return result;
    }
}
