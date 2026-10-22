class Solution {
    public List<String> cellsInRange(String s) {
        int row1=s.charAt(1)-'0';
        int row2=s.charAt(4)-'0';
        int col1=s.charAt(0)-'A';
        int col2=s.charAt(3)-'A';
        List<String> l= new ArrayList<>();
        for(int i=col1;i<=col2;i++){
            for(int j=row1;j<=row2;j++){
                StringBuilder s1=new StringBuilder();
                s1.append(String.valueOf((char)(i+65)));
                s1.append(String.valueOf(j));
                l.add(s1.toString());
            }
        }
        return l;
    }
}