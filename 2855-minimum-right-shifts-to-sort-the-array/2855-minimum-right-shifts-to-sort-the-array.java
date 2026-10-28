class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int n = nums.size();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums.get(i) > nums.get((i + 1) % n)) {
                count++;
            }
        }

        if (count == 0) {
            return 0;
        }

        if (count > 1) {
            return -1;
        }

        for (int i = 0; i < n; i++) {
            if (nums.get(i) > nums.get((i + 1) % n)) {
                return n - i - 1;
            }
        }

        return -1;
    }
}
