class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int m=0;
        for(int i=0;i<nums.length-1;i++){
            m+=nums[nums.length-1]-nums[i];
        }
        return m;
    }
}