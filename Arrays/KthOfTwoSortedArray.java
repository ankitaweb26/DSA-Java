/*
Problem: K-th of Two Sorted Arrays
Platform: GeeksforGeeks
Difficulty: Medium
Topic: Arrays, Two Pointers

Approach:
1. Initialize two pointers i and j at index 0 for arrays a and b.
2. Use count to track the number of elements selected.
3. Compare the current elements of both arrays and select the smaller one.
4. Move the pointer of the array from which the element was selected.
5. If one array is exhausted, select elements from the other array.
6. Repeat until count reaches k and return the kth element.

Time Complexity: O(k)
Auxiliary Space Complexity: O(1)
*/

class Solution {
    public int kthElement(int a[], int b[], int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        int kth = -1;

        while (count < k) {
            if (i == a.length) {
                kth = b[j];
                j++;
            } else if (j == b.length) {
                kth = a[i];
                i++;
            } else if (a[i] < b[j]) {
                kth = a[i];
                i++;
            } else {
                kth = b[j];
                j++;
            }

            count++;
        }

        return kth;
    }
}
