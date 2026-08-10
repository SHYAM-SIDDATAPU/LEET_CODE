class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int j=discounts.length-1;
        double s=0.0;
        for(int i=prices.length-1;i>=0;i--){
            if(0<=j){
              s+=(double)prices[i]*(100-discounts[j])/100;
              j--;
            }
            else s+=prices[i];
        }
        return s;
    }
}