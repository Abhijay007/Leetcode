class Solution {
    public int specialArray(int[] nums) {
        int count,num=1;
        while (num<=nums.length){
            count=0;
            for (int i=0;i<nums.length;i++){
                if (nums[i]>=num){
                    count++;
                }
            }
            if (num==count){
                return num;
            }
            num++;
        }
        
        return -1;
    }
}