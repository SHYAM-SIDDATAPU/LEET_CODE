class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        HashSet<Float> s= new HashSet<>();
        int n= nums.length;
        for(int i=0;i<n/2;i++){
            s.add((float)(nums[n-i-1]+nums[i])/2);
        }
        return s.size();
    }
}