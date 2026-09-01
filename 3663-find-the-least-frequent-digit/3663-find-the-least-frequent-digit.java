class Solution {
    public int getLeastFrequentDigit(int n) {

        int[] freq = new int[10];

        String str = String.valueOf(n);

        
        for (char ch : str.toCharArray()) {
            freq[ch - '0']++;
        }

        int min = Integer.MAX_VALUE;
        int small = 0;

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0 && freq[i] < min) {
                min = freq[i];
                small = i;
            }
        }
        return small;
    }
}