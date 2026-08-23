class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int a[]= new int[101];
        for(int i:nums){
            a[i]++;
            if(a[i]>2) return false;
        }
        return true;
    }
}