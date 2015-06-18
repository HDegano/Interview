package Arrays;

/**
 * Created by HDegano on 6/17/2015.
 */
public class Search2DMatrix {

    //row and column sorted, last item in row is less than the first item for the next row
    public boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;

        if(rows <= 0) return false;

        int cols = matrix[0].length;

        if(cols <= 0) return false;

        int lo = 0;
        int hi = rows * cols - 1;

        while(lo <= hi){

            int mid = lo + (hi - lo)/2;

            int midRow = mid / cols;
            int midCol = mid % cols;

            if(matrix[midRow][midCol] == target) return true;

            else if(matrix[midRow][midCol] < target)
                lo = mid + 1;

            else hi = mid - 1;
        }

        return false;
    }

}
