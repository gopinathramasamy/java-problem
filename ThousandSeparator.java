// LeetCode : 1556. Thousand Separator

// Given an integer n, add a dot (".") as the thousands separator and return it in string format.

// Example 1:

// Input: n = 987
// Output: "987"
// Example 2:

// Input: n = 1234
// Output: "1.234"
 

// Constraints:

// 0 <= n <= 231 - 1


public class ThousandSeparator {
  public String thousandSeparator(int n) {
        String str=String.valueOf(n);
        StringBuilder sb=new StringBuilder();
        int count=0;
        
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
            count++;
            if(count%3==0 && i!=0){
               sb.append('.');
            }
        }
        return sb.reverse().toString();
    }
}
