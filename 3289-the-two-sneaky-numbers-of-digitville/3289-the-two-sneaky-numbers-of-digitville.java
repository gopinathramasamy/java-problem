class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for (int num : map.keySet()) {
             if (map.get(num) == 2) {
                list.add(num);
             }
        }
        int arr[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}