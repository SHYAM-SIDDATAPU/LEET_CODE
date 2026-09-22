class Solution {
    public int[] numberGame(int[] nums) {
        int a[]= new int[nums.length];
        int j=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=2){
            a[j]= nums[i+1];
            a[++j]=nums[i];
            j++;
        }
        return a;
    }
}