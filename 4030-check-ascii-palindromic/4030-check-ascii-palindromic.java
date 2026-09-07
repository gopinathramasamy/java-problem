class Solution {
    public boolean isPalindromic(String s) {
       StringBuilder sb=new StringBuilder();
       for(char c:s.toCharArray()){
          int a=c;
          sb.append(String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0'));
       } 
       String temp=sb.toString();
       return temp.equals(sb.reverse().toString());
    }
}