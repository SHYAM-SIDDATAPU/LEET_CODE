class Solution {
    public int[] productExceptSelf(int[] nums) {
        int productAll=1,zeroCount=0,zeroInd=0;
        for(int i=0;i<nums.length;i++)
            if(nums[i]==0){
              zeroCount++;
              zeroInd=i;
            }
            else
            productAll*=nums[i];
        int r[]= new int[nums.length];
        if(zeroCount==1)
           r[zeroInd]=productAll;
        else if(zeroCount>1)
           return r;
        else
        for(int i=0;i<nums.length;i++)
            r[i]=productAll/nums[i];
        return r;
    }
}