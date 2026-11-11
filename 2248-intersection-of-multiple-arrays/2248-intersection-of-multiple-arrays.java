class Solution {
    public List<Integer> intersection(int[][] nums) {

        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            HashSet<Integer> set = new HashSet<>();

            for (int j = 0; j < nums[i].length; j++) {
                set.add(nums[i][j]);
            }

            for (int num : set) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        for (int key : map.keySet()) {
            if (map.get(key) == nums.length) {
                list.add(key);
            }
        }

        Collections.sort(list);
        return list;
    }
}