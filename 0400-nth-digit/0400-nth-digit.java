class Solution {
    public int findNthDigit(int n) {
        long digits = 1;
        long start = 1;
        long count = 9;

        while (n > digits * count) {
            n -= digits * count;
            digits++;
            start *= 10;
            count *= 10;
        }
        long num = start + (n - 1) / digits;

        String s = String.valueOf(num);
        return s.charAt((int)((n - 1) % digits)) - '0';
    }
}