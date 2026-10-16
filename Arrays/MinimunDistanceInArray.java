/*
Problem: Minimum Distance in Array
Platform: GeeksforGeeks
Topic: Arrays
Difficulty: Easy

Approach:
1. Track the latest indices of x and y.
2. Traverse the array once and update indices when found.
3. When both elements are found, calculate their absolute distance.
4. Update the minimum distance whenever a smaller distance is found.
5. Return -1 if either element is missing; otherwise, return the minimum distance.

Time Complexity: O(n)
Auxiliary Space Complexity: O(1)
*/

class Solution {
    int minDistance(int arr[], int x, int y) {
        int lastX = -1, lastY = -1;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastX = i;
            }

            if (arr[i] == y) {
                lastY = i;
            }

            if (lastX != -1 && lastY != -1) {
                int distance = Math.abs(lastX - lastY);

                if (distance < minDistance) {
                    minDistance = distance;
                }
            }
        }

        if (lastX == -1 || lastY == -1) {
            return -1;
        }

        return minDistance;
    }
}
