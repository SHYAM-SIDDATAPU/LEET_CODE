class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st= new Stack<>();
        int n= asteroids.length;
        for(int i:asteroids){
             if(i>0){
                st.push(i);
            }
            else{
                if(!st.isEmpty() && (st.peek()<0 && i<0)){
                   st.push(i);
                   continue;
                } 
                while(!st.isEmpty() && st.peek() >0 && st.peek()<Math.abs(i))
                    st.pop();
                if(!st.isEmpty() && st.peek() >0 && st.peek()>Math.abs(i)) continue;
                else if(!st.isEmpty() && st.peek() >0 && st.peek()==Math.abs(i)) st.pop();
                else
                st.push(i);
                
            }
        }
        int r[]= new int[st.size()];
        for(int i=r.length-1;i>=0;i--){
           r[i]=st.pop();
        }
        
        return r;
    }
}