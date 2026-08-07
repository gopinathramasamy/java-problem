class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1="";
        String s2="";
        int n = word1.length+word2.length;
        int index1 = 0;
        int index2 = 0;
        for(int i=0;i<n;i++){
            if(i<word1.length){
                s1+=word1[index1++];
            }
            else{
                s2+=word2[index2++];
            }
        }
        if(s1.equals(s2)){
            return true;
        }
        return false;
    }
}