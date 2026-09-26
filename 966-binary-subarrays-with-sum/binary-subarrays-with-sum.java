class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
       return fun(nums,goal)-fun(nums,goal-1);
    }
    int fun(int[] nums,int goal){
        if(goal<0) return 0;
       int i=0,j=0,r=0,s=0;
       while(j<nums.length){
             s+=nums[j];
             while(s>goal){
                s-=nums[i];
                i++;
             }
             r+=j-i+1;
             j++;
       }
       return r;
    }
}