class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int k=0;
        int r[]= new int[arr1.length];
        int arr3[]= Arrays.copyOf(arr1,arr1.length);
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    r[k]=arr2[i];
                    k++;
                    arr3[j]=0;
                }
            }
        }
        Arrays.sort(arr3);
        for(int i=arr3.length-1;i>=0;i--){
          if(arr3[i]==0) break;
            r[i]=arr3[i];
        }
        return r;
    }
}