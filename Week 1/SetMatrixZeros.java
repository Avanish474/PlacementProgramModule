class SetMatrixZeros {
    public void setZeroes(int[][] matrix) {
       List<int[]> arr = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0)
                   arr.add(new int[]{i,j});  
            }
        }
        
        for(int[] i : arr){
            for(int k=0;k<matrix.length;k++)
                 matrix[k][i[1]]=0;
            for(int k=0;k<matrix[0].length;k++)
                 matrix[i[0]][k]=0;
            
        }
        
    }
}
