class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low=0;//0
        int high=matrix[0].length*matrix.length-1;//11
        while(low<=high){
            int mid=(low+high)/2;//5 //1 0
            int row=mid/matrix[0].length;//1
            int col=mid%matrix[0].length;//
            System.out.println(row+" "+col);
            if(matrix[row][col]==target) return true;
            if(matrix[row][col]<target) low=mid+1;
            else high=mid-1;
        }
        return false;

    }
}
