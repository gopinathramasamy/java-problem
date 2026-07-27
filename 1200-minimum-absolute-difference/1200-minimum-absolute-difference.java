class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        ArrayList<List<Integer>> res=new ArrayList<>();
        int diff=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            diff=Math.min(diff,arr[i+1]-arr[i]);
        }
        for(int j=0;j<arr.length-1;j++){
            if((arr[j+1]-arr[j])==diff){
                res.add(Arrays.asList(arr[j],arr[j+1]));
            }
        }
        return res;
    }
}