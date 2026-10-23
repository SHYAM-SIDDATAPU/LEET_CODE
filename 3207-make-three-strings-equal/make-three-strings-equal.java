class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int i=0,j=0,k=0;
        int m=s1.length(),n=s2.length(),o=s3.length();
        while(i<m && j<n && k<o){
            if(s1.charAt(i)==s2.charAt(j) && s2.charAt(j)==s3.charAt(k)){
                i++; j++; k++;
            }
            else break;
        }
        if(i==0) return -1;
        return (m-i)+(n-j)+(o-k);
    }
}