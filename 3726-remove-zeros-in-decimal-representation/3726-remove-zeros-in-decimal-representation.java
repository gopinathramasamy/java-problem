class Solution {
    public long removeZeros(long n) {
       StringBuilder sb=new StringBuilder();
       String str=String.valueOf(n);
       for(char c:str.toCharArray()){
        if(c=='0'){
            continue;
        }
        sb.append(c);
       }
       return Long.parseLong(sb.toString());
    }
}