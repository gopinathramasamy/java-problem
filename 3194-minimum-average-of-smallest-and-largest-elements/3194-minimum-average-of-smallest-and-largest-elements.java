class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double ans=Integer.MAX_VALUE;
        int left=0;
        int right=nums.length-1;
        while(left<right){
            double div=(nums[left]+nums[right])/2.0;
            ans=Math.min(div,ans);
            left++;
            right--;
        }
        return ans;
    }
}