class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int[] diff = new int[capacity.length];
      
        for(int i=0; i<capacity.length; i++) {
        diff[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(diff);
        int i=0;
        while(i < diff.length && diff[i] <= additionalRocks) {
            additionalRocks -= diff[i];
            i++;
        }

        return i;
    }
}