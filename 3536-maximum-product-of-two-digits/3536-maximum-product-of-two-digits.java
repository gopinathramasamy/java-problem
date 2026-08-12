class Solution {
    public int maxProduct(int n) {
        int sum=0;
        int mul=0;
        String str=String.valueOf(n);
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                mul=(str.charAt(i)-'0')*(str.charAt(j)-'0');
                sum=Math.max(sum,mul);
            }
        }
        return sum;
    }
}