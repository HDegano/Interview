package Arrays;

import java.util.PriorityQueue;

/**
 * Created by HDegano on 6/17/2015.
 */
public class KthLargest{

    //O(nlgk) complexity, O(k) space
    public int findKthLargestPQ(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        int n = nums.length;

        for(int i = 0; i < n; ++i){

            if(pq.size() == k){
                if(pq.peek() < nums[i]){
                    pq.remove();
                    pq.add(nums[i]);
                }
            }

            else
                pq.add(nums[i]);
        }

        return pq.remove();
    }

    //O(n) complexity but not suitable for large data set
    public int findKthLargestQuickSelect(int[] nums, int k) {

        k = nums.length - k;

        int lo = 0;
        int hi = nums.length  - 1;

        while(hi > lo){

            int pivot = quickSelect(nums, lo, hi);

            if(pivot < k){
                lo = pivot + 1;
            }

            else if(pivot > k){
                hi = pivot - 1;
            }

            else return nums[pivot];
        }

        return nums[lo];
    }

    private int quickSelect(int[] ar, int lo, int hi){

        int pivot = lo;

        int i = lo;
        int j = hi + 1;

        while(true){

            while(ar[++i] < ar[pivot]) if(i == hi) break;
            while(ar[--j] > ar[pivot]) if(j == lo) break;

            if(i >= j) break;

            swap(ar, i , j);
        }

        swap(ar, j, pivot);

        return j;
    }

    private void swap(int[] ar, int x, int y){
        int temp = ar[x];
        ar[x] = ar[y];
        ar[y] = temp;
    }
}
