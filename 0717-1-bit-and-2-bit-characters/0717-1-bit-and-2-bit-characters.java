class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int a=0;
        while(a<bits.length-1){
          if(bits[a]==0){
            a++;
           }else{
              a+=2;
           }
        }
        return a==bits.length-1;
    }
}