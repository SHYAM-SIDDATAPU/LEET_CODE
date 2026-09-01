class Solution {
    public int maxAscendingSum(int[] nums) {
        int m=nums[0];
        int max=0;
        for(int i=1;i<nums.length;i++){
                if(nums[i-1]<nums[i]){
                    m+=nums[i];
                }
                else{
                    max=m>max?m:max;
                    m=nums[i];
                }
        }
        return Math.max(m,max);
    }
}