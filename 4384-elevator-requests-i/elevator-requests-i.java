class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int t=0,idx=0;
        for(int i:requests){
            if(i<n){
                t+=Math.abs(i-idx);
                idx=i;
            }
        }
        return t;
        
    }
}