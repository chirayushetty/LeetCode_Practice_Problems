// https://www.javatpoint.com/rotate-matrix-by-90-degrees-in-java

class Solution {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        
        //Transpose:
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                if(i!=j){
                //int temp=0;
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
                }
            }
        }
        
        // Swap elements of first column with last column:
        for(int i=0;i<len;i++){
            for(int j=0;j<len/2;j++){
                int temp=0;
                temp=matrix[i][j];
                matrix[i][j]=matrix[i][len-1-j];
                matrix[i][len-1-j]=temp;
            }
        }
    }
}