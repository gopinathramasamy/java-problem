class Solution {
    public int[] getConcatenation(int[] nums) {
        int index=0;
       int arr[]=new int[nums.length*2];
       for(int i=0;i<nums.length;i++){
        arr[index++]=nums[i];
       }
       for(int i=0;i<nums.length;i++){
        arr[index++]=nums[i];
       }
       return arr;
    }
}