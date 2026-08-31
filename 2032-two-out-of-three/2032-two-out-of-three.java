class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

        List<Integer> list = new ArrayList<>();

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();

        for (int x : nums1) {
            set1.add(x);
        }

        for (int x : nums2) {
            set2.add(x);
        }

        for (int x : nums3) {
            set3.add(x);
        }

        HashSet<Integer> all = new HashSet<>();

        all.addAll(set1);
        all.addAll(set2);
        all.addAll(set3);

        for (int x : all) {
            int count = 0;

            if (set1.contains(x)) count++;
            if (set2.contains(x)) count++;
            if (set3.contains(x)) count++;

            if (count >= 2) {
                list.add(x);
            }
        }

        return list;
    }
}