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
        int c=0,ip=0,fp=0;
        for(int i=0;i<nums.length;i++){
            if(p[nums[i]]){
                if(c==0) ip=i;
                fp=i;
                c++;
            } 
        }
        return Math.abs(ip-fp);
    }
}