public class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> (a[0]-b[0]));
        List<int[]> output = new ArrayList<>();
        int[] curr = intervals[0];
        output.add(curr);
        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];
            int lastEnd = curr[1];

            if (start <= lastEnd) {
                curr[1] = Math.max(lastEnd, end);
            } else {
                curr=interval;
                output.add(curr);
            }
        }
        return output.toArray(new int[output.size()][]);
    }
}