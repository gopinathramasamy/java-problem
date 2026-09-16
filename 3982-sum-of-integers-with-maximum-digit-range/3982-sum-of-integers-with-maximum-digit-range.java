class Solution {
    public int maxDigitRange(int[] nums) {

        int maxRange = 0;

        // Find maximum digit range
        for (int i = 0; i < nums.length; i++) {

            int temp = nums[i];
            int max = 0;
            int min = 9;

            while (temp != 0) {

                int digit = temp % 10;

                if (digit > max) {
                    max = digit;
                }

                if (digit < min) {
                    min = digit;
                }

                temp /= 10;
            }

            int range = max - min;

            if (range > maxRange) {
                maxRange = range;
            }
        }

        // Add all numbers having maximum range
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            int temp = nums[i];
            int max = 0;
            int min = 9;

            while (temp != 0) {

                int digit = temp % 10;

                if (digit > max) {
                    max = digit;
                }

                if (digit < min) {
                    min = digit;
                }

                temp /= 10;
            }

            int range = max - min;

            if (range == maxRange) {
                sum += nums[i];
            }
        }
        return sum;
    }
}