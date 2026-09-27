/*
Problem: Sum of Array
Platform: GeeksforGeeks
Topic: Arrays
Difficulty: Basic

Approach:
Initialize sum as 0.
Traverse the array using a for loop.
Add each element to sum.
Return the final sum.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int arraySum(int arr[]) {
        
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        
        return sum;
    }
}
