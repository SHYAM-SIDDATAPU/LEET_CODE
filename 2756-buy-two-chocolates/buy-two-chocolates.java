class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int m=money,c=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<=money){
                c++;
                money-=prices[i];
            }
            if(c==2) return money;
            
        }
        return m;
    }
}