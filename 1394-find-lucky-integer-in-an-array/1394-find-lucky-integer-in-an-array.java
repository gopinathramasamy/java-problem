class Solution {
   public int findLucky(int[] arr) {
       HashMap<Integer, Integer> freq = new HashMap<>();

       int sum = 0;

       for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

       for (int num : freq.keySet()) {
           if (num == freq.get(num)) {
           sum = num;
        }
    }
    if(sum==0)return -1;
     return sum;
    }
}