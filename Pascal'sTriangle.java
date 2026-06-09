// LeetCode : 118. Pascal's Triangle

// Given an integer numRows, return the first numRows of Pascal's triangle.

// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

// Example 1:

// Input: numRows = 5
// Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
// Example 2:

// Input: numRows = 1
// Output: [[1]]
 

// Constraints:

// 1 <= numRows <= 30

public class Pascal'sTriangle {
  public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> key = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            List<Integer> res = new ArrayList<>();
            long ans = 1;

            for (int col = 0; col < i; col++) {
                if (col == 0) {
                    ans = 1;
                } else {
                    ans = ans * (i - col);
                    ans = ans / col;
                }
                res.add((int) ans);
            }
            key.add(res);
        }
        return key;
    }
}
