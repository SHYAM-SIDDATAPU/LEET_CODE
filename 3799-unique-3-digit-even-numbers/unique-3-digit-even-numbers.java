class Solution {
    public int totalNumbers(int[] digits) {
        int n=digits.length;
        Set<Integer> set= new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(digits[i] !=0 &&
                     i!=j &&
                     j!=k &&
                     i!=k){
                        int s=100*digits[i]+10*digits[j]+digits[k];
                        if(s%2==0) set.add(s);
                    }
                }
            }
        }
        return set.size();
    }
}