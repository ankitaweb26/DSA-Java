/*
Problem: Array Subset
Platform: GeeksforGeeks
Topic: Arrays / HashMap
Difficulty: Basic

Approach:
1. Store the frequency of every element in array a using a HashMap.
2. Traverse array b.
3. For each element of b, check whether it exists in the frequency map.
4. If its frequency is 0 or it does not exist, b is not a subset of a.
5. If found, decrease its frequency because that occurrence has been used.
6. If all elements of b are found, return true.

Why frequency is needed:
It handles duplicate elements correctly.

Time Complexity: O(n + m) on average
Space Complexity: O(n)
*/

import java.util.HashMap;

class Solution {
    public boolean isSubset(int a[], int b[]) {

        HashMap<Integer, Integer> frequency = new HashMap<>();

        // Count frequency of elements in a
        for (int num : a) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        // Check every element of b
        for (int num : b) {

            // Element doesn't exist or all its occurrences are used
            if (!frequency.containsKey(num) || frequency.get(num) == 0) {
                return false;
            }

            // Use one occurrence
            frequency.put(num, frequency.get(num) - 1);
        }

        return true;
    }
}
