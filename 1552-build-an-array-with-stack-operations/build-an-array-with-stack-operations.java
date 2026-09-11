class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> s= new ArrayList<>();
        int l=target[target.length-1];
        int j=0;
        for(int i=0;i<l;i++){
            if(target[j]!=i+1){
                s.add("Push");
                s.add("Pop");
            }
            else{
                j++;
                s.add("Push");
            }
        }
        return s;
    }
}