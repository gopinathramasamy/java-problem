class Solution {
    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int small = 0;

            while (n != 0) {
                int d = n % 10;
                small+= d;
                n /= 10;
            }

            if (i == small) {
                return i;
            }
        }

        return -1;
    }
}