class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int t[]= new int[nums.length];
        for(int i=0;i<nums.length;i++){
                for(int j=nums.length-1;j>index[i];j--){
                    t[j]=t[j-1];
                }
            t[index[i]]=nums[i];
        }
        return t;
    }
}