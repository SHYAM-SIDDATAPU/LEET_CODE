class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
      int a[]= new int[matrix[0].length];
      for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(a[j]<matrix[i][j])
               a[j]= matrix[i][j];
        }
      }  
      for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]==-1)
                matrix[i][j]=a[j];
        }
      }  
      return matrix;
    }
}