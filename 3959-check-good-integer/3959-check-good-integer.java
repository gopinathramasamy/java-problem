class Solution {
    public boolean checkGoodInteger(int n) {
        int sum=0;
        int sum1=0;
        while(n!=0){
            int d=n%10;
            sum+=d;
            sum1+=d*d;
            n/=10;
        }
        if(Math.abs(sum1-sum)>=50){
            return true;
        }
        return false;
    }
}