class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> s= new HashSet<>();
        for(String i:emails){
            String []ld=i.split("@");
            ld[0]=ld[0].replace(".","");
            ld[0]=ld[0].split("\\+")[0];
            s.add(ld[0]+"@"+ld[1]);
        }
        return s.size();
    }
}