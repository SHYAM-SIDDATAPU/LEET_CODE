class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=max<nums[i]?nums[i]:max;
        }
        int m=0;
        while(k!=0){
            m+=max;
            max+=1;
            k--;
        }
        return m;
    }
}