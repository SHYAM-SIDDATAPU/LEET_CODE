class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> s1= new HashSet<>();
        HashSet<Integer> s2= new HashSet<>();
        HashSet<Integer> s3= new HashSet<>();
        for(int i:nums1) s1.add(i);
        for(int i:nums2) s2.add(i);
        for(int i:nums3) s3.add(i);
        Set<Integer> r= new HashSet<>();
       for(int i:s1)
            if(s2.contains(i) || s3.contains(i))
                r.add(i);
        for(int i:s2)
            if(s1.contains(i) || s3.contains(i))
                r.add(i);
        return new ArrayList<>(r);
    }
}