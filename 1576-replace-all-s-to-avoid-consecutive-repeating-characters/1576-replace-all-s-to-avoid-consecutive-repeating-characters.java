class Solution {
    public String modifyString(String s) {
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='?'){
                for(char j='a';j<='z';j++){
                    if((i==0||arr[i-1]!=j)&&(i==arr.length-1||arr[i+1]!=j)){
                        arr[i]=j;
                        break;
                    }
                }
            }
        }
        return new String(arr);
    }
}