class Solution {
    public String optimalDivision(int[] nums){
        String str="";
        if (nums.length == 1) {
            return String.valueOf(nums[0]);
        }
        if (nums.length == 2) {
            return nums[0] + "/" + nums[1];
        }
        str = nums[0] + "/(";
        for(int i=1;i<nums.length;i++){
           if(i==0){
             str+=nums[i]+"/(";
           }else{
              str+=nums[i];
              if (i < nums.length - 1) {
                   str += "/";
               }
           }
        }
        str+=")";
        return str;
    }
}