class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int a = arrivalTime + delayedTime;
        if (a >= 24) {
           return a - 24;
        }
        return a;
    }
}