import java.util.*;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] sorted = Arrays.copyOf(arr, n);
        Arrays.sort(sorted);
        Map<Integer, Integer> rank = new HashMap<>();
        int r = 1;
        for (int x : sorted) {
            if (!rank.containsKey(x)) {
                rank.put(x, r++);
            }
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = rank.get(arr[i]);
        }
        return ans;
    }
}