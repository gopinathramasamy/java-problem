class Solution {
    public boolean checkPrimeFrequency(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            // Check if already counted
            boolean checked = false;

            for (int k = 0; k < i; k++) {
                if (nums[k] == nums[i]) {
                    checked = true;
                    break;
                }
            }

            if (checked) {
                continue;
            }

            // Find frequency
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            // Check whether frequency is prime
            if (count > 1) {

                boolean prime = true;

                for (int j = 2; j * j <= count; j++) {
                    if (count % j == 0) {
                        prime = false;
                        break;
                    }
                }

                if (prime) {
                    return true;
                }
            }
        }

        return false;
    }
}