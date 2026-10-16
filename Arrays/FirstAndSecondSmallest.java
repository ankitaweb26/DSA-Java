/*
Problem: First and Second Smallests
Platform: GeeksforGeeks
Difficulty: Easy
Topic: Arrays

Approach:
1. Initialize first and second with Integer.MAX_VALUE.
2. Traverse the array and find the smallest element.
3. When a new smallest element is found, move the old smallest to second.
4. Otherwise, update second if the current element is greater than first
   and smaller than second.
5. If no second distinct smallest element exists, return [-1].
6. Otherwise, return [first, second].

Time Complexity: O(n)
Auxiliary Space Complexity: O(1), excluding the result list.
*/

class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];

            if (current < first) {
                second = first;
                first = current;
            } else if (current > first && current < second) {
                second = current;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();

        if (second == Integer.MAX_VALUE) {
            result.add(-1);
        } else {
            result.add(first);
            result.add(second);
        }

        return result;
    }
}
