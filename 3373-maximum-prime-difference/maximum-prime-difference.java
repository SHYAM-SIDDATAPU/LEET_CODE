class Solution {
    public static boolean prime(int a){
        if(a==1) return false;
        for(int i=2;i<a;i++){
                if(a%i==0) return false;
        }
        return true;
    }
    public int maximumPrimeDifference(int[] nums) {
        boolean p[]= new boolean[101];
        for(int i=1;i<=100;i++){
            p[i]=prime(i);
        }
        int ip=0,fp=nums.length-1;
        while(ip<nums.length && !p[nums[ip]]) ip++;
        while(fp>=0 && !p[nums[fp]]) fp--;
        return Math.abs(ip-fp);
    }
}