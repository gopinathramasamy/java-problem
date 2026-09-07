class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        int ans=0;
        for(int i=0;i<s.length()-1;i++){
            ans=Math.abs((s.charAt(i)-'0')-(s.charAt(i+1)-'0'));
            if(ans>2){
              return false;
            }
        }
        return true;
    }
}