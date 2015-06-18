package Arrays;

/**
 * Created by HDegano on 6/17/2015.
 */
public class RotateArray {

    //rotate to the right
    public void rotate(int[] nums, int k) {

        if(k > nums.length) k = k % nums.length; //wrap it

        reverse(nums, 0, nums.length);
        reverse(nums, 0, k);
        reverse(nums, k, nums.length);
    }

    private void reverse(int[] ar, int from, int upTo){

        if(upTo <= from) return;

        int l = upTo - from;
        int mid = (from + l /2);

        for(int i = from, j = upTo - 1; i < mid && j >= mid ; i++, j--){

            int temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
        }
    }
}
