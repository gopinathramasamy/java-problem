class Solution {
    public int smallestNumber(int n, int t) {
      int num=n;
      while(diviBy(num)%t!=0){
          num++;
        }
     return num;
    }
    static int diviBy(int n){
        int pro=1;
        while(n!=0){
            int d=n%10;
            pro*=d;
            n/=10;
        }
        return pro;
     }
}