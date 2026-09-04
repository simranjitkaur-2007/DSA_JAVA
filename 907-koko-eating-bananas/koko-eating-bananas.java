class Solution {

    private long totalHours(int speed, int[] piles) {
        long totalh = 0;
        for (int pile : piles) {
            totalh += Math.ceil((double) pile / speed);
        }
        return totalh;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for (int pile : piles) {
            high = Math.max(high, pile);
        }
        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long hours = totalHours(mid, piles);
            if (hours <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}