package Arrays;

/**
 * Created by HDegano on 6/17/2015.
 */
public class MinRotatedSortedArray {

    //Assumes there are no duplicate
//O(log n)
    public int FindMinRotatedArray(int[] ar){

        int n = ar.length;
        int lo = 0;
        int hi = n - 1;
        while(lo <= hi){

            if(ar[lo] <= ar[hi]) // (sub) array is already sorted, yay!
                return ar[lo];

            int mid = lo + (hi - lo)/2; //prevent int overflow, assumes all are positive
            int next = (mid + 1) % n; //modulus is needed if mid is the start/end of the array
            int prev = (mid + n - 1) % n;

            //check if mid is the min. Both it's previous and next are higher
            if((ar[mid] <=ar[prev])&&(ar[mid] <=ar[next]))
                return ar[mid];

            //figure out where is the dip
            if(ar[mid] <= ar[lo])
                hi = mid - 1; //the dip is in the half left side
            else
                lo = mid + 1;
        }

        return -1;
    }
}
