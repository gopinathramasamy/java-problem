class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        HashSet<Integer> ans=new HashSet<>();
        for(int freq:map.values()){
            if(!ans.add(freq)){
                return false;
            }
        }
        return true;
    }
}