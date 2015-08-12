import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by HDegano on 6/17/2015.
 */
public class TwoSum {

    public int[] twoSumNotSorted(int[] numbers, int target){

        int hi = numbers.length - 1;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < hi; i++){

            int x = numbers[i];
            if(map.containsKey(target - x)){
                return new int[]{map.get(target - x), i};
            }

            else
                map.put(x, i);
            }

        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] twoSumSorted(int[] numbers, int target){

        int lo = 0;
        int hi = numbers.length - 1;

        while(lo < hi){
            int sum = numbers[lo] + numbers[hi];
            if(sum < target)
                lo++;
            if(sum > target) hi--;
            else return new int[] {lo, hi};
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
