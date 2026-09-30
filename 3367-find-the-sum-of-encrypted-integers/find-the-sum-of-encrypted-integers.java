class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int s=0;
        for(int i:nums){
            s+=fun(i);
        }
        return s;
    }
    int fun(int n){
        int l= String.valueOf(n).length();
        int m=0;
        while(n!=0){
            m=Math.max(m,n%10);
            n=n/10;
        }
        for(int i=0;i<l;i++) n=n*10+m;
        return n;
    }
}