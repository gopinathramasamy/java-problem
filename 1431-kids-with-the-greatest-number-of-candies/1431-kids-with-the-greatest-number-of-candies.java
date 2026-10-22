class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list=new ArrayList<>();
        int geart=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>geart){
                geart=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            int ans=candies[i]+extraCandies;
            if(ans>=geart){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
}