class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int left=0,right=0,maxlen=0;
        HashSet<Character> set= new HashSet<>();

        while(right<n){
            char c=s.charAt(right);
            if(!set.contains(c)){
                set.add(c);
                maxlen=Math.max(maxlen,right-left+1);
                right++;
            }else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxlen; 
    }
}
