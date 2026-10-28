class Solution {
    public int[] rearrangeArray(int[] nums) {
       List<Integer> ans1= new ArrayList<>();
        while(true){
            List<Integer> temp= new ArrayList<>();
            for(int i=0;i<nums.length;i++)
                 if(temp.indexOf(nums[i])==-1 && nums[i]!=-1){
                    temp.add(nums[i]);
                    nums[i]=-1;
                 }
            if(temp.size()==0) break;
            Collections.sort(temp);
            ans1.addAll(temp);
        }
        int ans[]= new int[ans1.size()];
        for(int i=0;i<ans.length;i++) ans[i]=ans1.get(i);
        return ans;
    }
}