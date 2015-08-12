namespace Interview
{
    public class PlusOne
    {
        public int[] AddOne(int[] digits)
        {
            int carry = 1;
            int n = digits.Length;
            int index = n - 1;

            while (carry > 0 && index >= 0)
            {
                int temp = digits[index] + carry;

                digits[index] = temp % 10;
                carry--;
                carry += temp / 10;

                index--;
            }

            if (carry <= 0) return digits;
            
            int[] A = new int[n + 1];
            A[0] = carry;

            for (int i = 0; i < n; i++)
                A[i + 1] = digits[i];

            return A;
        }
    }
}
