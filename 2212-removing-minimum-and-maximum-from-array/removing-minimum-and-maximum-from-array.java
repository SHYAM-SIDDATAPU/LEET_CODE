class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int l=0;
        int s=0;
        for(int i=0;i<n;i++){
            l=nums[i]>nums[l]?i:l;
            s=nums[i]<nums[s]?i:s;
        }
        int left=Math.min(l,s);
        int right=Math.max(l,s);
        return Math.min(right+1,Math.min(n-left,left+1+n-right));
    }
}