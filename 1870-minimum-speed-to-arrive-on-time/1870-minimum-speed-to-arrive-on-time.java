class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int n = dist.length;
        if (hour <= n - 1) return -1;
        int left = 1, right = 10_000_000;
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            double time = 0.0;
            for (int i = 0; i < n-1 ; i++) {
                time += Math.ceil((double)dist[i]/mid);
            }
            time +=(double)dist[dist.length-1]/mid;
            if (time <= hour) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}