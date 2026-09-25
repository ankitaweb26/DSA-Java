/*
Problem: Min and Max in Array
Platform: GeeksforGeeks
Topic: Arrays
Difficulty: Easy

Approach:
Start with the first element as both min and max.
Check every other element.
If an element is smaller than min, update min.
If an element is larger than max, update max.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(min);
        result.add(max);

        return result;
    }
}
