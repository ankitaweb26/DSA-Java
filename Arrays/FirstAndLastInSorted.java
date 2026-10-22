/*
Problem: First and Last in Sorted
Platform: GeeksforGeeks
Difficulty: Medium
Topic: Arrays

Approach:
1. Initialize first and last to -1.
2. Traverse the array using index i.
3. If arr[i] equals x, check whether first is still -1.
4. If first is -1, store i as the first occurrence.
5. Update last to i every time x is found.
6. Return [first, last]. If x is absent, both remain -1.

Time Complexity: O(n)
Auxiliary Space Complexity: O(1), excluding the result array.
*/

class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        int first = -1;
        int last = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(first);
        result.add(last);

        return result;
    }
}
