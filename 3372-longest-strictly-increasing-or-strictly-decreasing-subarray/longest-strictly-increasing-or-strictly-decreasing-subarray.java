class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int count=1;
        int incMax=1,decMax=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]) count++;
            else count=1;
            incMax=Math.max(incMax,count);
        }
        count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]) count++;
            else count=1;
            decMax=Math.max(decMax,count);
        }
        return Math.max(incMax,decMax);
    }
}