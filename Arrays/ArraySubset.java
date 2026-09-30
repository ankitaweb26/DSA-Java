/*
Problem: Array Subset
Platform: GeeksforGeeks
Topic: Arrays
Difficulty: Basic

Approach:
1. Traverse every element of array b.
2. For each element of b, search for a matching element in a.
3. Use a boolean array to keep track of elements of a that are already used.
4. If a matching unused element is found, mark it as used.
5. If any element of b cannot be found, return false.
6. If all elements of b are found, return true.

Time Complexity: O(a.length * b.length)
Space Complexity: O(a.length)
*/

class Solution {
    public boolean isSubset(int a[], int b[]) {

        for (int i = 0; i < b.length; i++) {

            boolean found = false;

            for (int j = 0; j < a.length; j++) {

                if (b[i] == a[j] && !used[j]) {
                    found = true;
                    used[j] = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }

        return true;
    }
}
