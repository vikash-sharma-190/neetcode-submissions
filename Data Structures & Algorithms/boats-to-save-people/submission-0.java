class Solution {
    public int numRescueBoats(int[] people, int limit) {
        if (people == null || people.length == 0) return 0;

        Arrays.sort(people);            // O(n log n)
        int i = 0, j = people.length - 1;
        int boats = 0;

        while (i <= j) {
            // Always try to pair the lightest with the heaviest
            if (people[i] + people[j] <= limit) {
                i++;    // lightest included in this boat
                j--;    // heaviest included in this boat
            } else {
                // Heaviest goes alone
                j--;
            }
            boats++;   // one boat used in either case
        }

        return boats;
    }
}