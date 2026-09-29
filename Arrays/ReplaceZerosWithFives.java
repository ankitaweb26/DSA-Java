/*
Problem: Replace all 0's with 5's
Platform: GeeksforGeeks
Topic: Number / Digit Manipulation
Difficulty: Basic

Approach:
1. Extract each digit from right to left using % 10.
2. If the digit is 0, replace it with 5.
3. Use place value to put the digit in its correct position.
4. Remove the last digit using / 10.
5. Handle n = 0 separately because the loop does not run for 0.

Time Complexity: O(d), where d is the number of digits.
Space Complexity: O(1)
*/

class Solution {
    public int convertFive(int n) {

        if (n == 0) {
            return 5;
        }

        int result = 0;
        int place = 1;

        while (n > 0) {

            int digit = n % 10;

            if (digit == 0) {
                digit = 5;
            }

            result = result + digit * place;
            place = place * 10;

            n = n / 10;
        }

        return result;
    }
}
