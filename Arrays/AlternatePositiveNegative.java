/*
Problem: Alternate Positive and Negative Numbers
Platform: GeeksforGeeks
Topic: ArrayList, Arrays
Difficulty: Easy

Approach:
Separate the positive and negative numbers into two ArrayLists
while maintaining their relative order. Use three pointers to
place one positive number followed by one negative number in the
original list. Append any remaining elements at the end.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.ArrayList;

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        for (int num : arr) {
            if (num >= 0) {
                positive.add(num);
            } else {
                negative.add(num);
            }
        }

        int i = 0, j = 0, k = 0;

        while (i < positive.size() && j < negative.size()) {
            arr.set(k++, positive.get(i++));
            arr.set(k++, negative.get(j++));
        }

        while (i < positive.size()) {
            arr.set(k++, positive.get(i++));
        }

        while (j < negative.size()) {
            arr.set(k++, negative.get(j++));
        }
    }
}
