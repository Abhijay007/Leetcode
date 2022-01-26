class Solution {
    public int peakIndexInMountainArray(int[] nums) {
     int max = nums[0];
     for(int i = 0; i<nums.length; i++){
        if(nums[i]>max){
            max = nums[i];
        }
    }
 
         int i;
        for( i =0 ; i<nums.length; i++){
        if(nums[i] == max){
            return i;
        }
    }
    return i;
}
}