class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n=nums.size();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int total=0;
            for(int j=i;j<n;j++){
                total+=nums.get(j);
                if((j-i+1>=l && j-i+1<=r) && total>0){
                 min=Math.min(min,total);
                }
            }
        }
        return min!=Integer.MAX_VALUE?min:-1;
    }
}