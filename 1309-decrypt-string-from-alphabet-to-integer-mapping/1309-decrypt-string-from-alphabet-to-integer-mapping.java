class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='#'){
                String str=s.substring(i-2,i);
                int a=Integer.parseInt(str);
                char ch=(char)('a'+a-1);
                sb.append(ch);
                i-=2;
            }else{
                int a=s.charAt(i)-'0';
                char ch=(char)('a'+a-1);
                sb.append(ch);
            }
        }
        return sb.reverse().toString();
    }
}