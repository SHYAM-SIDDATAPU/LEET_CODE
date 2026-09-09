class Solution {
    public long countCommas(long n) {
        long x=1000;
        long r=0;
        while(x<=n){
            r+=n-x+1;
            x=x*1000;
        }
        return r;
    }
}