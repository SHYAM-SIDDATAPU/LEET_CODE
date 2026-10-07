class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3) return false;
        int inc=0;
        int dec=0;
        for(int i=1;i<arr.length;i++){
           if(dec!=0 && arr[i-1]<arr[i]) return false;
           else if(arr[i-1]>arr[i]) dec++;
           else if(arr[i-1]==arr[i]) return false;
           else inc++;
        }
        return inc>0 && dec>0;
    }
}