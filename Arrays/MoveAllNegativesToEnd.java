/*
Problem: Move All Negatives to End
Platform: GeeksforGeeks
Difficulty: Easy
Topic: Arrays, ArrayList

Approach:
1. Create two ArrayLists to store non-negative and negative elements.
2. Traverse the original array and separate the elements while
   preserving their relative order.
3. Copy all non-negative elements back into the original array.
4. Copy all negative elements after the non-negative elements.

Time Complexity: O(n)
Auxiliary Space Complexity: O(n)
*/

import java.util.ArrayList;

class Solution {
    public void segregateElements(int[] arr) {

        // Step 1: Create separate lists
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        // Step 2: Separate non-negative and negative elements
        for (int num : arr) {
            if (num >= 0) {
                positive.add(num);
            } else {
                negative.add(num);
            }
        }

        // Step 3: Copy non-negative elements first
        int k = 0;

        for (int num : positive) {
            arr[k] = num;
            k++;
        }

        // Step 4: Copy negative elements at the end
        for (int num : negative) {
            arr[k] = num;
            k++;
        }
    }
}
