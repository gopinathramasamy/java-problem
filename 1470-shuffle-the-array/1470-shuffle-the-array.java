class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]=new int[nums.length];
        int a=0;
        int left=0;
        int right=n;
        while(right<nums.length){
            arr[a++]=nums[left];
            arr[a++]=nums[right];
            left++;
            right++;
        }
        return arr;
    }
}