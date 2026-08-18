class Solution {
    public int maximalRectangle(char[][] matrix) {
        int m= matrix.length;
        int n= matrix[0].length;
        int a[][]= new int [m][n];
        for(int j=0;j<n;j++){
            int s=0;
            for(int i=0;i<m;i++){
                 if(matrix[i][j]=='1')
                 s++;
                 else s=0;
                 a[i][j]=s;
            }
        }
        int m1=0;
            for(int i=0;i<m;i++){
                m1= Math.max(m1,hist(a[i]));
            }
            return m1;
    }
    static int hist(int[] arr){
        int m=0;
       int lm[]=lmin(arr);
       int rm[]=rmin(arr);
       for(int i=0;i<arr.length;i++){
        m=Math.max(m,(rm[i]-lm[i]-1)*arr[i]);
       }
       return m;
    }
    static int[] rmin(int[] arr){
        Stack<Integer> st= new Stack<>();
        int rm[]= new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
           while(!st.isEmpty()&& arr[st.peek()]>=arr[i])
           st.pop();
           rm[i]=st.isEmpty()?arr.length:st.peek();
           st.push(i);
        }
        return rm;
    }
    static int[] lmin(int[] arr){
        Stack<Integer> st= new Stack<>();
        int lm[]= new int[arr.length];
        for(int i=0;i<arr.length;i++){
           while(!st.isEmpty()&& arr[st.peek()]>=arr[i])
           st.pop();
           lm[i]=st.isEmpty()?-1:st.peek();
           st.push(i);
        }
        return lm;
    }
}