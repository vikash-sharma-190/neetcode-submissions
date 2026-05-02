class Solution {
public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.offer(num);
                System.out.println("before" + minHeap.toString());
            if (minHeap.size() > k) {
                minHeap.poll();
                System.out.println("after" + minHeap.toString());
            }
        }
        return minHeap.peek();
    }
}
