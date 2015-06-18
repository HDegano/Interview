package Arrays;

/**
 * Created by HDegano on 6/17/2015.
 */
public class FindKInRotatedSortedArray {

    public int FindElementInRotatedSortedArray(int[] ar, int k){

        int n = ar.length;
        int lo = 0;
        int hi = n - 1;

        while(lo <= hi){

            int mid = lo + (hi - lo)/ 2; //prevent int overflow, assumes all positives

            if(ar[mid] == k) return mid; //found it, boom!

            //Ok we need to figure out what part is the sorted array and go from there
            if(ar[mid] <= ar[hi]){ //right side is sorted
                if(ar[mid] < k && k <= ar[hi])
                    lo = mid + 1;
                else
                    hi = mid - 1;
            }

            else{ //left side is sorted
                if(ar[lo] <= k && k < ar[mid])
                    hi = mid -1;
                else
                    lo = mid + 1;
            }
        }

        return -1;
    }

}
