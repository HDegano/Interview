package Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HDegano on 6/17/2015.
 */
public class PrintSpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> elements = new ArrayList<>();

        if (matrix.length == 0) return elements;

        int m = matrix.length; //rows
        int n = matrix[0].length; //col

        int row = 0;
        int col = -1; //why?cause we are doing ++col, do the col++ first then a clean up

        while (true) {

            //walk left to right
            for (int i = 0; i < n; i++) {
                elements.add(matrix[row][++col]);
            }

            if (--m == 0) break; //can we print?

            //walk top to bottom
            for (int i = 0; i < m; i++) {
                elements.add(matrix[++row][col]);
            }

            if (--n == 0) break;

            for (int i = 0; i < n; i++) {
                elements.add(matrix[row][--col]);
            }

            if (--m == 0) break;

            for (int i = 0; i < m; i++) {
                elements.add(matrix[--row][col]);
            }
        }

        return elements;
    }
}
