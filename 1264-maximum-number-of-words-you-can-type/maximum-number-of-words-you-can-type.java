class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        StringBuilder sb= new StringBuilder(text);
        int count=0;
        for(String i:text.split(" ")){
            int brokenCount=0;
            for(char j:i.toCharArray())
                if(brokenLetters.indexOf(j)!=-1){
                  brokenCount++;
                  break;
                }
            if(brokenCount==0) count++;
        }
        return count;
    }
}