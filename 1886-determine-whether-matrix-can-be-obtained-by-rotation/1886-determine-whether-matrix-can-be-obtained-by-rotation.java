// To rotate a matrix 90-degree clockwise :
// -Take transpose : a[i][j] = a[j][i]
// -Swap elements of first column with last column : a[j][i] = a[c-1-j][i] c is no.of column

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        if(mat==target) return true;
        int n = mat.length;
        
        int[][] res1 = new int[n][n];
        for(int i=0;i<n;i++){         //90 degree
            for(int j=0;j<n;j++){
                res1[i][j] = mat[n-1-j][i];
            }
        }
        
        int[][] res2 = new int[n][n];
        for(int i=0;i<n;i++){        //180 degree
            for(int j=0;j<n;j++){
                res2[i][j] = res1[n-1-j][i];
            }
        }
        
        int[][] res3 = new int[n][n];
        for(int i=0;i<n;i++){       //270 degree
            for(int j=0;j<n;j++){
                res3[i][j] = res2[n-1-j][i];
            }
        }
        
        //compare to 90,180,270 and itself
        // Arrays.deepEquals() use for matrix
        if(Arrays.deepEquals(target,res1) || Arrays.deepEquals(target,res2) ||                          Arrays.deepEquals(target,res3) || Arrays.deepEquals(target,mat)){
            return true;
        }
        
        return false;
    }
}