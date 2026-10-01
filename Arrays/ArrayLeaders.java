/*
Problem: Array Leaders
Platform: GeeksforGeeks
Topic: Arrays
Difficulty: Easy

Approach:
Traverse the array from right to left.

The rightmost element is always a leader.
Keep track of the maximum element seen so far from the right.

If the current element is greater than or equal to maxFromRight,
it is a leader.

Since we find leaders from right to left, reverse the result
before returning it.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public ArrayList<Integer> leaders(int arr[]) {

        ArrayList<Integer> result = new ArrayList<>();

        // Rightmost element is always a leader
        int maxFromRight = arr[arr.length - 1];
        result.add(maxFromRight);

        // Traverse from right to left
        for (int i = arr.length - 2; i >= 0; i--) {

            // Check if current element is a leader
            if (arr[i] >= maxFromRight) {
                result.add(arr[i]);

                // Update maximum from the right
                maxFromRight = arr[i];
            }
        }

        // Leaders were found from right to left
        Collections.reverse(result);

        return result;
    }
}
