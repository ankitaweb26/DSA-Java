/*
Problem: Second Largest
Platform: GeeksforGeeks
Topic: Arrays
Difficulty: Easy

Approach:
1. Initialize two variables, largest and secondLargest, to -1.
2. Traverse the array using a for loop.
3. If the current element is greater than largest:
   - Update secondLargest with the previous largest value.
   - Update largest with the current element.
4. Otherwise, check if the current element is smaller than largest but greater than secondLargest.
5. If both conditions are true, update secondLargest with the current element.
6. Return secondLargest. If no second-largest distinct element exists, it remains -1.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int getSecondLargest(int[] arr) {
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }
}
