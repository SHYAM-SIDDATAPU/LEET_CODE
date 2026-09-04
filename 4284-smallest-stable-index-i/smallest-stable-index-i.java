class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int c=0;
        int max=0;
        int ind=100;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            int min=1000000000;
            for(int j=i;j<nums.length;j++){
                min=Math.min(nums[j],min);
            }
            if(max-min<=k){
                ind=ind<i?ind:i;
                c++;
            }
        }
        if(c==0) return -1;
        return ind;
    }
}