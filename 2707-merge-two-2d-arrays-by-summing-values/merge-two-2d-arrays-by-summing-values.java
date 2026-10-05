class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer,Integer> t= new TreeMap<>();
        for(int i=0;i<nums1.length;i++) t.put(nums1[i][0],nums1[i][1]);
        for(int i=0;i<nums2.length;i++) t.put(nums2[i][0],t.getOrDefault(nums2[i][0],0)+nums2[i][1]);
        int [][]r=new int[t.size()][2];
        int j=0;
        for(Integer i:t.keySet()){
            r[j][0]=i;
            r[j][1]=t.get(i);
            j++;
        }
        return r;
    }
}