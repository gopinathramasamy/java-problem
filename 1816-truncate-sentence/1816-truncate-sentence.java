class Solution {
    public String truncateSentence(String s, int k) {
        int a=1;
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c==' '){
                a++;
            }
             if(a>k){
                break;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}