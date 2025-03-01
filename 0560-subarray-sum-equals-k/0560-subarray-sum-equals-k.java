class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefixSum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            prefixSum += nums[i];
            int rem = prefixSum - k;
            if(map.containsKey(rem)) {
                count += map.get(rem);
            }
            int currentCount = map.getOrDefault(prefixSum, 0);
            map.put(prefixSum, currentCount + 1);
        }
        return count;
    }
}