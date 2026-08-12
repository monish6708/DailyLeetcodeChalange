class Solution {
    int m, n;
    int matrix[][];
    public void setZeroes(int[][] matrix) {
        this.matrix = matrix;
         m= matrix.length;
         n= matrix[0].length;
         int[] row = new int[m];
         int[] col= new int[n];
         for(int i=0;i<m;i++){
             for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }

             }
        }

           for(int i=0;i<m;i++){
             for(int j=0;j<n;j++){
                if(row[i] ==1 || col[j] ==1){
                    matrix[i][j]=0;
                }

             }
        }

        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if(matrix[i][j]==0){
        //             colmatrix(j);
        //             rowmatrix(i);
        //         }
        //     }
        // }

        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if(matrix[i][j] == -1){
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }
        
    }
    // public void rowmatrix(int i){
    //     for(int j=0;j<n;j++){
    //         if(matrix[i][j]!=0){
    //         matrix[i][j]=-1;
    //         }
    //     }
    // }

    //     public void colmatrix(int j){
    //     for(int i=0;i<m;i++){
    //         if(matrix[i][j]!=0){
    //         matrix[i][j]=-1;
    //         }
    //     }
    // }
}