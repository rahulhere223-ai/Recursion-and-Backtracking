
import java.util.*;

class Solution {

    public void getcomb(int idx,
            List<Integer> list,
            HashSet<List<Integer>> set,
            int[] arr,
            int target,
            int sum) {

        if (sum == target) {
            set.add(new ArrayList<>(list));
            return;
        }

        if (idx >= arr.length || sum > target) {
            return;
        }

        // take
        list.add(arr[idx]);
        getcomb(idx + 1, list, set, arr, target, sum + arr[idx]);

        // backtrack
        list.remove(list.size() - 1);

        // not take
        getcomb(idx + 1, list, set, arr, target, sum);
    }

    public static void main(String[] args) {
        int candidates[] = {2, 1, 2, 2, 5};
        int target = 5;
        Arrays.sort(candidates);

        HashSet<List<Integer>> set = new HashSet<>();

        getcomb(0, new ArrayList<>(), set, candidates, target, 0);

    }
}
