class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int s=0,n=cardPoints.length;
        for(int i=0;i<k;i++){
            s+=cardPoints[i];
        }
        int max=s;
        for(int i=0;i<k;i++){
            s-=cardPoints[k-i-1];
            s+=cardPoints[n-i-1];
            max=Math.max(max,s);
        }
        return max;
    }
}