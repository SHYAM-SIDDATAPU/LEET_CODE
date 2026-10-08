class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int units=0;
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
        for(int i=0;i<boxTypes.length;i++){
            if(truckSize==0) break;
            int boxes= Math.min(boxTypes[i][0],truckSize);
            units+=boxes*boxTypes[i][1];
            truckSize-=boxes;
        }
        return units;
    }
}