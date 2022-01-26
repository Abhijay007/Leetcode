class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int m = Integer.MIN_VALUE;
        int ans = -1;
        for(int i= 0; i < arr.length; i++){
            if(arr[i]> m){
                ans = i;
                m = arr[i];
            }
        }
       return ans;
    }
}