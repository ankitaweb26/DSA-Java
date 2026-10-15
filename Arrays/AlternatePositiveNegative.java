/*
Problem: Alternate Positive and Negative Numbers
Platform: GeeksforGeeks
Difficulty: Easy
Topic: ArrayList

Approach:
1. Create separate lists for positive and negative numbers.
2. Traverse the original list and separate the elements.
3. Use three pointers:
   i -> Tracks positive elements.
   j -> Tracks negative elements.
   k -> Tracks the position in the original list.
4. Place one positive number followed by one negative number.
5. Add the remaining positive or negative elements in order.

Time Complexity: O(n)
Auxiliary Space Complexity: O(n)
*/

import java.util.ArrayList;

class Solution {
    void rearrange(ArrayList<Integer> arr) {

        // Step 1: Create two separate lists
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        // Step 2: Separate positive and negative numbers
        // Zero is considered a positive number
        for (int num : arr) {

            if (num >= 0) {
                positive.add(num);
            } else {
                negative.add(num);
            }
        }

        // Step 3: Initialize pointers
        int i = 0; // Pointer for positive list
        int j = 0; // Pointer for negative list
        int k = 0; // Pointer for original list

        // Step 4: Alternate positive and negative numbers
        while (i < positive.size() && j < negative.size()) {

            // Place the next positive number
            arr.set(k, positive.get(i));

            i++;
            k++;

            // Place the next negative number
            arr.set(k, negative.get(j));

            j++;
            k++;
        }

        // Step 5: Add remaining positive numbers
        while (i < positive.size()) {

            arr.set(k, positive.get(i));

            i++;
            k++;
        }

        // Step 6: Add remaining negative numbers
        while (j < negative.size()) {

            arr.set(k, negative.get(j));

            j++;
            k++;
        }
    }
}
