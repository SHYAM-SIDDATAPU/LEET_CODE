class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> l= new ArrayList<>();
        int a[]= new int[1001];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                a[nums[i][j]]++;
            }
        }
        for(int i=0;i<a.length;i++)  
          if(a[i]==nums.length) l.add(i);
        return l;
    }
}