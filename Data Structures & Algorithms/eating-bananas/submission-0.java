class Solution {
    private int calTotalHours(int[] arr, int k){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=Math.ceil(arr[i]/(k*1.0));
        }
        return sum;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int maxBanana = -1;
        for(int i=0;i<piles.length;i++){
            if(maxBanana < piles[i])
                maxBanana = piles[i];
        }
        int start = 1, end = maxBanana;
        int k = maxBanana;
        while(start <= end){
            int mid = (start+end)/2;
            int hours = calTotalHours(piles, mid);
            System.out.println("k = "+mid+"-> hours = "+hours);
            if(hours > h){
                start = mid + 1;
            }
            else if(hours <= h){
                k = mid;
                end = mid - 1;
            }
        }
        return k;
    }
}
