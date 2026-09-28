class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return fun(nums,k)-fun(nums,k-1);
    }
    int fun(int[] nums, int k){
        int r=0,s=0,i=0,j=0;
        while(j<nums.length){
            s+=nums[j]%2;
            while(s>k){
                s-=nums[i]%2;
                i++;
            }
            r+=j-i+1;
            j++;
        }
        return r;
    }
}