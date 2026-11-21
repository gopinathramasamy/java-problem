class Solution {
    public int countBalls(int lowLimit, int highLimit) {
         int arr[]=new int[46];
         for(int i=lowLimit;i<=highLimit;i++){
            int num=i;
            int sum=0;
            while(num>0){
                sum+=num%10;
                num/=10;
            }
            arr[sum]++;
         }
         int max=0;
         for(int i:arr){
            max=Math.max(max,i);
        }
        return max;
    }
}