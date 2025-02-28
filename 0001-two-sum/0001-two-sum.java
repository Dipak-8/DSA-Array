class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> nums_map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++) {
            int compliment = target - nums[i];
            if(nums_map.containsKey(compliment))
                return new int[] {nums_map.get(compliment), i};
            nums_map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No match found");
    }
}