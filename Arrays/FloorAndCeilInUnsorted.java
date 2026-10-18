/*
Problem: Floor and Ceil in Unsorted
Platform: GeeksforGeeks
Difficulty: Easy
Topic: Arrays

Approach:
1. Initialize floor and ceil with -1.
2. Traverse the array and check each element.
3. Update floor if the element is less than or equal to x
   and greater than the current floor.
4. Update ceil if the element is greater than or equal to x
   and smaller than the current ceil.
5. If floor or ceil is not found, keep it as -1.
6. Return [floor, ceil].

Time Complexity: O(n)
Auxiliary Space Complexity: O(1), excluding the result array.
*/

class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        int floor = -1;
        int ceil = -1;

        for (int num : arr) {
            if (num <= x && (floor == -1 || num > floor)) {
                floor = num;
            }

            if (num >= x && (ceil == -1 || num < ceil)) {
                ceil = num;
            }
        }

        return new int[]{floor, ceil};
    }
}
