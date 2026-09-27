/*
Problem: Alternates in Array
Platform: GeeksforGeeks
Topic: Arrays
Difficulty: Basic

Approach:
Start from index 0 and traverse the array by jumping 2 positions
at a time. Add each selected element to an ArrayList.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public ArrayList<Integer> getAlternates(int arr[]) {
        
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i += 2) {
            result.add(arr[i]);
        }
        
        return result;
    }
}
