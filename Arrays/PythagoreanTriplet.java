/*
Problem: Pythagorean Triplet
Platform: GeeksforGeeks
Difficulty: Medium
Topic: Arrays, Frequency Array, Math

Approach:
1. Create a frequency array to count occurrences of each number.
2. Iterate through possible values of a and b, skipping values not present in the array.
3. If a == b, ensure the number occurs at least twice.
4. Calculate sum = a² + b² and find c using Math.sqrt(sum).
5. Check if c is a perfect square and exists in the array.
6. Return true if a valid triplet is found; otherwise, return false.

Time Complexity: O(n + M²), where M = 1000
Auxiliary Space Complexity: O(M)
*/

class Solution {
    boolean pythagoreanTriplet(int[] arr) {
        int[] freq = new int[1001];

        for (int num : arr) {
            freq[num]++;
        }

        for (int a = 1; a <= 1000; a++) {
            if (freq[a] == 0) continue;

            for (int b = a; b <= 1000; b++) {
                if (freq[b] == 0) continue;

                if (a == b && freq[a] < 2) continue;

                int sum = a * a + b * b;
                int c = (int) Math.sqrt(sum);

                if (c <= 1000 && c * c == sum && freq[c] > 0) {
                    return true;
                }
            }
        }

        return false;
    }
}
