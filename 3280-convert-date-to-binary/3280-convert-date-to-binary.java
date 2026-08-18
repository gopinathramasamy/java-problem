class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder sb=new StringBuilder();
        String arr[]=date.split("-");
        for(int i=0;i<arr.length;i++){
            String a=function(arr[i]);
            sb.append(a);
            if(i!=arr.length-1){
                sb.append('-');
            }
        }
        return sb.toString();
    }
    static String function(String i){
        StringBuilder sb1=new StringBuilder();
        int num=Integer.parseInt(i);
        while(num!=0){
           int digit=num%2;
           sb1.append(digit+"");
           num/=2;
        }
        return sb1.reverse().toString();
    }
}