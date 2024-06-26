
class Solution {
    public int pivotIndex(int[] nums) {

        int preSum = 0;
        int suffSum = 0;

        int len = nums.length;

        int i = 0;
        
        for(int j  = 1; j < len; j++) {
            suffSum += nums[j];
        }
        
        if(preSum == suffSum) return 0;

        while(i < len-1) {
            preSum += nums[i];
            i++;
            suffSum -= nums[i];
            if(preSum == suffSum) return i;
        }

        return -1;
    }
}