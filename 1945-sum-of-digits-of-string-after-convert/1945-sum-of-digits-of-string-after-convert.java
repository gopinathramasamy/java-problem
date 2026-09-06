class Solution {
    public int getLucky(String s, int k) {
        String str="";
       for(char c:s.toCharArray()){
           str+=c-'a'+1;
       } 
       int add=0;
        for(char ch:str.toCharArray()){
            add+=ch-'0';
        }
        k--;
        while(k>0){
            int sum=0;
            while(add>0){
                sum+=add%10;
                add/=10;
            }
            add=sum;
            k--;
        }
       return add;
    }
}