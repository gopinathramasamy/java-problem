class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int sum=0;
        for(int i=0;i<words.length;i++){
            int ans=0;
           for(int j=0;j<words[i].length();j++){
             if(allowed.contains(words[i].charAt(j)+"")){
               ans++;
             }
           }
           if(ans==words[i].length()){
                sum++;
            }
        } 
        return sum;
    }
}