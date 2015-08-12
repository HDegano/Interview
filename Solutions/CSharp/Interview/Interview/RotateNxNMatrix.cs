namespace Interview
{
    public class RotateNxNMatrix
    {
        public void Rotate(int[,] matrix)
        {
            int m = matrix.GetLength(0);
            int n = matrix.GetLength(1);

            if (m != n) return;
            
            int top = 0;
            int bottom = m - 1;
            int left = 0;
            int right = n - 1;

            while (top < bottom && left < right)
            {
                int offset = 0;

                for (int i = left; i < right; i++)
                {
                    swap(matrix, top, bottom, left, right, offset);
                    offset += 1;
                }

                top++;
                bottom--;
                left++;
                right--;
            }
        }

        private void swap(int[,] matrix, int top, int bottom, int left, int right, int offset)
        {
            int temp = matrix[top, left + offset];
            matrix[top, left + offset] = matrix[bottom - offset, left];
            matrix[bottom - offset, left] = matrix[bottom, right - offset];
            matrix[bottom, right - offset] = matrix[top + offset, right];
            matrix[top + offset, right] = temp;
        }
    }
}
