class Solution {
    public static boolean prime(int a){
        if(a==1) return false;
        for(int i=2;i<a;i++){
                if(a%i==0) return false;
        }
        return true;
    }
    public int maximumPrimeDifference(int[] nums) {
        int ip=0,fp=nums.length-1;
        while(ip<nums.length && !prime(nums[ip])) ip++;
        while(fp>=0 && !prime(nums[fp])) fp--;
        return Math.abs(ip-fp);
    }
}