class Solution {
    public int largestInteger(int[] nums, int k) {
        int f[]= new int[51];
        for(int i=0;i<=nums.length-k;i++){
           HashSet<Integer> h= new HashSet<>();
            for(int j=i;j<i+k;j++){
                  h.add(nums[j]);
            }
            for(int j:h)
            f[j]++;
        }
        int m=-1;
        for(int i=0;i<nums.length;i++){
            if(f[nums[i]]==1 && m<nums[i])
            m= nums[i];
        }
        return m;
    }
}