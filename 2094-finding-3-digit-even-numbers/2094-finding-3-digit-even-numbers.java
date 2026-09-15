class Solution {
    public int[] findEvenNumbers(int[] digits) {

        int[] freq = new int[10];

        // Count each digit
        for (int d : digits) {
            freq[d]++;
        }

        ArrayList<Integer> list = new ArrayList<>();

        // First digit: 1-9
        for (int i = 1; i <= 9; i++) {

            if (freq[i] == 0) {
                continue;
            }

            freq[i]--;

            // Second digit: 0-9
            for (int j = 0; j <= 9; j++) {

                if (freq[j] == 0) {
                    continue;
                }

                freq[j]--;

                // Last digit must be even
                for (int k = 0; k <= 8; k += 2) {

                    if (freq[k] > 0) {
                        int num = i * 100 + j * 10 + k;
                        list.add(num);
                    }
                }

                freq[j]++;
            }

            freq[i]++;
        }

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}