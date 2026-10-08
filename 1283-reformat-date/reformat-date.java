class Solution {
    public String reformatDate(String date) {
       String []date1= date.split(" ");
        String mmArr[]= {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep","Oct","Nov", "Dec"};
        for(int i=0;i<mmArr.length;i++)
            if(date1[1].equals(mmArr[i])){
                if(i+1<10)
                date1[1]="0"+String.valueOf(i+1);
                else 
                date1[1]=String.valueOf(i+1);
                break;
            }
            StringBuilder dd=new StringBuilder();
        for(char i:date1[0].toCharArray()){
            if(Character.isDigit(i)) dd.append(String.valueOf(i));
            else break;
        }
        if(dd.length()==1){
          dd.append("0");
          dd.reverse();
        }
        return date1[2]+"-"+date1[1]+"-"+dd.toString();
    }
}