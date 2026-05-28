// LeetCode : 1796. Second Largest Digit in a String
 
// Example 1:

// Input: s = "dfa12321afd"
// Output: 2
// Explanation: The digits that appear in s are [1, 2, 3]. The second largest digit is 2.
// Example 2:

// Input: s = "abc1111"
// Output: -1
// Explanation: The digits that appear in s are [1]. There is no second largest digit. 
 

// Constraints:

// 1 <= s.length <= 500
// s consists of only lowercase English letters and digits.


public class SecondLargestString {
  class Solution {
    public int secondHighest(String s) {
        int max = -1, secondMax = -1;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                int num = c - '0';
                if (num > max) {
                    secondMax = max;
                    max = num;
                } else if (num < max && num > secondMax) {
                    secondMax = num;
                }
            }
        }
        return secondMax;
    }
}  
}
