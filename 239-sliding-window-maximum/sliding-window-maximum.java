class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int a[]= new int[nums.length-k+1];
        Deque<Integer> qu= new ArrayDeque<>();
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(!qu.isEmpty() && qu.peekFirst()<=i-k)
            qu.pollFirst();
            while(!qu.isEmpty() && nums[qu.peekLast()]<nums[i]){
             qu.pollLast();
            }
            qu.offer(i);
            if(i>=k-1){
            a[j]=nums[qu.peekFirst()];
            j++;
            }
        }
        return a;
        
    }
}