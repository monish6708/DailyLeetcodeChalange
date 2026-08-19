class Solution {
    public int[][] merge(int[][] intervals) {
                int n = intervals.length;

          // Step 1: Sort the intervals based on starting value
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

    List<int[]> ans = new ArrayList<>();

        int i = 0;

    while (i < n) {

        int start = intervals[i][0];
        int end = intervals[i][1];

        for (int j = i + 1; j < n; j++) {

            if (intervals[j][0] <= end) {
                end = Math.max(end, intervals[j][1]);
                i = j;  // Move i to the last merged interval
            } else {
                break;
            }
        }

        // Add the merged interval
        ans.add(new int[]{start, end});

        i++;
    }

    return ans.toArray(new int[ans.size()][]);
    }
}