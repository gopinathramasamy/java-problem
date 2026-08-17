class Solution {
    public String reformatDate(String date) {
        String[] arr=date.split(" ");
        String day=arr[0].substring(0,arr[0].length()-2);
        String month=arr[1];
        String year=arr[2];
        String[] months = {
            "Jan", "Feb", "Mar", "Apr",
            "May", "Jun", "Jul", "Aug",
            "Sep", "Oct", "Nov", "Dec"
        };
        int monthnum=0;
        for(int i=0;i<months.length;i++){
            if(months[i].equals(month)){
                monthnum=i+1;
                break;
            }
        }
        return year+"-"+String.format("%02d",monthnum)+"-"+String.format("%02d",Integer.parseInt(day));
    }
}