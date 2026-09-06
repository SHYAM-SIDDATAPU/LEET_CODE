class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb= new StringBuilder();
        for(char i:s.toCharArray()){
            sb.append(String.valueOf(i-'a'+1));
        }
        int t=0;
        while(k!=0){
            k--;
            int sum=0;
           for(char i:sb.toString().toCharArray()){
                sum+=i-'0';
            }
            sb.delete(0,sb.length());
            sb.append(sum);
            t=sum;
        }
        return (int)t;
    }
}