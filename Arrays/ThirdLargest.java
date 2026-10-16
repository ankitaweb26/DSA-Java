/*
Problem: Third Largest Element
Platform: GeeksforGeeks
Topic: Arrays, ArrayList
Difficulty: Easy

Approach:
1. Maintain three variables to track the largest, second largest,
   and third largest elements.
2. Traverse the list and update these variables based on each element.
3. Allow duplicate values by using >= in the comparisons.
4. Return third, which remains -1 if fewer than three elements exist.

Time Complexity: O(n)
Auxiliary Space Complexity: O(1)
*/

class Solution {
    public int thirdLargest(List<Integer> arr) {
        int first = -1;
        int second = -1;
        int third = -1;

        for (int i = 0; i < arr.size(); i++) {
            int current = arr.get(i);

            if (current >= first) {
                third = second;
                second = first;
                first = current;
            } else if (current >= second) {
                third = second;
                second = current;
            } else if (current >= third) {
                third = current;
            }
        }

        return third;
    }
}
