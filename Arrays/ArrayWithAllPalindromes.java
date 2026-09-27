/*
Problem: Array with All Palindromes
Platform: GeeksforGeeks
Topic: Arrays, Numbers
Difficulty: Basic

Approach:
Traverse each element of the array.
For every number, create its reverse using:
- % 10 to extract the last digit
- / 10 to remove the last digit
Compare the original number with its reverse.
If any number is not a palindrome, return false.
If all numbers are palindromes, return true.


Time Complexity: O(n * d)
Space Complexity: O(1)

where:
n = number of elements
d = number of digits in the largest element
*/

class Solution {

    public static boolean isPalinArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];
            int original = num;
            int reverse = 0;

            while (num > 0) {

                int digit = num % 10;

                reverse = reverse * 10 + digit;

                num = num / 10;
            }

            if (original != reverse) {
                return false;
            }
        }

        return true;
    }
}
