class Solution {
    public int getLeastFrequentDigit(int n) {
        int a[]= new int[10];
        while(n!=0){
            a[n%10]+=1;
            n=n/10;
        }
        int digit=10;
        int c=Integer.MAX_VALUE;
        for(int i=0;i<10;i++){
            if(a[i]>0){
            if(digit>i && c>a[i]){
                digit=i;
                c=a[i];
            }
            else if(digit<i && c>a[i]){
                digit=i;
                c=a[i];
            }
            }
        }
        return digit;
    }
}