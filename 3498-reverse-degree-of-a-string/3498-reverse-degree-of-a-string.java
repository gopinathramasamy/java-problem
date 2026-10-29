class Solution {
    public int reverseDegree(String s) {
        int add=0;
        for(int i=0;i<s.length();i++){
            int value=s.charAt(i)-'a';
            value=26-value;
            add+=value*(i+1);
        }
        return add;
    }
}