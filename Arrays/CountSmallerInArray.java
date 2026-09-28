/*
Problem: Count of Elements Less Than or Equal to X
Platform: GeeksforGeeks
Topic: Arrays / Lists
Difficulty: Basic

Approach:
Traverse the List and check each element.
If an element is less than or equal to x, increment the count.
Return the count after checking all elements.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int countOfElements(int x, List<Integer> arr) {

        int count = 0;

        for (int i = 0; i < arr.size(); i++) {

            if (arr.get(i) <= x) {
                count++;
            }
        }

        return count;
    }
}
