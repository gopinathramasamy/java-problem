class Solution {
    public int diagonalPrime(int[][] nums) {
        int n=nums.length;
        int maxprime=0;
        for(int i=0;i<n;i++){
            if(isprime(nums[i][i])){
                maxprime=Math.max(maxprime,nums[i][i]);
            }
            if(isprime(nums[i][n-i-1])){
                maxprime=Math.max(maxprime,nums[i][n-i-1]);
            }
        }
        return maxprime;            
    }
    public boolean isprime(int nums){
        if (nums < 2) return false;
        if (nums == 2) return true;
        if (nums % 2 == 0) return false;
        for(int i=3;i<=nums/i;i+=2){
            if(nums%i==0){
                return false;
            }
        }
        return true;
    }
}